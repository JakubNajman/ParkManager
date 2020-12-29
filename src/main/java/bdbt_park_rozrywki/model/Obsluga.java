package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Obsluga {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.NUMER_PRACOWNIKA")
	private BigDecimal numerPracownika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.SEKCJA_OBSLUGI")
	private String sekcjaObslugi;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.SPECJALNY_DOST�P")
	private BigDecimal specjalnyDostęp;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.NUMER_PRACOWNIKA")
	public BigDecimal getNumerPracownika() {
		return numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.NUMER_PRACOWNIKA")
	public void setNumerPracownika(BigDecimal numerPracownika) {
		this.numerPracownika = numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.SEKCJA_OBSLUGI")
	public String getSekcjaObslugi() {
		return sekcjaObslugi;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.SEKCJA_OBSLUGI")
	public void setSekcjaObslugi(String sekcjaObslugi) {
		this.sekcjaObslugi = sekcjaObslugi;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.SPECJALNY_DOST�P")
	public BigDecimal getSpecjalnyDostęp() {
		return specjalnyDostęp;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: OBSLUGA.SPECJALNY_DOST�P")
	public void setSpecjalnyDostęp(BigDecimal specjalnyDostęp) {
		this.specjalnyDostęp = specjalnyDostęp;
	}
}