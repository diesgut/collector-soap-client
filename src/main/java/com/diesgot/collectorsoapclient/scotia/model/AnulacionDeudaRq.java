package com.diesgot.collectorsoapclient.scotia.model;

import org.apache.commons.lang3.StringUtils;

import com.diesgot.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgot.collectorsoapclient.scotia.enums.AnulacionDeudaRqFieldEnum;
import com.diesgot.collectorsoapclient.scotia.enums.MessageTypeScoEnum;
import com.diesgot.collectorsoapclient.scotia.enums.PagoRqFieldEnum;
import com.diesgot.collectorsoapclient.scotia.enums.ScotiaProcessCodeEnum;
import com.diesgot.collectorsoapclient.util.CommonsUtilities;

public class AnulacionDeudaRq {

	private String messageTypeId;
	private String primaryBitMap;
	private String secondaryBitMap;
	private String numeroTarjeta;
	private String codigoProceso;
	private String monto;
	private String fechaHoraTransaccion1;
	private String trace1;
	private String fechaCaptura;
	private String modoIngresoDatos;
	private String canal;
	private String binAdquiriente1;
	private String forwardInstitutionCode1;
	private String retrievalReferenceNumber;
	private String terminalId;
	private String comercio;
	private String cardAcceptorLocation;
	private String transactionCurrencyCode;
	private String originalDataElements;
	private String messageTypeId2;
	private String trace2;
	private String fechaHoraTransaccion2;
	private String binAdquiriente2;
	private String forwardInstitutionCode2;
	private String datosReservados;
	private String datosRequerimiento;
	private String longitudDato;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProdServ;
	private String codigoPlazaRecaudador;
	private String codigoAgenciaRecaudador;
	private String tipoDatoPago;
	private String datoPago;
	private String codigoCiudad;
	private String filler;
	
	private String tipoServicio;
	private String nroDocumento;
	private String disponible;
	private String nroTransCobOri;
	private String nroOpeOriginalAcreedor;
	
	public AnulacionDeudaRq() {
		super();
	}
	
	
	public AnulacionDeudaRq(String input) {
		this.messageTypeId=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_1);
		this.primaryBitMap=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.PRIMARY_BIT_MAP);
		this.secondaryBitMap=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.SECONDARY_BIT_MAP);
		this.numeroTarjeta=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.NUMERO_DE_TARJETA);
		this.codigoProceso=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_PROCESO);
		this.monto=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.MONTO);
		this.fechaHoraTransaccion1=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_1);
		this.trace1=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.TRACE_1);
		this.fechaCaptura=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.FECHA_DE_CAPTURA);
		this.modoIngresoDatos=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.MODO_DE_INGRESO_DE_DATOS);
		this.canal=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CANAL);
		this.binAdquiriente1=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.BIN_ADQUIRIENTE_1);
		this.forwardInstitutionCode1=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.FORWARD_INSTITUTION_CODE_1);
		this.retrievalReferenceNumber=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER);
		this.terminalId=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.TERMINAL_ID);
		this.comercio=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.COMERCIO);
		this.cardAcceptorLocation=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CARD_ACCEPTOR_LOCATION);
		this.transactionCurrencyCode=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.TRANSACTION_CURRENCY_CODE);
		//ORIGINAL DATA
		this.messageTypeId2=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_2);
		this.trace2=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.TRACE_2);
		this.fechaHoraTransaccion2=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_2);
		this.binAdquiriente2=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.BIN_ADQUIRIENTE_2);
		this.forwardInstitutionCode2=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.FORWARD_INSTITUTION_CODE_2);
		this.datosReservados=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.DATOS_RESERVADOS);
		//DATOS REQUERIMIENTO
		this.longitudDato=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.LONGITUD_DE_DATO);
		this.codigoFormato=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_FORMATO);
		this.binProcesador=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.BIN_PROCESADOR);
		this.codigoAcreedor=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_ACREEDOR);
		this.codigoProdServ=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO);
		this.codigoPlazaRecaudador=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR);
		this.codigoAgenciaRecaudador=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR);
		this.tipoDatoPago=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.TIPO_DE_DATO_DE_PAGO);
		this.datoPago=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.DATO_DE_PAGO);
		this.codigoCiudad=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.CODIGO_DE_CIUDAD);
		this.filler=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.FILLER);
		//FILLER RECIBO A ANULAR
		this.tipoServicio=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.TIPO_DE_SERVICIO);
		this.nroDocumento=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.NUMERO_DE_DOCUMENTO);
		this.disponible=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.DISPONIBLE);
		this.nroTransCobOri=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.NUMERO_DE_TRANS_DE_COB_ORI);
		this.nroOpeOriginalAcreedor=this.getStringByPosition(input, AnulacionDeudaRqFieldEnum.NUMERO_OPE_ORIGINAL_ACREED);
	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, AnulacionDeudaRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_1) );
		sBuilder.append( this.getStringFilled(primaryBitMap, AnulacionDeudaRqFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secondaryBitMap, AnulacionDeudaRqFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(numeroTarjeta, AnulacionDeudaRqFieldEnum.NUMERO_DE_TARJETA) );
		sBuilder.append( this.getStringFilled(codigoProceso, AnulacionDeudaRqFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, AnulacionDeudaRqFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion1, AnulacionDeudaRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_1) );
		sBuilder.append( this.getStringFilled(trace1, AnulacionDeudaRqFieldEnum.TRACE_1) );
		sBuilder.append( this.getStringFilled(fechaCaptura, AnulacionDeudaRqFieldEnum.FECHA_DE_CAPTURA) );
		sBuilder.append( this.getStringFilled(modoIngresoDatos, AnulacionDeudaRqFieldEnum.MODO_DE_INGRESO_DE_DATOS) );
		sBuilder.append( this.getStringFilled(canal, AnulacionDeudaRqFieldEnum.CANAL) );
		sBuilder.append( this.getStringFilled(binAdquiriente1, AnulacionDeudaRqFieldEnum.BIN_ADQUIRIENTE_1) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCode1, AnulacionDeudaRqFieldEnum.FORWARD_INSTITUTION_CODE_1) );
		sBuilder.append( this.getStringFilled(retrievalReferenceNumber, AnulacionDeudaRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(terminalId, AnulacionDeudaRqFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(comercio, AnulacionDeudaRqFieldEnum.COMERCIO) );
		sBuilder.append( this.getStringFilled(cardAcceptorLocation, AnulacionDeudaRqFieldEnum.CARD_ACCEPTOR_LOCATION) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, AnulacionDeudaRqFieldEnum.TRANSACTION_CURRENCY_CODE) );
		//ORIGINAL DATA ELEMENTS
		sBuilder.append( this.getStringFilled(messageTypeId2, AnulacionDeudaRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_2) );
		sBuilder.append( this.getStringFilled(trace2, AnulacionDeudaRqFieldEnum.TRACE_2) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion2, AnulacionDeudaRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_2) );
		sBuilder.append( this.getStringFilled(binAdquiriente2, AnulacionDeudaRqFieldEnum.BIN_ADQUIRIENTE_2) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCode2, AnulacionDeudaRqFieldEnum.FORWARD_INSTITUTION_CODE_2) );
		sBuilder.append( this.getStringFilled(datosReservados, AnulacionDeudaRqFieldEnum.DATOS_RESERVADOS) );
		//DATOS DEL REQUERIMIENTO
		sBuilder.append( this.getStringFilled(longitudDato, AnulacionDeudaRqFieldEnum.LONGITUD_DE_DATO) );
		sBuilder.append( this.getStringFilled(codigoFormato, AnulacionDeudaRqFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, AnulacionDeudaRqFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(codigoAcreedor, AnulacionDeudaRqFieldEnum.CODIGO_DE_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProdServ, AnulacionDeudaRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO) );
		sBuilder.append( this.getStringFilled(codigoPlazaRecaudador, AnulacionDeudaRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(codigoAgenciaRecaudador, AnulacionDeudaRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(tipoDatoPago, AnulacionDeudaRqFieldEnum.TIPO_DE_DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(datoPago, AnulacionDeudaRqFieldEnum.DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(codigoCiudad, AnulacionDeudaRqFieldEnum.CODIGO_DE_CIUDAD) );
		sBuilder.append( this.getStringFilled(filler, AnulacionDeudaRqFieldEnum.FILLER) );
		//FILLER (RECIBO A ANULAR)
		sBuilder.append( this.getStringFilled(tipoServicio, AnulacionDeudaRqFieldEnum.TIPO_DE_SERVICIO) );
		sBuilder.append( this.getStringFilled(nroDocumento, AnulacionDeudaRqFieldEnum.NUMERO_DE_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(disponible, AnulacionDeudaRqFieldEnum.DISPONIBLE) );
		sBuilder.append( this.getStringFilled(nroTransCobOri, AnulacionDeudaRqFieldEnum.NUMERO_DE_TRANS_DE_COB_ORI) );
		sBuilder.append( this.getStringFilled(nroOpeOriginalAcreedor, AnulacionDeudaRqFieldEnum.NUMERO_OPE_ORIGINAL_ACREED) );
	
		return sBuilder.toString();
	}
	
	public String getStringFilled(String input, AnulacionDeudaRqFieldEnum anulacionDeudaRqFieldEnum) {
		String preData=input==null ? "":input;
		if (preData.length() >=anulacionDeudaRqFieldEnum.getDataLength()) {
			preData = preData.substring(0, anulacionDeudaRqFieldEnum.getDataLength());
		}
		if(anulacionDeudaRqFieldEnum.getAlign()==AlignFillEnum.RIGHT) {
			input=StringUtils.rightPad(preData,anulacionDeudaRqFieldEnum.getDataLength(), anulacionDeudaRqFieldEnum.getDataFill());
		}else if(anulacionDeudaRqFieldEnum.getAlign()==AlignFillEnum.LEFT) {
			input=StringUtils.leftPad(preData,anulacionDeudaRqFieldEnum.getDataLength(), anulacionDeudaRqFieldEnum.getDataFill());
		}
		return input;
	}
	
	public String getStringByPosition(String input,AnulacionDeudaRqFieldEnum type) {
		return CommonsUtilities.getStringValueByPosition(input, type.getPositions());
	}

	public void defaultData(String codigoTipoServicio) {
		this.messageTypeId=MessageTypeScoEnum.CONS_PAG_ANU_RQ.getCode();
		this.primaryBitMap="F220848188E08000";
		this.secondaryBitMap="0000004000000018";
		this.numeroTarjeta="160000000000000000";
		this.codigoProceso=ScotiaProcessCodeEnum.ANULACION_DEUDA.getCode();
		this.monto="000000099995";
		this.fechaHoraTransaccion1="1122113503";
		this.trace1="831255";
		this.fechaCaptura="1122";
		this.modoIngresoDatos="000";
		this.canal="90";
		this.binAdquiriente1="1006";
		this.forwardInstitutionCode1="1006";
		this.retrievalReferenceNumber="847501860708";
		this.terminalId="0056";
		this.comercio="000000000000000";
		this.cardAcceptorLocation="SOLUCIONES|PARA|EMPRESAS";
		this.transactionCurrencyCode="";
		//ORIGINAL DATA ELEMENTS
		this.messageTypeId2="0200";
		this.trace2="831237";
		this.fechaHoraTransaccion2="1122113503";
		this.binAdquiriente2="06";
		this.forwardInstitutionCode2="06";
		this.datosReservados="00220";
		//DATOS DEL REQUERIMIENTO
		this.longitudDato="152";
		this.codigoFormato="01";
		this.binProcesador="000000";
		this.codigoAcreedor="051";
		this.codigoProdServ="REC";
		this.codigoPlazaRecaudador="0000";
		this.codigoAgenciaRecaudador="847";
		this.tipoDatoPago="01";
		this.datoPago="";
		this.codigoCiudad="847";
		this.filler="";
		//FILLER (RECIBO A ANULAR)
		this.tipoServicio=codigoTipoServicio;
		this.nroDocumento="2018064953";
		this.disponible="";
		this.nroTransCobOri="000000932802";
		this.nroOpeOriginalAcreedor="000000044479";
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

	public String getFechaHoraTransaccion1() {
		return fechaHoraTransaccion1;
	}

	public void setFechaHoraTransaccion1(String fechaHoraTransaccion1) {
		this.fechaHoraTransaccion1 = fechaHoraTransaccion1;
	}

	public String getTrace1() {
		return trace1;
	}

	public void setTrace1(String trace1) {
		this.trace1 = trace1;
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

	public String getBinAdquiriente1() {
		return binAdquiriente1;
	}

	public void setBinAdquiriente1(String binAdquiriente1) {
		this.binAdquiriente1 = binAdquiriente1;
	}

	public String getForwardInstitutionCode1() {
		return forwardInstitutionCode1;
	}

	public void setForwardInstitutionCode1(String forwardInstitutionCode1) {
		this.forwardInstitutionCode1 = forwardInstitutionCode1;
	}

	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}

	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
		this.retrievalReferenceNumber = retrievalReferenceNumber;
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

	public String getOriginalDataElements() {
		return originalDataElements;
	}

	public void setOriginalDataElements(String originalDataElements) {
		this.originalDataElements = originalDataElements;
	}

	public String getMessageTypeId2() {
		return messageTypeId2;
	}

	public void setMessageTypeId2(String messageTypeId2) {
		this.messageTypeId2 = messageTypeId2;
	}

	public String getTrace2() {
		return trace2;
	}

	public void setTrace2(String trace2) {
		this.trace2 = trace2;
	}

	public String getFechaHoraTransaccion2() {
		return fechaHoraTransaccion2;
	}

	public void setFechaHoraTransaccion2(String fechaHoraTransaccion2) {
		this.fechaHoraTransaccion2 = fechaHoraTransaccion2;
	}

	public String getBinAdquiriente2() {
		return binAdquiriente2;
	}

	public void setBinAdquiriente2(String binAdquiriente2) {
		this.binAdquiriente2 = binAdquiriente2;
	}

	public String getForwardInstitutionCode2() {
		return forwardInstitutionCode2;
	}

	public void setForwardInstitutionCode2(String forwardInstitutionCode2) {
		this.forwardInstitutionCode2 = forwardInstitutionCode2;
	}

	public String getDatosReservados() {
		return datosReservados;
	}

	public void setDatosReservados(String datosReservados) {
		this.datosReservados = datosReservados;
	}

	public String getDatosRequerimiento() {
		return datosRequerimiento;
	}

	public void setDatosRequerimiento(String datosRequerimiento) {
		this.datosRequerimiento = datosRequerimiento;
	}

	public String getLongitudDato() {
		return longitudDato;
	}

	public void setLongitudDato(String longitudDato) {
		this.longitudDato = longitudDato;
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

	public String getCodigoProdServ() {
		return codigoProdServ;
	}

	public void setCodigoProdServ(String codigoProdServ) {
		this.codigoProdServ = codigoProdServ;
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

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}



	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public String getNroTransCobOri() {
		return nroTransCobOri;
	}

	public void setNroTransCobOri(String nroTransCobOri) {
		this.nroTransCobOri = nroTransCobOri;
	}

	public String getNroOpeOriginalAcreedor() {
		return nroOpeOriginalAcreedor;
	}

	public void setNroOpeOriginalAcreedor(String nroOpeOriginalAcreedor) {
		this.nroOpeOriginalAcreedor = nroOpeOriginalAcreedor;
	}
	
	

}
