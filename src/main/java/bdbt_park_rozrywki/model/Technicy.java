package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Technicy {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.NUMER_PRACOWNIKA")
	private BigDecimal numerPracownika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.NUMER_POZWOLENIA")
	private String numerPozwolenia;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.WYKSZTA�CENIE_TECHNICZNE")
	private String wyksztalcenieTechniczne;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.NUMER_PRACOWNIKA")
	public BigDecimal getNumerPracownika() {
		return numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.NUMER_PRACOWNIKA")
	public void setNumerPracownika(BigDecimal numerPracownika) {
		this.numerPracownika = numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.NUMER_POZWOLENIA")
	public String getNumerPozwolenia() {
		return numerPozwolenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.NUMER_POZWOLENIA")
	public void setNumerPozwolenia(String numerPozwolenia) {
		this.numerPozwolenia = numerPozwolenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.WYKSZTA�CENIE_TECHNICZNE")
	public String getWyksztalcenieTechniczne() {
		return wyksztalcenieTechniczne;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8329926+01:00", comments = "Source field: TECHNICY.WYKSZTA�CENIE_TECHNICZNE")
	public void setWykształcenieTechniczne(String wyksztalcenieTechniczne) {
		this.wyksztalcenieTechniczne = wyksztalcenieTechniczne;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties)
				.append("numer_Pozwolenia,/'" + getNumerPozwolenia().toString() + "',/")
				.append("numer_Pracownika,/'" + getNumerPracownika().toString() + "',/")
				.append("wyksztalcenie_Techniczne/'" + "Tak" + "'").toString();

		return properties;
	}

	public String toQuery() {
		return "TECHNICY";
	}
}