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

	@Autowired(required = true)
	private JdbcTemplate jdbcTemplate;
//	@Qualifier("universalDAO")
//	private Object entity;

	private static final String QUERY_BEG = "SELECT * FROM";
	private static final String QUERY_INSERT = "INSERT INTO ";
	private static final String QUERY_VALUES = " VALUES ";
	private static final String QUERY_DELETE = "DELETE FROM ";
	private static final String QUERY_UPDATE = "UPDATE ";
	private static final String QUERY_SET = " SET ";
	private static final String QUERY_WHERE = " WHERE ";

	/* Konstruktor. */
//	@SuppressWarnings("static-access")

	public UniversalDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		// this.entity = entity;
	}

	/* Inicjalizator przechowywania danych. */
//	@SuppressWarnings("unchecked")
	public List<Object> list(Object entity) {
		String query = "SELECT * FROM ";
		query = new StringBuilder(query).append(entity.getClass().getSimpleName().toUpperCase()).toString();
		List<Object> list = listInitializer(entity, query);
		return list;
	}

	/* Metody pomocnicze */
	@SuppressWarnings("unchecked")
	public List<Object> listInitializer(Object entity, String query) {
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
//	@SuppressWarnings("unchecked")
	public void save(Object entity) {
		String[] par = propertiesToArray(entity);

		String queryColumns = QUERY_INSERT + entity.getClass().getSimpleName().toUpperCase() + " ";
		for (int i = 0; i < par.length; i += 2) {
			if (i == 0)
				queryColumns = new StringBuilder(queryColumns).append("(").toString();
			queryColumns = new StringBuilder(queryColumns).append(par[i] + " ").toString().toUpperCase();
		}
		queryColumns = new StringBuilder(queryColumns).append(")").toString();
		String queryValues = QUERY_VALUES;
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
	public List<Object> getByField(Object entity, String fieldName, String fieldValue) {
		String query = QUERY_BEG;
		query = new StringBuilder(query).append(entity.getClass().getSimpleName().toUpperCase()).append(" WHERE ")
				.append(fieldName + "=" + fieldValue).toString();
		List<Object> record = listInitializer(entity, query);
		return record;
	}

	/* (U)pdate */
	public void update(Object entity, String fieldConditionName, String fieldCondtitonValue,
			String... fieldNameAndFieldValues) {
		if (fieldNameAndFieldValues.length % 2 == 0)
			try {
				String query = QUERY_UPDATE;
				query = new StringBuilder(query).append(entity.getClass().getSimpleName().toUpperCase())
						.append(QUERY_SET).toString();
				for (int i = 0; i < fieldNameAndFieldValues.length; i++) {
					if (i % 2 == 0) {
						query = new StringBuilder(query).append(fieldNameAndFieldValues[i] + " = ").toString();
					} else if (i == fieldNameAndFieldValues.length - 1) {
						query = new StringBuilder(query).append("'" + fieldNameAndFieldValues[i] + "'").toString();
					} else if (i % 2 == 1 && i != fieldNameAndFieldValues.length - 1)
						query = new StringBuilder(query).append("'" + fieldNameAndFieldValues[i] + "', ").toString();
				}
				query = new StringBuilder(query).append(QUERY_WHERE)
						.append(fieldConditionName + " = '" + fieldCondtitonValue + "'").toString();
				try {
					jdbcTemplate.execute(query);
				} catch (Exception e) {
					System.out.println("Coś poszło nie tak. Wiadomość od JDBC: \n");
					System.out.println(e.getMessage());
				}

			} catch (Exception e) {
				System.out.println("Coś poszło nie tak. \n");
				System.out.println(e.getMessage());
			}
		else
			System.out.println("Żadne dane nie zostały podane lub podałeś nieparzystą ilość danych.\n "
					+ "Przeczytaj jeszcze raz dokumentację.");
	}

	/* (D)elete */
	public void deleteByField(Object entity, String fieldName, String fieldValue) {
		if (!fieldValue.isEmpty() && !fieldName.isEmpty())
			try {
				String query = QUERY_DELETE;
				query = new StringBuilder(query).append(entity.getClass().getSimpleName().toUpperCase())
						.append(QUERY_WHERE).append(fieldName + " = '" + fieldValue + "'").toString();
				jdbcTemplate.execute(query);
			} catch (Exception e) {
				System.out.println("Coś poszło nie tak. Wiadomość JDBC:");
				System.out.println(e.getMessage());
			}
		else
			System.out.println("Żadne dane nie zostały podane .\n " + "Przeczytaj jeszcze raz dokumentację.");
	}

}
