package com.diesgut.collectorsoapclient.bbva.enums;

public enum BBVAProcessCodeEnum {
	
	CONSULTA_DEUDA("1010"),
	;
	
	private String code;
	
	private BBVAProcessCodeEnum(String code) {
		this.code = code;	
	}

	
	public String getCode() {
		return code;
	}	

}
