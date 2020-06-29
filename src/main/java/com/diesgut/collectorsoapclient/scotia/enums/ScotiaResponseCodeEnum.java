package com.diesgut.collectorsoapclient.scotia.enums;

public enum ScotiaResponseCodeEnum {
	CORRECTO("00","CORRECTO"),
	ERROR_APP("21","ERROR"), //ejemplo cliente no existe , cliente sin deuda, u otro tipo de error
	//EXTENDS CODE
	/*
90	cutoff is in progress
91	issuer or switch is inoperative
92	financial inst. cannot be found viol.law
93	Trans cannot be completes
94	duplicate  trasmision
95	reconcile error
96	system malfunction
99	communication error

	 * */
	;
	
	private String code;
	private String description;
	
	private ScotiaResponseCodeEnum(String code, String description) {
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
