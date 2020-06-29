package com.diesgut.collectorsoapclient.scotia.model;

import org.apache.commons.lang3.StringUtils;

import com.diesgut.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgut.collectorsoapclient.scotia.enums.PagoRsFieldEnum;

public class PagoRs {

	private String messageTypeId;
	private String primaryBitMap;
	private String secondaryBitMap;
	private String codigoProceso;
	private String monto;
	private String fechaHoraTransaccion;
	private String trace;
	private String fechaCaptura;
	private String identificacionEmpresa;
	private String retrievalReferenceNumber;
	private String authorizationIdResponse;
	private String responseCode;
	private String terminalId;
	private String transactionCurrencyCode;
	private String datosReservados;
	private String respuestaRequerimiento;
	private String tamanioBloque;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProductoServicio;
	private String codigoPlazaRecaudador;
	private String codigoAgenciaRecaudador;
	private String tipoDatoPago;
	private String datoPago;
	private String codigoCiudad;
	private String nroOperacionCobranza;
	private String nroOperacionAcreedor;
	private String nroProdServPagad;
	private String nroTotalDocPagad;
	private String filler1;
	private String origenRespuesta;
	private String codigoRespuestaExtend;
	private String descripRptaAplicativo;
	private String nombreDeudor;
	private String rucDeudor;
	private String rucAcreedor;
	private String codigoZonaDeudor;
	private String filler2;
	private String codigoProdServicio;
	private String descripcProdServ;
	private String importeTotalPorProdServ;
	private String mensaje1;
	private String mensaje2;
	private String numeroDocumentos;
	private String filler3;
	private String tipoServicio;
	private String descripcionDocumento;
	private String numeroDocumento;
	private String periodoCotizacion;
	private String tipoDocIdentidad;
	private String nroDocumentoIdentidad;
	private String fechaEmision;
	private String fechaVencimiento;
	private String importePagado;
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
	private String indicadorFacturacion;
	private String numeroFactura;
	private String referenciaDeuda;
	private String filler4;

	public PagoRs() {
		super();
	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, PagoRsFieldEnum.MESSAGE_TYPE_IDENTIFICATION) );
		sBuilder.append( this.getStringFilled(primaryBitMap, PagoRsFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secondaryBitMap, PagoRsFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(codigoProceso, PagoRsFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, PagoRsFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion, PagoRsFieldEnum.FECHA_Y_HORA_DE_TRANSACCION) );
		sBuilder.append( this.getStringFilled(trace, PagoRsFieldEnum.TRACE) );
		sBuilder.append( this.getStringFilled(fechaCaptura, PagoRsFieldEnum.FECHA_DE_CAPTURA) );
		sBuilder.append( this.getStringFilled(identificacionEmpresa, PagoRsFieldEnum.IDENTIFICACION_EMPRESA) );
		sBuilder.append( this.getStringFilled(retrievalReferenceNumber, PagoRsFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(authorizationIdResponse, PagoRsFieldEnum.AUTHORIZATION_ID_RESPONSE) );
		sBuilder.append( this.getStringFilled(responseCode, PagoRsFieldEnum.RESPONSE_CODE) );
		sBuilder.append( this.getStringFilled(terminalId, PagoRsFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, PagoRsFieldEnum.TRANSACTION_CURRENCY_CODE) );
		sBuilder.append( this.getStringFilled(datosReservados, PagoRsFieldEnum.DATOS_RESERVADOS) );
		//RESPUESTA REQUERIMIENTO
		sBuilder.append( this.getStringFilled(tamanioBloque, PagoRsFieldEnum.TAMANIO_DEL_BLOQUE) );
		sBuilder.append( this.getStringFilled(codigoFormato, PagoRsFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, PagoRsFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(codigoAcreedor, PagoRsFieldEnum.CODIGO_DE_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProductoServicio, PagoRsFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO) );
		sBuilder.append( this.getStringFilled(codigoPlazaRecaudador, PagoRsFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(codigoAgenciaRecaudador, PagoRsFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(tipoDatoPago, PagoRsFieldEnum.TIPO_DE_DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(datoPago, PagoRsFieldEnum.DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(codigoCiudad, PagoRsFieldEnum.CODIGO_DE_CIUDAD) );
		sBuilder.append( this.getStringFilled(nroOperacionCobranza, PagoRsFieldEnum.NUMERO_DE_OPERAC_COBRANZA) );
		sBuilder.append( this.getStringFilled(nroOperacionAcreedor, PagoRsFieldEnum.NUMERO_DE_OPERAC_ACREEDOR) );
		sBuilder.append( this.getStringFilled(nroProdServPagad, PagoRsFieldEnum.NUMERO_DE_PROD_SERV_PAGAD) );
		sBuilder.append( this.getStringFilled(nroTotalDocPagad, PagoRsFieldEnum.NUMERO_TOTAL_DE_DOC_PAGAD) );
		sBuilder.append( this.getStringFilled(filler1, PagoRsFieldEnum.FILLER1) );
		sBuilder.append( this.getStringFilled(origenRespuesta, PagoRsFieldEnum.ORIGEN_DE_RESPUESTA) );
		sBuilder.append( this.getStringFilled(codigoRespuestaExtend, PagoRsFieldEnum.CODIGO_DE_RESPUESTA_EXTEND) );
		sBuilder.append( this.getStringFilled(descripRptaAplicativo, PagoRsFieldEnum.DESCRIPC_DE_LA_RPTA_APLICATIV) );
		sBuilder.append( this.getStringFilled(nombreDeudor, PagoRsFieldEnum.NOMBRE_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(rucDeudor, PagoRsFieldEnum.RUC_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(rucAcreedor, PagoRsFieldEnum.RUC_DEL_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoZonaDeudor, PagoRsFieldEnum.CODIGO_DE_ZONA_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(filler2, PagoRsFieldEnum.FILLER2) );
		sBuilder.append( this.getStringFilled(codigoProdServicio, PagoRsFieldEnum.CODIGO_DEL_PROD_SERVICIO) );
		sBuilder.append( this.getStringFilled(descripcProdServ, PagoRsFieldEnum.DESCRIPC_DEL_PROD_SERV) );
		sBuilder.append( this.getStringFilled(importeTotalPorProdServ, PagoRsFieldEnum.IMPORTE_TOTAL_POR_PROD_SERV) );
		sBuilder.append( this.getStringFilled(mensaje1, PagoRsFieldEnum.MENSAJE_1) );
		sBuilder.append( this.getStringFilled(mensaje2, PagoRsFieldEnum.MENSAJE_2) );
		sBuilder.append( this.getStringFilled(filler3, PagoRsFieldEnum.FILLER3) );
		sBuilder.append( this.getStringFilled(tipoServicio, PagoRsFieldEnum.TIPO_DE_SERVICIO) );
		sBuilder.append( this.getStringFilled(descripcionDocumento, PagoRsFieldEnum.DESCRIPCION_DEL_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(numeroDocumento, PagoRsFieldEnum.NUMERO_DEL_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(periodoCotizacion, PagoRsFieldEnum.PERIODO_DE_COTIZACION) );
		sBuilder.append( this.getStringFilled(tipoDocIdentidad, PagoRsFieldEnum.TIPO_DOC_IDENTIDAD) );
		sBuilder.append( this.getStringFilled(nroDocumentoIdentidad, PagoRsFieldEnum.NUMERO_DOCUMENTO_IDENTIDAD) );
		sBuilder.append( this.getStringFilled(fechaEmision, PagoRsFieldEnum.FECHA_DE_EMISION) );
		sBuilder.append( this.getStringFilled(fechaVencimiento, PagoRsFieldEnum.FECHA_DE_VENCIMIENTO) );
		sBuilder.append( this.getStringFilled(importePagado, PagoRsFieldEnum.IMPORTE_PAGADO) );
		sBuilder.append( this.getStringFilled(codigoConcepto1, PagoRsFieldEnum.CODIGO_DE_CONCEPTO_1) );
		sBuilder.append( this.getStringFilled(importeConcepto1, PagoRsFieldEnum.IMPORTE_CONCEPTO_1) );
		sBuilder.append( this.getStringFilled(codigoConcepto2, PagoRsFieldEnum.CODIGO_DE_CONCEPTO_2) );
		sBuilder.append( this.getStringFilled(importeConcepto2, PagoRsFieldEnum.IMPORTE_CONCEPTO_2) );
		sBuilder.append( this.getStringFilled(codigoConcepto3, PagoRsFieldEnum.CODIGO_DE_CONCEPTO_3) );
		sBuilder.append( this.getStringFilled(importeConcepto3, PagoRsFieldEnum.IMPORTE_CONCEPTO_3) );
		sBuilder.append( this.getStringFilled(codigoConcepto4, PagoRsFieldEnum.CODIGO_DE_CONCEPTO_4) );
		sBuilder.append( this.getStringFilled(importeConcepto4, PagoRsFieldEnum.IMPORTE_CONCEPTO_4) );
		sBuilder.append( this.getStringFilled(codigoConcepto5, PagoRsFieldEnum.CODIGO_DE_CONCEPTO_5) );
		sBuilder.append( this.getStringFilled(importeConcepto5, PagoRsFieldEnum.IMPORTE_CONCEPTO_5) );
		sBuilder.append( this.getStringFilled(indicadorFacturacion, PagoRsFieldEnum.INDICADOR_DE_FACTURACION) );
		sBuilder.append( this.getStringFilled(numeroFactura, PagoRsFieldEnum.NUMERO_DE_FACTURA) );
		sBuilder.append( this.getStringFilled(referenciaDeuda, PagoRsFieldEnum.REFERENCIA_DE_LA_DEUDA) );
		sBuilder.append( this.getStringFilled(filler4, PagoRsFieldEnum.FILLER4) );
		return sBuilder.toString();
	}
	
	public String getStringFilled(String input, PagoRsFieldEnum consultaRsFieldEnum) {
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

	public String getIdentificacionEmpresa() {
		return identificacionEmpresa;
	}

	public void setIdentificacionEmpresa(String identificacionEmpresa) {
		this.identificacionEmpresa = identificacionEmpresa;
	}

	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}

	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
		this.retrievalReferenceNumber = retrievalReferenceNumber;
	}

	public String getAuthorizationIdResponse() {
		return authorizationIdResponse;
	}

	public void setAuthorizationIdResponse(String authorizationIdResponse) {
		this.authorizationIdResponse = authorizationIdResponse;
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

	public String getRespuestaRequerimiento() {
		return respuestaRequerimiento;
	}

	public void setRespuestaRequerimiento(String respuestaRequerimiento) {
		this.respuestaRequerimiento = respuestaRequerimiento;
	}


	public String getTamanioBloque() {
		return tamanioBloque;
	}

	public void setTamanioBloque(String tamanioBloque) {
		this.tamanioBloque = tamanioBloque;
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

	public String getNroOperacionCobranza() {
		return nroOperacionCobranza;
	}

	public void setNroOperacionCobranza(String nroOperacionCobranza) {
		this.nroOperacionCobranza = nroOperacionCobranza;
	}

	public String getNroOperacionAcreedor() {
		return nroOperacionAcreedor;
	}

	public void setNroOperacionAcreedor(String nroOperacionAcreedor) {
		this.nroOperacionAcreedor = nroOperacionAcreedor;
	}

	public String getNroProdServPagad() {
		return nroProdServPagad;
	}

	public void setNroProdServPagad(String nroProdServPagad) {
		this.nroProdServPagad = nroProdServPagad;
	}

	public String getNroTotalDocPagad() {
		return nroTotalDocPagad;
	}

	public void setNroTotalDocPagad(String nroTotalDocPagad) {
		this.nroTotalDocPagad = nroTotalDocPagad;
	}

	public String getFiller1() {
		return filler1;
	}

	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}

	public String getOrigenRespuesta() {
		return origenRespuesta;
	}

	public void setOrigenRespuesta(String origenRespuesta) {
		this.origenRespuesta = origenRespuesta;
	}

	public String getCodigoRespuestaExtend() {
		return codigoRespuestaExtend;
	}

	public void setCodigoRespuestaExtend(String codigoRespuestaExtend) {
		this.codigoRespuestaExtend = codigoRespuestaExtend;
	}

	public String getDescripRptaAplicativo() {
		return descripRptaAplicativo;
	}

	public void setDescripRptaAplicativo(String descripRptaAplicativo) {
		this.descripRptaAplicativo = descripRptaAplicativo;
	}

	public String getNombreDeudor() {
		return nombreDeudor;
	}

	public void setNombreDeudor(String nombreDeudor) {
		this.nombreDeudor = nombreDeudor;
	}

	public String getRucDeudor() {
		return rucDeudor;
	}

	public void setRucDeudor(String rucDeudor) {
		this.rucDeudor = rucDeudor;
	}

	public String getRucAcreedor() {
		return rucAcreedor;
	}

	public void setRucAcreedor(String rucAcreedor) {
		this.rucAcreedor = rucAcreedor;
	}

	public String getCodigoZonaDeudor() {
		return codigoZonaDeudor;
	}

	public void setCodigoZonaDeudor(String codigoZonaDeudor) {
		this.codigoZonaDeudor = codigoZonaDeudor;
	}

	public String getFiller2() {
		return filler2;
	}

	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public String getCodigoProdServicio() {
		return codigoProdServicio;
	}

	public void setCodigoProdServicio(String codigoProdServicio) {
		this.codigoProdServicio = codigoProdServicio;
	}

	public String getDescripcProdServ() {
		return descripcProdServ;
	}

	public void setDescripcProdServ(String descripcProdServ) {
		this.descripcProdServ = descripcProdServ;
	}

	public String getImporteTotalPorProdServ() {
		return importeTotalPorProdServ;
	}

	public void setImporteTotalPorProdServ(String importeTotalPorProdServ) {
		this.importeTotalPorProdServ = importeTotalPorProdServ;
	}

	public String getMensaje1() {
		return mensaje1;
	}

	public void setMensaje1(String mensaje1) {
		this.mensaje1 = mensaje1;
	}

	public String getMensaje2() {
		return mensaje2;
	}

	public void setMensaje2(String mensaje2) {
		this.mensaje2 = mensaje2;
	}

	public String getNumeroDocumentos() {
		return numeroDocumentos;
	}

	public void setNumeroDocumentos(String numeroDocumentos) {
		this.numeroDocumentos = numeroDocumentos;
	}

	public String getFiller3() {
		return filler3;
	}

	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getDescripcionDocumento() {
		return descripcionDocumento;
	}

	public void setDescripcionDocumento(String descripcionDocumento) {
		this.descripcionDocumento = descripcionDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getPeriodoCotizacion() {
		return periodoCotizacion;
	}

	public void setPeriodoCotizacion(String periodoCotizacion) {
		this.periodoCotizacion = periodoCotizacion;
	}

	public String getTipoDocIdentidad() {
		return tipoDocIdentidad;
	}

	public void setTipoDocIdentidad(String tipoDocIdentidad) {
		this.tipoDocIdentidad = tipoDocIdentidad;
	}

	public String getNroDocumentoIdentidad() {
		return nroDocumentoIdentidad;
	}

	public void setNroDocumentoIdentidad(String nroDocumentoIdentidad) {
		this.nroDocumentoIdentidad = nroDocumentoIdentidad;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getImportePagado() {
		return importePagado;
	}

	public void setImportePagado(String importePagado) {
		this.importePagado = importePagado;
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

	public String getImporteConcepto3() {
		return importeConcepto3;
	}

	public void setImporteConcepto3(String importeConcepto3) {
		this.importeConcepto3 = importeConcepto3;
	}

	public String getImporteConcepto4() {
		return importeConcepto4;
	}

	public void setImporteConcepto4(String importeConcepto4) {
		this.importeConcepto4 = importeConcepto4;
	}

	public String getImporteConcepto5() {
		return importeConcepto5;
	}

	public void setImporteConcepto5(String importeConcepto5) {
		this.importeConcepto5 = importeConcepto5;
	}

	public String getIndicadorFacturacion() {
		return indicadorFacturacion;
	}

	public void setIndicadorFacturacion(String indicadorFacturacion) {
		this.indicadorFacturacion = indicadorFacturacion;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
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

	public String getCodigoConcepto3() {
		return codigoConcepto3;
	}

	public void setCodigoConcepto3(String codigoConcepto3) {
		this.codigoConcepto3 = codigoConcepto3;
	}

	public String getCodigoConcepto4() {
		return codigoConcepto4;
	}

	public void setCodigoConcepto4(String codigoConcepto4) {
		this.codigoConcepto4 = codigoConcepto4;
	}

	public String getCodigoConcepto5() {
		return codigoConcepto5;
	}

	public void setCodigoConcepto5(String codigoConcepto5) {
		this.codigoConcepto5 = codigoConcepto5;
	}

}
