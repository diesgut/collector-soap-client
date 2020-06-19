package com.diesgot.collectorsoapclient.scotia.enums;

public enum ConsultaRqFieldEnum {

	
	MESSAGE_TYPE_ID(1,4,"",AlignFillEnum.LEFT),
	PRIMARY_BITMAP(5,20,"",AlignFillEnum.LEFT),
	SECONDARY_BITMAP(21,36,"0",AlignFillEnum.LEFT),
	NRO_TARJETA(37,54,"0",AlignFillEnum.LEFT),
	COD_PROCESO(55,60,"0",AlignFillEnum.RIGHT),
	MONTO(61,72,"0",AlignFillEnum.LEFT),
	FECHA_HORA_TRN(73,82,"",AlignFillEnum.LEFT),
	TRACE(83,88,"",AlignFillEnum.LEFT),
	FECHA_CAPTURA(89,92,"0",AlignFillEnum.LEFT),
	MODO_INGRESO_DATOS(93,95,"0",AlignFillEnum.LEFT),
	CANAL(96,97,"",AlignFillEnum.LEFT),
	BIN_ADQUIRIENTE(98,105,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE(106,113,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REF_NUMBER(114,125,"",AlignFillEnum.RIGHT),
	TERMINAL_ID(126,136,"",AlignFillEnum.RIGHT),
	COMERCIO(134,148,"0",AlignFillEnum.LEFT),
	CARD_ACCEP_LOC(149,188,"",AlignFillEnum.RIGHT),
	TRAN_CURRENCY_CODE(189,191,"",AlignFillEnum.LEFT),
	DATOS_RESERV(192,196,"",AlignFillEnum.LEFT),
	
	//DATOS REQUERIMIENTO
	
	LONG_REQUERIMIENTO(197,199,"",AlignFillEnum.LEFT),
	COD_FORMATO(200,201,"",AlignFillEnum.LEFT),
	BIN_PROCESADOR(202,212,"",AlignFillEnum.RIGHT),
	COD_ACREEDOR(213,223,"",AlignFillEnum.RIGHT),
	COD_PROD_SERV(224,231,"",AlignFillEnum.RIGHT),
	COD_PLAZA_RECAUDA(232,235,"",AlignFillEnum.RIGHT),
	COD_AGENCIA_RECAUDA(236,239,"",AlignFillEnum.RIGHT),
	TIPO_DATO_CONSULTA(240,241,"",AlignFillEnum.RIGHT),
	DATO_CONSULTA(242,262,"",AlignFillEnum.RIGHT),
	COD_CIUDAD(263,265,"",AlignFillEnum.RIGHT),
	COD_SERVICIO(266,268,"",AlignFillEnum.RIGHT),
	NRO_DOCUMENTO(269,284,"",AlignFillEnum.RIGHT),
	NRO_OPERACION(285,296,"",AlignFillEnum.RIGHT),
	FILLER(297,316,"",AlignFillEnum.RIGHT),
	TAMAÑO_MAX_BLOQUE(317,321,"",AlignFillEnum.RIGHT),
	POSICION_ULT_DOC(322,324,"",AlignFillEnum.RIGHT),
	PUNTERO_BASE_DATOS(325,334,"",AlignFillEnum.RIGHT),
	;

	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private ConsultaRqFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		this.dataFill = dataFill;
		this.orientation = ortientationFillEnum;
	}
	
	public Integer getDataLength() {
		int length=this.endPosition-this.startPosition;
		length++;
		return length;
	}

	public String getDataFill() {
		return dataFill;
	}
	
	public Integer[] getPositions() {
		return new Integer[]{this.startPosition, this.endPosition};
	}
	
	public AlignFillEnum getAlign() {
		return orientation;
	}
	
}
