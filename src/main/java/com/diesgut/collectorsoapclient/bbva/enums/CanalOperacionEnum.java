package com.diesgut.collectorsoapclient.bbva.enums;

public enum CanalOperacionEnum {

	TF("TERMINAL"),
	CN("BANCA POR INTERNET"),
	RD("REDEX"),
	BX("SALDO EXPRESS"),
	BT("BANCA POR TELEFONO"),
	;
	

	private String value;
	
	private CanalOperacionEnum(String value) {
		this.value = value;	
	}

	
	public String getValue() {
		return value;
	}	
	
}
