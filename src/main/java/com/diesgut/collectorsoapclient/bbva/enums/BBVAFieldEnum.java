package com.diesgut.collectorsoapclient.bbva.enums;

public enum BBVAFieldEnum {

	OPERATION_NUMBER(4),
	BANK_CODE(2),
	;
	
	private Integer length;
	
	private BBVAFieldEnum(Integer length) {
		this.length=length;
	}
	
	public Integer getLength() {
		return this.length;
	}

	
}
