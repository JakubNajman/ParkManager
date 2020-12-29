package bdbt_park_rozrywki.adresy;

import java.util.ArrayList;
import java.util.List;

public class Adresy {

	private int nr_adresu;
	private String miasto;
	private String ulica;
	private String nr_lokalu;
	private int kod_pocztowy;

	/* Konstruktory */
	public Adresy() {
		super();
	}

	public Adresy(int nr_adresu, String miasto, String ulica, String nr_lokalu, int kod_pocztowy) {
		super();
		this.nr_adresu = nr_adresu;
		this.miasto = miasto;
		this.ulica = ulica;
		this.nr_lokalu = nr_lokalu;
		this.kod_pocztowy = kod_pocztowy;
	}

	/* Getery i setery */

	public List<String> getProperties() {
		List<String> properties = new ArrayList<>();
		properties.add(getNr_adresu().toString());
		properties.add(getMiasto().toString());
		properties.add(getUlica().toString());
		properties.add(getNr_lokalu().toString());
		properties.add(getKod_pocztowy().toString());
		return properties;
	}

	public Integer getNr_adresu() {
		return nr_adresu;
	}

	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNr_lokalu() {
		return nr_lokalu;
	}

	public void setNr_lokalu(String nr_lokalu) {
		this.nr_lokalu = nr_lokalu;
	}

	public Integer getKod_pocztowy() {
		return kod_pocztowy;
	}

	public void setKod_pocztowy(int kod_pocztowy) {
		this.kod_pocztowy = kod_pocztowy;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties).append("nr_adresu,/'" + getNr_adresu().toString() + "',/")
				.append("miasto,/'" + getMiasto().toString() + "',/").append("ulica,/'" + getUlica().toString() + "',/")
				.append("nr_lokalu,/'" + getNr_lokalu().toString() + "',/")
				.append("kod_pocztowy/'" + getKod_pocztowy().toString() + "'").toString();
		return properties;
	}

	public String toQuery() {
		return "ADRESY";
	}

}
