package com.diesgot.collectorsoapclient.scotia.enums;

public enum MessageTypeScoEnum {
	CONS_PAG_ANU_RQ("0200"), 
	EXT_PAGO_ANU_RQ("0400"),
	CONS_PAG_ANU_RS("0210"),
	EXT_PAGO_ANU_RS("0410");

	private String code;

	private MessageTypeScoEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
