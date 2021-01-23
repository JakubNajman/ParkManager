package bdbt_park_rozrywki.model;

import java.math.BigDecimal;

import javax.annotation.Generated;

public class Pracownicy {
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.825992+01:00", comments = "Source field: PRACOWNICY.NUMER_PRACOWNIKA")
	private BigDecimal numerPracownika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.PESEL")
	private String pesel;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.IMIE_PRACOWNIKA")
	private String imiePracownika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.NAZWISKO_PRACOWNIKA")
	private String nazwiskoPracownika;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.PLEC")
	private String plec;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.DATA_URODZENIA")
	private String dataUrodzenia;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.DATA_ZATRUDNIENIA")
	private String dataZatrudnienia;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_KONTAKTOWY")
	private String numerKontaktowy;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.EMAIL")
	private String email;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_KONTA")
	private String numerKonta;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_PARKU")
	private BigDecimal numerParku;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NR_ADRESU")
	private BigDecimal nrAdresu;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_STANOWISKA")
	private BigDecimal nrStanowiska;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_WYNAGRODZENIA")
	private BigDecimal nrWynagrodzenia;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.NUMER_PRACOWNIKA")
	public BigDecimal getNumerPracownika() {
		return numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.NUMER_PRACOWNIKA")
	public void setNumerPracownika(BigDecimal numerPracownika) {
		this.numerPracownika = numerPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.PESEL")
	public String getPesel() {
		return pesel;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.PESEL")
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.IMIE_PRACOWNIKA")
	public String getImiePracownika() {
		return imiePracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.IMIE_PRACOWNIKA")
	public void setImiePracownika(String imiePracownika) {
		this.imiePracownika = imiePracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.NAZWISKO_PRACOWNIKA")
	public String getNazwiskoPracownika() {
		return nazwiskoPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8279938+01:00", comments = "Source field: PRACOWNICY.NAZWISKO_PRACOWNIKA")
	public void setNazwiskoPracownika(String nazwiskoPracownika) {
		this.nazwiskoPracownika = nazwiskoPracownika;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.PLEC")
	public String getPlec() {
		return plec;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.PLEC")
	public void setPlec(String plec) {
		this.plec = plec;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.DATA_URODZENIA")
	public String getDataUrodzenia() {
		return dataUrodzenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.DATA_URODZENIA")
	public void setDataUrodzenia(String dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.DATA_ZATRUDNIENIA")
	public String getDataZatrudnienia() {
		return dataZatrudnienia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.DATA_ZATRUDNIENIA")
	public void setDataZatrudnienia(String dataZatrudnienia) {
		this.dataZatrudnienia = dataZatrudnienia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_KONTAKTOWY")
	public String getNumerKontaktowy() {
		return numerKontaktowy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_KONTAKTOWY")
	public void setNumerKontaktowy(String numerKontaktowy) {
		this.numerKontaktowy = numerKontaktowy;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.EMAIL")
	public String getEmail() {
		return email;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.EMAIL")
	public void setEmail(String email) {
		this.email = email;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_KONTA")
	public String getNumerKonta() {
		return numerKonta;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_KONTA")
	public void setNumerKonta(String numerKonta) {
		this.numerKonta = numerKonta;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_PARKU")
	public BigDecimal getNumerParku() {
		return numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NUMER_PARKU")
	public void setNumerParku(BigDecimal numerParku) {
		this.numerParku = numerParku;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.8289892+01:00", comments = "Source field: PRACOWNICY.NR_ADRESU")
	public BigDecimal getNrAdresu() {
		return nrAdresu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_ADRESU")
	public void setNrAdresu(BigDecimal nrAdresu) {
		this.nrAdresu = nrAdresu;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_STANOWISKA")
	public BigDecimal getNrStanowiska() {
		return nrStanowiska;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_STANOWISKA")
	public void setNrStanowiska(BigDecimal nrStanowiska) {
		this.nrStanowiska = nrStanowiska;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_WYNAGRODZENIA")
	public BigDecimal getNrWynagrodzenia() {
		return nrWynagrodzenia;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2021-01-15T16:12:35.829994+01:00", comments = "Source field: PRACOWNICY.NR_WYNAGRODZENIA")
	public void setNrWynagrodzenia(BigDecimal nrWynagrodzenia) {
		this.nrWynagrodzenia = nrWynagrodzenia;
	}

	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties).append("data_urodzenia,/'" + getDataUrodzenia().toString() + "',/")
				.append("data_zatrudnienia,/'" + getDataZatrudnienia().toString() + "',/")
				.append("email,/'" + getEmail().toString() + "',/")
				.append("imie_pracownika,/'" + getImiePracownika().toString() + "',/")
				.append("nazwisko_pracownika,/'" + getNazwiskoPracownika().toString() + "',/")
				.append("nr_adresu,/'" + getNrAdresu().toString() + "',/")
				.append("nr_stanowiska,/'" + getNrStanowiska().toString() + "',/")
				.append("nr_wynagrodzenia,/'" + getNrWynagrodzenia().toString() + "',/")
				.append("numer_konta,/'" + getNumerKonta().toString() + "',/")
				.append("numer_kontaktowy,/'" + getNumerKontaktowy().toString() + "',/")
				.append("numer_parku,/'" + getNumerParku().toString() + "',/")
				.append("numer_pracownika,/'" + getNumerPracownika().toString() + "',/")
				.append("pesel,/'" + getPesel().toString() + "',/").append("plec/'" + getPlec().toString() + "'")
				.toString();

		return properties;
	}

<<<<<<< HEAD
=======
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_KONTA")
    private String numerKonta;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_PARKU")
    private BigDecimal numerParku;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NR_ADRESU")
    private BigDecimal nrAdresu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_STANOWISKA")
    private BigDecimal nrStanowiska;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_WYNAGRODZENIA")
    private BigDecimal nrWynagrodzenia;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.NUMER_PRACOWNIKA")
    public BigDecimal getNumerPracownika() {
        return numerPracownika;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.NUMER_PRACOWNIKA")
    public void setNumerPracownika(BigDecimal numerPracownika) {
        this.numerPracownika = numerPracownika;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.PESEL")
    public String getPesel() {
        return pesel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.PESEL")
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.IMIE_PRACOWNIKA")
    public String getImiePracownika() {
        return imiePracownika;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.IMIE_PRACOWNIKA")
    public void setImiePracownika(String imiePracownika) {
        this.imiePracownika = imiePracownika;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.NAZWISKO_PRACOWNIKA")
    public String getNazwiskoPracownika() {
        return nazwiskoPracownika;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8279938+01:00", comments="Source field: PRACOWNICY.NAZWISKO_PRACOWNIKA")
    public void setNazwiskoPracownika(String nazwiskoPracownika) {
        this.nazwiskoPracownika = nazwiskoPracownika;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.PLEC")
    public String getPlec() {
        return plec;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.PLEC")
    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.DATA_URODZENIA")
    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.DATA_URODZENIA")
    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.DATA_ZATRUDNIENIA")
    public Date getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.DATA_ZATRUDNIENIA")
    public void setDataZatrudnienia(Date dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_KONTAKTOWY")
    public String getNumerKontaktowy() {
        return numerKontaktowy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_KONTAKTOWY")
    public void setNumerKontaktowy(String numerKontaktowy) {
        this.numerKontaktowy = numerKontaktowy;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.EMAIL")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.EMAIL")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_KONTA")
    public String getNumerKonta() {
        return numerKonta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_KONTA")
    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_PARKU")
    public BigDecimal getNumerParku() {
        return numerParku;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NUMER_PARKU")
    public void setNumerParku(BigDecimal numerParku) {
        this.numerParku = numerParku;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8289892+01:00", comments="Source field: PRACOWNICY.NR_ADRESU")
    public BigDecimal getNrAdresu() {
        return nrAdresu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_ADRESU")
    public void setNrAdresu(BigDecimal nrAdresu) {
        this.nrAdresu = nrAdresu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_STANOWISKA")
    public BigDecimal getNrStanowiska() {
        return nrStanowiska;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_STANOWISKA")
    public void setNrStanowiska(BigDecimal nrStanowiska) {
        this.nrStanowiska = nrStanowiska;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_WYNAGRODZENIA")
    public BigDecimal getNrWynagrodzenia() {
        return nrWynagrodzenia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.829994+01:00", comments="Source field: PRACOWNICY.NR_WYNAGRODZENIA")
    public void setNrWynagrodzenia(BigDecimal nrWynagrodzenia) {
        this.nrWynagrodzenia = nrWynagrodzenia;
    }
    
	@Override
	public String toString() {
		String properties = "";
		properties = new StringBuilder(properties)
				.append("data_urodzenia,/'" + getDataUrodzenia().toString() + "',/")
				.append("data_zatrudnienia,/'" + getDataZatrudnienia().toString() + "',/")
				.append("email,/'" + getEmail().toString() + "',/")
				.append("imie_pracownika,/'" + getImiePracownika().toString() + "',/")
				.append("nazwisko_pracownika,/'" + getNazwiskoPracownika().toString() + "',/")
				.append("numer_adresu,/'" + getNrAdresu().toString() + "',/")
				.append("numer_stanowiska,/'" + getNrStanowiska().toString() + "',/")
				.append("numer_wynagrodzenia,/'" + getNrWynagrodzenia().toString() + "',/")
				.append("numer_konta,/'" + getNumerKonta().toString() + "',/")
				.append("numer_kontaktowy,/'" + getNumerKontaktowy().toString() + "',/")
				.append("numer_parku,/'" + getNumerParku().toString() + "',/")
				.append("numer_pracownika,/'" + getNumerPracownika().toString() + "',/")
				.append("pesel,/'" + getPesel().toString() + "',/")
				.append("plec,/'" + getPlec().toString() + "'").toString();

		return properties;
	}

	public String toQuery() {
		return "PRACOWNICY";
	}
    
>>>>>>> 87ad2c22190356bac6f7aedd4db5ab8b0d01189e
}