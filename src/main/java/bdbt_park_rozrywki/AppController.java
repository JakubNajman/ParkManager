package bdbt_park_rozrywki;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bdbt_park_rozrywki.adresy.Adresy;

@Controller
public class AppController {

	@SuppressWarnings("rawtypes")
	@Autowired
	private UniversalDAO uDAO;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		UniversalDAO uDAO = new UniversalDAO(new JdbcTemplate(), new Adresy());
		@SuppressWarnings("unchecked")
		List<Object> listAdresy = uDAO.list();
		model.addAttribute("listAdresy", listAdresy);
		return "index_Adresy";
	}

}
