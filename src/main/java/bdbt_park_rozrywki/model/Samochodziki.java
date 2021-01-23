package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Samochodziki {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.NUMER_ATRAKCJI")
	private BigDecimal numerAtrakcji;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.CZAS_JAZDY")
	private BigDecimal czasJazdy;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.ILOSC_SAMOCHODZIKOW")
	private BigDecimal iloscSamochodzikow;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.ROZMIAR_TORU")
	private BigDecimal rozmiarToru;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.NUMER_ATRAKCJI")
	public BigDecimal getNumerAtrakcji() {
		return numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.NUMER_ATRAKCJI")
	public void setNumerAtrakcji(BigDecimal numerAtrakcji) {
		this.numerAtrakcji = numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.CZAS_JAZDY")
	public BigDecimal getCzasJazdy() {
		return czasJazdy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.CZAS_JAZDY")
	public void setCzasJazdy(BigDecimal czasJazdy) {
		this.czasJazdy = czasJazdy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.ILOSC_SAMOCHODZIKOW")
	public BigDecimal getIloscSamochodzikow() {
		return iloscSamochodzikow;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.ILOSC_SAMOCHODZIKOW")
	public void setIloscSamochodzikow(BigDecimal iloscSamochodzikow) {
		this.iloscSamochodzikow = iloscSamochodzikow;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8319932+01:00", comments = "Source field: SAMOCHODZIKI.ROZMIAR_TORU")
	public BigDecimal getRozmiarToru() {
		return rozmiarToru;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: SAMOCHODZIKI.ROZMIAR_TORU")
	public void setRozmiarToru(BigDecimal rozmiarToru) {
		this.rozmiarToru = rozmiarToru;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties).append("czas_Jazdy,/'" + getCzasJazdy().toString() + "',/")
				.append("ilosc_Samochodzikow,/'" + getIloscSamochodzikow().toString() + "',/")
				.append("numer_Atrakcji,/'" + getNumerAtrakcji().toString() + "',/")
				.append("rozmiar_Toru/'" + getRozmiarToru().toString() + "'").toString();

		return properties;
	}

	public String toQuery() {
		return "SAMOCHODZIKI";
	}
}