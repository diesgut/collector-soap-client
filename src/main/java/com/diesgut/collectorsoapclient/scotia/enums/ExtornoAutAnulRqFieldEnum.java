package com.diesgut.collectorsoapclient.scotia.enums;

public enum ExtornoAutAnulRqFieldEnum {

	MESSAGE_TYPE_IDENTIFICATION(1,4,"",AlignFillEnum.RIGHT),
	PRIMARY_BIT_MAP(5,20,"",AlignFillEnum.RIGHT),
	SECONDARY_BIT_MAP(21,36,"",AlignFillEnum.RIGHT),
	NUMERO_DE_TARJETA(37,54,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PROCESO(55,60,"",AlignFillEnum.RIGHT),
	MONTO(61,72,"",AlignFillEnum.RIGHT),
	FECHA_Y_HORA_DE_TRANSACCION_1(73,82,"",AlignFillEnum.RIGHT),
	TRACE_1(83,88,"",AlignFillEnum.RIGHT),
	FECHA_DE_CAPTURA(89,92,"",AlignFillEnum.RIGHT),
	MODO_DE_INGRESO_DE_DATOS(93,95,"",AlignFillEnum.RIGHT),
	CANAL(96,97,"",AlignFillEnum.RIGHT),
	BIN_ADQUIRIENTE_1(98,105,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE_1(106,113,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REFERENCE_NUMBER(114,125,"",AlignFillEnum.RIGHT),
	RESPONSE_CODE(126,127,"",AlignFillEnum.RIGHT),
	TERMINAL_ID(128,135,"",AlignFillEnum.RIGHT),
	COMERCIO(136,150,"",AlignFillEnum.RIGHT),
	CARD_ACCEPTOR_LOCATION(151,190,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(191,193,"",AlignFillEnum.RIGHT),
	//ORIGINAL_DATA_ELEMENTS
	MESSAGE_TYPE_IDENTIFICATION_2(194,197,"",AlignFillEnum.RIGHT),
	TRACE_2(198,203,"",AlignFillEnum.RIGHT),
	FECHA_Y_HORA_DE_TRANSACCION_2(204,213,"",AlignFillEnum.RIGHT),
	BIN_ADQUIRIENTE_2(214,224,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE_2(225,235,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(236,240,"",AlignFillEnum.RIGHT),
	
	//DATOS_DEL_REQUERIMIENTO
	
	LONGITUD_DE_DATO(241,243,"",AlignFillEnum.RIGHT),
	CODIGO_DE_FORMATO(244,245,"",AlignFillEnum.RIGHT),
	BIN_PROCESADOR(246,256,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ACREEDOR(257,267,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO(268,275,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(276,279,"",AlignFillEnum.RIGHT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(280,283,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(284,285,"",AlignFillEnum.RIGHT),
	DATO_DE_PAGO(286,306,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CIUDAD(307,309,"",AlignFillEnum.RIGHT),
	FILLER(310,321,"",AlignFillEnum.RIGHT),

	//FILLER_(RECIBO_A_ANULAR)

	TIPO_DE_SERVICIO(322,324,"",AlignFillEnum.RIGHT),
	NUMERO_DE_DOCUMENTO(325,340,"",AlignFillEnum.RIGHT),
	DISPONIBLE(341,371,"",AlignFillEnum.RIGHT),
	NUMERO_DE_TRANS_DE_COB_ORI(372,383,"",AlignFillEnum.RIGHT),
	NUMERO_OPE_ORIGINAL_ACREED(384,395,"",AlignFillEnum.RIGHT),
	;
	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private ExtornoAutAnulRqFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
