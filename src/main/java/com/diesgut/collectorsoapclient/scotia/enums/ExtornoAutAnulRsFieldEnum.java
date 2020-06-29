package com.diesgut.collectorsoapclient.scotia.enums;

public enum ExtornoAutAnulRsFieldEnum {

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
	RESPONSE_CODE_(101,102,"",AlignFillEnum.RIGHT),
	TERMINAL_ID(103,110,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(111,113,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(114,115,"",AlignFillEnum.RIGHT),
	
	//DATOS_DEL_DOCUMENTO_A_EXTORNAR
	
	LONGITUD_DE_LA_TRAMA(116,118,"",AlignFillEnum.RIGHT),
	CODIGO_DE_FORMATO(119,120,"",AlignFillEnum.RIGHT),
	BIN_PROCESADOR(121,131,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ACREEDOR(132,142,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO_1(143,150,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(151,154,"",AlignFillEnum.RIGHT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(155,158,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(159,160,"",AlignFillEnum.RIGHT),
	DATO_DE_PAGO(161,181,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CIUDAD(182,184,"",AlignFillEnum.RIGHT),
	NOMBRE_DEL_CLIENTE(185,204,"",AlignFillEnum.RIGHT),
	RUC_DEL_DEUDOR(205,219,"",AlignFillEnum.RIGHT),
	RUC_DEL_ACREEDOR(220,234,"",AlignFillEnum.RIGHT),
	NUMERO_DE_TRANS_DE_COB_ORI(235,246,"",AlignFillEnum.RIGHT),
	NUMERO_OPE_ORIGINAL_ACREED(247,258,"",AlignFillEnum.RIGHT),
	FILLER_1(259,288,"",AlignFillEnum.RIGHT),
	ORIGEN_DE_RESPUESTA(289,289,"",AlignFillEnum.RIGHT),
	CODIGO_DE_RESPUESTA_EXTEND(290,292,"",AlignFillEnum.RIGHT),
	DESCRIPC_DE_LA_RPTA_APLICA(293,322,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO_2(323,325,"",AlignFillEnum.RIGHT),
	DESCRIPC_DEL_PROD_SERVICIO(326,340,"",AlignFillEnum.RIGHT),
	IMPORTE_DEL_PROD_SERVICIO(341,351,"",AlignFillEnum.RIGHT),
	MENSAJE_1_MARKETING(352,391,"",AlignFillEnum.RIGHT),
	MENSAJE_2_MARKETING(392,431,"",AlignFillEnum.RIGHT),
	NUMERO_DE_DOCUMENTOS(432,433,"",AlignFillEnum.RIGHT),
	FILLER_2(434,453,"",AlignFillEnum.RIGHT),
	TIPO_DE_DOCUMENTO_SERVICIO(454,456,"",AlignFillEnum.RIGHT),
	DESCRIPCION_DEL_DOCUMENTO(457,471,"",AlignFillEnum.RIGHT),
	NUMERO_DE_DOCUMENTO(472,487,"",AlignFillEnum.RIGHT),
	PERIODO_DE_COTIZACION(488,493,"",AlignFillEnum.RIGHT),
	TIPO_DE_DOC_IDENTIDAD(494,495,"",AlignFillEnum.RIGHT),
	NRO_DE_DOC_IDENTIDAD(496,510,"",AlignFillEnum.RIGHT),
	FECHA_DE_EMISION(511,518,"",AlignFillEnum.RIGHT),
	FECHA_DE_VENCIMIENTO(519,526,"",AlignFillEnum.RIGHT),
	IMPORTE_ANULADO_DEL_DCTO(527,537,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_1(538,539,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_1(540,550,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_2(551,552,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_2(553,563,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_3(564,565,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_3(566,576,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_4(577,578,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_4(579,589,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_5(590,591,"",AlignFillEnum.RIGHT),
	IMPORTE_CONCEPTO_5(592,602,"",AlignFillEnum.RIGHT),
	INDICADOR_DE_COMPROBANTE(603,603,"",AlignFillEnum.RIGHT),
	NUMERO_DE_FACTURA_ANULADA(604,614,"",AlignFillEnum.RIGHT),
	REFERENCIA_DE_LA_DEUDA(615,630,"",AlignFillEnum.RIGHT),
	FILLER_3(631,664,"",AlignFillEnum.RIGHT),
	;
	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private ExtornoAutAnulRsFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
