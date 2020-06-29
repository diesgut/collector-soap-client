package com.diesgut.collectorsoapclient.scotia.model;

import org.apache.commons.lang3.StringUtils;

import com.diesgut.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgut.collectorsoapclient.scotia.enums.ExtornoAutAnulRqFieldEnum;
import com.diesgut.collectorsoapclient.scotia.enums.ExtornoAutPagoRqFieldEnum;
import com.diesgut.collectorsoapclient.scotia.enums.MessageTypeScoEnum;
import com.diesgut.collectorsoapclient.scotia.enums.ScotiaProcessCodeEnum;
import com.diesgut.collectorsoapclient.util.CommonsUtilities;

public class ExtornoAutAnulRq {

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
	private String responseCode;
	private String terminalId;
	private String comercio;
	private String cardAcceptorLocation;
	private String transactionCurrencyCode;
	
	// ORIGINAL DATA ELEMENTS

	private String messageTypeId2;
	private String trace2;
	private String fechaHoraTransaccion2;
	private String binAdquiriente2;
	private String forwardInstitutionCode2;
	private String datosReservados;
	
	//DATPS REQUERIMIENTO
	
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

	//FILLER RECIBO ANULAR

	private String tipoServicio;
	private String numeroDocumento;
	private String disponible;
	private String numeroTransCobOri;
	private String numeroOpeOriginalAcreed;

	public ExtornoAutAnulRq() {
		super();
	}

	public ExtornoAutAnulRq(String input) {
		this.messageTypeId=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION);
		this.primaryBitMap=this.getStringByPosition(primaryBitMap, ExtornoAutAnulRqFieldEnum.PRIMARY_BIT_MAP);
		this.secondaryBitMap=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.SECONDARY_BIT_MAP);
		this.numeroTarjeta=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.NUMERO_DE_TARJETA);
		this.codigoProceso=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_PROCESO);
		this.monto=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.MONTO);
		this.fechaHoraTransaccion1=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_1);
		this.trace1=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.TRACE_1);
		this.fechaCaptura=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.FECHA_DE_CAPTURA);
		this.modoIngresoDatos=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.MODO_DE_INGRESO_DE_DATOS);
		this.canal=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CANAL);
		this.binAdquiriente1=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.BIN_ADQUIRIENTE_1);
		this.forwardInstitutionCode1=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.FORWARD_INSTITUTION_CODE_1);
		this.retrievalReferenceNumber=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER);
		this.responseCode=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.RESPONSE_CODE);
		this.terminalId=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.TERMINAL_ID);
		this.comercio=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.COMERCIO);
		this.cardAcceptorLocation=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CARD_ACCEPTOR_LOCATION);
		this.transactionCurrencyCode=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.TRANSACTION_CURRENCY_CODE);
		//ORIGINAL DATA ELEMENTS
		this.messageTypeId2=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_2);
		this.trace2=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.TRACE_2);
		this.fechaHoraTransaccion2=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_2);
		this.binAdquiriente2=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.BIN_ADQUIRIENTE_2);
		this.forwardInstitutionCode2=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.FORWARD_INSTITUTION_CODE_2);
		this.datosReservados=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.DATOS_RESERVADOS);
		//DATOS_DEL_REQUERIMIENTO
		this.longitudDato=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.LONGITUD_DE_DATO);
		this.codigoFormato=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_FORMATO);
		this.binProcesador=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.BIN_PROCESADOR);
		this.codigoAcreedor=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_ACREEDOR);
		this.codigoProdServ=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO);
		this.codigoPlazaRecaudador=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR);
		this.codigoAgenciaRecaudador=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR);
		this.tipoDatoPago=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.TIPO_DE_DATO_DE_PAGO);
		this.datoPago=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.DATO_DE_PAGO);
		this.codigoCiudad=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.CODIGO_DE_CIUDAD);
		this.filler=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.FILLER);
		//FILLER_(RECIBO_A_ANULAR)
		this.tipoServicio=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.TIPO_DE_SERVICIO);
		this.numeroDocumento=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.NUMERO_DE_DOCUMENTO);
		this.disponible=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.DISPONIBLE);
		this.numeroTransCobOri=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.NUMERO_DE_TRANS_DE_COB_ORI);
		this.numeroOpeOriginalAcreed=this.getStringByPosition(input, ExtornoAutAnulRqFieldEnum.NUMERO_OPE_ORIGINAL_ACREED);
	}
	
	public void defaultData(String codigoTipoServicio) {
		this.messageTypeId=MessageTypeScoEnum.EXT_PAGO_ANU_RQ.getCode();
		this.primaryBitMap="F22084818AE08000";
		this.secondaryBitMap="0000004000000018";
		this.numeroTarjeta="160000000000000000";
		this.codigoProceso=ScotiaProcessCodeEnum.EXTORNO_ANUL_DEUDA.getCode();
		this.monto="965000";
		this.fechaHoraTransaccion1="1019181120";
		this.trace1="572009";
		this.fechaCaptura="1019";
		this.modoIngresoDatos="000";
		this.canal="90";
		this.binAdquiriente1="1006";
		this.forwardInstitutionCode1="1006";
		this.retrievalReferenceNumber="050501860837";
		this.responseCode="22";
		this.terminalId="0056";
		this.comercio="000000000000000";
		this.cardAcceptorLocation="(I)*AGENCIA|SURQUILLO";
		this.transactionCurrencyCode="604";
		//ORIGINAL DATA ELEMENTS		
		this.messageTypeId2=MessageTypeScoEnum.CONS_PAG_ANU_RQ.getCode();
		this.trace2="572009";
		this.fechaHoraTransaccion2="1019181120";
		this.binAdquiriente2="06";
		this.forwardInstitutionCode2="06";
		this.datosReservados="00220";
		//DE(125) DATOS DEL REQUERIMIENTO
		this.longitudDato="152";
		this.codigoFormato="01";
		this.binProcesador="000000";
		this.codigoAcreedor="010";
		this.codigoProdServ="REC";
		this.codigoPlazaRecaudador="0000";
		this.codigoAgenciaRecaudador="050";
		this.tipoDatoPago="01";
		this.datoPago="2015137985";
		this.codigoCiudad="050";
		this.filler="";
		//FILLER (RECIBO A ANULAR)		
		this.tipoServicio=codigoTipoServicio;
		this.numeroDocumento="250000358602";
		this.disponible="";
		this.numeroTransCobOri="";
		this.numeroOpeOriginalAcreed="";
	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, ExtornoAutAnulRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION) );
		sBuilder.append( this.getStringFilled(primaryBitMap, ExtornoAutAnulRqFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secondaryBitMap, ExtornoAutAnulRqFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(numeroTarjeta, ExtornoAutAnulRqFieldEnum.NUMERO_DE_TARJETA) );
		sBuilder.append( this.getStringFilled(codigoProceso, ExtornoAutAnulRqFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, ExtornoAutAnulRqFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion1, ExtornoAutAnulRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_1) );
		sBuilder.append( this.getStringFilled(trace1, ExtornoAutAnulRqFieldEnum.TRACE_1) );
		sBuilder.append( this.getStringFilled(fechaCaptura, ExtornoAutAnulRqFieldEnum.FECHA_DE_CAPTURA) );
		sBuilder.append( this.getStringFilled(modoIngresoDatos, ExtornoAutAnulRqFieldEnum.MODO_DE_INGRESO_DE_DATOS) );
		sBuilder.append( this.getStringFilled(canal, ExtornoAutAnulRqFieldEnum.CANAL) );
		sBuilder.append( this.getStringFilled(binAdquiriente1, ExtornoAutAnulRqFieldEnum.BIN_ADQUIRIENTE_1) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCode1, ExtornoAutAnulRqFieldEnum.FORWARD_INSTITUTION_CODE_1) );
		sBuilder.append( this.getStringFilled(retrievalReferenceNumber, ExtornoAutAnulRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(responseCode, ExtornoAutAnulRqFieldEnum.RESPONSE_CODE) );
		sBuilder.append( this.getStringFilled(terminalId, ExtornoAutAnulRqFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(comercio, ExtornoAutAnulRqFieldEnum.COMERCIO) );
		sBuilder.append( this.getStringFilled(cardAcceptorLocation, ExtornoAutAnulRqFieldEnum.CARD_ACCEPTOR_LOCATION) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, ExtornoAutAnulRqFieldEnum.TRANSACTION_CURRENCY_CODE) );
		//ORIGINAL DATAELEENTES
		sBuilder.append( this.getStringFilled(messageTypeId2, ExtornoAutAnulRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_2) );
		sBuilder.append( this.getStringFilled(trace2, ExtornoAutAnulRqFieldEnum.TRACE_2) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion2, ExtornoAutAnulRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_2) );
		sBuilder.append( this.getStringFilled(binAdquiriente2, ExtornoAutAnulRqFieldEnum.BIN_ADQUIRIENTE_2) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCode2, ExtornoAutAnulRqFieldEnum.FORWARD_INSTITUTION_CODE_2) );
		sBuilder.append( this.getStringFilled(datosReservados, ExtornoAutAnulRqFieldEnum.DATOS_RESERVADOS) );
		//DATOS DEL REQUERIMIENTO
		sBuilder.append( this.getStringFilled(longitudDato, ExtornoAutAnulRqFieldEnum.LONGITUD_DE_DATO) );
		sBuilder.append( this.getStringFilled(codigoFormato, ExtornoAutAnulRqFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, ExtornoAutAnulRqFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(codigoAcreedor, ExtornoAutAnulRqFieldEnum.CODIGO_DE_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProdServ, ExtornoAutAnulRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO) );
		sBuilder.append( this.getStringFilled(codigoPlazaRecaudador, ExtornoAutAnulRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(codigoAgenciaRecaudador, ExtornoAutAnulRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(tipoDatoPago, ExtornoAutAnulRqFieldEnum.TIPO_DE_DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(datoPago, ExtornoAutAnulRqFieldEnum.DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(codigoCiudad, ExtornoAutAnulRqFieldEnum.CODIGO_DE_CIUDAD) );
		sBuilder.append( this.getStringFilled(filler, ExtornoAutAnulRqFieldEnum.FILLER) );
		//FILLER (RECIBO A ANULAR)
		sBuilder.append( this.getStringFilled(tipoServicio, ExtornoAutAnulRqFieldEnum.TIPO_DE_SERVICIO) );
		sBuilder.append( this.getStringFilled(numeroDocumento, ExtornoAutAnulRqFieldEnum.NUMERO_DE_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(disponible, ExtornoAutAnulRqFieldEnum.DISPONIBLE) );
		sBuilder.append( this.getStringFilled(numeroTransCobOri, ExtornoAutAnulRqFieldEnum.NUMERO_DE_TRANS_DE_COB_ORI) );
		sBuilder.append( this.getStringFilled(numeroOpeOriginalAcreed, ExtornoAutAnulRqFieldEnum.NUMERO_OPE_ORIGINAL_ACREED) );
		return sBuilder.toString();
	}
	
	public String getStringFilled(String input, ExtornoAutAnulRqFieldEnum  extornoAutAnulRqFieldEnum) {
		String preData=input==null ? "":input;
		if (preData.length() >=extornoAutAnulRqFieldEnum.getDataLength()) {
			preData = preData.substring(0, extornoAutAnulRqFieldEnum.getDataLength());
		}
		if(extornoAutAnulRqFieldEnum.getAlign()==AlignFillEnum.RIGHT) {
			input=StringUtils.rightPad(preData,extornoAutAnulRqFieldEnum.getDataLength(), extornoAutAnulRqFieldEnum.getDataFill());
		}else if(extornoAutAnulRqFieldEnum.getAlign()==AlignFillEnum.LEFT) {
			input=StringUtils.leftPad(preData,extornoAutAnulRqFieldEnum.getDataLength(), extornoAutAnulRqFieldEnum.getDataFill());
		}
		return input;
	}
	
	public String getStringByPosition(String input,ExtornoAutAnulRqFieldEnum type) {
		return CommonsUtilities.getStringValueByPosition(input, type.getPositions());
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

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
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

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public String getNumeroTransCobOri() {
		return numeroTransCobOri;
	}

	public void setNumeroTransCobOri(String numeroTransCobOri) {
		this.numeroTransCobOri = numeroTransCobOri;
	}

	public String getNumeroOpeOriginalAcreed() {
		return numeroOpeOriginalAcreed;
	}

	public void setNumeroOpeOriginalAcreed(String numeroOpeOriginalAcreed) {
		this.numeroOpeOriginalAcreed = numeroOpeOriginalAcreed;
	}
	
	

}
