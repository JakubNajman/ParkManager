package bdbt_park_rozrywki;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bdbt_park_rozrywki.adresy.Adresy;
import bdbt_park_rozrywki.model.Atrakcje;
import bdbt_park_rozrywki.model.Cenniki;
import bdbt_park_rozrywki.model.Kolejki;
import bdbt_park_rozrywki.model.Kucharze;
import bdbt_park_rozrywki.model.Obsluga;
import bdbt_park_rozrywki.model.Pracownicy;
import bdbt_park_rozrywki.model.Restauracje;
import bdbt_park_rozrywki.model.Samochodziki;
import bdbt_park_rozrywki.model.Stanowiska;
import bdbt_park_rozrywki.model.Technicy;

@Controller
public class AppController {

	String temp;

	@Autowired
	private UniversalDAO dao;

	@RequestMapping("/")
	public String viewTablesPage(Model model) {
		return ("tabele");
	}

	@GetMapping("/userView")
	public String userView() {
		return "tabele_user";
	}

/////////ADRESY////////////
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

	@RequestMapping(value = "/updateAdresy/{nr_adresu}")
	public ModelAndView showEditAdresyForm(@PathVariable(name = "nr_adresu") int id) {
		ModelAndView mav = new ModelAndView("update_Adresy");
		String nr_adresu = String.valueOf(id);
		System.out.println(nr_adresu);
		Adresy adresy = (Adresy) dao.getByField(new Adresy(), "nr_adresu", nr_adresu).get(0);
		temp = nr_adresu;
		mav.addObject("adresy", adresy);

		return mav;
	}

	@RequestMapping(value = "/updateAdresy", method = RequestMethod.POST)
	public String updateAdresy(@ModelAttribute("adresy") Adresy adresy) {
		dao.update(adresy, "NR_ADRESU", temp, "KOD_POCZTOWY", adresy.getKod_pocztowy().toString(), "MIASTO",
				adresy.getMiasto(), "NR_LOKALU", adresy.getNr_lokalu(), "ULICA", adresy.getUlica());
		return "redirect:/index_Adresy";
	}

////////ATRAKCJE//////////
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

	@RequestMapping(value = "/updateAtrakcje/{numer_atrakcji}")
	public ModelAndView showEditAtrakcjeForm(@PathVariable(name = "numer_atrakcji") int id) {
		ModelAndView mav = new ModelAndView("update_Atrakcje");
		String numer_atrakcji = String.valueOf(id);
		Atrakcje atrakcje = (Atrakcje) dao.getByField(new Atrakcje(), "numer_atrakcji", numer_atrakcji).get(0);
		temp = numer_atrakcji;
		mav.addObject("atrakcje", atrakcje);

		return mav;
	}

	@RequestMapping(value = "/updateAtrakcje", method = RequestMethod.POST)
	public String updateAtrakcje(@ModelAttribute("atrakcje") Atrakcje atrakcje) {
		dao.update(atrakcje, "NUMER_ATRAKCJI", temp, "DATA_KONSERWACJI", atrakcje.getDataKonserwacji(),
				"GODZINA_ZAMKNIECIA", atrakcje.getGodzinaZamkniecia(), "GODZINA_OTWARCIA",
				atrakcje.getGodzinaOtwarcia());
		return "redirect:/index_Atrakcje";
	}

////////CENNIKI///////////
	@RequestMapping("/index_Cenniki")
	public String viewCennikiPage(Model model) {
		List<Object> listCenniki = dao.list(new Cenniki());
		model.addAttribute("listCenniki", listCenniki);
		return "index_Cenniki";
	}

	@RequestMapping("/add_Cenniki")
	public String newCenniki(Model model) {
		Cenniki cenniki = new Cenniki();
		model.addAttribute("cenniki", cenniki);
		return "add_Cenniki";
	}

	@RequestMapping(value = "/saveCenniki", method = RequestMethod.POST)
	public String saveCenniki(@ModelAttribute("cenniki") Cenniki cenniki) {
		dao.save(cenniki);
		return "redirect:/index_Cenniki";
	}

	@RequestMapping(value = "/deleteCenniki/{nr_cennika}")
	public String deleteCenniki(@PathVariable(name = "nr_cennika") int id) {
		Cenniki cenniki = new Cenniki();
		String nr_cennika = String.valueOf(id);
		dao.deleteByField(cenniki, "nr_cennika", nr_cennika);
		return "redirect:/index_Cenniki";
	}

	@RequestMapping(value = "/updateCenniki/{nr_cennika}")
	public ModelAndView showEditCennikiForm(@PathVariable(name = "nr_cennika") int id) {
		ModelAndView mav = new ModelAndView("update_Cenniki");
		String nr_cennika = String.valueOf(id);
		Cenniki cenniki = (Cenniki) dao.getByField(new Cenniki(), "nr_cennika", nr_cennika).get(0);
		temp = nr_cennika;
		mav.addObject("cenniki", cenniki);

		return mav;
	}

	@RequestMapping(value = "/updateCenniki", method = RequestMethod.POST)
	public String updateCenniki(@ModelAttribute("cenniki") Cenniki cenniki) {
		dao.update(cenniki, "NR_CENNIKA", temp, "CENA_PODSTAWOWA", cenniki.getCenaPodstawowa().toString(),
				"CENA_ZE_ZNIKA", cenniki.getCenaZeZnizka().toString());
		return "redirect:/index_Cenniki";
	}

	/////////// KOLEJKI//////////

	@RequestMapping("/index_Kolejki")
	public String viewKolejkiPage(Model model) {
		List<Object> listKolejki = dao.list(new Kolejki());
		model.addAttribute("listKolejki", listKolejki);
		return "index_Kolejki";
	}

	@RequestMapping("/add_Kolejki")
	public String newlistKolejki(Model model) {
		Kolejki kolejki = new Kolejki();
		model.addAttribute("kolejki", kolejki);
		return "add_Kolejki";
	}

	@RequestMapping(value = "/saveKolejki", method = RequestMethod.POST)
	public String saveKolejki(@ModelAttribute("kolejki") Kolejki kolejki) {
		dao.save(kolejki);
		return "redirect:/index_Kolejki";
	}

	@RequestMapping(value = "/deleteKolejki/{numer_atrakcji}")
	public String deleteKolejki(@PathVariable(name = "numer_atrakcji") int id) {
		Kolejki kolejki = new Kolejki();
		String numer_atrakcji = String.valueOf(id);
		dao.deleteByField(kolejki, "numer_atrakcji", numer_atrakcji);
		return "redirect:/index_Kolejki";
	}

	@RequestMapping(value = "/updateKolejki/{numer_atrakcji}")
	public ModelAndView showEditKolejkiForm(@PathVariable(name = "numer_atrakcji") int id) {
		ModelAndView mav = new ModelAndView("update_Kolejki");
		String numer_atrakcji = String.valueOf(id);
		Kolejki kolejki = (Kolejki) dao.getByField(new Kolejki(), "numer_atrakcji", numer_atrakcji).get(0);
		temp = numer_atrakcji;
		mav.addObject("kolejki", kolejki);

		return mav;
	}

	@RequestMapping(value = "/updateKolejki", method = RequestMethod.POST)
	public String updateKolejki(@ModelAttribute("kolejki") Kolejki kolejki) {
		dao.update(kolejki, "NUMER_ATRAKCJI", temp, "CENA_PRZEJAZDU", kolejki.getCenaPrzejazdu().toString(),
				"CZY_DZIECI", kolejki.getCzyDzieci(), "ILOSC_WAGONIKOW", kolejki.getIloscWagonikow().toString());
		return "redirect:/index_Kolejki";
	}

	/////////// Samochodziki//////////

	@RequestMapping("/index_Samochodziki")
	public String viewSamochodzikiPage(Model model) {
		List<Object> listSamochodziki = dao.list(new Samochodziki());
		model.addAttribute("listSamochodziki", listSamochodziki);
		return "index_Samochodziki";
	}

	@RequestMapping("/add_Samochodziki")
	public String newlistSamochodziki(Model model) {
		Samochodziki samochodziki = new Samochodziki();
		model.addAttribute("samochodziki", samochodziki);
		return "add_Samochodziki";
	}

	@RequestMapping(value = "/saveSamochodziki", method = RequestMethod.POST)
	public String saveSamochodziki(@ModelAttribute("samochodziki") Samochodziki samochodziki) {
		dao.save(samochodziki);
		return "redirect:/index_Samochodziki";
	}

	@RequestMapping(value = "/deleteSamochodziki/{numer_atrakcji}")
	public String deleteSamochodziki(@PathVariable(name = "numer_atrakcji") int id) {
		Samochodziki samochodziki = new Samochodziki();
		String numer_atrakcji = String.valueOf(id);
		dao.deleteByField(samochodziki, "numer_atrakcji", numer_atrakcji);
		return "redirect:/index_Samochodziki";
	}

	@RequestMapping(value = "/updateSamochodziki/{numer_atrakcji}")
	public ModelAndView showEditSamochodzikiForm(@PathVariable(name = "numer_atrakcji") int id) {
		ModelAndView mav = new ModelAndView("update_Samochodziki");
		String numer_atrakcji = String.valueOf(id);
		Samochodziki samochodziki = (Samochodziki) dao.getByField(new Samochodziki(), "numer_atrakcji", numer_atrakcji)
				.get(0);
		temp = numer_atrakcji;
		mav.addObject("samochodziki", samochodziki);

		return mav;
	}

	@RequestMapping(value = "/updateSamochodziki", method = RequestMethod.POST)
	public String updateSamochodziki(@ModelAttribute("kolejki") Samochodziki samochodziki) {
		dao.update(samochodziki, "NUMER_ATRAKCJI", temp, "CZAS_JAZDY", samochodziki.getCzasJazdy().toString(),
				"ILOSC_SAMOCHODZIKOW", samochodziki.getIloscSamochodzikow().toString(), "ROZMIAR_TORU",
				samochodziki.getRozmiarToru().toString());
		return "redirect:/index_Samochodziki";
	}

	/////////// Pracownicy//////////

	@RequestMapping("/index_Pracownicy")
	public String viewPracownicyPage(Model model) {
		List<Object> listPracownicy = dao.list(new Pracownicy());
		model.addAttribute("listPracownicy", listPracownicy);
		return "index_Pracownicy";
	}

	@RequestMapping("/add_Pracownicy")
	public String newlistPracownicy(Model model) {
		Pracownicy pracownicy = new Pracownicy();
		model.addAttribute("pracownicy", pracownicy);
		return "add_Pracownicy";
	}

	@RequestMapping(value = "/savePracownicy", method = RequestMethod.POST)
	public String savePracownicy(@ModelAttribute("pracownicy") Pracownicy pracownicy) {
		dao.save(pracownicy);
		return "redirect:/index_Pracownicy";
	}

	@RequestMapping(value = "/deletePracownicy/{numer_pracownika}")
	public String deletePracownicy(@PathVariable(name = "numer_pracownika") int id) {
		Pracownicy pracownicy = new Pracownicy();
		String numer_pracownika = String.valueOf(id);
		dao.deleteByField(pracownicy, "numer_pracownika", numer_pracownika);
		return "redirect:/index_Pracownicy";
	}

	@RequestMapping(value = "/updatePracownicy/{numer_pracownika}")
	public ModelAndView showEditPracownicyForm(@PathVariable(name = "numer_pracownika") int id) {
		ModelAndView mav = new ModelAndView("update_Pracownika");
		String numer_pracownika = String.valueOf(id);
		Pracownicy pracownicy = (Pracownicy) dao.getByField(new Pracownicy(), "numer_pracownika", numer_pracownika)
				.get(0);
		temp = numer_pracownika;
		mav.addObject("pracownicy", pracownicy);

		return mav;
	}

	@RequestMapping(value = "/updatePracownicy", method = RequestMethod.POST)
	public String updatePracownicy(@ModelAttribute("kolejki") Pracownicy pracownicy) {
		dao.deleteByField(pracownicy, "NUMER_PRACOWNIKA", temp);
		dao.save(pracownicy);
		// dao.update(pracownicy, "NUMER_PRACOWNIKA", temp,
		// pracownicy.getDataUrodzenia(), pracownicy.get);
		return "redirect:/index_Samochodziki";
	}

	/////////// RESTAURACJE//////////

	@RequestMapping("/index_Restauracje")
	public String viewRestauracjePage(Model model) {
		List<Object> listRestauracje = dao.list(new Restauracje());
		model.addAttribute("listRestauracje", listRestauracje);
		return "index_Restauracje";
	}

	@RequestMapping("/add_Restauracje")
	public String newlistRestauracje(Model model) {
		Restauracje restauracje = new Restauracje();
		model.addAttribute("restauracje", restauracje);
		return "add_Restauracje";
	}

	@RequestMapping(value = "/saveRestauracje", method = RequestMethod.POST)
	public String saveRestauracje(@ModelAttribute("restauracje") Restauracje restauracje) {
		dao.save(restauracje);
		return "redirect:/index_Restauracje";
	}

	@RequestMapping(value = "/deleteRestauracje/{numer_restauracji}")
	public String deleteRestauracje(@PathVariable(name = "numer_restauracji") int id) {
		Restauracje restauracje = new Restauracje();
		String numer_restauracji = String.valueOf(id);
		dao.deleteByField(restauracje, "numer_restauracji", numer_restauracji);
		return "redirect:/index_Restauracje";
	}

	@RequestMapping(value = "/updateRestauracje/{numer_restauracji}")
	public ModelAndView showEditRestauracjeForm(@PathVariable(name = "numer_restauracji") int id) {
		ModelAndView mav = new ModelAndView("update_Restauracje");
		String numer_restauracji = String.valueOf(id);
		Restauracje restauracje = (Restauracje) dao
				.getByField(new Restauracje(), "numer_restauracji", numer_restauracji).get(0);
		temp = numer_restauracji;
		mav.addObject("restauracje", restauracje);

		return mav;
	}

	@RequestMapping(value = "/updateRestauracje", method = RequestMethod.POST)
	public String updateRestauracje(@ModelAttribute("restauracje") Restauracje restauracje) {
		dao.update(restauracje, "NUMER_RESTAURACJI", temp, "DATA_KONTROLI", restauracje.getDataKontroli(),
				"DOSTEPNOSC_ALKOHOLU", restauracje.getDostepnoscAlkoholu(), "ILOSC_MIEJSC",
				restauracje.getIloscMiejsc().toString(), "NAZWA_RESTAURACJI", restauracje.getNazwaRestauracji(),
				"STYLE_KUCHNI", restauracje.getStylKuchni());
		;
		return "redirect:/index_Samochodziki";
	}

	/////////// KUCHARZE//////////

	@RequestMapping("/index_Kucharze")
	public String viewKucharzePage(Model model) {
		List<Object> listKucharze = dao.list(new Kucharze());
		model.addAttribute("listKucharze", listKucharze);
		return "index_Kucharze";
	}

	@RequestMapping("/add_Kucharze")
	public String newlistKucharze(Model model) {
		Kucharze kucharze = new Kucharze();
		model.addAttribute("kucharze", kucharze);
		return "add_Kucharze";
	}

	@RequestMapping(value = "/saveKucharze", method = RequestMethod.POST)
	public String saveRestauracje(@ModelAttribute("kucharze") Kucharze kucharze) {
		dao.save(kucharze);
		return "redirect:/index_Kucharze";
	}

	@RequestMapping(value = "/deleteKucharze/{numer_pracownika}")
	public String deleteKucharze(@PathVariable(name = "numer_pracownika") int id) {
		Kucharze kucharze = new Kucharze();
		String numer_pracownika = String.valueOf(id);
		dao.deleteByField(kucharze, "numer_pracownika", numer_pracownika);
		return "redirect:/index_Kucharze";
	}

	@RequestMapping(value = "/updateKucharze/{numer_pracownika}")
	public ModelAndView showEditKucharzeForm(@PathVariable(name = "numer_pracownika") int id) {
		ModelAndView mav = new ModelAndView("update_Kucharze");
		String numer_pracownika = String.valueOf(id);
		Kucharze kucharze = (Kucharze) dao.getByField(new Kucharze(), "numer_pracownika", numer_pracownika).get(0);
		temp = numer_pracownika;
		mav.addObject("kucharze", kucharze);

		return mav;
	}

	@RequestMapping(value = "/updateKucharze", method = RequestMethod.POST)
	public String updateKucharze(@ModelAttribute("kucharze") Kucharze kucharze) {
		dao.update(kucharze, "NUMER_PRACOWNIKA", temp, "STOPIEN_KUCHARZA", kucharze.getStopienKucharza().toString());
		;
		return "redirect:/index_Kucharze";
	}

	/////////// OBSLUGA//////////

	@RequestMapping("/index_Obsluga")
	public String viewObslugaPage(Model model) {
		List<Object> listObsluga = dao.list(new Obsluga());
		model.addAttribute("listObsluga", listObsluga);
		return "index_Obsluga";
	}

	@RequestMapping("/add_Obsluga")
	public String newlistObsluga(Model model) {
		Obsluga obsluga = new Obsluga();
		model.addAttribute("obsluga", obsluga);
		return "add_obsluga";
	}

	@RequestMapping(value = "/saveObsluga", method = RequestMethod.POST)
	public String saveObsluga(@ModelAttribute("obsluga") Obsluga obsluga) {
		dao.save(obsluga);
		return "redirect:/index_Obsluga";
	}

	@RequestMapping(value = "/deleteObsluga/{numer_pracownika}")
	public String deleteObsluga(@PathVariable(name = "numer_pracownika") int id) {
		Obsluga obsluga = new Obsluga();
		String numer_pracownika = String.valueOf(id);
		dao.deleteByField(obsluga, "numer_pracownika", numer_pracownika);
		return "redirect:/index_Obsluga";
	}

	@RequestMapping(value = "/updateObsluga/{numer_pracownika}")
	public ModelAndView showEditObslugaForm(@PathVariable(name = "numer_pracownika") int id) {
		ModelAndView mav = new ModelAndView("update_Kucharze");
		String numer_pracownika = String.valueOf(id);
		Obsluga obsluga = (Obsluga) dao.getByField(new Obsluga(), "numer_pracownika", numer_pracownika).get(0);
		temp = numer_pracownika;
		mav.addObject("obsluga", obsluga);

		return mav;
	}

	@RequestMapping(value = "/updateObsluga", method = RequestMethod.POST)
	public String updateObsluga(@ModelAttribute("obsluga") Obsluga obsluga) {
		System.out.println(obsluga);
		dao.update(obsluga, "NUMER_PRACOWNIKA", temp, "SEKCJA_OBSLUGI", obsluga.getSekcjaObslugi(), "SPECJALNY_DOSTEP",
				obsluga.getSpecjalnyDostep().toString());
		;
		return "redirect:/index_Obsluga";
	}

	/////////// Technicy//////////

	@RequestMapping("/index_Technicy")
	public String viewTechnicyPage(Model model) {
		List<Object> listTechnicy = dao.list(new Technicy());
		model.addAttribute("listTechnicy", listTechnicy);
		return "index_Technicy";
	}

	@RequestMapping("/add_Technicy")
	public String newlistTechincy(Model model) {
		Technicy technicy = new Technicy();
		model.addAttribute("technicy", technicy);
		return "add_Technicy";
	}

	@RequestMapping(value = "/saveTechnicy", method = RequestMethod.POST)
	public String saveTechnicy(@ModelAttribute("technicy") Technicy technicy) {
		dao.save(technicy);
		return "redirect:/index_Technicy";
	}

	@RequestMapping(value = "/deleteTechnicy/{numer_pracownika}")
	public String deleteTechnicy(@PathVariable(name = "numer_pracownika") int id) {
		Technicy technicy = new Technicy();
		String numer_pracownika = String.valueOf(id);
		dao.deleteByField(technicy, "numer_pracownika", numer_pracownika);
		return "redirect:/index_Technicy";
	}

	@RequestMapping(value = "/updateTechnicy/{numer_pracownika}")
	public ModelAndView showEditTechnicyForm(@PathVariable(name = "numer_pracownika") int id) {
		ModelAndView mav = new ModelAndView("update_Technicy");
		String numer_pracownika = String.valueOf(id);
		Technicy technicy = (Technicy) dao.getByField(new Technicy(), "numer_pracownika", numer_pracownika).get(0);
		temp = numer_pracownika;
		mav.addObject("technicy", technicy);

		return mav;
	}

	@RequestMapping(value = "/updateTechnicy", method = RequestMethod.POST)
	public String updateTechnicy(@ModelAttribute("technicy") Technicy technicy) {
		System.out.println(technicy);
		dao.update(technicy, "NUMER_PRACOWNIKA", temp, "NUMER_POZWOLENIA", technicy.getNumerPozwolenia(),
				"WYKSZTALCENIE_TECHNICZNE", technicy.getWyksztalcenieTechniczne());
		;
		return "redirect:/index_Technicy";
	}

	/////////// Stanowiska//////////

	@RequestMapping("/index_Stanowiska")
	public String viewStanowiskaPage(Model model) {
		List<Object> listStanowiska = dao.list(new Stanowiska());
		model.addAttribute("listStanowiska", listStanowiska);
		return "index_Stanowiska";
	}

	@RequestMapping("/add_Stanowiska")
	public String newlistStanowiska(Model model) {
		Stanowiska stanowiska = new Stanowiska();
		model.addAttribute("stanowiska", stanowiska);
		return "add_Stanowiska";
	}

	@RequestMapping(value = "/saveStanowiska", method = RequestMethod.POST)
	public String saveStanowiska(@ModelAttribute("stanowiska") Stanowiska stanowiska) {
		dao.save(stanowiska);
		return "redirect:/index_Stanowiska";
	}

	@RequestMapping(value = "/deleteStanowiska/{nr_stanowiska}")
	public String deleteTechniy(@PathVariable(name = "nr_stanowiska") int id) {
		Stanowiska stanowiska = new Stanowiska();
		String nr_stanowiska = String.valueOf(id);
		dao.deleteByField(stanowiska, "nr_stanowiska", nr_stanowiska);
		return "redirect:/index_Stanowiska";
	}

	@RequestMapping(value = "/updateStanowiska/{nr_stanowiska}")
	public ModelAndView showEditStanowiskaForm(@PathVariable(name = "nr_stanowiska") int id) {
		ModelAndView mav = new ModelAndView("update_Stanowiska");
		String nr_stanowiska = String.valueOf(id);
		Stanowiska stanowiska = (Stanowiska) dao.getByField(new Stanowiska(), "nr_stanowiska", nr_stanowiska).get(0);
		temp = nr_stanowiska;
		mav.addObject("stanowiska", stanowiska);

		return mav;
	}

	@RequestMapping(value = "/updateStanowiska", method = RequestMethod.POST)
	public String updateStanowiska(@ModelAttribute("stanowiska") Stanowiska stanowiska) {
		System.out.println(stanowiska);
		dao.update(stanowiska, "NR_STANOWISKA", temp, "NAZWA", stanowiska.getNazwa(), "OPIS", stanowiska.getOpis());
		;
		return "redirect:/index_Stanowiska";
	}

}
