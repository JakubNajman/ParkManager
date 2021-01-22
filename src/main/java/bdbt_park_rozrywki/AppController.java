package bdbt_park_rozrywki;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bdbt_park_rozrywki.adresy.Adresy;
import bdbt_park_rozrywki.model.Atrakcje;

@Controller
public class AppController {

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
		return "redirect:/index_Adresy";
	}

	@RequestMapping(value = "/deleteAdresy/{nr_adresu}")
	public String deleteAdresy(@PathVariable(name = "nr_adresu") int id) {
		Adresy adresy = new Adresy();
		String nr_adresu = String.valueOf(id);
		dao.deleteByField(adresy, "nr_adresu", nr_adresu);
		return "redirect:/index_Adresy";
	}

	@RequestMapping("/index_Atrakcje")
	public String viewAtrakcjePage(Model model) {
		List<Object> listAtrakcje = dao.list(new Atrakcje());
		model.addAttribute("listAtrakcje", listAtrakcje);
		return "index_Atrakcje";
	}

	@RequestMapping("/add_Atrakcje")
	public String newAtrakcje(Model model) {
		Atrakcje atrakcje = new Atrakcje();
		model.addAttribute("atrakcje", atrakcje);
		return "add_Atrakcje";
	}

	@RequestMapping(value = "/saveAtrakcje", method = RequestMethod.POST)
	public String saveAtrakcje(@ModelAttribute("atrakcje") Atrakcje atrakcje) {
		dao.save(atrakcje);
		return "redirect:/index_Atrakcje";
	}

	@RequestMapping(value = "/deleteAtrakcje/{numer_atrakcji}")
	public String deleteAtrakcje(@PathVariable(name = "numer_atrakcji") int id) {
		Atrakcje atrakcje = new Atrakcje();
		String numer_atrakcji = String.valueOf(id);
		dao.deleteByField(atrakcje, "numer_atrakcji", numer_atrakcji);
		return "redirect:/index_Atrakcje";
	}

}
