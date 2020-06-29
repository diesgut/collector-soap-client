package com.diesgut.collectorsoapclient.scotia.model;





import com.diesgut.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgut.collectorsoapclient.scotia.enums.MessageTypeScoEnum;
import com.diesgut.collectorsoapclient.scotia.enums.PagoRqFieldEnum;
import com.diesgut.collectorsoapclient.scotia.enums.ScotiaProcessCodeEnum;
import com.diesgut.collectorsoapclient.util.CommonsUtilities;
import org.apache.commons.lang3.StringUtils;

public class PagoRq {

	private String messageTypeId;
	private String primaryBitMap;
	private String secondaryBitMap;
	private String numeroTarjeta;
	private String codigoProceso;
	private String monto;
	private String fechaHoraTransaccion;
	private String trace;
	private String fechaCaptura;
	private String modoIngresoDatos;
	private String canal;
	private String binAdquiriente;
	private String forwardInstitutionCode;
	private String retrievelRefereneNumber;
	private String terminalId;
	private String comercio;
	private String cardAcceptorLocation;
	private String transactionCurrencyCode;
	private String datosReservados;
	// datos del requerimiento
	private String longitudTrama;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProductoServicio;
	private String codigoPlazaRecaudador;
	private String codigoAgenciaRecaudador;;
	private String tipoDatoPago;
	private String datoPago;
	private String codigoCiudad;
	private String numeroProdServPagad;
	private String numeroTotalDocPagad;
	private String filler1;
	private String medioPago;
	private String importePagadoEfectivo;
	private String importePagCctA;
	private String nroCheque1;
	private String bcoGirador1;
	private String importeCheque1;
	private String plazaCheque1;
	private String nroCheque2;
	private String bcoGirador2;
	private String importeCheque2;
	private String plazaCheque2;
	private String nroCheque3;
	private String bcoGirador3;
	private String importeCheque3;
	private String plazaCheque3;
	private String monedaPago;
	private String tipoCambioAplicado;
	private String pagoTotalRealizado;
	private String filler2;
	private String codigoServicioPagado;
	private String estadoDeudor;
	private String importeTotalXprodServ;
	private String nroCuentaAbono;
	private String nroReferenciaAbono;
	private String nroDocumenosPagados;
	private String filler3;
	private String tipoDocumentoPago;
	private String nroDocumentoDePag;
	private String periodoCotizacion;
	private String tipoDocIdDeudor;
	private String nroDocIdDeudor;
	private String importeOriginalDeuda;
	private String importePagadoDocto;
	private String codigoConcepto1;
	private String importeConcepto1;
	private String codigoConcepto2;
	private String importeConcepto2;
	private String codigoConcepto3;
	private String importeConcepto3;
	private String codigoConcepto4;
	private String importeConcepto4;
	private String codigoConcepto5;
	private String importeConcepto5;
	private String referenciaDeuda;
	private String filler4;
	private String filler5;
	private String filler6;

	public PagoRq() {
		super();
	}

	public PagoRq(String input) {

		messageTypeId = this.getStringByPosition(input, PagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION);
		primaryBitMap = this.getStringByPosition(input, PagoRqFieldEnum.PRIMARY_BIT_MAP);
		secondaryBitMap = this.getStringByPosition(input, PagoRqFieldEnum.SECONDARY_BIT_MAP);
		numeroTarjeta = this.getStringByPosition(input, PagoRqFieldEnum.NUMERO_DE_TARJETA);
		codigoProceso = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_PROCESO);
		monto = this.getStringByPosition(input, PagoRqFieldEnum.MONTO);
		fechaHoraTransaccion = this.getStringByPosition(input, PagoRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION);
		trace = this.getStringByPosition(input, PagoRqFieldEnum.TRACE);
		fechaCaptura = this.getStringByPosition(input, PagoRqFieldEnum.FECHA_DE_CAPTURA);
		modoIngresoDatos = this.getStringByPosition(input, PagoRqFieldEnum.MODO_DE_INGRESO_DE_DATOS);
		canal = this.getStringByPosition(input, PagoRqFieldEnum.CANAL);
		binAdquiriente = this.getStringByPosition(input, PagoRqFieldEnum.BIN_ADQUIRIENTE);
		forwardInstitutionCode = this.getStringByPosition(input, PagoRqFieldEnum.FORWARD_INSTITUTION_CODE);
		retrievelRefereneNumber = this.getStringByPosition(input, PagoRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER);
		terminalId = this.getStringByPosition(input, PagoRqFieldEnum.TERMINAL_ID);
		comercio = this.getStringByPosition(input, PagoRqFieldEnum.COMERCIO);
		cardAcceptorLocation = this.getStringByPosition(input, PagoRqFieldEnum.CARD_ACCEPTOR_LOCATION);
		transactionCurrencyCode = this.getStringByPosition(input, PagoRqFieldEnum.TRANSACTION_CURRENCY_CODE);
		datosReservados = this.getStringByPosition(input, PagoRqFieldEnum.DATOS_RESERVADOS);
		// datos del requerimiento
		longitudTrama = this.getStringByPosition(input, PagoRqFieldEnum.LONGITUD_DE_LA_TRAMA);
		codigoFormato = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_FORMATO);
		binProcesador = this.getStringByPosition(input, PagoRqFieldEnum.BIN_PROCESADOR);
		codigoAcreedor = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_ACREEDOR);
		codigoProductoServicio = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO);
		codigoPlazaRecaudador = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR);
		codigoAgenciaRecaudador = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR);
		tipoDatoPago = this.getStringByPosition(input, PagoRqFieldEnum.TIPO_DE_DATO_DE_PAGO);
		datoPago = this.getStringByPosition(input, PagoRqFieldEnum.DATO_DE_PAGO);
		codigoCiudad = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_CIUDAD);
		numeroProdServPagad = this.getStringByPosition(input, PagoRqFieldEnum.NUMERO_DE_PROD_SERV_PAGAD);
		numeroTotalDocPagad = this.getStringByPosition(input, PagoRqFieldEnum.NUMERO_TOTAL_DE_DOC_PAGAD);
		filler1 = this.getStringByPosition(input, PagoRqFieldEnum.FILLER1);
		medioPago = this.getStringByPosition(input, PagoRqFieldEnum.MEDIO_DE_PAGO);
		importePagadoEfectivo = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_PAGADO_EFECTIVO);
		importePagCctA = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_PAG_C_CTA);
		nroCheque1 = this.getStringByPosition(input, PagoRqFieldEnum.NRO_CHEQUE1);
		bcoGirador1 = this.getStringByPosition(input, PagoRqFieldEnum.BCO_GIRADOR1);
		importeCheque1 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_CHEQUE1);
		plazaCheque1 = this.getStringByPosition(input, PagoRqFieldEnum.PLAZA_CHEQUE1);
		nroCheque2 = this.getStringByPosition(input, PagoRqFieldEnum.NRO_CHEQUE2);
		bcoGirador2 = this.getStringByPosition(input, PagoRqFieldEnum.BCO_GIRADOR2);
		importeCheque2 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_CHEQUE2);
		plazaCheque2 = this.getStringByPosition(input, PagoRqFieldEnum.PLAZA_CHEQUE2);
		nroCheque3 = this.getStringByPosition(input, PagoRqFieldEnum.NRO_CHEQUE3);
		bcoGirador3 = this.getStringByPosition(input, PagoRqFieldEnum.BCO_GIRADOR3);
		importeCheque3 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_CHEQUE3);
		plazaCheque3 = this.getStringByPosition(input, PagoRqFieldEnum.PLAZA_CHEQUE3);
		monedaPago = this.getStringByPosition(input, PagoRqFieldEnum.MONEDA_DE_PAGO);
		tipoCambioAplicado = this.getStringByPosition(input, PagoRqFieldEnum.TIPO_DE_CAMBIO_APLICADO);
		pagoTotalRealizado = this.getStringByPosition(input, PagoRqFieldEnum.PAGO_TOTAL_REALIZADO);
		filler2 = this.getStringByPosition(input, PagoRqFieldEnum.FILLER2);
		codigoServicioPagado = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DEL_SERVICIO_PAGADO);
		estadoDeudor = this.getStringByPosition(input, PagoRqFieldEnum.ESTADO_DEL_DEUDOR);
		importeTotalXprodServ = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_TOTAL_X_PROD_SERV);
		nroCuentaAbono = this.getStringByPosition(input, PagoRqFieldEnum.NRO_DE_CUENTA_DE_ABONO);
		nroReferenciaAbono = this.getStringByPosition(input, PagoRqFieldEnum.NRO_DE_REFERENCIA_DEL_ABONO);
		nroDocumenosPagados = this.getStringByPosition(input, PagoRqFieldEnum.NRO_DE_DOCUMENTOS_PAGADOS);
		messageTypeId = this.getStringByPosition(input, PagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION);
		filler3 = this.getStringByPosition(input, PagoRqFieldEnum.FILLER3);
		tipoDocumentoPago = this.getStringByPosition(input, PagoRqFieldEnum.TIPO_DE_DOCUMENTO_DE_PAGO);
		nroDocumentoDePag = this.getStringByPosition(input, PagoRqFieldEnum.NUMERO_DE_DOCUMENTO_DE_PAG);
		periodoCotizacion = this.getStringByPosition(input, PagoRqFieldEnum.PERIODO_DE_COTIZACION);
		tipoDocIdDeudor = this.getStringByPosition(input, PagoRqFieldEnum.TIPO_DOC_ID_DEUDOR);
		nroDocIdDeudor = this.getStringByPosition(input, PagoRqFieldEnum.NUMERO_DOC_ID_DEL_DEUDOR);
		importeOriginalDeuda = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_ORIGINAL_DE_LA_DEUDA);
		importePagadoDocto = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_PAGADO_DEL_DOCTO);
		codigoConcepto1 = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_1);
		importeConcepto1 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO1);
		codigoConcepto2 = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_2);
		importeConcepto2 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO2);
		codigoConcepto3 = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_3);
		importeConcepto3 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO3);
		codigoConcepto4 = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_4);
		importeConcepto4 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO4);
		codigoConcepto5 = this.getStringByPosition(input, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_5);
		importeConcepto5 = this.getStringByPosition(input, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO5);
		referenciaDeuda = this.getStringByPosition(input, PagoRqFieldEnum.REFERENCIA_DE_LA_DEUDA);
		filler4 = this.getStringByPosition(input, PagoRqFieldEnum.FILLER4);
		filler5 = this.getStringByPosition(input, PagoRqFieldEnum.FILLER5);
		filler6 = this.getStringByPosition(filler6, PagoRqFieldEnum.FILLER6);

	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, PagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION) );
		sBuilder.append( this.getStringFilled(primaryBitMap, PagoRqFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secondaryBitMap, PagoRqFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(numeroTarjeta, PagoRqFieldEnum.NUMERO_DE_TARJETA) );
		sBuilder.append( this.getStringFilled(codigoProceso, PagoRqFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, PagoRqFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion, PagoRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION) );
		sBuilder.append( this.getStringFilled(trace, PagoRqFieldEnum.TRACE) );
		sBuilder.append( this.getStringFilled(fechaCaptura, PagoRqFieldEnum.FECHA_DE_CAPTURA) );
		sBuilder.append( this.getStringFilled(modoIngresoDatos, PagoRqFieldEnum.MODO_DE_INGRESO_DE_DATOS) );
		sBuilder.append( this.getStringFilled(canal, PagoRqFieldEnum.CANAL) );
		sBuilder.append( this.getStringFilled(binAdquiriente, PagoRqFieldEnum.BIN_ADQUIRIENTE) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCode, PagoRqFieldEnum.FORWARD_INSTITUTION_CODE) );
		sBuilder.append( this.getStringFilled(retrievelRefereneNumber, PagoRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(terminalId, PagoRqFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(comercio, PagoRqFieldEnum.COMERCIO) );
		sBuilder.append( this.getStringFilled(cardAcceptorLocation, PagoRqFieldEnum.CARD_ACCEPTOR_LOCATION) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, PagoRqFieldEnum.TRANSACTION_CURRENCY_CODE) );
		sBuilder.append( this.getStringFilled(datosReservados, PagoRqFieldEnum.DATOS_RESERVADOS) );
		//DATOS DEL REQUERIMIENTO
		sBuilder.append( this.getStringFilled(longitudTrama, PagoRqFieldEnum.LONGITUD_DE_LA_TRAMA) );
		sBuilder.append( this.getStringFilled(codigoFormato, PagoRqFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, PagoRqFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(codigoAcreedor, PagoRqFieldEnum.CODIGO_DE_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProductoServicio, PagoRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO) );
		sBuilder.append( this.getStringFilled(codigoPlazaRecaudador, PagoRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(codigoAgenciaRecaudador, PagoRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(tipoDatoPago, PagoRqFieldEnum.TIPO_DE_DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(datoPago, PagoRqFieldEnum.DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(codigoCiudad, PagoRqFieldEnum.CODIGO_DE_CIUDAD) );
		sBuilder.append( this.getStringFilled(numeroProdServPagad, PagoRqFieldEnum.NUMERO_DE_PROD_SERV_PAGAD) );
		sBuilder.append( this.getStringFilled(numeroTotalDocPagad, PagoRqFieldEnum.NUMERO_TOTAL_DE_DOC_PAGAD) );
		sBuilder.append( this.getStringFilled(filler1, PagoRqFieldEnum.FILLER1) );
		sBuilder.append( this.getStringFilled(medioPago, PagoRqFieldEnum.MEDIO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(importePagadoEfectivo, PagoRqFieldEnum.IMPORTE_PAGADO_EFECTIVO) );
		sBuilder.append( this.getStringFilled(importePagCctA, PagoRqFieldEnum.IMPORTE_PAG_C_CTA) );
		sBuilder.append( this.getStringFilled(nroCheque1, PagoRqFieldEnum.NRO_CHEQUE1) );
		sBuilder.append( this.getStringFilled(bcoGirador1, PagoRqFieldEnum.BCO_GIRADOR1) );
		sBuilder.append( this.getStringFilled(importeCheque1, PagoRqFieldEnum.IMPORTE_CHEQUE1) );
		sBuilder.append( this.getStringFilled(plazaCheque1, PagoRqFieldEnum.PLAZA_CHEQUE1) );
		sBuilder.append( this.getStringFilled(nroCheque2, PagoRqFieldEnum.NRO_CHEQUE2) );
		sBuilder.append( this.getStringFilled(bcoGirador2, PagoRqFieldEnum.BCO_GIRADOR2) );
		sBuilder.append( this.getStringFilled(importeCheque2, PagoRqFieldEnum.IMPORTE_CHEQUE2) );
		sBuilder.append( this.getStringFilled(plazaCheque2, PagoRqFieldEnum.PLAZA_CHEQUE2) );
		sBuilder.append( this.getStringFilled(nroCheque3, PagoRqFieldEnum.NRO_CHEQUE3) );
		sBuilder.append( this.getStringFilled(bcoGirador3, PagoRqFieldEnum.BCO_GIRADOR3) );
		sBuilder.append( this.getStringFilled(importeCheque3, PagoRqFieldEnum.IMPORTE_CHEQUE3) );
		sBuilder.append( this.getStringFilled(plazaCheque3, PagoRqFieldEnum.PLAZA_CHEQUE3) );
		sBuilder.append( this.getStringFilled(monedaPago, PagoRqFieldEnum.MONEDA_DE_PAGO) );
		sBuilder.append( this.getStringFilled(tipoCambioAplicado, PagoRqFieldEnum.TIPO_DE_CAMBIO_APLICADO) );
		sBuilder.append( this.getStringFilled(pagoTotalRealizado, PagoRqFieldEnum.PAGO_TOTAL_REALIZADO) );
		sBuilder.append( this.getStringFilled(filler2, PagoRqFieldEnum.FILLER2) );
		sBuilder.append( this.getStringFilled(codigoServicioPagado, PagoRqFieldEnum.CODIGO_DEL_SERVICIO_PAGADO) );
		sBuilder.append( this.getStringFilled(estadoDeudor, PagoRqFieldEnum.ESTADO_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(importeTotalXprodServ, PagoRqFieldEnum.IMPORTE_TOTAL_X_PROD_SERV) );
		sBuilder.append( this.getStringFilled(nroCuentaAbono, PagoRqFieldEnum.NRO_DE_CUENTA_DE_ABONO) );
		sBuilder.append( this.getStringFilled(nroReferenciaAbono, PagoRqFieldEnum.NRO_DE_REFERENCIA_DEL_ABONO) );
		sBuilder.append( this.getStringFilled(nroDocumenosPagados, PagoRqFieldEnum.NRO_DE_DOCUMENTOS_PAGADOS) );
		sBuilder.append( this.getStringFilled(filler3, PagoRqFieldEnum.FILLER3) );
		sBuilder.append( this.getStringFilled(tipoDocumentoPago, PagoRqFieldEnum.TIPO_DE_DOCUMENTO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(nroDocumentoDePag, PagoRqFieldEnum.NUMERO_DE_DOCUMENTO_DE_PAG) );
		sBuilder.append( this.getStringFilled(periodoCotizacion, PagoRqFieldEnum.PERIODO_DE_COTIZACION) );
		sBuilder.append( this.getStringFilled(tipoDocIdDeudor, PagoRqFieldEnum.TIPO_DOC_ID_DEUDOR) );
		sBuilder.append( this.getStringFilled(nroDocIdDeudor, PagoRqFieldEnum.NUMERO_DOC_ID_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(importeOriginalDeuda, PagoRqFieldEnum.IMPORTE_ORIGINAL_DE_LA_DEUDA) );
		sBuilder.append( this.getStringFilled(importePagadoDocto, PagoRqFieldEnum.IMPORTE_PAGADO_DEL_DOCTO) );
		sBuilder.append( this.getStringFilled(codigoConcepto1, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_1) );
		sBuilder.append( this.getStringFilled(importeConcepto1, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO1) );
		sBuilder.append( this.getStringFilled(codigoConcepto2, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_2) );
		sBuilder.append( this.getStringFilled(importeConcepto2, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO2) );
		sBuilder.append( this.getStringFilled(codigoConcepto3, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_3) );
		sBuilder.append( this.getStringFilled(importeConcepto3, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO3) );
		sBuilder.append( this.getStringFilled(codigoConcepto4, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_4) );
		sBuilder.append( this.getStringFilled(importeConcepto4, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO4) );
		sBuilder.append( this.getStringFilled(codigoConcepto5, PagoRqFieldEnum.CODIGO_DE_CONCEPTO_5) );
		sBuilder.append( this.getStringFilled(importeConcepto5, PagoRqFieldEnum.IMPORTE_DE_CONCEPTO5) );
		sBuilder.append( this.getStringFilled(referenciaDeuda, PagoRqFieldEnum.REFERENCIA_DE_LA_DEUDA) );
		sBuilder.append( this.getStringFilled(filler4, PagoRqFieldEnum.FILLER4) );
		sBuilder.append( this.getStringFilled(filler5, PagoRqFieldEnum.FILLER5) );
		sBuilder.append( this.getStringFilled(filler6, PagoRqFieldEnum.FILLER6) );
		return sBuilder.toString();
	}
	
	public String getStringFilled(String input, PagoRqFieldEnum pagoRqFieldEnum) {
		String preData=input==null ? "":input;
		if (preData.length() >=pagoRqFieldEnum.getDataLength()) {
			preData = preData.substring(0, pagoRqFieldEnum.getDataLength());
		}
		if(pagoRqFieldEnum.getAlign()==AlignFillEnum.RIGHT) {
			input=StringUtils.rightPad(preData,pagoRqFieldEnum.getDataLength(), pagoRqFieldEnum.getDataFill());
		}else if(pagoRqFieldEnum.getAlign()==AlignFillEnum.LEFT) {
			input=StringUtils.leftPad(preData,pagoRqFieldEnum.getDataLength(), pagoRqFieldEnum.getDataFill());
		}
		return input;
	}

	public String getStringByPosition(String input, PagoRqFieldEnum type) {
		return CommonsUtilities.getStringValueByPosition(input, type.getPositions());
	}

	public void defaultData(String codigoTipoServicio) {
		this.setMessageTypeId(MessageTypeScoEnum.CONS_PAG_ANU_RQ.getCode());

		this.setPrimaryBitMap("F220848188E08000");
		this.setSecondaryBitMap("0000000000000018");
		this.setNumeroTarjeta("160000000000000000");
		this.setCodigoProceso(ScotiaProcessCodeEnum.PAGO_DEUDA.getCode());
		this.setMonto("000000099995");
		this.setFechaHoraTransaccion("1122113503");
		this.setTrace("831237");
		this.setFechaCaptura("1122");
		this.setModoIngresoDatos("000");
		this.setCanal("90");
		this.setBinAdquiriente("1006");
		this.setForwardInstitutionCode("1006");
		this.setRetrievelRefereneNumber("847501860708");
		this.setTerminalId("0056");
		this.setComercio("000000000000000");
		this.setCardAcceptorLocation("SOLUCIONES|PARA|EMPRESAS");
		this.setTransactionCurrencyCode("604");
		this.setDatosReservados("00220");
		// DATOS REQUERIMIENTO
		this.setLongitudTrama("468");
		this.setCodigoFormato("01");
		this.setBinProcesador("000000");
		this.setCodigoAcreedor("051");
		this.setCodigoProductoServicio("REC");
		this.setCodigoPlazaRecaudador("0000");
		this.setCodigoAgenciaRecaudador("847");
		this.setTipoDatoPago("01");
		this.setDatoPago("2018064953");
		this.setCodigoCiudad("847");
		this.setNumeroProdServPagad("01");
		this.setNumeroTotalDocPagad("001");
		this.setFiller1("");
		this.setMedioPago("00");
		this.setImportePagadoEfectivo("00000099995");
		this.setImportePagCctA("00000000000");
		this.setNroCheque1("");
		this.setBcoGirador1("");
		this.setImporteCheque1("00000000000");
		this.setPlazaCheque1("");
		this.setNroCheque2("");
		this.setBcoGirador2("");
		this.setImporteCheque2("00000000000");
		this.setPlazaCheque2("");
		this.setNroCheque3("");
		this.setBcoGirador3("");
		this.setImporteCheque3("00000000000");
		this.setPlazaCheque3("");
		this.setMonedaPago("604");
		this.setTipoCambioAplicado("00000000000");
		this.setPagoTotalRealizado("00000099995");
		this.setFiller2("");
		this.setCodigoServicioPagado(codigoTipoServicio); //003
		this.setEstadoDeudor("V");
		this.setImporteTotalXprodServ("00000099995"); //
		this.setNroCuentaAbono("");
		this.setNroReferenciaAbono(""+System.currentTimeMillis()); //847501860708
		this.setNroDocumenosPagados("01");
		this.setFiller3("");
		this.setTipoDocumentoPago(codigoTipoServicio); //003
		this.setNumeroTotalDocPagad("2018064953");
		this.setPeriodoCotizacion("");
		this.setTipoDocIdDeudor("");
		this.setNroDocIdDeudor("");
		this.setImporteOriginalDeuda("00283199995"); //
		this.setImportePagadoDocto("00000099995"); //
		this.setCodigoConcepto1("00");
		this.setImporteConcepto1("00000000000");
		this.setCodigoConcepto2("00");
		this.setImporteConcepto2("00000000000");
		this.setCodigoConcepto3("00");
		this.setImporteConcepto3("00000000000");
		this.setCodigoConcepto4("00");
		this.setImporteConcepto4("00000000000");
		this.setCodigoConcepto5("00");
		this.setImporteConcepto5("00000000000");
		this.setReferenciaDeuda("2018064953"); //
		this.setFiller4("RECAU|PROFORMA|SOLES");
		this.setFiller5("");
		this.setFiller6(".");
	}
	
	public String getMessageTypeId() {
		return messageTypeId;
	}

	public void setMessageTypeId(String messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public String getPrimaryBitMap() {
		return primaryBitMap;
	}

	public void setPrimaryBitMap(String primaryBitMap) {
		this.primaryBitMap = primaryBitMap;
	}

	public String getSecondaryBitMap() {
		return secondaryBitMap;
	}

	public void setSecondaryBitMap(String secondaryBitMap) {
		this.secondaryBitMap = secondaryBitMap;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCodigoProceso() {
		return codigoProceso;
	}

	public void setCodigoProceso(String codigoProceso) {
		this.codigoProceso = codigoProceso;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getFechaHoraTransaccion() {
		return fechaHoraTransaccion;
	}

	public void setFechaHoraTransaccion(String fechaHoraTransaccion) {
		this.fechaHoraTransaccion = fechaHoraTransaccion;
	}

	public String getTrace() {
		return trace;
	}

	public void setTrace(String trace) {
		this.trace = trace;
	}

	public String getFechaCaptura() {
		return fechaCaptura;
	}

	public void setFechaCaptura(String fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

	public String getModoIngresoDatos() {
		return modoIngresoDatos;
	}

	public void setModoIngresoDatos(String modoIngresoDatos) {
		this.modoIngresoDatos = modoIngresoDatos;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getBinAdquiriente() {
		return binAdquiriente;
	}

	public void setBinAdquiriente(String binAdquiriente) {
		this.binAdquiriente = binAdquiriente;
	}

	public String getForwardInstitutionCode() {
		return forwardInstitutionCode;
	}

	public void setForwardInstitutionCode(String forwardInstitutionCode) {
		this.forwardInstitutionCode = forwardInstitutionCode;
	}

	public String getRetrievelRefereneNumber() {
		return retrievelRefereneNumber;
	}

	public void setRetrievelRefereneNumber(String retrievelRefereneNumber) {
		this.retrievelRefereneNumber = retrievelRefereneNumber;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getComercio() {
		return comercio;
	}

	public void setComercio(String comercio) {
		this.comercio = comercio;
	}

	public String getCardAcceptorLocation() {
		return cardAcceptorLocation;
	}

	public void setCardAcceptorLocation(String cardAcceptorLocation) {
		this.cardAcceptorLocation = cardAcceptorLocation;
	}

	public String getTransactionCurrencyCode() {
		return transactionCurrencyCode;
	}

	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		this.transactionCurrencyCode = transactionCurrencyCode;
	}

	public String getDatosReservados() {
		return datosReservados;
	}

	public void setDatosReservados(String datosReservados) {
		this.datosReservados = datosReservados;
	}

	public String getLongitudTrama() {
		return longitudTrama;
	}

	public void setLongitudTrama(String longitudTrama) {
		this.longitudTrama = longitudTrama;
	}

	public String getCodigoFormato() {
		return codigoFormato;
	}

	public void setCodigoFormato(String codigoFormato) {
		this.codigoFormato = codigoFormato;
	}

	public String getBinProcesador() {
		return binProcesador;
	}

	public void setBinProcesador(String binProcesador) {
		this.binProcesador = binProcesador;
	}

	public String getCodigoAcreedor() {
		return codigoAcreedor;
	}

	public void setCodigoAcreedor(String codigoAcreedor) {
		this.codigoAcreedor = codigoAcreedor;
	}

	public String getCodigoProductoServicio() {
		return codigoProductoServicio;
	}

	public void setCodigoProductoServicio(String codigoProductoServicio) {
		this.codigoProductoServicio = codigoProductoServicio;
	}

	public String getCodigoPlazaRecaudador() {
		return codigoPlazaRecaudador;
	}

	public void setCodigoPlazaRecaudador(String codigoPlazaRecaudador) {
		this.codigoPlazaRecaudador = codigoPlazaRecaudador;
	}

	public String getCodigoAgenciaRecaudador() {
		return codigoAgenciaRecaudador;
	}

	public void setCodigoAgenciaRecaudador(String codigoAgenciaRecaudador) {
		this.codigoAgenciaRecaudador = codigoAgenciaRecaudador;
	}

	public String getTipoDatoPago() {
		return tipoDatoPago;
	}

	public void setTipoDatoPago(String tipoDatoPago) {
		this.tipoDatoPago = tipoDatoPago;
	}

	public String getDatoPago() {
		return datoPago;
	}

	public void setDatoPago(String datoPago) {
		this.datoPago = datoPago;
	}

	public String getCodigoCiudad() {
		return codigoCiudad;
	}

	public void setCodigoCiudad(String codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}

	public String getNumeroProdServPagad() {
		return numeroProdServPagad;
	}

	public void setNumeroProdServPagad(String numeroProdServPagad) {
		this.numeroProdServPagad = numeroProdServPagad;
	}

	public String getNumeroTotalDocPagad() {
		return numeroTotalDocPagad;
	}

	public void setNumeroTotalDocPagad(String numeroTotalDocPagad) {
		this.numeroTotalDocPagad = numeroTotalDocPagad;
	}

	public String getFiller1() {
		return filler1;
	}

	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public String getImportePagadoEfectivo() {
		return importePagadoEfectivo;
	}

	public void setImportePagadoEfectivo(String importePagadoEfectivo) {
		this.importePagadoEfectivo = importePagadoEfectivo;
	}

	public String getImportePagCctA() {
		return importePagCctA;
	}

	public void setImportePagCctA(String importePagCctA) {
		this.importePagCctA = importePagCctA;
	}

	public String getNroCheque1() {
		return nroCheque1;
	}

	public void setNroCheque1(String nroCheque1) {
		this.nroCheque1 = nroCheque1;
	}

	public String getBcoGirador1() {
		return bcoGirador1;
	}

	public void setBcoGirador1(String bcoGirador1) {
		this.bcoGirador1 = bcoGirador1;
	}

	public String getImporteCheque1() {
		return importeCheque1;
	}

	public void setImporteCheque1(String importeCheque1) {
		this.importeCheque1 = importeCheque1;
	}

	public String getPlazaCheque1() {
		return plazaCheque1;
	}

	public void setPlazaCheque1(String plazaCheque1) {
		this.plazaCheque1 = plazaCheque1;
	}

	public String getNroCheque2() {
		return nroCheque2;
	}

	public void setNroCheque2(String nroCheque2) {
		this.nroCheque2 = nroCheque2;
	}

	public String getBcoGirador2() {
		return bcoGirador2;
	}

	public void setBcoGirador2(String bcoGirador2) {
		this.bcoGirador2 = bcoGirador2;
	}

	public String getImporteCheque2() {
		return importeCheque2;
	}

	public void setImporteCheque2(String importeCheque2) {
		this.importeCheque2 = importeCheque2;
	}

	public String getPlazaCheque2() {
		return plazaCheque2;
	}

	public void setPlazaCheque2(String plazaCheque2) {
		this.plazaCheque2 = plazaCheque2;
	}

	public String getNroCheque3() {
		return nroCheque3;
	}

	public void setNroCheque3(String nroCheque3) {
		this.nroCheque3 = nroCheque3;
	}

	public String getBcoGirador3() {
		return bcoGirador3;
	}

	public void setBcoGirador3(String bcoGirador3) {
		this.bcoGirador3 = bcoGirador3;
	}

	public String getImporteCheque3() {
		return importeCheque3;
	}

	public void setImporteCheque3(String importeCheque3) {
		this.importeCheque3 = importeCheque3;
	}

	public String getPlazaCheque3() {
		return plazaCheque3;
	}

	public void setPlazaCheque3(String plazaCheque3) {
		this.plazaCheque3 = plazaCheque3;
	}

	public String getMonedaPago() {
		return monedaPago;
	}

	public void setMonedaPago(String monedaPago) {
		this.monedaPago = monedaPago;
	}

	public String getTipoCambioAplicado() {
		return tipoCambioAplicado;
	}

	public void setTipoCambioAplicado(String tipoCambioAplicado) {
		this.tipoCambioAplicado = tipoCambioAplicado;
	}

	public String getPagoTotalRealizado() {
		return pagoTotalRealizado;
	}

	public void setPagoTotalRealizado(String pagoTotalRealizado) {
		this.pagoTotalRealizado = pagoTotalRealizado;
	}

	public String getFiller2() {
		return filler2;
	}

	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public String getCodigoServicioPagado() {
		return codigoServicioPagado;
	}

	public void setCodigoServicioPagado(String codigoServicioPagado) {
		this.codigoServicioPagado = codigoServicioPagado;
	}

	public String getEstadoDeudor() {
		return estadoDeudor;
	}

	public void setEstadoDeudor(String estadoDeudor) {
		this.estadoDeudor = estadoDeudor;
	}

	public String getImporteTotalXprodServ() {
		return importeTotalXprodServ;
	}

	public void setImporteTotalXprodServ(String importeTotalXprodServ) {
		this.importeTotalXprodServ = importeTotalXprodServ;
	}

	public String getNroCuentaAbono() {
		return nroCuentaAbono;
	}

	public void setNroCuentaAbono(String nroCuentaAbono) {
		this.nroCuentaAbono = nroCuentaAbono;
	}

	public String getNroReferenciaAbono() {
		return nroReferenciaAbono;
	}

	public void setNroReferenciaAbono(String nroReferenciaAbono) {
		this.nroReferenciaAbono = nroReferenciaAbono;
	}

	public String getNroDocumenosPagados() {
		return nroDocumenosPagados;
	}

	public void setNroDocumenosPagados(String nroDocumenosPagados) {
		this.nroDocumenosPagados = nroDocumenosPagados;
	}

	public String getFiller3() {
		return filler3;
	}

	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}

	public String getTipoDocumentoPago() {
		return tipoDocumentoPago;
	}

	public void setTipoDocumentoPago(String tipoDocumentoPago) {
		this.tipoDocumentoPago = tipoDocumentoPago;
	}

	public String getNroDocumentoDePag() {
		return nroDocumentoDePag;
	}

	public void setNroDocumentoDePag(String nroDocumentoDePag) {
		this.nroDocumentoDePag = nroDocumentoDePag;
	}

	public String getPeriodoCotizacion() {
		return periodoCotizacion;
	}

	public void setPeriodoCotizacion(String periodoCotizacion) {
		this.periodoCotizacion = periodoCotizacion;
	}

	public String getTipoDocIdDeudor() {
		return tipoDocIdDeudor;
	}

	public void setTipoDocIdDeudor(String tipoDocIdDeudor) {
		this.tipoDocIdDeudor = tipoDocIdDeudor;
	}

	public String getNroDocIdDeudor() {
		return nroDocIdDeudor;
	}

	public void setNroDocIdDeudor(String nroDocIdDeudor) {
		this.nroDocIdDeudor = nroDocIdDeudor;
	}

	public String getImporteOriginalDeuda() {
		return importeOriginalDeuda;
	}

	public void setImporteOriginalDeuda(String importeOriginalDeuda) {
		this.importeOriginalDeuda = importeOriginalDeuda;
	}

	public String getImportePagadoDocto() {
		return importePagadoDocto;
	}

	public void setImportePagadoDocto(String importePagadoDocto) {
		this.importePagadoDocto = importePagadoDocto;
	}

	public String getCodigoConcepto1() {
		return codigoConcepto1;
	}

	public void setCodigoConcepto1(String codigoConcepto1) {
		this.codigoConcepto1 = codigoConcepto1;
	}

	public String getImporteConcepto1() {
		return importeConcepto1;
	}

	public void setImporteConcepto1(String importeConcepto1) {
		this.importeConcepto1 = importeConcepto1;
	}

	public String getCodigoConcepto2() {
		return codigoConcepto2;
	}

	public void setCodigoConcepto2(String codigoConcepto2) {
		this.codigoConcepto2 = codigoConcepto2;
	}

	public String getImporteConcepto2() {
		return importeConcepto2;
	}

	public void setImporteConcepto2(String importeConcepto2) {
		this.importeConcepto2 = importeConcepto2;
	}

	public String getCodigoConcepto3() {
		return codigoConcepto3;
	}

	public void setCodigoConcepto3(String codigoConcepto3) {
		this.codigoConcepto3 = codigoConcepto3;
	}

	public String getImporteConcepto3() {
		return importeConcepto3;
	}

	public void setImporteConcepto3(String importeConcepto3) {
		this.importeConcepto3 = importeConcepto3;
	}

	public String getCodigoConcepto4() {
		return codigoConcepto4;
	}

	public void setCodigoConcepto4(String codigoConcepto4) {
		this.codigoConcepto4 = codigoConcepto4;
	}

	public String getImporteConcepto4() {
		return importeConcepto4;
	}

	public void setImporteConcepto4(String importeConcepto4) {
		this.importeConcepto4 = importeConcepto4;
	}

	public String getCodigoConcepto5() {
		return codigoConcepto5;
	}

	public void setCodigoConcepto5(String codigoConcepto5) {
		this.codigoConcepto5 = codigoConcepto5;
	}

	public String getImporteConcepto5() {
		return importeConcepto5;
	}

	public void setImporteConcepto5(String importeConcepto5) {
		this.importeConcepto5 = importeConcepto5;
	}

	public String getReferenciaDeuda() {
		return referenciaDeuda;
	}

	public void setReferenciaDeuda(String referenciaDeuda) {
		this.referenciaDeuda = referenciaDeuda;
	}

	public String getFiller4() {
		return filler4;
	}

	public void setFiller4(String filler4) {
		this.filler4 = filler4;
	}

	public String getFiller5() {
		return filler5;
	}

	public void setFiller5(String filler5) {
		this.filler5 = filler5;
	}

	public String getFiller6() {
		return filler6;
	}

	public void setFiller6(String filler6) {
		this.filler6 = filler6;
	}

}
