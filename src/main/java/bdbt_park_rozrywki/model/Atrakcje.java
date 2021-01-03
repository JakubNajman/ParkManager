package bdbt_park_rozrywki.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Generated;

public class Atrakcje {
	private BigDecimal numerAtrakcji;

	private Date dataKonserwacji;

	private Date godzinaOtwarcia;

	private Date godzinaZamknięcia;

	private BigDecimal numerParku;

	private BigDecimal nrCennika;

	public Atrakcje(BigDecimal numerAtrakcji, Date dataKonserwacji, Date godzinaOtwarcia, Date godzinaZamknięcia,
			BigDecimal numerParku, BigDecimal nrCennika) {
		super();
		this.numerAtrakcji = numerAtrakcji;
		this.dataKonserwacji = dataKonserwacji;
		this.godzinaOtwarcia = godzinaOtwarcia;
		this.godzinaZamknięcia = godzinaZamknięcia;
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
	public Date getDataKonserwacji() {
		return dataKonserwacji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.DATA_KONSERWACJI")
	public void setDataKonserwacji(Date dataKonserwacji) {
		this.dataKonserwacji = dataKonserwacji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.GODZINA_OTWARCIA")
	public Date getGodzinaOtwarcia() {
		return godzinaOtwarcia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.368496+01:00", comments = "Source field: ATRAKCJE.GODZINA_OTWARCIA")
	public void setGodzinaOtwarcia(Date godzinaOtwarcia) {
		this.godzinaOtwarcia = godzinaOtwarcia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.GODZINA_ZAMKNI�CIA")
	public Date getGodzinaZamknięcia() {
		return godzinaZamknięcia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: ATRAKCJE.GODZINA_ZAMKNI�CIA")
	public void setGodzinaZamknięcia(Date godzinaZamknięcia) {
		this.godzinaZamknięcia = godzinaZamknięcia;
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
		properties = new StringBuilder(properties)
				.append("numer_atrakcji,/'" + getNumerAtrakcji().toString() + "',/")
				.append("data_konserwacji,/'" + getDataKonserwacji().toString() + "',/")
				.append("godzina_otwarcia,/'" + getGodzinaOtwarcia().toString() + "',/")
				.append("godzina_zamknięcia,/'" + getGodzinaOtwarcia().toString() + "',/")
				.append("numer_parku/'" + getNumerParku().toString() + "',/")
				.append("nr_cennika/'" + getNrCennika().toString() + "'").toString();				
		
		return properties;
	}

	public String toQuery() {
		return "ATRAKCJE";
	}
	
}