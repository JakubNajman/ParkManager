package bdbt_park_rozrywki;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bdbt_park_rozrywki.adresy.Adresy;

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
	private UniversalDAO dao;

	@RequestMapping("/")
	public String viewTablesPage(Model model) {
		return "tabele";
	}

	@RequestMapping("/index_Adresy")
	public String viewAdresyPage(Model model) {
		List<Object> listAdresy = dao.list(new Adresy());
		model.addAttribute("listAdresy", listAdresy);
		return "index_Adresy";
	}

	@RequestMapping("/add_Adresy")
	public String newAdresy(Model model) {
		Adresy adresy = new Adresy();
		model.addAttribute("adresy", adresy);
		return "add_Adresy";
	}

	@RequestMapping(value = "/saveAdresy", method = RequestMethod.POST)
	public String saveAdresy(@ModelAttribute("adresy") Adresy adresy) {
		dao.save(adresy);
		return "redirect:/adresy";
	}

}
