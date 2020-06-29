package com.diesgut.collectorsoapclient.model.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum OperationTypeEnum {
	
	DEPOSIT_WS(Long.valueOf(40003), "DEPOSITO COBRO OPERACIONES MANUALES"),
	ANULACION_EXTORNO_DEPOSITO_WS(Long.valueOf(40009), "ANULACION O EXTORNO DEPOSITO"),
	EXTORNO_ANULACION_DEUDA_WS(Long.valueOf(40010 ), "EXTORNO ANUACION DEUDA"), 
	;
	
	public final static List<OperationTypeEnum> list = new ArrayList<OperationTypeEnum>();
	public final static Map<Long, OperationTypeEnum> lookup = new HashMap<Long, OperationTypeEnum>();
	
	static {
		for (OperationTypeEnum c : OperationTypeEnum.values()) {
			lookup.put(c.getCode(), c);
			list.add(c);
		}
	}


	private Long code;
	private String value;
	
	private OperationTypeEnum(Long code, String value) {
		this.code = code;
		this.value = value;
	}


	public static OperationTypeEnum get(Integer code) {
		return lookup.get(code);
	}
	
	public Long getCode() {
		return this.code;
	}

	public String getValue() {
		return this.value;
	}

}
