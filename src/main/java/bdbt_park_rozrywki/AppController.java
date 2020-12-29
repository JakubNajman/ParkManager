package bdbt_park_rozrywki;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bdbt_park_rozrywki.adresy.*;

@Controller
public class AppController {
	
	@Autowired
	private AdresyDAO adresyDAO;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Adresy> listAdresy = adresyDAO.list();
		model.addAttribute("listAdresy", listAdresy);
		return "index";
	}
	
}
