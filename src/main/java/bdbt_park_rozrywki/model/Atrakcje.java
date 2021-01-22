package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Atrakcje {
	private BigDecimal numerAtrakcji;

	private String dataKonserwacji;

	private String godzinaOtwarcia;

	private String godzinaZamkniecia;

	private BigDecimal numerParku;

	private BigDecimal nrCennika;

	public Atrakcje(BigDecimal numerAtrakcji, String dataKonserwacji, String godzinaOtwarcia, String godzinaZamknięcia,
			BigDecimal numerParku, BigDecimal nrCennika) {
		super();
		this.numerAtrakcji = numerAtrakcji;
		this.dataKonserwacji = dataKonserwacji;
		this.godzinaOtwarcia = godzinaOtwarcia;
		this.godzinaZamkniecia = godzinaZamknięcia;
		this.numerParku = numerParku;
		this.nrCennika = nrCennika;
	}

	public Atrakcje() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.NUMER_ATRAKCJI")
	public BigDecimal getNumerAtrakcji() {
		return numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.NUMER_ATRAKCJI")
	public void setNumerAtrakcji(BigDecimal numerAtrakcji) {
		this.numerAtrakcji = numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.DATA_KONSERWACJI")
	public String getDataKonserwacji() {
		return dataKonserwacji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.DATA_KONSERWACJI")
	public void setDataKonserwacji(String dataKonserwacji) {
		this.dataKonserwacji = dataKonserwacji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.GODZINA_OTWARCIA")
	public String getGodzinaOtwarcia() {
		return godzinaOtwarcia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.GODZINA_OTWARCIA")
	public void setGodzinaOtwarcia(String godzinaOtwarcia) {
		this.godzinaOtwarcia = godzinaOtwarcia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.GODZINA_ZAMKNI�CIA")
	public String getGodzinaZamkniecia() {
		return godzinaZamkniecia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.GODZINA_ZAMKNI�CIA")
	public void setGodzinaZamkniecia(String godzinaZamknięcia) {
		this.godzinaZamkniecia = godzinaZamknięcia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.NUMER_PARKU")
	public BigDecimal getNumerParku() {
		return numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.NUMER_PARKU")
	public void setNumerParku(BigDecimal numerParku) {
		this.numerParku = numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.NR_CENNIKA")
	public BigDecimal getNrCennika() {
		return nrCennika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.NR_CENNIKA")
	public void setNrCennika(BigDecimal nrCennika) {
		this.nrCennika = nrCennika;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties).append("numer_atrakcji,/'" + getNumerAtrakcji().toString() + "',/")
				.append("data_konserwacji,/'" + getDataKonserwacji().toString() + "',/")
				.append("godzina_otwarcia,/'" + getGodzinaOtwarcia().toString() + "',/")
				.append("godzina_zamkniecia,/'" + getGodzinaOtwarcia().toString() + "',/")
				.append("numer_parku,/'" + getNumerParku().toString() + "',/")
				.append("nr_cennika/'" + getNrCennika().toString() + "'").toString();

		return properties;
	}

	public String toQuery() {
		return "ATRAKCJE";
	}

}