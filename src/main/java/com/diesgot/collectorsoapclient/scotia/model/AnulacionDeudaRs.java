package com.diesgot.collectorsoapclient.scotia.model;

import org.apache.commons.lang3.StringUtils;

import com.diesgot.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgot.collectorsoapclient.scotia.enums.AnulacionDeudaRsFieldEnum;

public class AnulacionDeudaRs {

	private String messageTypeId;
	private String primaryBitMap;
	private String secondaryBitMap;
	private String codigoProceso;
	private String monto;
	private String fechaHoraTransaccion;
	private String trace;
	private String fechaCaptura;
	private String identificacionEmpresa;
	private String retrievalRefereneNumber;
	private String authorizationIdResponse;
	private String responseCode;
	private String terminalId;
	private String transactionCurrencyCode;
	private String datosReservados;

	// datos documento a extornar

	private String longitudTrama;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProdServ1;
	private String codigoPlazaRecaudador;
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
	private String descripRptaAplic;
	private String codigoProdServ2;
	private String descProdServ;
	private String importeProdServ;
	private String mensaje1;
	private String mensaje2;
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

	public AnulacionDeudaRs() {

	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, AnulacionDeudaRsFieldEnum.MESSAGE_TYPE_IDENTIFICATION) );
		sBuilder.append( this.getStringFilled(primaryBitMap, AnulacionDeudaRsFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secondaryBitMap, AnulacionDeudaRsFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(codigoProceso, AnulacionDeudaRsFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, AnulacionDeudaRsFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion, AnulacionDeudaRsFieldEnum.FECHA_Y_HORA_DE_TRANSACCION) );
		sBuilder.append( this.getStringFilled(trace, AnulacionDeudaRsFieldEnum.TRACE) );
		sBuilder.append( this.getStringFilled(fechaCaptura, AnulacionDeudaRsFieldEnum.FECHA_DE_CAPTURA) );
		sBuilder.append( this.getStringFilled(identificacionEmpresa, AnulacionDeudaRsFieldEnum.IDENTIFICACION_EMPRESA) );
		sBuilder.append( this.getStringFilled(retrievalRefereneNumber, AnulacionDeudaRsFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(authorizationIdResponse, AnulacionDeudaRsFieldEnum.AUTHORIZATION_ID_RESPONSE) );
		sBuilder.append( this.getStringFilled(responseCode, AnulacionDeudaRsFieldEnum.RESPONSE_CODE) );
		sBuilder.append( this.getStringFilled(terminalId, AnulacionDeudaRsFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, AnulacionDeudaRsFieldEnum.TRANSACTION_CURRENCY_CODE) );
		sBuilder.append( this.getStringFilled(datosReservados, AnulacionDeudaRsFieldEnum.DATOS_RESERVADOS) );
		//DATOS DEL DOCUMENTO A EXTORNAR
		sBuilder.append( this.getStringFilled(longitudTrama, AnulacionDeudaRsFieldEnum.LONGITUD_DE_LA_TRAMA) );
		sBuilder.append( this.getStringFilled(codigoFormato, AnulacionDeudaRsFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, AnulacionDeudaRsFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(codigoAcreedor, AnulacionDeudaRsFieldEnum.CODIGO_DE_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProdServ1, AnulacionDeudaRsFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO_1) );
		sBuilder.append( this.getStringFilled(codigoPlazaRecaudador, AnulacionDeudaRsFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(codigoAgenciaRecaudador, AnulacionDeudaRsFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(tipoDatoPago, AnulacionDeudaRsFieldEnum.TIPO_DE_DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(datoPago, AnulacionDeudaRsFieldEnum.DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(codigoCiudad, AnulacionDeudaRsFieldEnum.CODIGO_DE_CIUDAD) );
		sBuilder.append( this.getStringFilled(nombreCliente, AnulacionDeudaRsFieldEnum.NOMBRE_DEL_CLIENTE) );
		sBuilder.append( this.getStringFilled(rucDeudor, AnulacionDeudaRsFieldEnum.RUC_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(rucAcreedor, AnulacionDeudaRsFieldEnum.RUC_DEL_ACREEDOR) );
		sBuilder.append( this.getStringFilled(numeroTransCobOri, AnulacionDeudaRsFieldEnum.NUMERO_DE_TRANS_DE_COB_ORI) );
		sBuilder.append( this.getStringFilled(numeroOpeOriginalAcreed, AnulacionDeudaRsFieldEnum.NUMERO_OPE_ORIGINAL_ACREED) );
		sBuilder.append( this.getStringFilled(filler1, AnulacionDeudaRsFieldEnum.FILLER_1) );
		sBuilder.append( this.getStringFilled(origenRespuesta, AnulacionDeudaRsFieldEnum.ORIGEN_DE_RESPUESTA) );
		sBuilder.append( this.getStringFilled(codigoRespuestaExtend, AnulacionDeudaRsFieldEnum.CODIGO_DE_RESPUESTA_EXTEND) );
		sBuilder.append( this.getStringFilled(descripRptaAplic, AnulacionDeudaRsFieldEnum.DESCRIPC_DE_LA_RPTA_APLICA) );
		sBuilder.append( this.getStringFilled(codigoProdServ2, AnulacionDeudaRsFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO_2) );
		sBuilder.append( this.getStringFilled(descProdServ, AnulacionDeudaRsFieldEnum.DESCRIPC_DEL_PROD_SERVICIO) );
		sBuilder.append( this.getStringFilled(importeProdServ, AnulacionDeudaRsFieldEnum.IMPORTE_DEL_PROD_SERVICIO) );
		sBuilder.append( this.getStringFilled(mensaje1, AnulacionDeudaRsFieldEnum.MENSAJE_1_MARKETING) );
		sBuilder.append( this.getStringFilled(mensaje2, AnulacionDeudaRsFieldEnum.MENSAJE_2_MARKETING) );
		sBuilder.append( this.getStringFilled(numeroDocumentos, AnulacionDeudaRsFieldEnum.NUMERO_DE_DOCUMENTOS) );
		sBuilder.append( this.getStringFilled(filler2, AnulacionDeudaRsFieldEnum.FILLER_2) );
		sBuilder.append( this.getStringFilled(tipoDocumentoServicio, AnulacionDeudaRsFieldEnum.TIPO_DE_DOCUMENTO_SERVICIO) );
		sBuilder.append( this.getStringFilled(descripcionDocumento, AnulacionDeudaRsFieldEnum.DESCRIPCION_DEL_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(numeroDocumento, AnulacionDeudaRsFieldEnum.NUMERO_DE_DOCUMENTO) );
		sBuilder.append( this.getStringFilled(periodoCotizacion, AnulacionDeudaRsFieldEnum.PERIODO_DE_COTIZACION) );
		sBuilder.append( this.getStringFilled(tipoDocIdentidad, AnulacionDeudaRsFieldEnum.TIPO_DE_DOC_IDENTIDAD) );
		sBuilder.append( this.getStringFilled(nroDocIdentidad, AnulacionDeudaRsFieldEnum.NRO_DE_DOC_IDENTIDAD) );
		sBuilder.append( this.getStringFilled(fechaEmision, AnulacionDeudaRsFieldEnum.FECHA_DE_EMISION) );
		sBuilder.append( this.getStringFilled(fechaVencimiento, AnulacionDeudaRsFieldEnum.FECHA_DE_VENCIMIENTO) );
		sBuilder.append( this.getStringFilled(importeAnuladoDcto, AnulacionDeudaRsFieldEnum.IMPORTE_ANULADO_DEL_DCTO) );
		sBuilder.append( this.getStringFilled(codigoConcepto1, AnulacionDeudaRsFieldEnum.CODIGO_DE_CONCEPTO_1) );
		sBuilder.append( this.getStringFilled(importeConcepto1, AnulacionDeudaRsFieldEnum.IMPORTE_CONCEPTO_1) );
		sBuilder.append( this.getStringFilled(codigoConcepto2, AnulacionDeudaRsFieldEnum.CODIGO_DE_CONCEPTO_2) );
		sBuilder.append( this.getStringFilled(importeConcepto2, AnulacionDeudaRsFieldEnum.IMPORTE_CONCEPTO_2) );
		sBuilder.append( this.getStringFilled(codigoConcepto3, AnulacionDeudaRsFieldEnum.CODIGO_DE_CONCEPTO_3) );
		sBuilder.append( this.getStringFilled(importeConcepto3, AnulacionDeudaRsFieldEnum.IMPORTE_CONCEPTO_3) );
		sBuilder.append( this.getStringFilled(codigoConcepto4, AnulacionDeudaRsFieldEnum.CODIGO_DE_CONCEPTO_4) );
		sBuilder.append( this.getStringFilled(importeConcepto4, AnulacionDeudaRsFieldEnum.IMPORTE_CONCEPTO_4) );
		sBuilder.append( this.getStringFilled(codigoConcepto5, AnulacionDeudaRsFieldEnum.CODIGO_DE_CONCEPTO_5) );
		sBuilder.append( this.getStringFilled(importeConcepto5, AnulacionDeudaRsFieldEnum.IMPORTE_CONCEPTO_5) );
		sBuilder.append( this.getStringFilled(indicadorComprobante, AnulacionDeudaRsFieldEnum.INDICADOR_DE_COMPROBANTE) );
		sBuilder.append( this.getStringFilled(numeroFacturaAnulada, AnulacionDeudaRsFieldEnum.NUMERO_DE_FACTURA_ANULADA) );
		sBuilder.append( this.getStringFilled(referenciaDeuda, AnulacionDeudaRsFieldEnum.REFERENCIA_DE_LA_DEUDA) );
		sBuilder.append( this.getStringFilled(filler3, AnulacionDeudaRsFieldEnum.FILLER_3) );
		return sBuilder.toString();
	}

	public String getStringFilled(String input, AnulacionDeudaRsFieldEnum anulacionDeudaRsFieldEnum) {
		String preData=input==null ? "":input;
		if (preData.length() >=anulacionDeudaRsFieldEnum.getDataLength()) {
			preData = preData.substring(0, anulacionDeudaRsFieldEnum.getDataLength());
		}
		if(anulacionDeudaRsFieldEnum.getAlign()==AlignFillEnum.RIGHT) {
			input=StringUtils.rightPad(preData,anulacionDeudaRsFieldEnum.getDataLength(), anulacionDeudaRsFieldEnum.getDataFill());
		}else if(anulacionDeudaRsFieldEnum.getAlign()==AlignFillEnum.LEFT) {
			input=StringUtils.leftPad(preData,anulacionDeudaRsFieldEnum.getDataLength(), anulacionDeudaRsFieldEnum.getDataFill());
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

	public String getRetrievalRefereneNumber() {
		return retrievalRefereneNumber;
	}

	public void setRetrievalRefereneNumber(String retrievalRefereneNumber) {
		this.retrievalRefereneNumber = retrievalRefereneNumber;
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

	public String getCodigoProdServ1() {
		return codigoProdServ1;
	}

	public void setCodigoProdServ1(String codigoProdServ1) {
		this.codigoProdServ1 = codigoProdServ1;
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

	public String getDescripRptaAplic() {
		return descripRptaAplic;
	}

	public void setDescripRptaAplic(String descripRptaAplic) {
		this.descripRptaAplic = descripRptaAplic;
	}

	public String getCodigoProdServ2() {
		return codigoProdServ2;
	}

	public void setCodigoProdServ2(String codigoProdServ2) {
		this.codigoProdServ2 = codigoProdServ2;
	}

	public String getDescProdServ() {
		return descProdServ;
	}

	public void setDescProdServ(String descProdServ) {
		this.descProdServ = descProdServ;
	}

	public String getImporteProdServ() {
		return importeProdServ;
	}

	public void setImporteProdServ(String importeProdServ) {
		this.importeProdServ = importeProdServ;
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
