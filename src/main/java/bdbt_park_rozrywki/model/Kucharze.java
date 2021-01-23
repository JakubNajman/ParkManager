package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Kucharze {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KUCHARZE.NUMER_PRACOWNIKA")
	private BigDecimal numerPracownika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KUCHARZE.STOPIEN_KUCHARZA")
	private BigDecimal stopienKucharza;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KUCHARZE.NUMER_PRACOWNIKA")
	public BigDecimal getNumerPracownika() {
		return numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KUCHARZE.NUMER_PRACOWNIKA")
	public void setNumerPracownika(BigDecimal numerPracownika) {
		this.numerPracownika = numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KUCHARZE.STOPIEN_KUCHARZA")
	public BigDecimal getStopienKucharza() {
		return stopienKucharza;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KUCHARZE.STOPIEN_KUCHARZA")
	public void setStopienKucharza(BigDecimal stopienKucharza) {
		this.stopienKucharza = stopienKucharza;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties)
				.append("numer_pracownika,/'" + getNumerPracownika().toString() + "',/")
				.append("stopien_kucharza/'" + getStopienKucharza().toString() + "'").toString();
		return properties;
	}

	public String toQuery() {
		return "KUCHARZE";
	}

}