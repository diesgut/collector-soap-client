package com.diesgut.collectorsoapclient.scotia.model;


import org.apache.commons.lang3.StringUtils;

import com.diesgut.collectorsoapclient.scotia.enums.AlignFillEnum;
import com.diesgut.collectorsoapclient.scotia.enums.ExtornoAutPagoRqFieldEnum;
import com.diesgut.collectorsoapclient.scotia.enums.MessageTypeScoEnum;
import com.diesgut.collectorsoapclient.scotia.enums.ScotiaProcessCodeEnum;
import com.diesgut.collectorsoapclient.util.CommonsUtilities;

public class ExtornoAutPagoRq {

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
	private String forwardInstitutionCod1;
	private String retrievalReferenceNumber;
	private String responseCode;
	private String terminalId;
	private String comercio;
	private String cardAcceptorLocation;
	private String transactionCurrencyCode;
	private String originalDataElements;
	private String messageTypeId2;
	private String trace2;
	private String fechaHoraTransaccion2;
	private String binAdquiriente2;
	private String forwardInstitutionCod2;
	private String datosReservados;
	private String datosRequerimiento;
	private String longitudTrama;
	private String codigoFormato;
	private String binProcesador;
	private String codigoAcreedor;
	private String codigoProdServ;
	private String codigoPlazaRecaudador;
	private String codigoAgenciaRecaudador;
	private String tipoDatoPago;
	private String datoPago;
	private String codigoCiudad;
	private String numeroProdServPagad;
	private String numeroTotalDocPagad;
	private String filler1;
	private String medioPago;
	private String importePagadoEfectivo;
	private String importePagCta;
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
	private String codigoServPagado;
	private String estadoDeudor;
	private String importeTotalXProdSev;
	private String nroCuentaAbono;
	private String nroReferenciaAbono;
	private String nroDocumentosPagados;
	private String filler3;
	private String tipoDocumentoPago;
	private String numeroDocumentoPago;
	private String periodoCotizacion;
	private String tipoDocIdDeudor;
	private String numeroDocIdDeudor;
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
	private String importeConceptos;
	private String referenciaDeuda;
	private String filler4;

	public ExtornoAutPagoRq() {
		super();
	}

	public ExtornoAutPagoRq(String input) {
		 this.messageTypeId=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION);
		 this.primaryBitMap=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.PRIMARY_BIT_MAP);
		 this.secondaryBitMap=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.SECONDARY_BIT_MAP);
		 this.codigoProceso=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_PROCESO);
		 this.monto=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.MONTO);
		 this.fechaHoraTransaccion1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_1);
		 this.trace1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TRACE_1);
		 this.fechaCaptura=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FECHA_DE_CAPTURA);
		 this.modoIngresoDatos=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.MODO_DE_INGRESO_DE_DATOS);
		 this.canal=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CANAL);
		 this.binAdquiriente1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.BIN_ADQUIRIENTE_1);
		 this.forwardInstitutionCod1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FORWARD_INSTITUTION_CODE_1);
		 this.retrievalReferenceNumber=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER);
		 this.responseCode=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.RESPONSE_CODE);
		 this.terminalId=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TERMINAL_ID);
		 this.comercio=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.COMERCIO);
		 this.messageTypeId=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CARD_ACCEPTOR_LOCATION);
		 this.transactionCurrencyCode=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TRANSACTION_CURRENCY_CODE);
		 
		 //ORIGINAL_DATA_ELEMENTS
		 
		 this.messageTypeId2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_2);
		 this.trace2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TRACE_2);
		 this.fechaHoraTransaccion2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_2);
		 this.binAdquiriente2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.BIN_ADQUIRIENTE_2);
		 this.forwardInstitutionCod2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FORWARD_INSTITUTION_CODE_2);
		 this.datosReservados=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.DATOS_RESERVADOS);
		 
		//DATOS_DEL_REQUERIMIENTO
		 
		 this.longitudTrama=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.LONGITUD_DE_LA_TRAMA);
		 this.codigoFormato=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_FORMATO);
		 this.binProcesador=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.BIN_PROCESADOR);
		 this.codigoAcreedor=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_ACREEDOR);
		 this.codigoProdServ=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO);
		 this.codigoPlazaRecaudador=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR);
		 this.codigoAgenciaRecaudador=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR);
		 this.tipoDatoPago=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TIPO_DE_DATO_DE_PAGO);
		 this.datoPago=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.DATO_DE_PAGO);
		 this.codigoCiudad=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_CIUDAD);
		 this.numeroProdServPagad=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NUMERO_DE_PROD_SERV_PAGAD);
		 this.numeroTotalDocPagad=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NUMERO_TOTAL_DE_DOC_PAGAD);
		 this.filler1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FILLER_1);
		 this.medioPago=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.MEDIO_DE_PAGO);
		 this.importePagadoEfectivo=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_PAGADO_EFECTIVO);
		 this.importePagCta=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_PAG_C_CTA);
		 
		 this.nroCheque1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NRO_CHEQUE1);
		 this.bcoGirador1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.BCO_GIRADOR1);
		 this.importeCheque1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_CHEQUE1);
		 this.plazaCheque1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.PLAZA_CHEQUE1);
		 
		 this.nroCheque2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NRO_CHEQUE2);
		 this.bcoGirador2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.BCO_GIRADOR2);
		 this.importeCheque2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_CHEQUE2);
		 this.plazaCheque2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.PLAZA_CHEQUE2);
		 
		 this.nroCheque3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NRO_CHEQUE3);
		 this.bcoGirador3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.BCO_GIRADOR3);
		 this.importeCheque3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_CHEQUE3);
		 this.plazaCheque3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.PLAZA_CHEQUE3);
		 
		 
		 this.monedaPago=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.MONEDA_DE_PAGO);
		 this.tipoCambioAplicado=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TIPO_DE_CAMBIO_APLICADO);
		 this.pagoTotalRealizado=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.PAGO_TOTAL_REALIZADO);
		 this.filler2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FILLER_2);
		 this.codigoServPagado=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DEL_SERVICIO_PAGADO);
		 this.estadoDeudor=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.ESTADO_DEL_DEUDOR);
		 this.importeTotalXProdSev=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_TOTAL_X_PROD_SERV);
		 this.nroCuentaAbono=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NRO_DE_CUENTA_DE_ABONO);
		 this.nroReferenciaAbono=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NRO_DE_REFERENCIA_DEL_ABONO);
		 this.nroDocumentosPagados=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NRO_DE_DOCUMENTOS_PAGADOS);
		 this.filler3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FILLER_3);
		 this.tipoDocumentoPago=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TIPO_DE_DOCUMENTO_DE_PAGO);
		 this.numeroDocumentoPago=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NUMERO_DE_DOCUMENTO_DE_PAG);
		 this.periodoCotizacion=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.PERIODO_DE_COTIZACION);
		 this.tipoDocIdDeudor=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.TIPO_DOC_ID_DEUDOR);
		 this.numeroDocIdDeudor=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.NUMERO_DOC_ID_DEL_DEUDOR);
		 this.importeOriginalDeuda=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_ORIGINAL_DE_LA_DEUDA);
		 this.importePagadoDocto=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_PAGADO_DEL_DOCTO);
		 this.codigoConcepto1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_1);
		 this.importeConcepto1=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO1);
		 this.codigoConcepto2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_2);
		 this.importeConcepto2=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO2);
		 this.codigoConcepto3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_3);
		 this.importeConcepto3=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO3);
		 this.codigoConcepto4=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_4);
		 this.importeConcepto4=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO4);
		 this.codigoConcepto5=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_5);
		 this.importeConceptos=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO5);
		 this.referenciaDeuda=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.REFERENCIA_DE_LA_DEUDA);
		 this.filler4=this.getStringByPosition(input,ExtornoAutPagoRqFieldEnum.FILLER_4);
	}
	
	public String getInput() {
		StringBuilder sBuilder=new StringBuilder();
		sBuilder.append( this.getStringFilled(messageTypeId, ExtornoAutPagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION) );
		sBuilder.append( this.getStringFilled(primaryBitMap, ExtornoAutPagoRqFieldEnum.PRIMARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(secondaryBitMap, ExtornoAutPagoRqFieldEnum.SECONDARY_BIT_MAP) );
		sBuilder.append( this.getStringFilled(numeroTarjeta, ExtornoAutPagoRqFieldEnum.NUMERO_DE_TARJETA) );
		sBuilder.append( this.getStringFilled(codigoProceso, ExtornoAutPagoRqFieldEnum.CODIGO_DE_PROCESO) );
		sBuilder.append( this.getStringFilled(monto, ExtornoAutPagoRqFieldEnum.MONTO) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion1, ExtornoAutPagoRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_1) );
		sBuilder.append( this.getStringFilled(trace1, ExtornoAutPagoRqFieldEnum.TRACE_1) );
		sBuilder.append( this.getStringFilled(fechaCaptura, ExtornoAutPagoRqFieldEnum.FECHA_DE_CAPTURA) );
		sBuilder.append( this.getStringFilled(modoIngresoDatos, ExtornoAutPagoRqFieldEnum.MODO_DE_INGRESO_DE_DATOS) );
		sBuilder.append( this.getStringFilled(canal, ExtornoAutPagoRqFieldEnum.CANAL) );
		sBuilder.append( this.getStringFilled(binAdquiriente1, ExtornoAutPagoRqFieldEnum.BIN_ADQUIRIENTE_1) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCod1, ExtornoAutPagoRqFieldEnum.FORWARD_INSTITUTION_CODE_1) );
		sBuilder.append( this.getStringFilled(retrievalReferenceNumber, ExtornoAutPagoRqFieldEnum.RETRIEVAL_REFERENCE_NUMBER) );
		sBuilder.append( this.getStringFilled(responseCode, ExtornoAutPagoRqFieldEnum.RESPONSE_CODE) );
		sBuilder.append( this.getStringFilled(terminalId, ExtornoAutPagoRqFieldEnum.TERMINAL_ID) );
		sBuilder.append( this.getStringFilled(comercio, ExtornoAutPagoRqFieldEnum.COMERCIO) );
		sBuilder.append( this.getStringFilled(cardAcceptorLocation, ExtornoAutPagoRqFieldEnum.CARD_ACCEPTOR_LOCATION) );
		sBuilder.append( this.getStringFilled(transactionCurrencyCode, ExtornoAutPagoRqFieldEnum.TRANSACTION_CURRENCY_CODE) );
		//ORIGINAL DATA ELEMENTS
		sBuilder.append( this.getStringFilled(messageTypeId2, ExtornoAutPagoRqFieldEnum.MESSAGE_TYPE_IDENTIFICATION_2) );
		sBuilder.append( this.getStringFilled(trace2, ExtornoAutPagoRqFieldEnum.TRACE_2) );
		sBuilder.append( this.getStringFilled(fechaHoraTransaccion2, ExtornoAutPagoRqFieldEnum.FECHA_Y_HORA_DE_TRANSACCION_2) );
		sBuilder.append( this.getStringFilled(binAdquiriente2, ExtornoAutPagoRqFieldEnum.BIN_ADQUIRIENTE_2) );
		sBuilder.append( this.getStringFilled(forwardInstitutionCod2, ExtornoAutPagoRqFieldEnum.FORWARD_INSTITUTION_CODE_2) );
		sBuilder.append( this.getStringFilled(datosReservados, ExtornoAutPagoRqFieldEnum.DATOS_RESERVADOS) );
		//DATOS DEL REQUERIMIENTO
		sBuilder.append( this.getStringFilled(longitudTrama, ExtornoAutPagoRqFieldEnum.LONGITUD_DE_LA_TRAMA) );
		sBuilder.append( this.getStringFilled(codigoFormato, ExtornoAutPagoRqFieldEnum.CODIGO_DE_FORMATO) );
		sBuilder.append( this.getStringFilled(binProcesador, ExtornoAutPagoRqFieldEnum.BIN_PROCESADOR) );
		sBuilder.append( this.getStringFilled(codigoAcreedor, ExtornoAutPagoRqFieldEnum.CODIGO_DE_ACREEDOR) );
		sBuilder.append( this.getStringFilled(codigoProdServ, ExtornoAutPagoRqFieldEnum.CODIGO_DE_PRODUCTO_SERVICIO) );
		sBuilder.append( this.getStringFilled(codigoPlazaRecaudador, ExtornoAutPagoRqFieldEnum.CODIGO_DE_PLAZA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(codigoAgenciaRecaudador, ExtornoAutPagoRqFieldEnum.CODIGO_DE_AGENCIA_DEL_RECAUDADOR) );
		sBuilder.append( this.getStringFilled(tipoDatoPago, ExtornoAutPagoRqFieldEnum.TIPO_DE_DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(datoPago, ExtornoAutPagoRqFieldEnum.DATO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(codigoCiudad, ExtornoAutPagoRqFieldEnum.CODIGO_DE_CIUDAD) );
		sBuilder.append( this.getStringFilled(numeroProdServPagad, ExtornoAutPagoRqFieldEnum.NUMERO_DE_PROD_SERV_PAGAD) );
		sBuilder.append( this.getStringFilled(numeroTotalDocPagad, ExtornoAutPagoRqFieldEnum.NUMERO_TOTAL_DE_DOC_PAGAD) );
		sBuilder.append( this.getStringFilled(filler1, ExtornoAutPagoRqFieldEnum.FILLER_1) );
		sBuilder.append( this.getStringFilled(medioPago, ExtornoAutPagoRqFieldEnum.MEDIO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(importePagadoEfectivo, ExtornoAutPagoRqFieldEnum.IMPORTE_PAGADO_EFECTIVO) );
		sBuilder.append( this.getStringFilled(importePagCta, ExtornoAutPagoRqFieldEnum.IMPORTE_PAG_C_CTA) );
		sBuilder.append( this.getStringFilled(nroCheque1, ExtornoAutPagoRqFieldEnum.NRO_CHEQUE1) );
		sBuilder.append( this.getStringFilled(bcoGirador1, ExtornoAutPagoRqFieldEnum.BCO_GIRADOR1) );
		sBuilder.append( this.getStringFilled(importeCheque1, ExtornoAutPagoRqFieldEnum.IMPORTE_CHEQUE1) );
		sBuilder.append( this.getStringFilled(plazaCheque1, ExtornoAutPagoRqFieldEnum.PLAZA_CHEQUE1) );
		sBuilder.append( this.getStringFilled(nroCheque2, ExtornoAutPagoRqFieldEnum.NRO_CHEQUE2) );
		sBuilder.append( this.getStringFilled(bcoGirador2, ExtornoAutPagoRqFieldEnum.BCO_GIRADOR2) );
		sBuilder.append( this.getStringFilled(importeCheque2, ExtornoAutPagoRqFieldEnum.IMPORTE_CHEQUE2) );
		sBuilder.append( this.getStringFilled(plazaCheque2, ExtornoAutPagoRqFieldEnum.PLAZA_CHEQUE2) );
		sBuilder.append( this.getStringFilled(nroCheque3, ExtornoAutPagoRqFieldEnum.NRO_CHEQUE3) );
		sBuilder.append( this.getStringFilled(bcoGirador3, ExtornoAutPagoRqFieldEnum.BCO_GIRADOR3) );
		sBuilder.append( this.getStringFilled(importeCheque3, ExtornoAutPagoRqFieldEnum.IMPORTE_CHEQUE3) );
		sBuilder.append( this.getStringFilled(plazaCheque3, ExtornoAutPagoRqFieldEnum.PLAZA_CHEQUE3) );
		sBuilder.append( this.getStringFilled(monedaPago, ExtornoAutPagoRqFieldEnum.MONEDA_DE_PAGO) );
		sBuilder.append( this.getStringFilled(tipoCambioAplicado, ExtornoAutPagoRqFieldEnum.TIPO_DE_CAMBIO_APLICADO) );
		sBuilder.append( this.getStringFilled(pagoTotalRealizado, ExtornoAutPagoRqFieldEnum.PAGO_TOTAL_REALIZADO) );
		sBuilder.append( this.getStringFilled(filler2, ExtornoAutPagoRqFieldEnum.FILLER_2) );
		sBuilder.append( this.getStringFilled(codigoServPagado, ExtornoAutPagoRqFieldEnum.CODIGO_DEL_SERVICIO_PAGADO) );
		sBuilder.append( this.getStringFilled(estadoDeudor, ExtornoAutPagoRqFieldEnum.ESTADO_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(importeTotalXProdSev, ExtornoAutPagoRqFieldEnum.IMPORTE_TOTAL_X_PROD_SERV) );
		sBuilder.append( this.getStringFilled(nroCuentaAbono, ExtornoAutPagoRqFieldEnum.NRO_DE_CUENTA_DE_ABONO) );
		sBuilder.append( this.getStringFilled(nroReferenciaAbono, ExtornoAutPagoRqFieldEnum.NRO_DE_REFERENCIA_DEL_ABONO) );
		sBuilder.append( this.getStringFilled(nroDocumentosPagados, ExtornoAutPagoRqFieldEnum.NRO_DE_DOCUMENTOS_PAGADOS) );
		sBuilder.append( this.getStringFilled(filler3, ExtornoAutPagoRqFieldEnum.FILLER_3) );
		sBuilder.append( this.getStringFilled(tipoDocumentoPago, ExtornoAutPagoRqFieldEnum.TIPO_DE_DOCUMENTO_DE_PAGO) );
		sBuilder.append( this.getStringFilled(numeroDocumentoPago, ExtornoAutPagoRqFieldEnum.NUMERO_DE_DOCUMENTO_DE_PAG) );
		sBuilder.append( this.getStringFilled(periodoCotizacion, ExtornoAutPagoRqFieldEnum.PERIODO_DE_COTIZACION) );
		sBuilder.append( this.getStringFilled(tipoDocIdDeudor, ExtornoAutPagoRqFieldEnum.TIPO_DOC_ID_DEUDOR) );
		sBuilder.append( this.getStringFilled(numeroDocIdDeudor, ExtornoAutPagoRqFieldEnum.NUMERO_DOC_ID_DEL_DEUDOR) );
		sBuilder.append( this.getStringFilled(importeOriginalDeuda, ExtornoAutPagoRqFieldEnum.IMPORTE_ORIGINAL_DE_LA_DEUDA) );
		sBuilder.append( this.getStringFilled(importePagadoDocto, ExtornoAutPagoRqFieldEnum.IMPORTE_PAGADO_DEL_DOCTO) );
		sBuilder.append( this.getStringFilled(codigoConcepto1, ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_1) );
		sBuilder.append( this.getStringFilled(importeConcepto1, ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO1) );
		sBuilder.append( this.getStringFilled(codigoConcepto2, ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_2) );
		sBuilder.append( this.getStringFilled(importeConcepto2, ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO2) );
		sBuilder.append( this.getStringFilled(codigoConcepto3, ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_3) );
		sBuilder.append( this.getStringFilled(importeConcepto3, ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO3) );
		sBuilder.append( this.getStringFilled(codigoConcepto4, ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_4) );
		sBuilder.append( this.getStringFilled(importeConcepto4, ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO4) );
		sBuilder.append( this.getStringFilled(codigoConcepto5, ExtornoAutPagoRqFieldEnum.CODIGO_DE_CONCEPTO_5) );
		sBuilder.append( this.getStringFilled(importeConcepto5, ExtornoAutPagoRqFieldEnum.IMPORTE_DE_CONCEPTO5) );
		sBuilder.append( this.getStringFilled(referenciaDeuda, ExtornoAutPagoRqFieldEnum.REFERENCIA_DE_LA_DEUDA) );
		sBuilder.append( this.getStringFilled(filler4, ExtornoAutPagoRqFieldEnum.FILLER_4) );
		return sBuilder.toString();
	}

	public String getStringFilled(String input, ExtornoAutPagoRqFieldEnum extornoAutPagoRqFieldEnum) {
		String preData=input==null ? "":input;
		if (preData.length() >=extornoAutPagoRqFieldEnum.getDataLength()) {
			preData = preData.substring(0, extornoAutPagoRqFieldEnum.getDataLength());
		}
		if(extornoAutPagoRqFieldEnum.getAlign()==AlignFillEnum.RIGHT) {
			input=StringUtils.rightPad(preData,extornoAutPagoRqFieldEnum.getDataLength(), extornoAutPagoRqFieldEnum.getDataFill());
		}else if(extornoAutPagoRqFieldEnum.getAlign()==AlignFillEnum.LEFT) {
			input=StringUtils.leftPad(preData,extornoAutPagoRqFieldEnum.getDataLength(), extornoAutPagoRqFieldEnum.getDataFill());
		}
		return input;
	}
	
	public void defaultData(String codigoTipoServicio) {
		this.messageTypeId=MessageTypeScoEnum.EXT_PAGO_ANU_RQ.getCode();
		this.primaryBitMap="F22084818AE08000";
		this.secondaryBitMap="0000004000000018";
		this.numeroTarjeta="160000000000000000";
		this.codigoProceso=ScotiaProcessCodeEnum.EXTORNO_PAGO_DEUDA.getCode();
		this.monto="000000060010"; //
		this.fechaHoraTransaccion1="1106085118";
		this.trace1="826436";
		this.fechaCaptura="1106";
		this.modoIngresoDatos="000";
		this.canal="90";
		this.binAdquiriente1="06520900";
		this.forwardInstitutionCod1="06520900";
		this.retrievalReferenceNumber="847501860635";
		this.responseCode="22";
		this.terminalId="0056";
		this.comercio="000000000000000";
		this.cardAcceptorLocation="SOLUCIONES|PARA|EMPRESAS";
		this.transactionCurrencyCode="604";
		//ORIGINAL DATA ELEMENTS
		this.messageTypeId2=MessageTypeScoEnum.CONS_PAG_ANU_RQ.getCode(); 
		this.trace2="826436";
		this.fechaHoraTransaccion2="1106085118";
		this.binAdquiriente2="520900";
		this.forwardInstitutionCod2="520900";
		this.datosReservados="00220";
		//DATOS DEL REQUERIMIENTO	
		this.longitudTrama="468";
		this.codigoFormato="01";
		this.binProcesador="000000";
		this.codigoAcreedor="000000";
		this.codigoProdServ="REC";
		this.codigoPlazaRecaudador="0000";
		this.codigoAgenciaRecaudador="847";
		this.tipoDatoPago="01"; //
		this.datoPago="20566588"; //dato pago
		this.codigoCiudad="847";
		this.numeroProdServPagad="01";
		this.numeroTotalDocPagad="001";
		this.filler1="";
		this.medioPago="00";
		this.importePagadoEfectivo="00000060010"; //
		this.importePagCta="00000000000";//
		this.nroCheque1="";
		this.bcoGirador1="";
		this.importeCheque1="";
		this.plazaCheque1="";
		this.nroCheque2="";
		this.bcoGirador2="";
		this.importeCheque2="";
		this.plazaCheque2="";
		this.nroCheque3="";
		this.bcoGirador3="";
		this.importeCheque3="";
		this.plazaCheque3="";
		this.monedaPago="604";
		this.tipoCambioAplicado="00000000000";
		this.pagoTotalRealizado="00000060010";
		this.filler2="";
		this.codigoServPagado=codigoTipoServicio;
		this.estadoDeudor="V";
		this.importeTotalXProdSev="00000060010";//
		this.nroCuentaAbono="";
		this.nroReferenciaAbono="847501860635"; //
		this.nroDocumentosPagados="01";
		this.filler3="";
		this.tipoDocumentoPago=codigoTipoServicio; //sds
		this.numeroDocumentoPago="0000000002285061"; //
		this.periodoCotizacion="";
		this.tipoDocIdDeudor="";
		this.numeroDocIdDeudor="";
		this.importeOriginalDeuda="00000060010"; //
		this.importePagadoDocto="00000060010";
		this.codigoConcepto1="00";
		this.importeConcepto1="00000000000";
		this.codigoConcepto2="00";
		this.importeConcepto2="00000000000";
		this.codigoConcepto3="00";
		this.importeConcepto3="00000000000";
		this.codigoConcepto4="00";
		this.importeConcepto4="00000000000";
		this.codigoConcepto5="00";
		this.importeConcepto5="00000000000";
		this.referenciaDeuda="20566588"; //
		this.filler4="RECAUDACION|SOLES";
	}
	
	public String getStringByPosition(String input, ExtornoAutPagoRqFieldEnum type) {
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

	public String getForwardInstitutionCod1() {
		return forwardInstitutionCod1;
	}

	public void setForwardInstitutionCod1(String forwardInstitutionCode) {
		this.forwardInstitutionCod1 = forwardInstitutionCode;
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

	public String getForwardInstitutionCod2() {
		return forwardInstitutionCod2;
	}

	public void setForwardInstitutionCod2(String forwardInstitutionCod) {
		this.forwardInstitutionCod2 = forwardInstitutionCod;
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

	public String getImportePagCta() {
		return importePagCta;
	}

	public void setImportePagCta(String importePagCta) {
		this.importePagCta = importePagCta;
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

	public String getCodigoServPagado() {
		return codigoServPagado;
	}

	public void setCodigoServPagado(String codigoServPagado) {
		this.codigoServPagado = codigoServPagado;
	}

	public String getEstadoDeudor() {
		return estadoDeudor;
	}

	public void setEstadoDeudor(String estadoDeudor) {
		this.estadoDeudor = estadoDeudor;
	}

	public String getImporteTotalXProdSev() {
		return importeTotalXProdSev;
	}

	public void setImporteTotalXProdSev(String importeTotalXProdSev) {
		this.importeTotalXProdSev = importeTotalXProdSev;
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

	public String getNroDocumentosPagados() {
		return nroDocumentosPagados;
	}

	public void setNroDocumentosPagados(String nroDocumentosPagados) {
		this.nroDocumentosPagados = nroDocumentosPagados;
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

	public String getNumeroDocumentoPago() {
		return numeroDocumentoPago;
	}

	public void setNumeroDocumentoPago(String numeroDocumentoPago) {
		this.numeroDocumentoPago = numeroDocumentoPago;
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

	public String getNumeroDocIdDeudor() {
		return numeroDocIdDeudor;
	}

	public void setNumeroDocIdDeudor(String numeroDocIdDeudor) {
		this.numeroDocIdDeudor = numeroDocIdDeudor;
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

	public String getImporteConceptos() {
		return importeConceptos;
	}

	public void setImporteConceptos(String importeConceptos) {
		this.importeConceptos = importeConceptos;
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
