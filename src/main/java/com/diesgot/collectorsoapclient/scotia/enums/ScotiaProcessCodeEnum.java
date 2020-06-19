package com.diesgot.collectorsoapclient.scotia.enums;

public enum ScotiaProcessCodeEnum {
	CONSULTA_DEUDA("355000"),
	PAGO_DEUDA("945000"),
	ANULACION_DEUDA("965000"),
	EXTORNO_PAGO_DEUDA("945000"),
	EXTORNO_ANUL_DEUDA("965000"),
	;
	
	private String code;
	
	private ScotiaProcessCodeEnum(String code) {
		this.code = code;	
	}

	
	public String getCode() {
		return code;
	}	
	
}
