package com.diesgot.collectorsoapclient.scotia;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diesgot.collectorsoapclient.StartApplication;
import com.diesgot.collectorsoapclient.model.Acreencia;
import com.diesgot.collectorsoapclient.model.Operation;
import com.diesgot.collectorsoapclient.model.enums.AcreenciaStateEnum;
import com.diesgot.collectorsoapclient.model.enums.BankEnum;
import com.diesgot.collectorsoapclient.model.enums.CurrencyEnum;
import com.diesgot.collectorsoapclient.model.enums.OperationStateEnum;
import com.diesgot.collectorsoapclient.model.enums.OperationTypeEnum;
import com.diesgot.collectorsoapclient.repository.iAcreenciaDAO;
import com.diesgot.collectorsoapclient.repository.iOperationDAO;
import com.diesgot.collectorsoapclient.scotia.enums.CurrencyScoEnum;
import com.diesgot.collectorsoapclient.scotia.enums.MessageTypeScoEnum;
import com.diesgot.collectorsoapclient.scotia.enums.PagoRqFieldEnum;
import com.diesgot.collectorsoapclient.scotia.model.AnulacionDeudaRq;
import com.diesgot.collectorsoapclient.scotia.model.ExtornoAutAnulRq;
import com.diesgot.collectorsoapclient.scotia.model.ExtornoAutPagoRq;
import com.diesgot.collectorsoapclient.scotia.model.PagoRq;
import com.diesgot.collectorsoapclient.util.CommonsUtilities;

@Service
public class ScotiaServiceImp implements iScotiaService {

	private static final Logger log = LoggerFactory.getLogger(ScotiaServiceImp.class);

	@Autowired
	iAcreenciaDAO acreenciaDAO;

	@Autowired
	iOperationDAO operationDAO;

	private final String TRANS_FORMAT_DATE = "MMddHHmmss";

	@Override
	public void generatePaymentsRq() {
		LocalDateTime now = LocalDateTime.now();
		String sDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
		String sTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));

		BankEnum bankEnum = BankEnum.SCO;

		List<Acreencia> acreencias = acreenciaDAO.allByBankAndState(bankEnum, AcreenciaStateEnum.PROCESADO_ENVIADO,
				AcreenciaStateEnum.REGISTRADO);
//		acreencias.removeIf(x->x.getStateEnum()!=AcreenciaStateEnum.REGISTRADO );

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddHHmmss");
		String fechaHoraTransaccion = now.format(formatter);

		try {
			// sDate+sTime +
			String csvFile = StartApplication.FOLDER_SCOTIA_RQ + bankEnum.name() + "_" + "_payments_rq.txt";
			FileWriter writer = new FileWriter(csvFile);

			Random random = new Random();
			for (Acreencia acreencia : acreencias) {
				if (acreencia.getDebtAmount() == null || acreencia.getDebtAmount().compareTo(BigDecimal.ZERO) == 0) {

					int amount = random.nextInt(1500 - 500) + 500;
					acreencia.setDebtAmount(BigDecimal.valueOf(amount));
				}
				BigDecimal debtAmount = acreencia.getDebtAmount().setScale(2, BigDecimal.ROUND_UNNECESSARY);
				String sDebtAmount = debtAmount.toString().replace(".", "");

				PagoRq pagoRq = new PagoRq();
				pagoRq.defaultData(acreencia.getCodigoTipoServicio());
				pagoRq.setDatoPago(acreencia.getDatoPago());

				// montos
				pagoRq.setMonto(sDebtAmount);
				pagoRq.setImporteOriginalDeuda(sDebtAmount);
				pagoRq.setImportePagadoDocto(sDebtAmount);
				pagoRq.setImporteTotalXprodServ(sDebtAmount);
				pagoRq.setImportePagadoEfectivo(sDebtAmount);

				// Transaction Data
				CurrencyScoEnum currencyScoEnum = null;
				if (acreencia.getCurrencyEnum() == CurrencyEnum.PEN) {
					currencyScoEnum = CurrencyScoEnum.PEN;
				} else if (acreencia.getCurrencyEnum() == CurrencyEnum.USD) {
					currencyScoEnum = CurrencyScoEnum.USD;
				}
				pagoRq.setFechaHoraTransaccion(fechaHoraTransaccion);
				pagoRq.setNroDocumentoDePag(acreencia.getIdAcreencia().toString());
				pagoRq.setTransactionCurrencyCode(currencyScoEnum.getValue());
				
				String operationNumber="" + System.currentTimeMillis();
				Integer dataLength=PagoRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER.getDataLength();
				if (operationNumber.length() >=dataLength) {
					operationNumber = operationNumber.substring(0, dataLength);
				}
				pagoRq.setNroReferenciaAbono(operationNumber);
				pagoRq.setRetrievelRefereneNumber(pagoRq.getNroReferenciaAbono());

				StringBuilder sb = new StringBuilder();
				String cabecera = String.format("Bank Reference (Documento): %s, Operation Number: %s, Cliente: %s",
						pagoRq.getNroDocumentoDePag(), pagoRq.getNroReferenciaAbono(), acreencia.getDatoPago());
				sb.append(cabecera);
				sb.append("\n");
				sb.append(pagoRq.getInput());
				sb.append("\n");
				writer.append(sb.toString());
			}

			writer.flush();
			writer.close();

		} catch (Exception e) {
			log.error("Error", e);
		}

	}

	@Override
	public void anulacionPagoDeudaRq() {
		LocalDateTime now = LocalDateTime.now();
		String sDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
		String sTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));

		BankEnum bankEnum = BankEnum.SCO;

		List<Operation> operations = operationDAO.allPayedByBankAndOperationType(bankEnum,
				OperationTypeEnum.DEPOSIT_WS);
		operations.removeIf(x->x.getOperationStateEnum()!=OperationStateEnum.REGISTRADO);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TRANS_FORMAT_DATE);
		String fechaHoraTransaccion = now.format(formatter);

		try {
			// sDate+sTime +
			String csvFile = StartApplication.FOLDER_SCOTIA_RQ + bankEnum.name() + "_" + "_annul_payments_rq.txt";
			FileWriter writer = new FileWriter(csvFile);

			for (Operation operation : operations) {
				BigDecimal debtAmount = operation.getOperationAmount().setScale(2, BigDecimal.ROUND_UNNECESSARY);
				String sDebtAmount = debtAmount.toString().replace(".", "");

				CurrencyScoEnum currencyScoEnum = null;
				if (operation.getAcreencia().getCurrencyEnum() == CurrencyEnum.PEN) {
					currencyScoEnum = CurrencyScoEnum.PEN;
				} else if (operation.getAcreencia().getCurrencyEnum() == CurrencyEnum.USD) {
					currencyScoEnum = CurrencyScoEnum.USD;
				}

				AnulacionDeudaRq anulacionDeudaRq = new AnulacionDeudaRq();
				//
				anulacionDeudaRq.defaultData(operation.getAcreencia().getCodigoTipoServicio());
				// anulacionDeudaRq.setRetrievalReferenceNumber("" + System.currentTimeMillis());
				anulacionDeudaRq.setRetrievalReferenceNumber(operation.getOperationNumber());
				anulacionDeudaRq.setDatoPago(operation.getAcreencia().getDatoPago());
				anulacionDeudaRq.setMonto(sDebtAmount);
				anulacionDeudaRq.setTransactionCurrencyCode(currencyScoEnum.getValue());
				// original data elements
				String fechaHoraTransaccion2 = CommonsUtilities.convertDateToString(operation.getOperationDate(),
						TRANS_FORMAT_DATE);
				anulacionDeudaRq.setMessageTypeId2(MessageTypeScoEnum.CONS_PAG_ANU_RQ.getCode());
				anulacionDeudaRq.setFechaHoraTransaccion2(fechaHoraTransaccion2);
				// datos del requerimiento
				anulacionDeudaRq.setDatoPago(operation.getAcreencia().getDatoPago());
				// filler recibo anular
				anulacionDeudaRq.setNroDocumento(operation.getAcreencia().getIdAcreencia().toString());
				anulacionDeudaRq.setNroTransCobOri(operation.getOperationNumber()); // nro operacion banco
				anulacionDeudaRq.setNroOpeOriginalAcreedor(operation.getIdOperation().toString()); // fund operation

				StringBuilder sb = new StringBuilder();
				String cabecera = String.format(
						"Bank Reference (Documento): %s, Operation Number To Annul: %s, Cliente: %s",
						anulacionDeudaRq.getNroDocumento(), anulacionDeudaRq.getNroTransCobOri(),
						anulacionDeudaRq.getDatoPago());
				sb.append(cabecera);
				sb.append("\n");
				sb.append(anulacionDeudaRq.getInput());
				sb.append("\n");
				writer.append(sb.toString());
			}

			writer.flush();
			writer.close();

		} catch (Exception e) {
			log.error("Error", e);
		}

	}

	@Override
	public void extornoAutPagoRq() {
		LocalDateTime now = LocalDateTime.now();
		String sDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
		String sTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));

		BankEnum bankEnum = BankEnum.SCO;

		List<Operation> operations = operationDAO.allPayedByBankAndOperationType(bankEnum,
				OperationTypeEnum.DEPOSIT_WS);

		String TRANS_FORMAT_DATE = "MMddHHmmss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TRANS_FORMAT_DATE);
		String fechaHoraTransaccion = now.format(formatter);

		try {
			// sDate+sTime +
			String csvFile = StartApplication.FOLDER_SCOTIA_RQ + bankEnum.name() + "_" + "_extornoAutPago_rq.txt";
			FileWriter writer = new FileWriter(csvFile);

			for (Operation operation : operations) {
				BigDecimal debtAmount = operation.getOperationAmount().setScale(2, BigDecimal.ROUND_UNNECESSARY);
				String sDebtAmount = debtAmount.toString().replace(".", "");

				CurrencyScoEnum currencyScoEnum = null;
				if (operation.getAcreencia().getCurrencyEnum() == CurrencyEnum.PEN) {
					currencyScoEnum = CurrencyScoEnum.PEN;
				} else if (operation.getAcreencia().getCurrencyEnum() == CurrencyEnum.USD) {
					currencyScoEnum = CurrencyScoEnum.USD;
				}

				ExtornoAutPagoRq extornoAutPagoRq = new ExtornoAutPagoRq();
				//
				extornoAutPagoRq.defaultData(operation.getAcreencia().getCodigoTipoServicio());
				extornoAutPagoRq.setMonto(sDebtAmount);
				extornoAutPagoRq.setFechaHoraTransaccion1(fechaHoraTransaccion);
				extornoAutPagoRq.setRetrievalReferenceNumber(operation.getOperationNumber()); // Igual al mensaje 0200
				extornoAutPagoRq.setTransactionCurrencyCode(currencyScoEnum.getValue());
				// original data elements
				String fechaTransaccion2 = CommonsUtilities.convertDateToString(operation.getOperationDate(),
						TRANS_FORMAT_DATE);
				extornoAutPagoRq.setMessageTypeId2(MessageTypeScoEnum.CONS_PAG_ANU_RQ.getCode());
				extornoAutPagoRq.setFechaHoraTransaccion2(fechaTransaccion2);
				// datos del requerimiento
				extornoAutPagoRq.setDatoPago(operation.getAcreencia().getDatoPago());
				extornoAutPagoRq.setMonedaPago(currencyScoEnum.getValue());
				extornoAutPagoRq.setPagoTotalRealizado(sDebtAmount);
				extornoAutPagoRq.setImporteTotalXProdSev(sDebtAmount);
				extornoAutPagoRq.setNroReferenciaAbono(operation.getOperationNumber());
				extornoAutPagoRq.setNumeroDocumentoPago("" + operation.getAcreencia().getIdAcreencia());
				extornoAutPagoRq.setImporteOriginalDeuda(sDebtAmount);
				extornoAutPagoRq.setImportePagadoDocto(sDebtAmount);
				extornoAutPagoRq.setReferenciaDeuda(operation.getAcreencia().getDatoPago());

				StringBuilder sb = new StringBuilder();
				String cabecera = String.format(
						"Bank Reference (Documento): %s, Operation Number Deposit To Extorn: %s, Cliente: %s",
						extornoAutPagoRq.getNumeroDocumentoPago(), extornoAutPagoRq.getRetrievalReferenceNumber(),
						extornoAutPagoRq.getDatoPago());
				sb.append(cabecera);
				sb.append("\n");
				sb.append(extornoAutPagoRq.getInput());
				sb.append("\n");
				writer.append(sb.toString());
			}

			writer.flush();
			writer.close();

		} catch (Exception e) {
			log.error("Error", e);
		}
	}

	@Override
	public void extornoAutAnulacionRq() {
		LocalDateTime now = LocalDateTime.now();
		String sDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
		String sTime = now.format(DateTimeFormatter.ofPattern("HHmmss"));

		BankEnum bankEnum = BankEnum.SCO;

		List<Operation> operations = operationDAO.allPayedByBankAndOperationType(bankEnum,
				OperationTypeEnum.ANULACION_EXTORNO_DEPOSITO_WS);

		String TRANS_FORMAT_DATE = "MMddHHmmss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TRANS_FORMAT_DATE);
		String fechaHoraTransaccion = now.format(formatter);
		try {
			// sDate+sTime +
			String csvFile = StartApplication.FOLDER_SCOTIA_RQ + bankEnum.name() + "_"
					+ "_extorno_aut_anulacion_rq.txt";
			FileWriter writer = new FileWriter(csvFile);

			for (Operation operation : operations) {
				BigDecimal debtAmount = operation.getOperationAmount().setScale(2, BigDecimal.ROUND_UNNECESSARY);
				String sDebtAmount = debtAmount.toString().replace(".", "");

				CurrencyScoEnum currencyScoEnum = null;
				if (operation.getAcreencia().getCurrencyEnum() == CurrencyEnum.PEN) {
					currencyScoEnum = CurrencyScoEnum.PEN;
				} else if (operation.getAcreencia().getCurrencyEnum() == CurrencyEnum.USD) {
					currencyScoEnum = CurrencyScoEnum.USD;
				}

				ExtornoAutAnulRq extornoAutAnulRq = new ExtornoAutAnulRq();
				//
				extornoAutAnulRq.defaultData(operation.getAcreencia().getCodigoTipoServicio());
				extornoAutAnulRq.setMonto(sDebtAmount);
				extornoAutAnulRq.setFechaHoraTransaccion1(fechaHoraTransaccion);
				extornoAutAnulRq.setRetrievalReferenceNumber(operation.getOperationNumber()); // "" +
																								// System.currentTimeMillis()
				extornoAutAnulRq.setTransactionCurrencyCode(currencyScoEnum.getValue());
				// ORIGINAL DATA ELEMENTS
				String fechaTransaccion2 = CommonsUtilities.convertDateToString(operation.getOperationDate(),
						TRANS_FORMAT_DATE);
				extornoAutAnulRq.setFechaHoraTransaccion2(fechaTransaccion2);
				// DATOS DEL REQUERIMIENTO
				extornoAutAnulRq.setDatoPago(operation.getAcreencia().getDatoPago());
				// RECIBO A ANULAR
				extornoAutAnulRq.setNumeroDocumento("" + operation.getAcreencia().getIdAcreencia());
				extornoAutAnulRq.setNumeroTransCobOri(operation.getOperationNumber());
				extornoAutAnulRq.setNumeroOpeOriginalAcreed("" + operation.getIdOperation());

				StringBuilder sb = new StringBuilder();
				String cabecera = String.format(
						"Bank Reference (Documento): %s, Operation Number Annul To Extorn: %s, Cliente: %s",
						extornoAutAnulRq.getNumeroDocumento(), operation.getOperationNumber(),
						extornoAutAnulRq.getDatoPago());
				sb.append(cabecera);
				sb.append("\n");
				sb.append(extornoAutAnulRq.getInput());
				sb.append("\n");
				writer.append(sb.toString());
			}

			writer.flush();
			writer.close();

		} catch (Exception e) {
			log.error("Error", e);
		}

	}

}
