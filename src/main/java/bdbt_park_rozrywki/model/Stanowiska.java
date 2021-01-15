package bdbt_park_rozrywki.model;

import java.math.BigDecimal;
import javax.annotation.Generated;

public class Stanowiska {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.NR_STANOWISKA")
    private BigDecimal nrStanowiska;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.NAZWA")
    private String nazwa;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.OPIS")
    private String opis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.NR_STANOWISKA")
    public BigDecimal getNrStanowiska() {
        return nrStanowiska;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.NR_STANOWISKA")
    public void setNrStanowiska(BigDecimal nrStanowiska) {
        this.nrStanowiska = nrStanowiska;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.NAZWA")
    public String getNazwa() {
        return nazwa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.NAZWA")
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.OPIS")
    public String getOpis() {
        return opis;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-15T16:12:35.8329926+01:00", comments="Source field: STANOWISKA.OPIS")
    public void setOpis(String opis) {
        this.opis = opis;
    }
}