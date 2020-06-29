package com.diesgut.collectorsoapclient.bbva.enums;

public enum CodigoRespuestaEnum {

	TRAN_EXITOSA("'0001", "TRANSACCION REALIZADA CON EXITO"),
	FRMT_TRAMA_INV("3000", "FORMATO DE TRAMA NO VALIDO"),
	TRAN_ERROR("3002", "NO SE PUDO REALIZAR LA TRANSACCION"),
	EXTORNO_ERROR("3004", "NO SE PUEDE REALIZAR EL REGISTRO DE EXTORNO"),
	NOT_PENDING_DEBT("3009", "NO TIENE DEUDAS PENDIENTES"),
	NRO_REF_NOT_EXIST("0101", "NUMERO DE REFERENCIA NO EXISTE"),
	NRO_REF_EXPIRED("0102", "NUMERO DE REFERENCIA EXPIRADA"),
	NRO_REF_PAYED("0106", "NUMERO DE REFERENCIA CON ESTADO PAGADO"),
	ERROR_OLD_PAYMENT("0290", "ERROR DEBE PAGAR LA CUOTA MAS ANTIGUA"),
	NRO_REF_INV_STATE("3013", "ESTADO DE NRO DE REFERENCIA NO VALIDO"),
	EXTORNO_SUCCESS("3014", "EXTORNO NO PROCESADO PORQUE NO EXISTE REGISTRO DEL PAGO"),
	AMOUNT_MIN_OR_MAX("3051", "MONTO DE PAGO DEBE SER MINIMO O MAXIMO"),
	;
	
	private String code;
	private String value;
	
	private CodigoRespuestaEnum(String code, String value) {
		this.code = code;
		this.value = value;	
	}
	
	public String getCode() {
		return code;
	}
	
	public String getValue() {
		return value;
	}	
	
}
