package com.diesgot.collectorsoapclient.model.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public enum OperationStateEnum {

	REGISTRADO(Integer.valueOf(944), "REGISTRADO"), 
	CONFIRMADO(Integer.valueOf(945), "CONFIRMADO"),
	PROCESADO(Integer.valueOf(1303), "PROCESADO"), 
	RECHAZADO(Integer.valueOf(1304), "RECHAZADO"), 
	ANULADO(Integer.valueOf(1305), "ANULADO"),
	CONCILIADO(Integer.valueOf(1306), "CONCILIADO");

	public final static List<OperationStateEnum> list = new ArrayList<OperationStateEnum>();

	public final static Map<Integer, OperationStateEnum> lookup = new HashMap<Integer, OperationStateEnum>();

	static {
		for (OperationStateEnum c : OperationStateEnum.values()) {
			lookup.put(c.getCode(), c);
			list.add(c);
		}
	}

	private Integer code;

	private String value;

	private OperationStateEnum(Integer code, String value) {
		this.code = code;
		this.value = value;
	}

	public static OperationStateEnum get(Integer code) {
		return lookup.get(code);
	}

	public Integer getCode() {
		return this.code;
	}

	public String getValue() {
		return this.value;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static List<OperationStateEnum> listSomeElements(
			OperationStateEnum... transferSecuritiesTypeParams) {
		List<OperationStateEnum> retorno = new ArrayList<OperationStateEnum>();
		for (OperationStateEnum TransferSecuritiesType : transferSecuritiesTypeParams) {
			retorno.add(TransferSecuritiesType);
		}
		return retorno;
	}
}
