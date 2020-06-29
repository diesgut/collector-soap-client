package com.diesgut.collectorsoapclient.scotia.enums;

public enum ExtornoAutPagoRqFieldEnum {

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
	
	// ORIGINAL_DATA_ELEMENTS
	
	MESSAGE_TYPE_IDENTIFICATION_2(194,197,"",AlignFillEnum.RIGHT),
	TRACE_2(198,203,"",AlignFillEnum.RIGHT),
	FECHA_Y_HORA_DE_TRANSACCION_2(204,213,"",AlignFillEnum.RIGHT),
	BIN_ADQUIRIENTE_2(214,224,"",AlignFillEnum.RIGHT),
	FORWARD_INSTITUTION_CODE_2(225,235,"",AlignFillEnum.RIGHT),
	DATOS_RESERVADOS(236,240,"",AlignFillEnum.RIGHT),
	
	//DATOS_DEL_REQUERIMIENTO
	
	LONGITUD_DE_LA_TRAMA(241,243,"",AlignFillEnum.RIGHT),
	CODIGO_DE_FORMATO(244,245,"",AlignFillEnum.RIGHT),
	BIN_PROCESADOR(246,256,"",AlignFillEnum.RIGHT),
	CODIGO_DE_ACREEDOR(257,267,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO(268,275,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(276,279,"",AlignFillEnum.RIGHT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(280,283,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(284,285,"",AlignFillEnum.RIGHT),
	DATO_DE_PAGO(286,306,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CIUDAD(307,309,"",AlignFillEnum.RIGHT),
	NUMERO_DE_PROD_SERV_PAGAD(310,311,"",AlignFillEnum.RIGHT),
	NUMERO_TOTAL_DE_DOC_PAGAD(312,314,"",AlignFillEnum.RIGHT),
	FILLER_1(315,324,"",AlignFillEnum.RIGHT),
	MEDIO_DE_PAGO(325,326,"",AlignFillEnum.RIGHT),
	IMPORTE_PAGADO_EFECTIVO(327,337,"",AlignFillEnum.RIGHT),
	IMPORTE_PAG_C_CTA(338,348,"",AlignFillEnum.RIGHT),
	NRO_CHEQUE1(349,363,"",AlignFillEnum.RIGHT),
	BCO_GIRADOR1(364,366,"",AlignFillEnum.RIGHT),
	IMPORTE_CHEQUE1(367,377,"",AlignFillEnum.RIGHT),
	PLAZA_CHEQUE1(378,378,"",AlignFillEnum.RIGHT),
	NRO_CHEQUE2(379,393,"",AlignFillEnum.RIGHT),
	BCO_GIRADOR2(394,396,"",AlignFillEnum.RIGHT),
	IMPORTE_CHEQUE2(397,407,"",AlignFillEnum.RIGHT),
	PLAZA_CHEQUE2(408,408,"",AlignFillEnum.RIGHT),
	NRO_CHEQUE3(409,423,"",AlignFillEnum.RIGHT),
	BCO_GIRADOR3(424,426,"",AlignFillEnum.RIGHT),
	IMPORTE_CHEQUE3(427,437,"",AlignFillEnum.RIGHT),
	PLAZA_CHEQUE3(438,438,"",AlignFillEnum.RIGHT),
	MONEDA_DE_PAGO(439,441,"",AlignFillEnum.RIGHT),
	TIPO_DE_CAMBIO_APLICADO(442,452,"",AlignFillEnum.RIGHT),
	PAGO_TOTAL_REALIZADO(453,463,"",AlignFillEnum.RIGHT),
	FILLER_2(464,473,"",AlignFillEnum.RIGHT),
	CODIGO_DEL_SERVICIO_PAGADO(474,476,"",AlignFillEnum.RIGHT),
	ESTADO_DEL_DEUDOR(477,478,"",AlignFillEnum.RIGHT),
	IMPORTE_TOTAL_X_PROD_SERV(479,489,"",AlignFillEnum.RIGHT),
	NRO_DE_CUENTA_DE_ABONO(490,508,"",AlignFillEnum.RIGHT),
	NRO_DE_REFERENCIA_DEL_ABONO(509,520,"",AlignFillEnum.RIGHT),
	NRO_DE_DOCUMENTOS_PAGADOS(521,522,"",AlignFillEnum.RIGHT),
	FILLER_3(523,532,"",AlignFillEnum.RIGHT),
	TIPO_DE_DOCUMENTO_DE_PAGO(533,535,"",AlignFillEnum.RIGHT),
	NUMERO_DE_DOCUMENTO_DE_PAG(536,551,"",AlignFillEnum.RIGHT),
	PERIODO_DE_COTIZACION(552,557,"",AlignFillEnum.RIGHT),
	TIPO_DOC_ID_DEUDOR(558,559,"",AlignFillEnum.RIGHT),
	NUMERO_DOC_ID_DEL_DEUDOR(560,574,"",AlignFillEnum.RIGHT),
	IMPORTE_ORIGINAL_DE_LA_DEUDA(575,585,"",AlignFillEnum.RIGHT),
	IMPORTE_PAGADO_DEL_DOCTO(586,596,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_1(597,598,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO1(599,609,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_2(610,611,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO2(612,622,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_3(623,624,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO3(625,635,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_4(636,637,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO4(638,648,"",AlignFillEnum.RIGHT),
	CODIGO_DE_CONCEPTO_5(649,650,"",AlignFillEnum.RIGHT),
	IMPORTE_DE_CONCEPTO5(651,661,"",AlignFillEnum.RIGHT),
	REFERENCIA_DE_LA_DEUDA(662,677,"",AlignFillEnum.RIGHT),
	FILLER_4(678,711,"",AlignFillEnum.RIGHT),
	;
	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private ExtornoAutPagoRqFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
