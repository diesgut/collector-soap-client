package com.diesgot.collectorsoapclient.scotia.model;

import org.apache.commons.lang3.StringUtils;

import com.diesgot.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgot.collectorsoapclient.scotia.enums.ExtornoAutAnulRsFieldEnum;

public class ExtornoAutAnulRs {

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
	private String terminarlId;
	private String transactionCurrencyCode;
	private String datosResevados;

	// DATOS DEL DOCUMENTO A EXTORNAR

	private String longitudTrama;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProdServicio1;
	private String codigoPlazaRecadador;
	private String codigoAgenciaRecaudador;
	private String tipoDatoPago;
	private String datoPago;
	private String codigoCiudad;
	private String nombreCliente;
	private String rucDeudor;
	private String rucAcreedor;
	private String numeroTransCobOri;
	private String numeroOpeOriginalAcreed;
	private String filler1;
	private String origenRespuesta;
	private String codigoRespuestaExtend;
	private String descripRptaAplica;
	private String codigoProdServicio2;
	private String descripProdServicio;
	private String importeProdServicio;
	private String mensaje1Marketing;
	private String mensaje2Marketing;
	private String numeroDocumentos;
	private String filler2;
	private String tipoDocumentoServicio;
	private String descripcionDocumento;
	private String numeroDocumento;
	private String periodoCotizacion;
	private String tipoDocIdentidad;
	private String nroDocIdentidad;
	private String fechaEmision;
	private String fechaVencimiento;
	private String importeAnuladoDcto;
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
	private String indicadorComprobante;
	private String numeroFacturaAnulada;
	private String referenciaDeuda;
	private String filler3;

	public ExtornoAutAnulRs() {
		super();
	}

	public String getInput() {
		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append(this.getStringFilled(messageTypeId, ExtornoAutAnulRsFieldEnum.MESSAGE_TYPE_IDENTIFICATION));
		sBuilder.append(this.getStringFilled(primaryBitMap, ExtornoAutAnulRsFieldEnum.PRIMARY_BIT_MAP));
		sBuilder.append(this.getStringFilled(secondaryBitMap, ExtornoAutAnulRsFieldEnum.SECONDARY_BIT_MAP));
		sBuilder.append(this.getStringFilled(codigoProceso, ExtornoAutAnulRsFieldEnum.CODIGO_DE_PROCESO));
		sBuilder.append(this.getStringFilled(monto, ExtornoAutAnulRsFieldEnum.MONTO));
		sBuilder.append(this.getStringFilled(fechaHoraTransaccion, ExtornoAutAnulRsFieldEnum.FECHA_Y_HORA_DE_TRANSACCION));
		sBuilder.append(this.getStringFilled(trace, ExtornoAutAnulRsFieldEnum.TRACE));
		sBuilder.append(this.getStringFilled(fechaCaptura, ExtornoAutAnulRsFieldEnum.FECHA_DE_CAPTURA));
		sBuilder.append(this.getStringFilled(identificacionEmpresa, ExtornoAutAnulRsFieldEnum.IDENTIFICACION_EMPRESA));
		sBuilder.append(this.getStringFilled(retrievalReferenceNumber, ExtornoAutAnulRsFieldEnum.RETRIEVAL_REFERENCE_NUMBER));
		sBuilder.append(this.getStringFilled(authorizationIdResponse, ExtornoAutAnulRsFieldEnum.AUTHORIZATION_ID_RESPONSE));
		sBuilder.append(this.getStringFilled(responseCode, ExtornoAutAnulRsFieldEnum.RESPONSE_CODE_));
		sBuilder.append(this.getStringFilled(terminarlId, ExtornoAutAnulRsFieldEnum.TERMINAL_ID));
		sBuilder.append(this.getStringFilled(transactionCurrencyCode, ExtornoAutAnulRsFieldEnum.TRANSACTION_CURRENCY_CODE));
		sBuilder.append(this.getStringFilled(datosResevados, ExtornoAutAnulRsFieldEnum.DATOS_RESERVADOS));
		// DATOS DEL DOCUMENTO A EXTORNAR
		sBuilder.append(this.getStringFilled(longitudTrama, ExtornoAutAnulRsFieldEnum.LONGITUD_DE_LA_TRAMA));
		sBuilder.append(this.getStringFilled(codigoFormato, ExtornoAutAnulRsFieldEnum.CODIGO_DE_FORMATO));
		sBuilder.append(this.getStringFilled(binProcesador, ExtornoAutAnulRsFieldEnum.BIN_PROCESADOR));
		sBuilder.append(this.getStringFilled(codigoAcreedor, ExtornoAutAnulRsFieldEnum.CODIGO_DE_ACREEDOR));
		sBuilder.append(this.getStringFilled(codigoProdServicio1, ExtornoAutAnulRsFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO_1));
		sBuilder.append(this.getStringFilled(codigoPlazaRecadador, ExtornoAutAnulRsFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR));
		sBuilder.append(this.getStringFilled(codigoAgenciaRecaudador,ExtornoAutAnulRsFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR));
		sBuilder.append(this.getStringFilled(tipoDatoPago, ExtornoAutAnulRsFieldEnum.TIPO_DE_DATO_DE_PAGO));
		sBuilder.append(this.getStringFilled(datoPago, ExtornoAutAnulRsFieldEnum.DATO_DE_PAGO));
		sBuilder.append(this.getStringFilled(codigoCiudad, ExtornoAutAnulRsFieldEnum.CODIGO_DE_CIUDAD));
		sBuilder.append(this.getStringFilled(nombreCliente, ExtornoAutAnulRsFieldEnum.NOMBRE_DEL_CLIENTE));
		sBuilder.append(this.getStringFilled(rucDeudor, ExtornoAutAnulRsFieldEnum.RUC_DEL_DEUDOR));
		sBuilder.append(this.getStringFilled(rucAcreedor, ExtornoAutAnulRsFieldEnum.RUC_DEL_ACREEDOR));
		sBuilder.append(this.getStringFilled(numeroTransCobOri, ExtornoAutAnulRsFieldEnum.NUMERO_DE_TRANS_DE_COB_ORI));
		sBuilder.append(this.getStringFilled(numeroOpeOriginalAcreed, ExtornoAutAnulRsFieldEnum.NUMERO_OPE_ORIGINAL_ACREED));
		sBuilder.append(this.getStringFilled(filler1, ExtornoAutAnulRsFieldEnum.FILLER_1));
		sBuilder.append(this.getStringFilled(origenRespuesta, ExtornoAutAnulRsFieldEnum.ORIGEN_DE_RESPUESTA));
		sBuilder.append(this.getStringFilled(codigoRespuestaExtend, ExtornoAutAnulRsFieldEnum.CODIGO_DE_RESPUESTA_EXTEND));
		sBuilder.append(this.getStringFilled(descripRptaAplica, ExtornoAutAnulRsFieldEnum.DESCRIPC_DE_LA_RPTA_APLICA));
		sBuilder.append(this.getStringFilled(codigoProdServicio2, ExtornoAutAnulRsFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO_2));
		sBuilder.append(this.getStringFilled(descripProdServicio, ExtornoAutAnulRsFieldEnum.DESCRIPC_DEL_PROD_SERVICIO));
		sBuilder.append(this.getStringFilled(importeProdServicio, ExtornoAutAnulRsFieldEnum.IMPORTE_DEL_PROD_SERVICIO));
		sBuilder.append(this.getStringFilled(mensaje1Marketing, ExtornoAutAnulRsFieldEnum.MENSAJE_1_MARKETING));
		sBuilder.append(this.getStringFilled(mensaje2Marketing, ExtornoAutAnulRsFieldEnum.MENSAJE_2_MARKETING));
		sBuilder.append(this.getStringFilled(numeroDocumentos, ExtornoAutAnulRsFieldEnum.NUMERO_DE_DOCUMENTOS));
		sBuilder.append(this.getStringFilled(filler2, ExtornoAutAnulRsFieldEnum.FILLER_2));
		sBuilder.append(this.getStringFilled(tipoDocumentoServicio, ExtornoAutAnulRsFieldEnum.TIPO_DE_DOCUMENTO_SERVICIO));
		sBuilder.append(this.getStringFilled(descripcionDocumento, ExtornoAutAnulRsFieldEnum.DESCRIPCION_DEL_DOCUMENTO));
		sBuilder.append(this.getStringFilled(numeroDocumento, ExtornoAutAnulRsFieldEnum.NUMERO_DE_DOCUMENTO));
		sBuilder.append(this.getStringFilled(periodoCotizacion, ExtornoAutAnulRsFieldEnum.PERIODO_DE_COTIZACION));
		sBuilder.append(this.getStringFilled(tipoDocIdentidad, ExtornoAutAnulRsFieldEnum.TIPO_DE_DOC_IDENTIDAD));
		sBuilder.append(this.getStringFilled(nroDocIdentidad, ExtornoAutAnulRsFieldEnum.NRO_DE_DOC_IDENTIDAD));
		sBuilder.append(this.getStringFilled(fechaEmision, ExtornoAutAnulRsFieldEnum.FECHA_DE_EMISION));
		sBuilder.append(this.getStringFilled(fechaVencimiento, ExtornoAutAnulRsFieldEnum.FECHA_DE_VENCIMIENTO));
		sBuilder.append(this.getStringFilled(importeAnuladoDcto, ExtornoAutAnulRsFieldEnum.IMPORTE_ANULADO_DEL_DCTO));
		sBuilder.append(this.getStringFilled(codigoConcepto1, ExtornoAutAnulRsFieldEnum.CODIGO_DE_CONCEPTO_1));
		sBuilder.append(this.getStringFilled(importeConcepto1, ExtornoAutAnulRsFieldEnum.IMPORTE_CONCEPTO_1));
		sBuilder.append(this.getStringFilled(codigoConcepto2, ExtornoAutAnulRsFieldEnum.CODIGO_DE_CONCEPTO_2));
		sBuilder.append(this.getStringFilled(importeConcepto2, ExtornoAutAnulRsFieldEnum.IMPORTE_CONCEPTO_2));
		sBuilder.append(this.getStringFilled(codigoConcepto3, ExtornoAutAnulRsFieldEnum.CODIGO_DE_CONCEPTO_3));
		sBuilder.append(this.getStringFilled(importeConcepto3, ExtornoAutAnulRsFieldEnum.IMPORTE_CONCEPTO_3));
		sBuilder.append(this.getStringFilled(codigoConcepto4, ExtornoAutAnulRsFieldEnum.CODIGO_DE_CONCEPTO_4));
		sBuilder.append(this.getStringFilled(importeConcepto4, ExtornoAutAnulRsFieldEnum.IMPORTE_CONCEPTO_4));
		sBuilder.append(this.getStringFilled(codigoConcepto5, ExtornoAutAnulRsFieldEnum.CODIGO_DE_CONCEPTO_5));
		sBuilder.append(this.getStringFilled(importeConcepto5, ExtornoAutAnulRsFieldEnum.IMPORTE_CONCEPTO_5));
		sBuilder.append(this.getStringFilled(indicadorComprobante, ExtornoAutAnulRsFieldEnum.INDICADOR_DE_COMPROBANTE));
		sBuilder.append(this.getStringFilled(numeroFacturaAnulada, ExtornoAutAnulRsFieldEnum.NUMERO_DE_FACTURA_ANULADA));
		sBuilder.append(this.getStringFilled(referenciaDeuda, ExtornoAutAnulRsFieldEnum.REFERENCIA_DE_LA_DEUDA));
		sBuilder.append(this.getStringFilled(filler3, ExtornoAutAnulRsFieldEnum.FILLER_3));

		return sBuilder.toString();
	}

	public String getStringFilled(String input, ExtornoAutAnulRsFieldEnum extornoAutAnulRsFieldEnum) {
		String preData = input == null ? "" : input;
		if (preData.length() >= extornoAutAnulRsFieldEnum.getDataLength()) {
			preData = preData.substring(0, extornoAutAnulRsFieldEnum.getDataLength());
		}
		if (extornoAutAnulRsFieldEnum.getAlign() == AlignFillEnum.RIGHT) {
			input = StringUtils.rightPad(preData, extornoAutAnulRsFieldEnum.getDataLength(),
					extornoAutAnulRsFieldEnum.getDataFill());
		} else if (extornoAutAnulRsFieldEnum.getAlign() == AlignFillEnum.LEFT) {
			input = StringUtils.leftPad(preData, extornoAutAnulRsFieldEnum.getDataLength(),
					extornoAutAnulRsFieldEnum.getDataFill());
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

	public String getTerminarlId() {
		return terminarlId;
	}

	public void setTerminarlId(String terminarlId) {
		this.terminarlId = terminarlId;
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

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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

	public String getDescripRptaAplica() {
		return descripRptaAplica;
	}

	public void setDescripRptaAplica(String descripRptaAplica) {
		this.descripRptaAplica = descripRptaAplica;
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

	public String getImporteProdServicio() {
		return importeProdServicio;
	}

	public void setImporteProdServicio(String importeProdServicio) {
		this.importeProdServicio = importeProdServicio;
	}

	public String getMensaje1Marketing() {
		return mensaje1Marketing;
	}

	public void setMensaje1Marketing(String mensaje1Marketing) {
		this.mensaje1Marketing = mensaje1Marketing;
	}

	public String getMensaje2Marketing() {
		return mensaje2Marketing;
	}

	public void setMensaje2Marketing(String mensaje2Marketing) {
		this.mensaje2Marketing = mensaje2Marketing;
	}

	public String getNumeroDocumentos() {
		return numeroDocumentos;
	}

	public void setNumeroDocumentos(String numeroDocumentos) {
		this.numeroDocumentos = numeroDocumentos;
	}

	public String getFiller2() {
		return filler2;
	}

	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public String getTipoDocumentoServicio() {
		return tipoDocumentoServicio;
	}

	public void setTipoDocumentoServicio(String tipoDocumentoServicio) {
		this.tipoDocumentoServicio = tipoDocumentoServicio;
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

	public String getNroDocIdentidad() {
		return nroDocIdentidad;
	}

	public void setNroDocIdentidad(String nroDocIdentidad) {
		this.nroDocIdentidad = nroDocIdentidad;
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

	public String getImporteAnuladoDcto() {
		return importeAnuladoDcto;
	}

	public void setImporteAnuladoDcto(String importeAnuladoDcto) {
		this.importeAnuladoDcto = importeAnuladoDcto;
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

	public String getIndicadorComprobante() {
		return indicadorComprobante;
	}

	public void setIndicadorComprobante(String indicadorComprobante) {
		this.indicadorComprobante = indicadorComprobante;
	}

	public String getNumeroFacturaAnulada() {
		return numeroFacturaAnulada;
	}

	public void setNumeroFacturaAnulada(String numeroFacturaAnulada) {
		this.numeroFacturaAnulada = numeroFacturaAnulada;
	}

	public String getReferenciaDeuda() {
		return referenciaDeuda;
	}

	public void setReferenciaDeuda(String referenciaDeuda) {
		this.referenciaDeuda = referenciaDeuda;
	}

	public String getFiller3() {
		return filler3;
	}

	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}

}
