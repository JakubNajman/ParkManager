package bdbt_park_rozrywki;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import bdbt_park_rozrywki.adresy.Adresy;
import bdbt_park_rozrywki.adresy.AdresyDAO;

@Controller
public class AppController {

//	@SuppressWarnings("rawtypes")
//	@Autowired
//	private UniversalDAO uDAO;
//
//	@RequestMapping("/")
//	public String viewHomePage(Model model) {
//		UniversalDAO uDAO = new UniversalDAO(new JdbcTemplate(), new Adresy());
//		@SuppressWarnings("unchecked")
//		List<Object> listAdresy = uDAO.list();
//		model.addAttribute("listAdresy", listAdresy);
//		return "index_Adresy";
//	}

	@Autowired
	private AdresyDAO dao;

	public String viewHomePage(Model model) {
		List<Adresy> listAdresy = dao.list();
		model.addAttribute("listAdresy", listAdresy);
		return "index";
	}

}
