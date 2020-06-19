package com.diesgot.collectorsoapclient.scotia.model;

import org.apache.commons.lang3.StringUtils;

import com.diesgot.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgot.collectorsoapclient.scotia.enums.ExtornoAutPagoRsFieldEnum;

public class ExtornoAutPagoRs {

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
	private String datosResevados;

	// RESPUESTA REQUERIMIENTO

	private String tamanioBloque;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProdServicio1;
	private String codigoPlazaRecadador;
	private String codigoAgenciaRecaudador;
	private String tipoDatoPago;
	private String datoPago;
	private String codigoCiudad;
	private String numeroOperacCobranza;
	private String numeroOperacAcreedor;
	private String numeroProdServPagado;
	private String numeroTotalDocPagado;
	private String filler1;
	private String origenRespuesta;
	private String codigoRespuestaExtend;
	private String descripRptaApplica;
	private String nombreDeudor;
	private String rucDeudor;
	private String rucAcreedor;
	private String codigoZonaDeudor;
	private String filler2;
	private String codigoProdServicio2;
	private String descripProdServicio;
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
	private String numeroDocumentoIdentidad;
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

	public ExtornoAutPagoRs() {
		super();
	}

	public String getInput() {
		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append(this.getStringFilled(messageTypeId, ExtornoAutPagoRsFieldEnum.MESSAGE_TYPE_IDENTIFICATION));
		sBuilder.append(this.getStringFilled(primaryBitMap, ExtornoAutPagoRsFieldEnum.PRIMARY_BIT_MAP));
		sBuilder.append(this.getStringFilled(secondaryBitMap, ExtornoAutPagoRsFieldEnum.SECONDARY_BIT_MAP));
		sBuilder.append(this.getStringFilled(codigoProceso, ExtornoAutPagoRsFieldEnum.CODIGO_DE_PROCESO));
		sBuilder.append(this.getStringFilled(monto, ExtornoAutPagoRsFieldEnum.MONTO));
		sBuilder.append(this.getStringFilled(fechaHoraTransaccion, ExtornoAutPagoRsFieldEnum.FECHA_Y_HORA_DE_TRANSACCION));
		sBuilder.append(this.getStringFilled(trace, ExtornoAutPagoRsFieldEnum.TRACE));
		sBuilder.append(this.getStringFilled(fechaCaptura, ExtornoAutPagoRsFieldEnum.FECHA_DE_CAPTURA));
		sBuilder.append(this.getStringFilled(identificacionEmpresa, ExtornoAutPagoRsFieldEnum.IDENTIFICACION_EMPRESA));
		sBuilder.append(this.getStringFilled(retrievalReferenceNumber, ExtornoAutPagoRsFieldEnum.RETRIEVAL_REFERENCE_NUMBER));
		sBuilder.append(this.getStringFilled(authorizationIdResponse, ExtornoAutPagoRsFieldEnum.AUTHORIZATION_ID_RESPONSE));
		sBuilder.append(this.getStringFilled(responseCode, ExtornoAutPagoRsFieldEnum.RESPONSE_CODE));
		sBuilder.append(this.getStringFilled(terminalId, ExtornoAutPagoRsFieldEnum.TERMINAL_ID));
		sBuilder.append(this.getStringFilled(transactionCurrencyCode, ExtornoAutPagoRsFieldEnum.TRANSACTION_CURRENCY_CODE));
		sBuilder.append(this.getStringFilled(datosResevados, ExtornoAutPagoRsFieldEnum.DATOS_RESERVADOS));

		// RESPUESTA REQUERIMIENTO

		sBuilder.append(this.getStringFilled(tamanioBloque, ExtornoAutPagoRsFieldEnum.TAMANIO_DEL_BLOQUE));
		sBuilder.append(this.getStringFilled(codigoFormato, ExtornoAutPagoRsFieldEnum.CODIGO_DE_FORMATO));
		sBuilder.append(this.getStringFilled(binProcesador, ExtornoAutPagoRsFieldEnum.BIN_PROCESADOR));
		sBuilder.append(this.getStringFilled(codigoAcreedor, ExtornoAutPagoRsFieldEnum.CODIGO_DE_ACREEDOR));
		sBuilder.append(this.getStringFilled(codigoProdServicio1, ExtornoAutPagoRsFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO));
		sBuilder.append(this.getStringFilled(codigoPlazaRecadador, ExtornoAutPagoRsFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR));
		sBuilder.append(this.getStringFilled(codigoAgenciaRecaudador, ExtornoAutPagoRsFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR));
		sBuilder.append(this.getStringFilled(tipoDatoPago, ExtornoAutPagoRsFieldEnum.TIPO_DE_DATO_DE_PAGO));
		sBuilder.append(this.getStringFilled(datoPago, ExtornoAutPagoRsFieldEnum.DATO_DE_PAGO));
		sBuilder.append(this.getStringFilled(codigoCiudad, ExtornoAutPagoRsFieldEnum.CODIGO_DE_CIUDAD));
		sBuilder.append(this.getStringFilled(numeroOperacCobranza, ExtornoAutPagoRsFieldEnum.NUMERO_DE_OPERAC_COBRANZA));
		sBuilder.append(this.getStringFilled(numeroOperacAcreedor, ExtornoAutPagoRsFieldEnum.NUMERO_DE_OPERAC_ACREEDOR));
		sBuilder.append(this.getStringFilled(numeroProdServPagado, ExtornoAutPagoRsFieldEnum.NUMERO_DE_PROD_SERV_PAGAD));
		sBuilder.append(this.getStringFilled(numeroTotalDocPagado, ExtornoAutPagoRsFieldEnum.NUMERO_TOTAL_DE_DOC_PAGAD));
		sBuilder.append(this.getStringFilled(filler1, ExtornoAutPagoRsFieldEnum.FILLER_1));
		sBuilder.append(this.getStringFilled(origenRespuesta, ExtornoAutPagoRsFieldEnum.ORIGEN_DE_RESPUESTA));
		sBuilder.append(this.getStringFilled(codigoRespuestaExtend, ExtornoAutPagoRsFieldEnum.CODIGO_DE_RESPUESTA_EXTEND));
		sBuilder.append(this.getStringFilled(descripRptaApplica, ExtornoAutPagoRsFieldEnum.DESCRIPC_DE_LA_RPTA_APLICATIV));
		sBuilder.append(this.getStringFilled(nombreDeudor, ExtornoAutPagoRsFieldEnum.NOMBRE_DEL_DEUDOR));
		sBuilder.append(this.getStringFilled(rucDeudor, ExtornoAutPagoRsFieldEnum.RUC_DEL_DEUDOR));
		sBuilder.append(this.getStringFilled(rucAcreedor, ExtornoAutPagoRsFieldEnum.RUC_DEL_ACREEDOR));
		sBuilder.append(this.getStringFilled(codigoZonaDeudor, ExtornoAutPagoRsFieldEnum.CODIGO_DE_ZONA_DEL_DEUDOR));
		sBuilder.append(this.getStringFilled(filler2, ExtornoAutPagoRsFieldEnum.FILLER_2));
		sBuilder.append(this.getStringFilled(codigoProdServicio2, ExtornoAutPagoRsFieldEnum.CODIGO_DEL_PROD_SERVICIO));
		sBuilder.append(this.getStringFilled(descripProdServicio, ExtornoAutPagoRsFieldEnum.DESCRIPC_DEL_PROD_SERV));
		sBuilder.append(this.getStringFilled(importeTotalPorProdServ, ExtornoAutPagoRsFieldEnum.IMPORTE_TOTAL_POR_PROD_SERV));
		sBuilder.append(this.getStringFilled(mensaje1, ExtornoAutPagoRsFieldEnum.MENSAJE_1));
		sBuilder.append(this.getStringFilled(mensaje2, ExtornoAutPagoRsFieldEnum.MENSAJE_2));
		sBuilder.append(this.getStringFilled(numeroDocumentos, ExtornoAutPagoRsFieldEnum.NUMERO_DE_DOCUMENTOS));
		sBuilder.append(this.getStringFilled(filler3, ExtornoAutPagoRsFieldEnum.FILLER_3));
		sBuilder.append(this.getStringFilled(tipoServicio, ExtornoAutPagoRsFieldEnum.TIPO_DE_SERVICIO));
		sBuilder.append(this.getStringFilled(descripcionDocumento, ExtornoAutPagoRsFieldEnum.DESCRIPCION_DEL_DOCUMENTO));
		sBuilder.append(this.getStringFilled(numeroDocumento, ExtornoAutPagoRsFieldEnum.NUMERO_DEL_DOCUMENTO));
		sBuilder.append(this.getStringFilled(periodoCotizacion, ExtornoAutPagoRsFieldEnum.PERIODO_DE_COTIZACION));
		sBuilder.append(this.getStringFilled(tipoDocIdentidad, ExtornoAutPagoRsFieldEnum.TIPO_DOC_IDENTIDAD));
		sBuilder.append(this.getStringFilled(numeroDocumentoIdentidad, ExtornoAutPagoRsFieldEnum.NUMERO_DOCUMENTO_IDENTIDAD));
		sBuilder.append(this.getStringFilled(fechaEmision, ExtornoAutPagoRsFieldEnum.FECHA_DE_EMISION));
		sBuilder.append(this.getStringFilled(fechaVencimiento, ExtornoAutPagoRsFieldEnum.FECHA_DE_VENCIMIENTO));
		sBuilder.append(this.getStringFilled(importePagado, ExtornoAutPagoRsFieldEnum.IMPORTE_PAGADO));
		sBuilder.append(this.getStringFilled(codigoConcepto1, ExtornoAutPagoRsFieldEnum.CODIGO_DE_CONCEPTO1));
		sBuilder.append(this.getStringFilled(importeConcepto1, ExtornoAutPagoRsFieldEnum.IMPORTE_CONCEPTO_1));
		sBuilder.append(this.getStringFilled(codigoConcepto2, ExtornoAutPagoRsFieldEnum.CODIGO_DE_CONCEPTO2));
		sBuilder.append(this.getStringFilled(importeConcepto2, ExtornoAutPagoRsFieldEnum.IMPORTE_CONCEPTO_2));
		sBuilder.append(this.getStringFilled(codigoConcepto3, ExtornoAutPagoRsFieldEnum.CODIGO_DE_CONCEPTO3));
		sBuilder.append(this.getStringFilled(importeConcepto3, ExtornoAutPagoRsFieldEnum.IMPORTE_CONCEPTO_3));
		sBuilder.append(this.getStringFilled(codigoConcepto4, ExtornoAutPagoRsFieldEnum.CODIGO_DE_CONCEPTO4));
		sBuilder.append(this.getStringFilled(importeConcepto4, ExtornoAutPagoRsFieldEnum.IMPORTE_CONCEPTO_4));
		sBuilder.append(this.getStringFilled(codigoConcepto5, ExtornoAutPagoRsFieldEnum.CODIGO_DE_CONCEPTO5));
		sBuilder.append(this.getStringFilled(importeConcepto5, ExtornoAutPagoRsFieldEnum.IMPORTE_CONCEPTO_5));
		sBuilder.append(this.getStringFilled(indicadorFacturacion, ExtornoAutPagoRsFieldEnum.INDICADOR_DE_FACTURACION));
		sBuilder.append(this.getStringFilled(numeroFactura, ExtornoAutPagoRsFieldEnum.NUMERO_DE_FACTURA));
		sBuilder.append(this.getStringFilled(referenciaDeuda, ExtornoAutPagoRsFieldEnum.REFERENCIA_DE_LA_DEUDA));
		sBuilder.append(this.getStringFilled(filler4, ExtornoAutPagoRsFieldEnum.FILLER_4));

		return sBuilder.toString();
	}

	public String getStringFilled(String input, ExtornoAutPagoRsFieldEnum extornoAutPagoRsFieldEnum) {
		String preData = input == null ? "" : input;
		if (preData.length() >= extornoAutPagoRsFieldEnum.getDataLength()) {
			preData = preData.substring(0, extornoAutPagoRsFieldEnum.getDataLength());
		}
		if (extornoAutPagoRsFieldEnum.getAlign() == AlignFillEnum.RIGHT) {
			input = StringUtils.rightPad(preData, extornoAutPagoRsFieldEnum.getDataLength(),
					extornoAutPagoRsFieldEnum.getDataFill());
		} else if (extornoAutPagoRsFieldEnum.getAlign() == AlignFillEnum.LEFT) {
			input = StringUtils.leftPad(preData, extornoAutPagoRsFieldEnum.getDataLength(),
					extornoAutPagoRsFieldEnum.getDataFill());
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

	public String getDatosResevados() {
		return datosResevados;
	}

	public void setDatosResevados(String datosResevados) {
		this.datosResevados = datosResevados;
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

	public String getCodigoProdServicio1() {
		return codigoProdServicio1;
	}

	public void setCodigoProdServicio1(String codigoProdServicio1) {
		this.codigoProdServicio1 = codigoProdServicio1;
	}

	public String getCodigoPlazaRecadador() {
		return codigoPlazaRecadador;
	}

	public void setCodigoPlazaRecadador(String codigoPlazaRecadador) {
		this.codigoPlazaRecadador = codigoPlazaRecadador;
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

	public String getNumeroOperacCobranza() {
		return numeroOperacCobranza;
	}

	public void setNumeroOperacCobranza(String numeroOperacCobranza) {
		this.numeroOperacCobranza = numeroOperacCobranza;
	}

	public String getNumeroOperacAcreedor() {
		return numeroOperacAcreedor;
	}

	public void setNumeroOperacAcreedor(String numeroOperacAcreedor) {
		this.numeroOperacAcreedor = numeroOperacAcreedor;
	}

	public String getNumeroProdServPagado() {
		return numeroProdServPagado;
	}

	public void setNumeroProdServPagado(String numeroProdServPagado) {
		this.numeroProdServPagado = numeroProdServPagado;
	}

	public String getNumeroTotalDocPagado() {
		return numeroTotalDocPagado;
	}

	public void setNumeroTotalDocPagado(String numeroTotalDocPagado) {
		this.numeroTotalDocPagado = numeroTotalDocPagado;
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

	public String getDescripRptaApplica() {
		return descripRptaApplica;
	}

	public void setDescripRptaApplica(String descripRptaApplica) {
		this.descripRptaApplica = descripRptaApplica;
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

	public String getCodigoProdServicio2() {
		return codigoProdServicio2;
	}

	public void setCodigoProdServicio2(String codigoProdServicio2) {
		this.codigoProdServicio2 = codigoProdServicio2;
	}

	public String getDescripProdServicio() {
		return descripProdServicio;
	}

	public void setDescripProdServicio(String descripProdServicio) {
		this.descripProdServicio = descripProdServicio;
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

	public String getNumeroDocumentoIdentidad() {
		return numeroDocumentoIdentidad;
	}

	public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
		this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
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

}
