package com.diesgot.collectorsoapclient.scotia.enums;

public enum CurrencyScoEnum {
	PEN("604"), USD("840");

	private String value;

	private CurrencyScoEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
