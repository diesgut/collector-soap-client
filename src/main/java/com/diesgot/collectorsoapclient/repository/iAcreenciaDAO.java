package com.diesgot.collectorsoapclient.repository;

import java.util.List;

import com.diesgot.collectorsoapclient.model.Acreencia;
import com.diesgot.collectorsoapclient.model.enums.AcreenciaStateEnum;
import com.diesgot.collectorsoapclient.model.enums.BankEnum;

public interface iAcreenciaDAO {
	
	List<Acreencia> allByBankAndState(BankEnum bankEnum, AcreenciaStateEnum... acreenciaStateEnum);

}
