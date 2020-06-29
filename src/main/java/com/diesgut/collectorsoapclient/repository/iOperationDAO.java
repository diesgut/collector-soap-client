package com.diesgut.collectorsoapclient.repository;

import java.util.List;

import com.diesgut.collectorsoapclient.model.Operation;
import com.diesgut.collectorsoapclient.model.enums.BankEnum;
import com.diesgut.collectorsoapclient.model.enums.OperationTypeEnum;

public interface iOperationDAO {
	List<Operation> allPayedByBankAndOperationType(BankEnum bankEnum, OperationTypeEnum operationTypeEnum);
}
