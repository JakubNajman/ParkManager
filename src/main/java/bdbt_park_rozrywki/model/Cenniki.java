package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Cenniki {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.NR_CENNIKA")
	private BigDecimal nrCennika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.CENA_PODSTAWOWA")
	private BigDecimal cenaPodstawowa;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.CENA_ZE_ZNIZKA")
	private BigDecimal cenaZeZnizka;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.NR_CENNIKA")
	public BigDecimal getNrCennika() {
		return nrCennika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.NR_CENNIKA")
	public void setNrCennika(BigDecimal nrCennika) {
		this.nrCennika = nrCennika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.CENA_PODSTAWOWA")
	public BigDecimal getCenaPodstawowa() {
		return cenaPodstawowa;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.CENA_PODSTAWOWA")
	public void setCenaPodstawowa(BigDecimal cenaPodstawowa) {
		this.cenaPodstawowa = cenaPodstawowa;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.CENA_ZE_ZNIZKA")
	public BigDecimal getCenaZeZnizka() {
		return cenaZeZnizka;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3694938+01:00", comments = "Source field: CENNIKI.CENA_ZE_ZNIZKA")
	public void setCenaZeZnizka(BigDecimal cenaZeZnizka) {
		this.cenaZeZnizka = cenaZeZnizka;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties).append("cena_podstawowa,/'" + getCenaPodstawowa().toString() + "',/")
				.append("cena_ze_znizka,/'" + getCenaZeZnizka().toString() + "',/")
				.append("nr_cennika/'" + getNrCennika().toString() + "'").toString();
		return properties;
	}

	public String toQuery() {
		return "CENNIKI";
	}

}