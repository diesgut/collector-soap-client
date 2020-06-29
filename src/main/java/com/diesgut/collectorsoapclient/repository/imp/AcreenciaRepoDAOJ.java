package com.diesgut.collectorsoapclient.repository.imp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.diesgut.collectorsoapclient.model.Acreencia;
import com.diesgut.collectorsoapclient.model.enums.AcreenciaStateEnum;
import com.diesgut.collectorsoapclient.model.enums.BankEnum;
import com.diesgut.collectorsoapclient.repository.iAcreenciaDAO;

@Repository
public class AcreenciaRepoDAOJ implements iAcreenciaDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Acreencia> allByBankAndState(BankEnum bankEnum, AcreenciaStateEnum... acreenciaStateEnum) {

		
		List<Integer> states=Arrays.asList(acreenciaStateEnum).stream().map(x->x.getCode()).collect(Collectors.toList());
		
		MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
		mapSqlParameterSource.addValue("BANK", bankEnum.getCode());
		mapSqlParameterSource.addValue("STATE", states);

		StringBuilder sQuery = new StringBuilder();
		sQuery.append(" SELECT  ");
		sQuery.append(" 	br.id_bank_reference_pk,   ");
		sQuery.append(" 	br.bank_reference,   ");
		sQuery.append("  	bcc.collect_concept_bank, ");
		sQuery.append("  	br.debt_amount, ");
		sQuery.append("  	br.currency, ");
		sQuery.append("  	br.expiration_date, ");
		sQuery.append("  	br.register_status ");
		sQuery.append(" FROM	  ");
		sQuery.append(" 	bank_reference br   ");
		sQuery.append(" INNER JOIN	  ");
		sQuery.append(" 	bank_account ba on ba.id_bank_account_pk=br.id_bank_account_fk  ");
		sQuery.append(" INNER JOIN	  ");
		sQuery.append(" 	bank b on b.id_bank_pk=ba.id_bank_fk  ");
		sQuery.append(" INNER JOIN	  ");
		sQuery.append(" 	bank_collect_concept bcc on bcc.id_collect_concept_pk=br.id_collect_concept_fk  ");
		sQuery.append(" WHERE	  ");
		sQuery.append(" 1=1	  ");
		sQuery.append(" and 	b.id_bank_pk=:BANK and br.register_status in (:STATE) ");
		sQuery.append(" ORDER BY  ");
		sQuery.append(" br.bank_reference, bcc.collect_concept_bank  ");

		List<Acreencia> banksReferences = new ArrayList<>();
		List<Map<String, Object>> rows = namedParameterJdbcTemplate.queryForList(sQuery.toString(),
				mapSqlParameterSource);
		for (Map row : rows) {
			if (row.get("debt_amount") == null) {
				continue;
			}
			Acreencia acreencia = new Acreencia();
			Timestamp expirationDate = (Timestamp) row.get("expiration_date");

			acreencia.setIdAcreencia((Long) row.get("id_bank_reference_pk"));
			acreencia.setDatoPago((String) row.get("bank_reference"));
			acreencia.setCurrency(Integer.parseInt(row.get("currency").toString()));
			acreencia.setState(Integer.valueOf( row.get("register_status").toString() ));
			acreencia.setCodigoTipoServicio((String) row.get("collect_concept_bank"));
			acreencia.setDebtAmount((BigDecimal)row.get("debt_amount"));
			acreencia.setExpirationDate(expirationDate);
			banksReferences.add(acreencia);
		}
		return banksReferences;

	}

}
