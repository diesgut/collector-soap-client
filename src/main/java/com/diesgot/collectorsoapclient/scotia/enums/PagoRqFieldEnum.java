package com.diesgot.collectorsoapclient.scotia.enums;

public enum PagoRqFieldEnum {

	
	MESSAGE_TYPE_IDENTIFICATION(1,4,"",AlignFillEnum.RIGHT),
	PRIMARY_BIT_MAP(5,20,"",AlignFillEnum.RIGHT),
	SECONDARY_BIT_MAP(21,36,"",AlignFillEnum.RIGHT),
	NUMERO_DE_TARJETA(37,54,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PROCESO(55,60,"",AlignFillEnum.RIGHT),
	MONTO(61,72,"0",AlignFillEnum.LEFT),
	FECHA_Y_HORA_DE_TRANSACCION(73,82,"",AlignFillEnum.RIGHT),
	TRACE(83,88,"",AlignFillEnum.RIGHT),
	FECHA_DE_CAPTURA(89,92,"",AlignFillEnum.RIGHT),
	MODO_DE_INGRESO_DE_DATOS(93,95,"",AlignFillEnum.RIGHT),
	CANAL(96,97,"",AlignFillEnum.RIGHT),
	BIN_ADQUIRIENTE(98,105,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE(106,113,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REFERENCE_NUMBER(114,125,"",AlignFillEnum.RIGHT),
	TERMINAL_ID(126,133,"",AlignFillEnum.RIGHT),
	COMERCIO(134,148,"",AlignFillEnum.RIGHT),
	CARD_ACCEPTOR_LOCATION(149,188,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(189,191,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(192,196,"",AlignFillEnum.RIGHT),
	//DATOS DEL REQUIRIMIENTO
	LONGITUD_DE_LA_TRAMA(197,199,"",AlignFillEnum.RIGHT),
	CODIGO_DE_FORMATO(200,201,"",AlignFillEnum.RIGHT),
	BIN_PROCESADOR(202,212,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ACREEDOR(213,223,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO(224,231,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(232,235,"",AlignFillEnum.RIGHT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(236,239,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(240,241,"",AlignFillEnum.RIGHT),
	DATO_DE_PAGO(242,262,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CIUDAD(263,265,"",AlignFillEnum.RIGHT),
	NUMERO_DE_PROD_SERV_PAGAD(266,267,"",AlignFillEnum.RIGHT),
	NUMERO_TOTAL_DE_DOC_PAGAD(268,270,"",AlignFillEnum.RIGHT),
	FILLER1(271,280,"",AlignFillEnum.RIGHT),
	MEDIO_DE_PAGO(281,282,"",AlignFillEnum.RIGHT),
	IMPORTE_PAGADO_EFECTIVO(283,293,"0",AlignFillEnum.LEFT),
	IMPORTE_PAG_C_CTA(294,304,"",AlignFillEnum.RIGHT),
	NRO_CHEQUE1(305,319,"",AlignFillEnum.RIGHT),
	BCO_GIRADOR1(320,322,"",AlignFillEnum.RIGHT),
	IMPORTE_CHEQUE1(323,333,"",AlignFillEnum.RIGHT),
	PLAZA_CHEQUE1(334,334,"",AlignFillEnum.RIGHT),
	NRO_CHEQUE2(335,349,"",AlignFillEnum.RIGHT),
	BCO_GIRADOR2(350,352,"",AlignFillEnum.RIGHT),
	IMPORTE_CHEQUE2(353,363,"",AlignFillEnum.RIGHT),
	PLAZA_CHEQUE2(364,364,"",AlignFillEnum.RIGHT),
	NRO_CHEQUE3(365,379,"",AlignFillEnum.RIGHT),
	BCO_GIRADOR3(380,382,"",AlignFillEnum.RIGHT),
	IMPORTE_CHEQUE3(383,393,"",AlignFillEnum.RIGHT),
	PLAZA_CHEQUE3(394,394,"",AlignFillEnum.RIGHT),
	MONEDA_DE_PAGO(395,397,"",AlignFillEnum.RIGHT),
	TIPO_DE_CAMBIO_APLICADO(398,408,"",AlignFillEnum.RIGHT),
	PAGO_TOTAL_REALIZADO(409,419,"",AlignFillEnum.RIGHT),
	FILLER2(420,429,"",AlignFillEnum.RIGHT),
	CODIGO_DEL_SERVICIO_PAGADO(430,432,"",AlignFillEnum.RIGHT),
	ESTADO_DEL_DEUDOR(433,434,"",AlignFillEnum.RIGHT),
	IMPORTE_TOTAL_X_PROD_SERV(435,445,"0",AlignFillEnum.LEFT),
	NRO_DE_CUENTA_DE_ABONO(446,464,"",AlignFillEnum.RIGHT),
	NRO_DE_REFERENCIA_DEL_ABONO(465,476,"",AlignFillEnum.RIGHT),
	NRO_DE_DOCUMENTOS_PAGADOS(477,478,"",AlignFillEnum.RIGHT),
	FILLER3(479,488,"",AlignFillEnum.RIGHT),
	TIPO_DE_DOCUMENTO_DE_PAGO(489,491,"",AlignFillEnum.RIGHT),
	NUMERO_DE_DOCUMENTO_DE_PAG(492,507,"",AlignFillEnum.RIGHT),
	PERIODO_DE_COTIZACION(508,513,"",AlignFillEnum.RIGHT),
	TIPO_DOC_ID_DEUDOR(514,515,"",AlignFillEnum.RIGHT),
	NUMERO_DOC_ID_DEL_DEUDOR(516,530,"",AlignFillEnum.RIGHT),
	IMPORTE_ORIGINAL_DE_LA_DEUDA(531,541,"0",AlignFillEnum.LEFT),
	IMPORTE_PAGADO_DEL_DOCTO(542,552,"0",AlignFillEnum.LEFT),
	CODIGO_DE_CONCEPTO_1(553,554,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO1(555,565,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_2(566,567,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO2(568,578,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_3(579,580,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO3(581,591,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_4(592,593,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO4(594,604,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_5(605,606,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO5(607,617,"",AlignFillEnum.RIGHT),
	REFERENCIA_DE_LA_DEUDA(618,633,"",AlignFillEnum.RIGHT),
	FILLER4(634,663,"",AlignFillEnum.RIGHT),
	FILLER5(664,666,"",AlignFillEnum.RIGHT),
	FILLER6(667,667,"",AlignFillEnum.RIGHT),
	;

	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private PagoRqFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
