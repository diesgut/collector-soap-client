package com.diesgot.collectorsoapclient.model;

import java.math.BigDecimal;
import java.util.Date;

import com.diesgot.collectorsoapclient.model.enums.AcreenciaStateEnum;
import com.diesgot.collectorsoapclient.model.enums.CurrencyEnum;

public class Acreencia {

	private Long idAcreencia;
	private String codigoTipoServicio;
	private String tipoDatoPago; // tipo identificacion cliente - codigo cliente o codigo documento
	private String datoPago; // codigo cliente o codigo documento
	private Integer currency;
	private String accountNumber;
	private String customerName;
	private Integer state;
	private BigDecimal debtAmount;
	private Date expirationDate;

	public Acreencia() {
		super();
	}

	public Long getIdAcreencia() {
		return idAcreencia;
	}

	public void setIdAcreencia(Long idAcreencia) {
		this.idAcreencia = idAcreencia;
	}

	public String getTipoDatoPago() {
		return tipoDatoPago;
	}

	public void setTipoDatoPago(String tipoDatoPago) {
		this.tipoDatoPago = tipoDatoPago;
	}

	public String getDatoPago() {
		return datoPago;
	}

	public void setDatoPago(String datoPago) {
		this.datoPago = datoPago;
	}

	public Integer getCurrency() {
		return currency;
	}
	
	public CurrencyEnum getCurrencyEnum() {
		if(this.getCurrency()==null) {
			return null;			
		}
		return CurrencyEnum.lookup.get( this.currency );
	}

	public void setCurrency(Integer currency) {
		this.currency = currency;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCodigoTipoServicio() {
		return codigoTipoServicio;
	}

	public void setCodigoTipoServicio(String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

	public AcreenciaStateEnum getStateEnum() {
		if (this.state == null) {
			return null;
		}
		return AcreenciaStateEnum.lookup.get(this.state);
	}

	public void setStateEnum(AcreenciaStateEnum type) {
		this.state = type.getCode();
	}

	public BigDecimal getDebtAmount() {
		return debtAmount;
	}

	public void setDebtAmount(BigDecimal debtAmount) {
		this.debtAmount = debtAmount;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
