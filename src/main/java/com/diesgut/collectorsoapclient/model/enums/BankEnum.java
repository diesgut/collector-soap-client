package com.diesgut.collectorsoapclient.model.enums;

public enum BankEnum {

	BCP(2L, ""), 
	SCO(4L, ""), 
	BBVA(3L, "11");

	private Long code;
	private String bankCode;

	private BankEnum(Long code, String bankCode) {
		this.code = code;
		this.bankCode = bankCode;
	}

	public Long getCode() {
		return code;
	}

	public String getBankCode() {
		return bankCode;
	}

}
