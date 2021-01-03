package bdbt_park_rozrywki.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.annotation.Generated;

public class ParkiRozrywki {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NUMER_PARKU")
	private BigDecimal numerParku;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NAZWA_PARKU")
	private String nazwaParku;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.DATA_ZA�O�ENIA")
	private Date dataZałożenia;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.LICZBA_PRACOWNIKOW")
	private BigDecimal liczbaPracownikow;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NR_ADRESU")
	private BigDecimal nrAdresu;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NUMER_PARKU")
	public BigDecimal getNumerParku() {
		return numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NUMER_PARKU")
	public void setNumerParku(BigDecimal numerParku) {
		this.numerParku = numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NAZWA_PARKU")
	public String getNazwaParku() {
		return nazwaParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NAZWA_PARKU")
	public void setNazwaParku(String nazwaParku) {
		this.nazwaParku = nazwaParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.DATA_ZA�O�ENIA")
	public Date getDataZałożenia() {
		return dataZałożenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.DATA_ZA�O�ENIA")
	public void setDataZZałożenia(Date dataZałożenia) {
		this.dataZałożenia = dataZałożenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.LICZBA_PRACOWNIKOW")
	public BigDecimal getLiczbaPracownikow() {
		return liczbaPracownikow;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.LICZBA_PRACOWNIKOW")
	public void setLiczbaPracownikow(BigDecimal liczbaPracownikow) {
		this.liczbaPracownikow = liczbaPracownikow;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: PARKI_ROZRYWKI.NR_ADRESU")
	public BigDecimal getNrAdresu() {
		return nrAdresu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3714875+01:00", comments = "Source field: PARKI_ROZRYWKI.NR_ADRESU")
	public void setNrAdresu(BigDecimal nrAdresu) {
		this.nrAdresu = nrAdresu;
	}
	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties)
				.append("data_zalozenia,/'" + getDataZałożenia().toString() + "',/")
				.append("liczba_pracownikow,/'" + getLiczbaPracownikow().toString() + "',/")
				.append("nazwa_parku,/'" + getNazwaParku().toString() + "',/")
				.append("nr_adresu,/'" + getNrAdresu().toString() + "',/")
				.append("numer_parku,/'" + getNumerParku().toString() + "'")
				.toString();
		return properties;
	}

	public String toQuery() {
		return "PARKI_ROZRYWKI";
	}

}