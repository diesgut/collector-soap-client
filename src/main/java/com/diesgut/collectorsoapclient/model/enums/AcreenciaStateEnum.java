package com.diesgut.collectorsoapclient.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum AcreenciaStateEnum {

	REGISTRADO(Integer.valueOf(1347),"REGISTRADO"),
	PROCESADO_ENVIADO(Integer.valueOf(1348),"PROCESADO ENVIADO"),
	ANULADO(Integer.valueOf(1349),"ANULADO");
	
	
	public final static Map<Integer, AcreenciaStateEnum> lookup = new HashMap<Integer, AcreenciaStateEnum>();
	
	static {
		for (AcreenciaStateEnum c : AcreenciaStateEnum.values()) {
			lookup.put(c.getCode(), c);
		}
	}
	
	/** The code. */
	private Integer code;
	
	/** The value. */
	private String value;
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 *
	 * @param code the new code
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * Instantiates a new institution type.
	 *
	 * @param code the code
	 * @param value the value
	 */
	private AcreenciaStateEnum(Integer code, String value) {
		this.code = code;
		this.value = value;
	}
}
