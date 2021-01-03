package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Kolejki {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.NUMER_ATRAKCJI")
	private BigDecimal numerAtrakcji;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.CENA_PRZEJAZDU")
	private BigDecimal cenaPrzejazdu;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.CZY_DZIECI")
	private String czyDzieci;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.ILOSC_WAGONIKãW")
	private BigDecimal iloscWagoników;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.NUMER_ATRAKCJI")
	public BigDecimal getNumerAtrakcji() {
		return numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.NUMER_ATRAKCJI")
	public void setNumerAtrakcji(BigDecimal numerAtrakcji) {
		this.numerAtrakcji = numerAtrakcji;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.CENA_PRZEJAZDU")
	public BigDecimal getCenaPrzejazdu() {
		return cenaPrzejazdu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.CENA_PRZEJAZDU")
	public void setCenaPrzejazdu(BigDecimal cenaPrzejazdu) {
		this.cenaPrzejazdu = cenaPrzejazdu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.CZY_DZIECI")
	public String getCzyDzieci() {
		return czyDzieci;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.CZY_DZIECI")
	public void setCzyDzieci(String czyDzieci) {
		this.czyDzieci = czyDzieci;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.ILOSC_WAGONIKãW")
	public BigDecimal getIloscWagoników() {
		return iloscWagoników;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-12-29T12:30:56.3704903+01:00", comments = "Source field: KOLEJKI.ILOSC_WAGONIKãW")
	public void setIloscWagoników(BigDecimal iloscWagoników) {
		this.iloscWagoników = iloscWagoników;
	}
	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties)
				.append("cena_przejazdu,/'" + getCenaPrzejazdu().toString() + "',/")
				.append("czy_dzieci,/'" + getCzyDzieci().toString() + "',/")
				.append("ilosc_wagonikow,/'" + getIloscWagoników().toString() + "',/")
				.append("numer_atrakcji,/'" + getNumerAtrakcji().toString() + "'")
				.toString();
		return properties;
	}

	public String toQuery() {
		return "KOLEJKI";
	}

}