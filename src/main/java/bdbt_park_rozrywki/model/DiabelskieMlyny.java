package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class DiabelskieMlyny {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3819218+01:00", comments = "Source field: DIABELSKIE_MLYNY.NUMER_ATRAKCJI")
	private BigDecimal numerAtrakcji;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.RODZAJ_KOSZA")
	private String rodzajKosza;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.WYSOKOSC")
	private BigDecimal wysokosc;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.ILO��_KOSZY")
	private BigDecimal ilośćKoszy;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.NUMER_ATRAKCJI")
	public BigDecimal getNumerAtrakcji() {
		return numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.NUMER_ATRAKCJI")
	public void setNumerAtrakcji(BigDecimal numerAtrakcji) {
		this.numerAtrakcji = numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.RODZAJ_KOSZA")
	public String getRodzajKosza() {
		return rodzajKosza;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.RODZAJ_KOSZA")
	public void setRodzajKosza(String rodzajKosza) {
		this.rodzajKosza = rodzajKosza;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.WYSOKOSC")
	public BigDecimal getWysokosc() {
		return wysokosc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.WYSOKOSC")
	public void setWysokosc(BigDecimal wysokosc) {
		this.wysokosc = wysokosc;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.ILO��_KOSZY")
	public BigDecimal getIlośćKoszy() {
		return ilośćKoszy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:38:12.3829534+01:00", comments = "Source field: DIABELSKIE_MLYNY.ILO��_KOSZY")
	public void setIlośćKoszy(BigDecimal ilośćKoszy) {
		this.ilośćKoszy = ilośćKoszy;
	}
}