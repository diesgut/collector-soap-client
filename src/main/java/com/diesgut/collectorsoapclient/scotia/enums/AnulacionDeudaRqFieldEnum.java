package com.diesgut.collectorsoapclient.scotia.enums;

public enum AnulacionDeudaRqFieldEnum {
	
	MESSAGE_TYPE_IDENTIFICATION_1(1,4,"",AlignFillEnum.LEFT),
	PRIMARY_BIT_MAP(5,20,"",AlignFillEnum.LEFT),
	SECONDARY_BIT_MAP(21,36,"",AlignFillEnum.LEFT),
	NUMERO_DE_TARJETA(37,54,"",AlignFillEnum.LEFT),
	CODIGO_DE_PROCESO(55,60,"",AlignFillEnum.LEFT),
	MONTO(61,72,"0",AlignFillEnum.LEFT),
	FECHA_Y_HORA_DE_TRANSACCION_1(73,82,"",AlignFillEnum.LEFT),
	TRACE_1(83,88,"",AlignFillEnum.LEFT),
	FECHA_DE_CAPTURA(89,92,"",AlignFillEnum.LEFT),
	MODO_DE_INGRESO_DE_DATOS(93,95,"",AlignFillEnum.LEFT),
	CANAL(96,97,"",AlignFillEnum.LEFT),
	BIN_ADQUIRIENTE_1(98,105,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE_1(106,113,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REFERENCE_NUMBER(114,125,"",AlignFillEnum.LEFT),
	TERMINAL_ID(126,133,"",AlignFillEnum.RIGHT),
	COMERCIO(134,148,"",AlignFillEnum.LEFT),
	CARD_ACCEPTOR_LOCATION(149,188,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(189,191,"",AlignFillEnum.LEFT),
	
	//ORIGINAL_DATA_ELEMENTS
	
	MESSAGE_TYPE_IDENTIFICATION_2(192,195,"",AlignFillEnum.LEFT),
	TRACE_2(196,201,"",AlignFillEnum.LEFT),
	FECHA_Y_HORA_DE_TRANSACCION_2(202,211,"",AlignFillEnum.LEFT),
	BIN_ADQUIRIENTE_2(212,222,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE_2(223,233,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(234,238,"",AlignFillEnum.LEFT),
	
	//DATOS_DEL_REQUERIMIENTO
	
	LONGITUD_DE_DATO(239,241,"",AlignFillEnum.LEFT),
	CODIGO_DE_FORMATO(242,243,"",AlignFillEnum.LEFT),
	BIN_PROCESADOR(244,254,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ACREEDOR(255,265,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO(266,273,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(274,277,"",AlignFillEnum.LEFT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(278,281,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(282,283,"",AlignFillEnum.LEFT),
	DATO_DE_PAGO(284,304,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CIUDAD(305,307,"",AlignFillEnum.LEFT),
	FILLER(308,319,"",AlignFillEnum.LEFT),
	
	//FILLER_RECIBO_ANULAR(1,4,"",AlignFillEnum.LEFT),
	
	TIPO_DE_SERVICIO(320,322,"",AlignFillEnum.LEFT),
	NUMERO_DE_DOCUMENTO(323,338,"",AlignFillEnum.RIGHT),
	DISPONIBLE(339,369,"",AlignFillEnum.LEFT),
	NUMERO_DE_TRANS_DE_COB_ORI(370,381,"0",AlignFillEnum.LEFT),
	NUMERO_OPE_ORIGINAL_ACREED(382,393,"0",AlignFillEnum.LEFT),
	;

	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private AnulacionDeudaRqFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
