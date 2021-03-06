package bdbt_park_rozrywki;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import bdbt_park_rozrywki.model.Pracownicy;
import bdbt_park_rozrywki.model.Restauracje;

class UniversalDAOTest {

	private UniversalDAO uDAO;

	@BeforeEach
	void setUp() throws Exception {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:oracle:thin:@127.0.0.1:1521:orcl");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");

		uDAO = new UniversalDAO(new JdbcTemplate(dataSource));
	}

	@Test
	void testUpdate() {
		uDAO.update("MIASTO", "Radom", "ULICA", "ddd");
	}

	@Test
	void testList() {
		List<Object> listPracownicy = uDAO.list(new Pracownicy());
		System.out.print(listPracownicy);

	}

	@Test
	void testGet() {
		List<Object> listCennikiList = uDAO.list(new Restauracje());
		System.out.println(listCennikiList);
	}

//	@Test
//	void testSave() {
//		Atrakcje atrakcje = new Atrakcje(1, );
//		uDAO.save(adresy1);
//	}

//	@Test
//	void testDelete() {
//		uDAO.deleteByField(new Adresy(), "MIASTO", "namimaciek");
//	}

}
