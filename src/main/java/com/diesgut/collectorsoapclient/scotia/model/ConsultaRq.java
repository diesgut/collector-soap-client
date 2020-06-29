package com.diesgut.collectorsoapclient.scotia.model;

import com.diesgut.collectorsoapclient.scotia.enums.ConsultaRqFieldEnum;
import com.diesgut.collectorsoapclient.util.CommonsUtilities;

public class ConsultaRq {

	private String messageTypeId;
	private String primaryBitMat;
	private String secundaryBitMat;
	private String numeroTarjeta;
	private String codigoProceso;
	private String monto;
	private String fechaHora; //MMDDhhmmss
	private String trace;
	private String fechaCaptura; //fecha contable MMDD
	private String modoIngresoDatos;
	private String canal;
	private String binAdquiriente;
	private String forwardInstitutionCode;
	private String retrievelRefNumber;
	private String terminalId;
	private String comercio;
	private String cardAcceptorLocation;
	private String transactionCurencyCode;
	private String datosReservados;
	//Datos del requerimiento
	private Integer longitudRequerimiento;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProductoServicio; //servicio
	private String codigoPlazaRecaudador;
	private String codigoAgenciaRecaudador;
	private String tipoDatoConsulta;
	private String datoConsulta; //Se indicará Código de Cliente o Recibo  
	private String codigoCiudad;
	private String codigoServicio;
	private String numeroDocumento;
	private String numeroOperacion;
	private String filler;
	private String tamañoMaximoBloque;
	private String posicionUltimoDoc;
	private String punteroBaseDatos;
	
	public ConsultaRq() {
		super();
	}
	
	public ConsultaRq(String input) {
		this.messageTypeId=this.getStringByPosition(input, ConsultaRqFieldEnum.MESSAGE_TYPE_ID);
		this.primaryBitMat=this.getStringByPosition(input, ConsultaRqFieldEnum.PRIMARY_BITMAP);
		this.secundaryBitMat=this.getStringByPosition(input, ConsultaRqFieldEnum.SECONDARY_BITMAP);
		this.numeroTarjeta=this.getStringByPosition(input, ConsultaRqFieldEnum.NRO_TARJETA);
		this.codigoProceso=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_PROCESO);
		this.monto=null;
		//MMDDhhmmss
		String fechaHora=this.getStringByPosition(input, ConsultaRqFieldEnum.FECHA_HORA_TRN);
	//	this.fechaHora=CommonsUtilities.convertStringtoDate(fechaHora, "MMDDhhmmss");
		this.fechaHora=fechaHora;
		this.trace=this.getStringByPosition(input, ConsultaRqFieldEnum.TRACE);
		this.fechaCaptura=this.getStringByPosition(input, ConsultaRqFieldEnum.FECHA_CAPTURA); 
		this.modoIngresoDatos=this.getStringByPosition(input, ConsultaRqFieldEnum.MODO_INGRESO_DATOS);
		this.canal=this.getStringByPosition(input, ConsultaRqFieldEnum.CANAL);
		this.binAdquiriente=this.getStringByPosition(input, ConsultaRqFieldEnum.BIN_ADQUIRIENTE);
		this.forwardInstitutionCode=this.getStringByPosition(input, ConsultaRqFieldEnum.FORWARD_INSTITUTION_CODE);
		this.retrievelRefNumber=this.getStringByPosition(input, ConsultaRqFieldEnum.RETRIEVAL_REF_NUMBER);
		this.terminalId=this.getStringByPosition(input, ConsultaRqFieldEnum.TERMINAL_ID);
		this.comercio=this.getStringByPosition(input, ConsultaRqFieldEnum.COMERCIO);
		this.cardAcceptorLocation=this.getStringByPosition(input, ConsultaRqFieldEnum.CARD_ACCEP_LOC);
		this.transactionCurencyCode=this.getStringByPosition(input, ConsultaRqFieldEnum.TRAN_CURRENCY_CODE);
		this.datosReservados=this.getStringByPosition(input, ConsultaRqFieldEnum.DATOS_RESERV);
		//Datos del requerimiento
		String longRequerimiento=this.getStringByPosition(input, ConsultaRqFieldEnum.LONG_REQUERIMIENTO);
		this.longitudRequerimiento=Integer.parseInt(longRequerimiento);
		this.codigoFormato=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_FORMATO);
		this.binProcesador=this.getStringByPosition(input, ConsultaRqFieldEnum.BIN_PROCESADOR);
		this.codigoAcreedor=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_ACREEDOR);
		this.codigoProductoServicio=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_PROD_SERV);
		this.codigoPlazaRecaudador=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_PLAZA_RECAUDA);
		this.codigoAgenciaRecaudador=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_AGENCIA_RECAUDA);
		this.tipoDatoConsulta=this.getStringByPosition(input, ConsultaRqFieldEnum.TIPO_DATO_CONSULTA);
		this.datoConsulta=this.getStringByPosition(input, ConsultaRqFieldEnum.DATO_CONSULTA);
		this.codigoCiudad=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_CIUDAD);
		this.codigoServicio=this.getStringByPosition(input, ConsultaRqFieldEnum.COD_SERVICIO);
		this.numeroDocumento=this.getStringByPosition(input, ConsultaRqFieldEnum.NRO_DOCUMENTO);
		this.numeroOperacion=this.getStringByPosition(input, ConsultaRqFieldEnum.NRO_OPERACION);
		this.filler=this.getStringByPosition(input, ConsultaRqFieldEnum.FILLER);
		this.tamañoMaximoBloque=this.getStringByPosition(input, ConsultaRqFieldEnum.TAMAÑO_MAX_BLOQUE);
		this.posicionUltimoDoc=this.getStringByPosition(input, ConsultaRqFieldEnum.POSICION_ULT_DOC);
		this.punteroBaseDatos=this.getStringByPosition(input, ConsultaRqFieldEnum.PUNTERO_BASE_DATOS);
	}
	
	public String getStringByPosition(String input,ConsultaRqFieldEnum type) {
		return CommonsUtilities.getStringValueByPosition(input, type.getPositions());
	}

	public String getMessageTypeId() {
		return messageTypeId;
	}

	public void setMessageTypeId(String messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public String getPrimaryBitMat() {
		return primaryBitMat;
	}

	public void setPrimaryBitMat(String primaryBitMat) {
		this.primaryBitMat = primaryBitMat;
	}

	public String getSecundaryBitMat() {
		return secundaryBitMat;
	}

	public void setSecundaryBitMat(String secundaryBitMat) {
		this.secundaryBitMat = secundaryBitMat;
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

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
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

	public String getRetrievelRefNumber() {
		return retrievelRefNumber;
	}

	public void setRetrievelRefNumber(String retrievelRefNumber) {
		this.retrievelRefNumber = retrievelRefNumber;
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

	public String getTransactionCurencyCode() {
		return transactionCurencyCode;
	}

	public void setTransactionCurencyCode(String transactionCurencyCode) {
		this.transactionCurencyCode = transactionCurencyCode;
	}

	public String getDatosReservados() {
		return datosReservados;
	}

	public void setDatosReservados(String datosReservados) {
		this.datosReservados = datosReservados;
	}


	public Integer getLongitudRequerimiento() {
		return longitudRequerimiento;
	}

	public void setLongitudRequerimiento(Integer longitudRequerimiento) {
		this.longitudRequerimiento = longitudRequerimiento;
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

	public String getTipoDatoConsulta() {
		return tipoDatoConsulta;
	}

	public void setTipoDatoConsulta(String tipoDatoConsulta) {
		this.tipoDatoConsulta = tipoDatoConsulta;
	}

	public String getDatoConsulta() {
		return datoConsulta;
	}

	public void setDatoConsulta(String datoConsulta) {
		this.datoConsulta = datoConsulta;
	}

	public String getCodigoCiudad() {
		return codigoCiudad;
	}

	public void setCodigoCiudad(String codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}

	public String getCodigoServicio() {
		return codigoServicio;
	}

	public void setCodigoServicio(String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNumeroOperacion() {
		return numeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getTamañoMaximoBloque() {
		return tamañoMaximoBloque;
	}

	public void setTamañoMaximoBloque(String tamañoMaximoBloque) {
		this.tamañoMaximoBloque = tamañoMaximoBloque;
	}

	public String getPosicionUltimoDoc() {
		return posicionUltimoDoc;
	}

	public void setPosicionUltimoDoc(String posicionUltimoDoc) {
		this.posicionUltimoDoc = posicionUltimoDoc;
	}

	public String getPunteroBaseDatos() {
		return punteroBaseDatos;
	}

	public void setPunteroBaseDatos(String punteroBaseDatos) {
		this.punteroBaseDatos = punteroBaseDatos;
	}
	
	
	
	
	
}
