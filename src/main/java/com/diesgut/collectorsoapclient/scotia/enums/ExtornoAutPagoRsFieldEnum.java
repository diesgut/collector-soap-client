package com.diesgut.collectorsoapclient.scotia.enums;

public enum ExtornoAutPagoRsFieldEnum {
	MESSAGE_TYPE_IDENTIFICATION(1,4,"",AlignFillEnum.RIGHT),
	PRIMARY_BIT_MAP(5,20,"",AlignFillEnum.RIGHT),
	SECONDARY_BIT_MAP(21,36,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PROCESO(37,42,"",AlignFillEnum.RIGHT),
	MONTO(43,54,"",AlignFillEnum.RIGHT),
	FECHA_Y_HORA_DE_TRANSACCION(55,64,"",AlignFillEnum.RIGHT),
	TRACE(65,70,"",AlignFillEnum.RIGHT),
	FECHA_DE_CAPTURA(71,74,"",AlignFillEnum.RIGHT),
	IDENTIFICACION_EMPRESA(75,82,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REFERENCE_NUMBER(83,94,"",AlignFillEnum.RIGHT),
	AUTHORIZATION_ID_RESPONSE(95,100,"",AlignFillEnum.RIGHT),
	RESPONSE_CODE(101,102,"",AlignFillEnum.RIGHT),
	TERMINAL_ID(103,110,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(111,113,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(114,118,"",AlignFillEnum.RIGHT),
	
	//RESPUESTA REQUERIMIENTO
	
	TAMANIO_DEL_BLOQUE(119,121,"",AlignFillEnum.RIGHT),
	CODIGO_DE_FORMATO(122,123,"",AlignFillEnum.RIGHT),
	BIN_PROCESADOR(124,134,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ACREEDOR(135,145,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO(146,153,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(154,157,"",AlignFillEnum.RIGHT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(158,161,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(162,163,"",AlignFillEnum.RIGHT),
	DATO_DE_PAGO(164,184,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CIUDAD(185,187,"",AlignFillEnum.RIGHT),
	NUMERO_DE_OPERAC_COBRANZA(188,199,"",AlignFillEnum.RIGHT),
	NUMERO_DE_OPERAC_ACREEDOR(200,211,"",AlignFillEnum.RIGHT),
	NUMERO_DE_PROD_SERV_PAGAD(212,213,"",AlignFillEnum.RIGHT),
	NUMERO_TOTAL_DE_DOC_PAGAD(214,216,"",AlignFillEnum.RIGHT),
	FILLER_1(217,226,"",AlignFillEnum.RIGHT),
	ORIGEN_DE_RESPUESTA(227,227,"",AlignFillEnum.RIGHT),
	CODIGO_DE_RESPUESTA_EXTEND(228,230,"",AlignFillEnum.RIGHT),
	DESCRIPC_DE_LA_RPTA_APLICATIV(231,260,"",AlignFillEnum.RIGHT),
	NOMBRE_DEL_DEUDOR(261,280,"",AlignFillEnum.RIGHT),
	RUC_DEL_DEUDOR(281,295,"",AlignFillEnum.RIGHT),
	RUC_DEL_ACREEDOR(296,310,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ZONA_DEL_DEUDOR(311,316,"",AlignFillEnum.RIGHT),
	FILLER_2(317,336,"",AlignFillEnum.RIGHT),
	CODIGO_DEL_PROD_SERVICIO(337,339,"",AlignFillEnum.RIGHT),
	DESCRIPC_DEL_PROD_SERV(340,354,"",AlignFillEnum.RIGHT),
	IMPORTE_TOTAL_POR_PROD_SERV(355,365,"",AlignFillEnum.RIGHT),
	MENSAJE_1(366,405,"",AlignFillEnum.RIGHT),
	MENSAJE_2(406,445,"",AlignFillEnum.RIGHT),
	NUMERO_DE_DOCUMENTOS(446,447,"",AlignFillEnum.RIGHT),
	FILLER_3(448,467,"",AlignFillEnum.RIGHT),
	TIPO_DE_SERVICIO(468,470,"",AlignFillEnum.RIGHT),
	DESCRIPCION_DEL_DOCUMENTO(471,485,"",AlignFillEnum.RIGHT),
	NUMERO_DEL_DOCUMENTO(486,501,"",AlignFillEnum.RIGHT),
	PERIODO_DE_COTIZACION(502,507,"",AlignFillEnum.RIGHT),
	TIPO_DOC_IDENTIDAD(508,509,"",AlignFillEnum.RIGHT),
	NUMERO_DOCUMENTO_IDENTIDAD(510,524,"",AlignFillEnum.RIGHT),
	FECHA_DE_EMISION(525,532,"",AlignFillEnum.RIGHT),
	FECHA_DE_VENCIMIENTO(533,540,"",AlignFillEnum.RIGHT),
	IMPORTE_PAGADO(541,551,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO1(552,553,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_1(554,564,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO2(565,566,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_2(567,577,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO3(578,579,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_3(580,590,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO4(591,592,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_4(593,603,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO5(604,605,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_5(606,616,"",AlignFillEnum.RIGHT),
	INDICADOR_DE_FACTURACION(617,617,"",AlignFillEnum.RIGHT),
	NUMERO_DE_FACTURA(618,628,"",AlignFillEnum.RIGHT),
	REFERENCIA_DE_LA_DEUDA(629,644,"",AlignFillEnum.RIGHT),
	FILLER_4(645,678,"",AlignFillEnum.RIGHT),


	;
	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private ExtornoAutPagoRsFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
