package com.diesgot.collectorsoapclient.scotia.enums;

public enum ConsultaRsFieldEnum {

	
	MESSAGE_TYPE_IDENTIFICATION(1,4,"0",AlignFillEnum.LEFT),
	PRIMARY_BIT_MAP(5,20,"",AlignFillEnum.RIGHT),
	SECONDARY_BIT_MAP(21,36,"0",AlignFillEnum.LEFT),
	CODIGO_DE_PROCESO(37,42,"0",AlignFillEnum.RIGHT),
	MONTO(43,54,"0",AlignFillEnum.LEFT),
	FECHA_Y_HORA_DE_TRANSACCION(55,64,"",AlignFillEnum.RIGHT),
	TRACE(65,70,"",AlignFillEnum.RIGHT),
	FECHA_DE_CAPTURA(71,74,"",AlignFillEnum.RIGHT),
	BIN_ADQUIRIENTE(75,82,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REFERENCE_NUMBER(83,94,"",AlignFillEnum.RIGHT),
	AUTHORIZATION_ID_RESPONSE(95,100,"0",AlignFillEnum.RIGHT),
	RESPONSE_CODE(101,102,"0",AlignFillEnum.RIGHT),
	TERMINAL_ID(103,110,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(111,113,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(114,118,"0",AlignFillEnum.LEFT),
	
	//CABECERA DE RPTA
	LONGITUD_DEL_CAMPO(119,121,"",AlignFillEnum.RIGHT),
	CODIGO_DE_FORMATO(122,123,"",AlignFillEnum.RIGHT),
	BIN_PROCESADOR(124,134,"",AlignFillEnum.RIGHT),
	BIN_ACREEDOR(135,145,"",AlignFillEnum.RIGHT),
	CODIGO_PRODUCTO_SERVICIO_1(146,153,"",AlignFillEnum.RIGHT),
	AGENCIA(154,157,"",AlignFillEnum.RIGHT),
	TIPO_DE_IDENTIFICACION(158,159,"",AlignFillEnum.RIGHT),
	NUMERO_DE_IDENTIFICACION(160,180,"",AlignFillEnum.RIGHT),
	NOMBRE_DEL_DEUDOR(181,200,"",AlignFillEnum.RIGHT),
	NUMERO_DE_SERVICIOS_DEVUELTOS(201,202,"",AlignFillEnum.RIGHT),
	NUMERO_DE_OPERACIÓN_DE_COBRANZA(203,214,"",AlignFillEnum.RIGHT),
	INDICADOR_SI_HAY_MAS_DOCUMENTOS(215,215,"",AlignFillEnum.RIGHT),
	TAMAÑO_MAXIMO_DE_BLOQUE(216,220,"",AlignFillEnum.RIGHT),
	POSICION_DEL_ULTIMO_DOCUMENTO(221,223,"",AlignFillEnum.RIGHT),
	PUNTERO_DE_LA_BASE_DE_DATOS(224,233,"",AlignFillEnum.RIGHT),
	ORIGEN_DE_RESPUESTA(234,234,"",AlignFillEnum.RIGHT),
	CODIGO_DE_RESPUESTA(235,237,"",AlignFillEnum.RIGHT),
	FILLER1(238,247,"",AlignFillEnum.RIGHT),
	
	//DETALLE DE RPTA
	CODIGO_PRODUCTO_SERVICIO_2(248,250,"",AlignFillEnum.RIGHT),
	MONEDA(251,253,"",AlignFillEnum.RIGHT),
	ESTADO_DEL_DEUDOR(254,255,"",AlignFillEnum.RIGHT),
	MENSAJE_1_AL_DEUDOR(256,295,"",AlignFillEnum.RIGHT),
	MENSAJE_2_AL_DEUDOR(296,335,"",AlignFillEnum.RIGHT),
	INDICADOR_DE_CRONOLOGIA(336,336,"",AlignFillEnum.RIGHT),
	INDICADOR_DE_PAGOS_VENCIDOS(337,337,"",AlignFillEnum.RIGHT),
	RESTRICCION_DE_PAGO(338,338,"",AlignFillEnum.RIGHT),
	DOCUMENTOS_POR_SERVICIO(339,340,"0",AlignFillEnum.LEFT),
	FILLER2(341,345,"",AlignFillEnum.RIGHT),
	//DETALLE SERVICIO
	TIPO_DE_SERVICIO(346,348,"0",AlignFillEnum.LEFT),
	NUMERO_DE_DOCUMENTO(349,364,"",AlignFillEnum.RIGHT),
	REFERENCIA_DE_LA_DEUDA(365,380,"",AlignFillEnum.RIGHT),
	FECHA_DE_VENCIMIENTO(381,388,"",AlignFillEnum.RIGHT),
	IMPORTE_MINIMO(389,399,"0",AlignFillEnum.LEFT),
	IMPORTE_A_TOTAL(400,410,"0",AlignFillEnum.LEFT),
	;
	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private ConsultaRsFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
