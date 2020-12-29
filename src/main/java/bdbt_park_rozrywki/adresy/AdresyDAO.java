package bdbt_park_rozrywki.adresy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
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
	public List<Adresy> list(){
		String query = "SELECT * FROM ADRESY";
		List<Adresy> listAdresy = jdbcTemplate.query(query, 
				BeanPropertyRowMapper.newInstance(Adresy.class));
		return listAdresy;
	}
	
	/* (C)reate */
	public void save(Adresy adres) {
		
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
