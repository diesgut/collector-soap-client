package com.diesgut.collectorsoapclient.repository;

import java.util.List;

import com.diesgut.collectorsoapclient.model.Acreencia;
import com.diesgut.collectorsoapclient.model.enums.AcreenciaStateEnum;
import com.diesgut.collectorsoapclient.model.enums.BankEnum;

public interface iAcreenciaDAO {
	
	List<Acreencia> allByBankAndState(BankEnum bankEnum, AcreenciaStateEnum... acreenciaStateEnum);

}
