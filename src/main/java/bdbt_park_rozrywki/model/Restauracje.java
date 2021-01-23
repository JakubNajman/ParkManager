package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Restauracje {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NUMER_RESTAURACJI")
	private BigDecimal numerRestauracji;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NAZWA_RESTAURACJI")
	private String nazwaRestauracji;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.ILOSC_MIEJSC")
	private BigDecimal iloscMiejsc;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.STYL_KUCHNI")
	private String stylKuchni;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.DOSTEPNOSC_ALKOHOLU")
	private String dostepnoscAlkoholu;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.DATA_KONTROLI")
	private String dataKontroli;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NUMER_PARKU")
	private BigDecimal numerParku;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NUMER_RESTAURACJI")
	public BigDecimal getNumerRestauracji() {
		return numerRestauracji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NUMER_RESTAURACJI")
	public void setNumerRestauracji(BigDecimal numerRestauracji) {
		this.numerRestauracji = numerRestauracji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NAZWA_RESTAURACJI")
	public String getNazwaRestauracji() {
		return nazwaRestauracji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NAZWA_RESTAURACJI")
	public void setNazwaRestauracji(String nazwaRestauracji) {
		this.nazwaRestauracji = nazwaRestauracji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.ILOSC_MIEJSC")
	public BigDecimal getIloscMiejsc() {
		return iloscMiejsc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.ILOSC_MIEJSC")
	public void setIloscMiejsc(BigDecimal iloscMiejsc) {
		this.iloscMiejsc = iloscMiejsc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.STYL_KUCHNI")
	public String getStylKuchni() {
		return stylKuchni;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.STYL_KUCHNI")
	public void setStylKuchni(String stylKuchni) {
		this.stylKuchni = stylKuchni;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.DOSTEPNOSC_ALKOHOLU")
	public String getDostepnoscAlkoholu() {
		return dostepnoscAlkoholu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.DOSTEPNOSC_ALKOHOLU")
	public void setDostepnoscAlkoholu(String dostepnoscAlkoholu) {
		this.dostepnoscAlkoholu = dostepnoscAlkoholu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.DATA_KONTROLI")
	public String getDataKontroli() {
		return dataKontroli;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.DATA_KONTROLI")
	public void setDataKontroli(String dataKontroli) {
		this.dataKontroli = dataKontroli;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NUMER_PARKU")
	public BigDecimal getNumerParku() {
		return numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:17:35.2122437+01:00", comments = "Source field: RESTAURACJE.NUMER_PARKU")
	public void setNumerParku(BigDecimal numerParku) {
		this.numerParku = numerParku;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties).append("data_kontroli,/'" + getDataKontroli().toString() + "',/")
				.append("dostepnosc_alkoholu,/'" + getDostepnoscAlkoholu().toString() + "',/")
				.append("ilosc_miejsc,/'" + getIloscMiejsc().toString() + "',/")
				.append("nazwa_restauracji,/'" + getNazwaRestauracji().toString() + "',/")
				.append("numer_parku,/'" + getNumerParku().toString() + "',/")
				.append("numer_restauracji,/'" + getNumerRestauracji().toString() + "',/")
				.append("styl_kuchni/'" + getStylKuchni().toString() + "'").toString();
		return properties;
	}

	public String toQuery() {
		return "RESTAURACJE";
	}

}