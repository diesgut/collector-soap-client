package com.diesgot.collectorsoapclient.scotia.enums;

public enum AnulacionDeudaRsFieldEnum {
	
	MESSAGE_TYPE_IDENTIFICATION(1,4,"",AlignFillEnum.LEFT),
	PRIMARY_BIT_MAP(5,20,"",AlignFillEnum.LEFT),
	SECONDARY_BIT_MAP(21,36,"",AlignFillEnum.LEFT),
	CODIGO_DE_PROCESO(37,42,"",AlignFillEnum.LEFT),
	MONTO(43,54,"",AlignFillEnum.LEFT),
	FECHA_Y_HORA_DE_TRANSACCION(55,64,"",AlignFillEnum.LEFT),
	TRACE(65,70,"",AlignFillEnum.LEFT),
	FECHA_DE_CAPTURA(71,74,"",AlignFillEnum.LEFT),
	IDENTIFICACION_EMPRESA(75,82,"",AlignFillEnum.RIGHT),
	RETRIEVAL_REFERENCE_NUMBER(83,94,"",AlignFillEnum.LEFT),
	AUTHORIZATION_ID_RESPONSE(95,100,"",AlignFillEnum.LEFT),
	RESPONSE_CODE(101,102,"",AlignFillEnum.LEFT),
	TERMINAL_ID(103,110,"",AlignFillEnum.RIGHT),
	TRANSACTION_CURRENCY_CODE(111,113,"",AlignFillEnum.LEFT),
	DATOS_RESERVADOS(114,118,"",AlignFillEnum.LEFT),
	
	//DATOS_DEL_DOCUMENTO_A_EXTORNAR
	
	LONGITUD_DE_LA_TRAMA(119,121,"",AlignFillEnum.LEFT),
	CODIGO_DE_FORMATO(122,123,"",AlignFillEnum.LEFT),
	BIN_PROCESADOR(124,134,"",AlignFillEnum.LEFT),
	CODIGO_DE_ACREEDOR(135,145,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PRODUCTO_SERVICIO_1(146,153,"",AlignFillEnum.RIGHT),
	CODIGO_DE_PLAZA_DEL_RECAUDADOR(154,157,"",AlignFillEnum.LEFT),
	CODIGO_DE_AGENCIA_DEL_RECAUDADOR(158,161,"",AlignFillEnum.RIGHT),
	TIPO_DE_DATO_DE_PAGO(162,163,"",AlignFillEnum.LEFT),
	DATO_DE_PAGO(164,184,"",AlignFillEnum.LEFT),
	CODIGO_DE_CIUDAD(185,187,"",AlignFillEnum.LEFT),
	NOMBRE_DEL_CLIENTE(188,207,"",AlignFillEnum.LEFT),
	RUC_DEL_DEUDOR(208,222,"",AlignFillEnum.LEFT),
	RUC_DEL_ACREEDOR(223,237,"",AlignFillEnum.LEFT),
	NUMERO_DE_TRANS_DE_COB_ORI(238,249,"0",AlignFillEnum.LEFT),
	NUMERO_OPE_ORIGINAL_ACREED(250,261,"0",AlignFillEnum.LEFT),
	FILLER_1(262,291,"",AlignFillEnum.LEFT),
	ORIGEN_DE_RESPUESTA(292,292,"",AlignFillEnum.LEFT),
	CODIGO_DE_RESPUESTA_EXTEND(293,295,"",AlignFillEnum.LEFT),
	DESCRIPC_DE_LA_RPTA_APLICA(296,325,"",AlignFillEnum.LEFT),
	CODIGO_DE_PRODUCTO_SERVICIO_2(326,328,"",AlignFillEnum.LEFT),
	DESCRIPC_DEL_PROD_SERVICIO(329,343,"",AlignFillEnum.LEFT),
	IMPORTE_DEL_PROD_SERVICIO(344,354,"",AlignFillEnum.LEFT),
	MENSAJE_1_MARKETING(355,394,"",AlignFillEnum.LEFT),
	MENSAJE_2_MARKETING(395,434,"",AlignFillEnum.LEFT),
	NUMERO_DE_DOCUMENTOS(435,436,"",AlignFillEnum.LEFT),
	FILLER_2(437,456,"",AlignFillEnum.LEFT),
	TIPO_DE_DOCUMENTO_SERVICIO(457,459,"",AlignFillEnum.LEFT),
	DESCRIPCION_DEL_DOCUMENTO(460,474,"",AlignFillEnum.LEFT),
	NUMERO_DE_DOCUMENTO(475,490,"",AlignFillEnum.LEFT),
	PERIODO_DE_COTIZACION(491,496,"",AlignFillEnum.LEFT),
	TIPO_DE_DOC_IDENTIDAD(497,498,"",AlignFillEnum.LEFT),
	NRO_DE_DOC_IDENTIDAD(499,513,"",AlignFillEnum.LEFT),
	FECHA_DE_EMISION(514,521,"",AlignFillEnum.LEFT),
	FECHA_DE_VENCIMIENTO(522,529,"",AlignFillEnum.LEFT),
	IMPORTE_ANULADO_DEL_DCTO(530,540,"",AlignFillEnum.LEFT),
	CODIGO_DE_CONCEPTO_1(541,542,"",AlignFillEnum.LEFT),
	IMPORTE_CONCEPTO_1(543,553,"",AlignFillEnum.LEFT),
	CODIGO_DE_CONCEPTO_2(554,555,"",AlignFillEnum.LEFT),
	IMPORTE_CONCEPTO_2(556,566,"",AlignFillEnum.LEFT),
	CODIGO_DE_CONCEPTO_3(567,568,"",AlignFillEnum.LEFT),
	IMPORTE_CONCEPTO_3(569,579,"",AlignFillEnum.LEFT),
	CODIGO_DE_CONCEPTO_4(580,581,"",AlignFillEnum.LEFT),
	IMPORTE_CONCEPTO_4(582,592,"",AlignFillEnum.LEFT),
	CODIGO_DE_CONCEPTO_5(593,594,"",AlignFillEnum.LEFT),
	IMPORTE_CONCEPTO_5(595,605,"",AlignFillEnum.LEFT),
	INDICADOR_DE_COMPROBANTE(606,606,"",AlignFillEnum.LEFT),
	NUMERO_DE_FACTURA_ANULADA(607,617,"",AlignFillEnum.LEFT),
	REFERENCIA_DE_LA_DEUDA(618,633,"",AlignFillEnum.LEFT),
	FILLER_3(634,667,"",AlignFillEnum.LEFT),
	;

	
	private Integer startPosition;
	private Integer endPosition;
	private String dataFill;
	private AlignFillEnum orientation;
	
	private AnulacionDeudaRsFieldEnum(Integer startPosition, Integer endPosition, String dataFill, AlignFillEnum ortientationFillEnum) {
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
