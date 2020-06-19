package com.diesgot.collectorsoapclient.repository;

import java.util.List;

import com.diesgot.collectorsoapclient.model.Operation;
import com.diesgot.collectorsoapclient.model.enums.BankEnum;
import com.diesgot.collectorsoapclient.model.enums.OperationTypeEnum;

public interface iOperationDAO {
	List<Operation> allPayedByBankAndOperationType(BankEnum bankEnum, OperationTypeEnum operationTypeEnum);
}
