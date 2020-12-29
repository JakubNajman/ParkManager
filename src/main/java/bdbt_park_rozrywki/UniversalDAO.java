/*
 * Copyright 2020 the original author - Jakub Najman.
 *
 * Dozwala się rozpowszechniać bez wiedzy autora- jednak fajnie poinformować :)
 * 
 */
package bdbt_park_rozrywki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UniversalDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static Object entity;

	private static final String QUERY_BEG = "SELECT * FROM";
	private static final String QUERY_INSERT = "INSERT INTO";

	/* Konstruktor. */
	@SuppressWarnings("static-access")
	public UniversalDAO(JdbcTemplate jdbcTemplate, Object entity) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.entity = entity;
	}

	/* Inicjalizator przechowywania danych. */
	@SuppressWarnings("unchecked")
	public List<Object> list() {
		String query = "SELECT * FROM ";
		query = new StringBuilder(query).append(entity.getClass().getSimpleName().toUpperCase()).toString();
		List<Object> list = listInitializer(query);
		return list;
	}

	/* Metody pomocnicze */

	@SuppressWarnings("unchecked")
	public List<Object> listInitializer(String query) {
		return (List<Object>) jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(entity.getClass()));
	}

	public String[] propertiesToArray(Object entity) {
		String propertiesString = entity.toString();
		String str[] = propertiesString.split("/");
		List<String> properties = new ArrayList<String>();
		properties = Arrays.asList(str);
		return str;
	}

	/* (C)reate */
	@SuppressWarnings("unchecked")
	public void save(Object entity) {
		String[] par = propertiesToArray(entity);

		String queryColumns = QUERY_INSERT + " " + entity.getClass().getSimpleName().toUpperCase() + " ";
		for (int i = 0; i < par.length; i += 2) {
			if (i == 0)
				queryColumns = new StringBuilder(queryColumns).append("(").toString();
			queryColumns = new StringBuilder(queryColumns).append(par[i] + " ").toString().toUpperCase();
		}
		queryColumns = new StringBuilder(queryColumns).append(")").toString();
		String queryValues = " VALUES ";
		for (int i = 1; i < par.length; i += 2) {
			if (i == 1)
				queryValues = new StringBuilder(queryValues).append("(").toString();

			queryValues = new StringBuilder(queryValues).append(par[i] + " ").toString();
		}
		queryValues = new StringBuilder(queryValues).append(")").toString();

		String query = queryColumns + queryValues;

		jdbcTemplate.execute(query);
	}

	/* (R)ead */
	public List<Object> getByField(String fieldName, String fieldValue) {
		String query = QUERY_BEG;
		query = new StringBuilder(query).append(entity.getClass().getSimpleName().toUpperCase()).append(" WHERE ")
				.append(fieldName + "=" + fieldValue).toString();
		List<Object> record = listInitializer(query);
		return record;
	}

	/* (U)pdate */
	public void update(Object object) {

	}

	/* (D)elete */
	public void deleteByField(String fieldName, String fieldValue) {

	}

}
