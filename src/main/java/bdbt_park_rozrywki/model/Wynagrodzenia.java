package bdbt_park_rozrywki.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Wynagrodzenia {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.NR_WYNAGRODZENIA")
    private BigDecimal nrWynagrodzenia;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.DATA_PRZELEWU")
    private Date dataPrzelewu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.KWOTA_PODSTAWOWA")
    private BigDecimal kwotaPodstawowa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.KWOTA_DODATKOWA")
    private BigDecimal kwotaDodatkowa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.NR_WYNAGRODZENIA")
    public BigDecimal getNrWynagrodzenia() {
        return nrWynagrodzenia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.NR_WYNAGRODZENIA")
    public void setNrWynagrodzenia(BigDecimal nrWynagrodzenia) {
        this.nrWynagrodzenia = nrWynagrodzenia;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.DATA_PRZELEWU")
    public Date getDataPrzelewu() {
        return dataPrzelewu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.DATA_PRZELEWU")
    public void setDataPrzelewu(Date dataPrzelewu) {
        this.dataPrzelewu = dataPrzelewu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.KWOTA_PODSTAWOWA")
    public BigDecimal getKwotaPodstawowa() {
        return kwotaPodstawowa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.KWOTA_PODSTAWOWA")
    public void setKwotaPodstawowa(BigDecimal kwotaPodstawowa) {
        this.kwotaPodstawowa = kwotaPodstawowa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.KWOTA_DODATKOWA")
    public BigDecimal getKwotaDodatkowa() {
        return kwotaDodatkowa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8339948+01:00", comments="Source field: WYNAGRODZENIA.KWOTA_DODATKOWA")
    public void setKwotaDodatkowa(BigDecimal kwotaDodatkowa) {
        this.kwotaDodatkowa = kwotaDodatkowa;
    }
}