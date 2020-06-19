package com.diesgot.collectorsoapclient.model;

import java.math.BigDecimal;
import java.util.Date;

import com.diesgot.collectorsoapclient.model.enums.OperationStateEnum;

public class Operation {

	private Long idOperation;
	private String operationNumber;
	private Long operationType;
	private Long idOperationRelated;
	private BigDecimal operationAmount;
	private Date operationDate;
	private Integer operationState;
	
	private Acreencia acreencia;

	public Operation() {
		super();
	}

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public String getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(String operationNumber) {
		this.operationNumber = operationNumber;
	}


	public Long getOperationType() {
		return operationType;
	}

	public void setOperationType(Long operationType) {
		this.operationType = operationType;
	}

	public Long getIdOperationRelated() {
		return idOperationRelated;
	}

	public void setIdOperationRelated(Long idOperationRelated) {
		this.idOperationRelated = idOperationRelated;
	}

	public BigDecimal getOperationAmount() {
		return operationAmount;
	}

	public void setOperationAmount(BigDecimal operationAmount) {
		this.operationAmount = operationAmount;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public Acreencia getAcreencia() {
		return acreencia;
	}

	public void setAcreencia(Acreencia acreencia) {
		this.acreencia = acreencia;
	}

	public Integer getOperationState() {
		return operationState;
	}

	public void setOperationState(Integer operationState) {
		this.operationState = operationState;
	}

	public OperationStateEnum getOperationStateEnum() {
		if(this.operationState==null) {
			return null;
		}
		return OperationStateEnum.lookup.get( this.operationState );
	}

}
