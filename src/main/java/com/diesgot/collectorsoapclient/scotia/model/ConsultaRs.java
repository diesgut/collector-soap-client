package com.diesgot.collectorsoapclient.scotia.model;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.diesgot.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgot.collectorsoapclient.scotia.enums.ConsultaRsFieldEnum;

public class ConsultaRs {

	private String messageTypeId;
	private String primaryBitMat;
	private String secodaryBitMat;
	private String codigoProceso;
	private String monto;
	private String fechaHora; // MMDDhhmmss
	private String trace;
	private String fechaCaptura; // fecha contable MMDD
	private String binAdquiriente;
	private String retrievelRefNumber;
	private String authorizationResponse;
	private String responseCode;
	private String terminalId;
	private String transactionCurrencyCode;
	private String datosReservados;

	// Respuesta del requerimiento

	// Cabecera de respuesta
	private String longitudCampo;
	private String codigoFormato;
	private String binProcesador;
	private String binAcreedor;
	private String codigoProducto;
	private String agencia;
	private String tipoIdentificacion; // Numero de Servicio o Numero de Recibo
	private String numeroIdentificacion; 
	private String nombreDeudor; // nombre del cliente
	private String numeroServiciosDevueltos;
	private String nroOperacionCobranza;
	private String indicadorMasDocumentos;
	private String tamanoMaximoBloque;
	private String posicionUltimoDocumento;
	private String punteroBaseDatos;
	private String origenRespuesta;
	private String codigoRespuesta;
	private String filler;

	/* Detalle de respuesta */
	// cabecera servicio
	private String codigoProductoServicio;
	private String moneda;
	private String estadoDeudor;
	private String mensajeDeudor1;
	private String mensajeDeudor2;
	private String indicadorCronologia;
	private String indicadoPagosVencidos;
	private String restriccionesPago;
	private String documentosPorServicio;
	private String filler2;

	// detalles servicio
	private List<ConsultaDetalleServicioRs> detalleServicio;

	public ConsultaRs() {
		super();
	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, ConsultaRsFieldEnum.MESSAGE_TYPE_IDENTIFICATION) );
		sBuilder.append( this.getStringFilled(primaryBitMat, ConsultaRsFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secodaryBitMat, ConsultaRsFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(codigoProceso, ConsultaRsFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, ConsultaRsFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHora, ConsultaRsFieldEnum.FECHA_Y_HORA_DE_TRANSACCION) ); // MMDDhhmmss
		sBuilder.append( this.getStringFilled(trace, ConsultaRsFieldEnum.TRACE) );
		sBuilder.append( this.getStringFilled(fechaCaptura, ConsultaRsFieldEnum.FECHA_DE_CAPTURA) ); // fecha contable MMDD
		sBuilder.append( this.getStringFilled(binAdquiriente, ConsultaRsFieldEnum.BIN_ADQUIRIENTE) );
		sBuilder.append( this.getStringFilled(retrievelRefNumber, ConsultaRsFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(authorizationResponse, ConsultaRsFieldEnum.AUTHORIZATION_ID_RESPONSE) );
		sBuilder.append( this.getStringFilled(responseCode, ConsultaRsFieldEnum.RESPONSE_CODE) );
		sBuilder.append( this.getStringFilled(terminalId, ConsultaRsFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, ConsultaRsFieldEnum.TRANSACTION_CURRENCY_CODE) );
		sBuilder.append( this.getStringFilled(datosReservados, ConsultaRsFieldEnum.DATOS_RESERVADOS) );

		// Respuesta del requerimiento

		// Cabecera de respuesta
		sBuilder.append( this.getStringFilled(longitudCampo, ConsultaRsFieldEnum.LONGITUD_DEL_CAMPO) );
		sBuilder.append( this.getStringFilled(codigoFormato, ConsultaRsFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, ConsultaRsFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(binAcreedor, ConsultaRsFieldEnum.BIN_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProducto, ConsultaRsFieldEnum.CODIGO_PRODUCTO_SERVICIO_1) );
		sBuilder.append( this.getStringFilled(agencia, ConsultaRsFieldEnum.AGENCIA) );
		sBuilder.append( this.getStringFilled(tipoIdentificacion, ConsultaRsFieldEnum.TIPO_DE_IDENTIFICACION) ); // Numero de Servicio o Numero de Recibo
		sBuilder.append( this.getStringFilled(numeroIdentificacion, ConsultaRsFieldEnum.NUMERO_DE_IDENTIFICACION) ); 
		sBuilder.append( this.getStringFilled(nombreDeudor, ConsultaRsFieldEnum.NOMBRE_DEL_DEUDOR) ); // nombre del cliente
		sBuilder.append( this.getStringFilled(numeroServiciosDevueltos, ConsultaRsFieldEnum.NUMERO_DE_SERVICIOS_DEVUELTOS) );
		sBuilder.append( this.getStringFilled(nroOperacionCobranza, ConsultaRsFieldEnum.NUMERO_DE_OPERACIÓN_DE_COBRANZA) );
		sBuilder.append( this.getStringFilled(indicadorMasDocumentos, ConsultaRsFieldEnum.INDICADOR_SI_HAY_MAS_DOCUMENTOS) );
		sBuilder.append( this.getStringFilled(tamanoMaximoBloque, ConsultaRsFieldEnum.TAMAÑO_MAXIMO_DE_BLOQUE) );
		sBuilder.append( this.getStringFilled(posicionUltimoDocumento, ConsultaRsFieldEnum.POSICION_DEL_ULTIMO_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(punteroBaseDatos, ConsultaRsFieldEnum.PUNTERO_DE_LA_BASE_DE_DATOS) );
		sBuilder.append( this.getStringFilled(origenRespuesta, ConsultaRsFieldEnum.ORIGEN_DE_RESPUESTA) );
		sBuilder.append( this.getStringFilled(codigoRespuesta, ConsultaRsFieldEnum.CODIGO_DE_RESPUESTA) );
		sBuilder.append( this.getStringFilled(filler, ConsultaRsFieldEnum.FILLER1) );

		/* Detalle de respuesta */
		// cabecera servicio
		sBuilder.append( this.getStringFilled(codigoProductoServicio, ConsultaRsFieldEnum.CODIGO_PRODUCTO_SERVICIO_2) );
		sBuilder.append( this.getStringFilled(moneda, ConsultaRsFieldEnum.MONEDA) );
		sBuilder.append( this.getStringFilled(estadoDeudor, ConsultaRsFieldEnum.ESTADO_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(mensajeDeudor1, ConsultaRsFieldEnum.MENSAJE_1_AL_DEUDOR) );
		sBuilder.append( this.getStringFilled(mensajeDeudor2, ConsultaRsFieldEnum.MENSAJE_2_AL_DEUDOR) );
		sBuilder.append( this.getStringFilled(indicadorCronologia, ConsultaRsFieldEnum.INDICADOR_DE_CRONOLOGIA) );
		sBuilder.append( this.getStringFilled(indicadoPagosVencidos, ConsultaRsFieldEnum.INDICADOR_DE_PAGOS_VENCIDOS) );
		sBuilder.append( this.getStringFilled(restriccionesPago, ConsultaRsFieldEnum.RESTRICCION_DE_PAGO) );
		sBuilder.append( this.getStringFilled(documentosPorServicio, ConsultaRsFieldEnum.DOCUMENTOS_POR_SERVICIO) );
		sBuilder.append( this.getStringFilled(filler2, ConsultaRsFieldEnum.FILLER2) );
		
		for(ConsultaDetalleServicioRs detalleServicioRs: this.getDetalleServicio()) {
			sBuilder.append( this.getStringFilled(detalleServicioRs.getTipoServicio(), ConsultaRsFieldEnum.TIPO_DE_SERVICIO) );
			sBuilder.append( this.getStringFilled(detalleServicioRs.getNumeroDocumento(), ConsultaRsFieldEnum.NUMERO_DE_DOCUMENTO) );
			sBuilder.append( this.getStringFilled(detalleServicioRs.getReferenciaDeuda(), ConsultaRsFieldEnum.REFERENCIA_DE_LA_DEUDA) );
			sBuilder.append( this.getStringFilled(detalleServicioRs.getFechaVencimiento(), ConsultaRsFieldEnum.FECHA_DE_VENCIMIENTO) );
			sBuilder.append( this.getStringFilled(detalleServicioRs.getImporteMinimo(), ConsultaRsFieldEnum.IMPORTE_MINIMO) );
			sBuilder.append( this.getStringFilled(detalleServicioRs.getImporteTotal(), ConsultaRsFieldEnum.IMPORTE_A_TOTAL) );
		}
		
		return sBuilder.toString();
	}
	
	public String getStringFilled(String input, ConsultaRsFieldEnum consultaRsFieldEnum) {
		String preData=input==null ? "":input;
		if (preData.length() >=consultaRsFieldEnum.getDataLength()) {
			preData = preData.substring(0, consultaRsFieldEnum.getDataLength());
		}
		if(consultaRsFieldEnum.getAlign()==AlignFillEnum.RIGHT) {
			input=StringUtils.rightPad(preData,consultaRsFieldEnum.getDataLength(), consultaRsFieldEnum.getDataFill());
		}else if(consultaRsFieldEnum.getAlign()==AlignFillEnum.LEFT) {
			input=StringUtils.leftPad(preData,consultaRsFieldEnum.getDataLength(), consultaRsFieldEnum.getDataFill());
		}
		return input;
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

	public String getSecondaryBitMat() {
		return secodaryBitMat;
	}

	public void setSecondaryBitMat(String secundaryBitMat) {
		this.secodaryBitMat = secundaryBitMat;
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

	public String getBinAdquiriente() {
		return binAdquiriente;
	}

	public void setBinAdquiriente(String binAdquiriente) {
		this.binAdquiriente = binAdquiriente;
	}

	public String getRetrievelRefNumber() {
		return retrievelRefNumber;
	}

	public void setRetrievelRefNumber(String retrievelRefNumber) {
		this.retrievelRefNumber = retrievelRefNumber;
	}

	public String getAuthorizationResponse() {
		return authorizationResponse;
	}

	public void setAuthorizationResponse(String authorizationResponse) {
		this.authorizationResponse = authorizationResponse;
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

	public String getLongitudCampo() {
		return longitudCampo;
	}

	public void setLongitudCampo(String longitudCampo) {
		this.longitudCampo = longitudCampo;
	}

	public String getCodigoFormato() {
		return codigoFormato;
	}

	public void setCodigoFormato(String codigoFormato) {
		this.codigoFormato = codigoFormato;
	}

	

	public String getSecodaryBitMat() {
		return secodaryBitMat;
	}

	public void setSecodaryBitMat(String secodaryBitMat) {
		this.secodaryBitMat = secodaryBitMat;
	}

	public String getBinProcesador() {
		return binProcesador;
	}

	public void setBinProcesador(String binProcesador) {
		this.binProcesador = binProcesador;
	}

	public String getBinAcreedor() {
		return binAcreedor;
	}

	public void setBinAcreedor(String binAcreedor) {
		this.binAcreedor = binAcreedor;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNombreDeudor() {
		return nombreDeudor;
	}

	public void setNombreDeudor(String nombreDeudor) {
		this.nombreDeudor = nombreDeudor;
	}

	public String getNumeroServiciosDevueltos() {
		return numeroServiciosDevueltos;
	}

	public void setNumeroServiciosDevueltos(String numeroServiciosDevueltos) {
		this.numeroServiciosDevueltos = numeroServiciosDevueltos;
	}

	public String getNroOperacionCobranza() {
		return nroOperacionCobranza;
	}

	public void setNroOperacionCobranza(String nroOperacionCobranza) {
		this.nroOperacionCobranza = nroOperacionCobranza;
	}

	public String getIndicadorMasDocumentos() {
		return indicadorMasDocumentos;
	}

	public void setIndicadorMasDocumentos(String indicadorMasDocumentos) {
		this.indicadorMasDocumentos = indicadorMasDocumentos;
	}

	public String getTamanoMaximoBloque() {
		return tamanoMaximoBloque;
	}

	public void setTamanoMaximoBloque(String tamanoMaximoBloque) {
		this.tamanoMaximoBloque = tamanoMaximoBloque;
	}

	public String getPosicionUltimoDocumento() {
		return posicionUltimoDocumento;
	}

	public void setPosicionUltimoDocumento(String posicionUltimoDocumento) {
		this.posicionUltimoDocumento = posicionUltimoDocumento;
	}

	public String getPunteroBaseDatos() {
		return punteroBaseDatos;
	}

	public void setPunteroBaseDatos(String punteroBaseDatos) {
		this.punteroBaseDatos = punteroBaseDatos;
	}

	public String getOrigenRespuesta() {
		return origenRespuesta;
	}

	public void setOrigenRespuesta(String origenRespuesta) {
		this.origenRespuesta = origenRespuesta;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getFiller() {
		return filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getCodigoProductoServicio() {
		return codigoProductoServicio;
	}

	public void setCodigoProductoServicio(String codigoProductoServicio) {
		this.codigoProductoServicio = codigoProductoServicio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getEstadoDeudor() {
		return estadoDeudor;
	}

	public void setEstadoDeudor(String estadoDeudor) {
		this.estadoDeudor = estadoDeudor;
	}

	public String getMensajeDeudor1() {
		return mensajeDeudor1;
	}

	public void setMensajeDeudor1(String mensajeDeudor1) {
		this.mensajeDeudor1 = mensajeDeudor1;
	}

	public String getMensajeDeudor2() {
		return mensajeDeudor2;
	}

	public void setMensajeDeudor2(String mensajeDeudor2) {
		this.mensajeDeudor2 = mensajeDeudor2;
	}

	public String getIndicadorCronologia() {
		return indicadorCronologia;
	}

	public void setIndicadorCronologia(String indicadorCronologia) {
		this.indicadorCronologia = indicadorCronologia;
	}

	public String getIndicadoPagosVencidos() {
		return indicadoPagosVencidos;
	}

	public void setIndicadoPagosVencidos(String indicadoPagosVencidos) {
		this.indicadoPagosVencidos = indicadoPagosVencidos;
	}

	public String getRestriccionesPago() {
		return restriccionesPago;
	}

	public void setRestriccionesPago(String restriccionesPago) {
		this.restriccionesPago = restriccionesPago;
	}

	public String getDocumentosPorServicio() {
		return documentosPorServicio;
	}

	public void setDocumentosPorServicio(String documentosPorServicio) {
		this.documentosPorServicio = documentosPorServicio;
	}

	public String getFiller2() {
		return filler2;
	}

	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public List<ConsultaDetalleServicioRs> getDetalleServicio() {
		return detalleServicio;
	}

	public void setDetalleServicio(List<ConsultaDetalleServicioRs> detalleServicio) {
		this.detalleServicio = detalleServicio;
	}



	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}



	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	

}
