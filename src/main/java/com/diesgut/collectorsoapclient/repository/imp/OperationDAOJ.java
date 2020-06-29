package com.diesgut.collectorsoapclient.repository.imp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.diesgut.collectorsoapclient.model.Acreencia;
import com.diesgut.collectorsoapclient.model.Operation;
import com.diesgut.collectorsoapclient.model.enums.BankEnum;
import com.diesgut.collectorsoapclient.model.enums.OperationTypeEnum;
import com.diesgut.collectorsoapclient.repository.iOperationDAO;

@Repository
public class OperationDAOJ implements iOperationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Operation> allPayedByBankAndOperationType(BankEnum bankEnum, OperationTypeEnum operationTypeEnum) {

		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("BANK", bankEnum.getCode());
		mapSqlParameterSource.addValue("OPERATION_TYPE", operationTypeEnum.getCode());

		StringBuilder sQuery = new StringBuilder();
		sQuery.append(" SELECT  ");
		sQuery.append("  	fo.id_fund_operation_pk,	 ");
		sQuery.append("  	fo.operation_number,	 ");
		sQuery.append("  	fo.id_funds_operation_type_fk,	 ");
		sQuery.append("  	fo.id_fund_operation_related_fk,	 ");
		sQuery.append("  	fo.operation_amount,	 ");
		sQuery.append("  	fo.operation_date,	 ");
		sQuery.append("  	fo.operation_state,	 ");
		sQuery.append(" 	br.id_bank_reference_pk,   ");
		sQuery.append(" 	br.bank_reference,   ");
		sQuery.append("  	bcc.collect_concept_bank, ");
		sQuery.append("  	br.debt_amount, ");
		sQuery.append("  	br.currency, ");
		sQuery.append("  	br.expiration_date, ");
		sQuery.append("  	br.register_status ");
		sQuery.append(" FROM	  ");
		sQuery.append(" 	fund_operation fo   ");
		sQuery.append(" inner JOIN bank_reference br on br.id_bank_reference_pk=fo.id_bank_reference_fk	   ");
		sQuery.append(" inner JOIN bank_collect_concept bcc on bcc.id_collect_concept_pk=br.id_collect_concept_fk	   ");
		sQuery.append(" inner JOIN bank_account ba on ba.id_bank_account_pk=br.id_bank_account_fk	   ");
		sQuery.append(" inner join bank b on b.id_bank_pk=ba.id_bank_fk	   ");
		sQuery.append(" WHERE	1=1  ");
		sQuery.append(" and fo.id_funds_operation_type_fk=:OPERATION_TYPE	  ");
		sQuery.append(" and b.id_bank_pk=:BANK	  ");
		sQuery.append(" and  not EXISTS (	  ");
		sQuery.append(" select fo2.id_fund_operation_pk from fund_operation fo2 where fo2.id_fund_operation_related_fk=fo.id_fund_operation_pk	  ");
		sQuery.append(" )	  ");
		sQuery.append(" order by fo.operation_date desc	  ");


		List<Operation> operations = new ArrayList<>();
		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(sQuery.toString(),
				mapSqlParameterSource);
		for (Map row : rows) {
			Operation operation = new Operation();
			Timestamp operationDate = (Timestamp) row.get("operation_date");

			operation.setIdOperation((Long) row.get("id_fund_operation_pk"));
			operation.setOperationNumber((String) row.get("operation_number"));
			operation.setOperationType((Long) row.get("id_funds_operation_type_fk"));
			operation.setIdOperationRelated((Long) row.get("id_fund_operation_related_fk"));
			operation.setOperationAmount( (BigDecimal)row.get("operation_amount") );
			operation.setOperationDate( operationDate );
			operation.setOperationState( Integer.parseInt( row.get("operation_state").toString() ) );
			
			Acreencia acreencia = new Acreencia();
			Timestamp AcreexpirationDate = (Timestamp) row.get("expiration_date");

			acreencia.setIdAcreencia((Long) row.get("id_bank_reference_pk"));
			acreencia.setDatoPago((String) row.get("bank_reference"));
			acreencia.setCurrency(Integer.parseInt(row.get("currency").toString()));
			acreencia.setState(Integer.valueOf( row.get("register_status").toString() ));
			acreencia.setCodigoTipoServicio((String) row.get("collect_concept_bank"));
			acreencia.setDebtAmount((BigDecimal)row.get("debt_amount"));
			acreencia.setExpirationDate(AcreexpirationDate);
			
			operation.setAcreencia(acreencia);
			
			operations.add(operation);
		}
		return operations;

	}

}
