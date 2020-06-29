package com.diesgut.collectorsoapclient.scotia.enums;

public enum ScotiaExtendErrorEnum {
	CUSTOMER_NOT_EXIST("90", "CLIENTE NO EXISTENTE"),
	NOT_PENDING_DEBT("91", "NO TIENE DEUDAS PENDIENTES"),
	PAGO_VENCIDO("92", "DOCUMENTO PAGO VENCIDO"),
	MONTO_ERRADO("93", "MONTO ERRADO"),
	DEUDA_NO_VALIDA("94", "DEUDA NO VALIDA"),
	PAGO_NO_PROCESADO("95","PAGO NO PROCESADO"),
	TRAN_ERROR("95", "NO SE PUDO REALIZAR LA TRANSACCION"),
	
	;
	
	private String code;
	private String description;
	
	private ScotiaExtendErrorEnum(String code, String description) {
		this.code = code;	
		this.description=description;
	}

	
	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

}
