package bdbt_park_rozrywki.adresy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class AdresyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/* Konstruktor */
	public AdresyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* Kontener na dane */
	public List<Adresy> list() {
		String query = "SELECT * FROM ADRESY";
		List<Adresy> listAdresy = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Adresy.class));
		return listAdresy;
	}

	/* (C)reate */
	public void save(Adresy adres) {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		insert.withTableName("ADRESY").usingColumns("NR_ADRESU", "MIASTO", "ULICA", "NR_LOKALU", "KOD_POCZTOWY");

		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(adres);
		insert.execute(param);
	}

	/* (R)ead */
	public Adresy getByNr_Adresu(int nr_adresu) {
		return null;
	}

	/* (U)pdate */
	public void update(Adresy adres) {

	}

	/* (D)elete */
	public void deleteByNr_Adresu(int nr_adresu) {

	}
}
