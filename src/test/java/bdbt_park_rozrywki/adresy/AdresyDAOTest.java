package bdbt_park_rozrywki.adresy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

class AdresyDAOTest {
	
	private AdresyDAO adresyDAO;
	
	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		adresyDAO = new AdresyDAO(new JdbcTemplate(dataSource));
		
	}

	@Test
	void testList() {
		
		List<Adresy> listAdresy = adresyDAO.list();
		//System.out.print(listAdresy);
		assertTrue(!listAdresy.isEmpty());
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testGetByNr_Adresu() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteByNr_Adresu() {
		fail("Not yet implemented");
	}

}
