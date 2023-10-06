package gn.dgd.gnif.gestioncodenif;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="codeNif")
public class CodeNif {
    @Id
    @Column(name="CMP_COD", nullable= false, updatable= false, unique= true)
    //@SequenceGenerator( )
    private String cmp_cod = new String();
    @Timestamp
    private Date valid_from= new Date();
    private String ValidTo= new String();
    private String cmp_nam= new String();
    private String cmp_adr= new String();
    private String cmp_ad2= new String();
    private String cmp_ad3= new String();
    private Date cmp_ad4= new Date();
    private String cmp_tel= new String();
    private String cmp_fax= new String();
    private String cmp_sta= new String();
    @DateTimeFormat
    private Date  modify_time= new Date();
    private int flg_rem= 0;
    public CodeNif() {}

    public CodeNif(String cmp_cod, Date valid_from, String validTo, String cmp_nam, String cmp_adr, String cmp_ad2, String cmp_ad3, Date cmp_ad4, String cmp_tel, String cmp_fax, String cmp_sta, Date modify_time, int flg_rem) {
        this.cmp_cod = cmp_cod;
        this.valid_from = valid_from;
        ValidTo = validTo;
        this.cmp_nam = cmp_nam;
        this.cmp_adr = cmp_adr;
        this.cmp_ad2 = cmp_ad2;
        this.cmp_ad3 = cmp_ad3;
        this.cmp_ad4 = cmp_ad4;
        this.cmp_tel = cmp_tel;
        this.cmp_fax = cmp_fax;
        this.cmp_sta = cmp_sta;
        this.modify_time = modify_time;
        this.flg_rem = flg_rem;
    }
    //getters and setters

    public String getCmp_cod() {
        return cmp_cod;
    }

    public void setCmp_cod(String cmp_cod) {
        this.cmp_cod = cmp_cod;
    }

    public Date getValid_from() {
        return valid_from;
    }

    public void setValid_from(Date valid_from) {
        this.valid_from = valid_from;
    }

    public String getValidTo() {
        return ValidTo;
    }

    public void setValidTo(String validTo) {
        ValidTo = validTo;
    }

    public String getCmp_nam() {
        return cmp_nam;
    }

    public void setCmp_nam(String cmp_nam) {
        this.cmp_nam = cmp_nam;
    }

    public String getCmp_adr() {
        return cmp_adr;
    }

    public void setCmp_adr(String cmp_adr) {
        this.cmp_adr = cmp_adr;
    }

    public String getCmp_ad2() {
        return cmp_ad2;
    }

    public void setCmp_ad2(String cmp_ad2) {
        this.cmp_ad2 = cmp_ad2;
    }

    public String getCmp_ad3() {
        return cmp_ad3;
    }

    public void setCmp_ad3(String cmp_ad3) {
        this.cmp_ad3 = cmp_ad3;
    }

    public Date getCmp_ad4() {
        return cmp_ad4;
    }

    public void setCmp_ad4(Date cmp_ad4) {
        this.cmp_ad4 = cmp_ad4;
    }

    public String getCmp_tel() {
        return cmp_tel;
    }

    public void setCmp_tel(String cmp_tel) {
        this.cmp_tel = cmp_tel;
    }

    public String getCmp_fax() {
        return cmp_fax;
    }

    public void setCmp_fax(String cmp_fax) {
        this.cmp_fax = cmp_fax;
    }

    public String getCmp_sta() {
        return cmp_sta;
    }

    public void setCmp_sta(String cmp_sta) {
        this.cmp_sta = cmp_sta;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public int getFlg_rem() {
        return flg_rem;
    }

    public void setFlg_rem(int flg_rem) {
        this.flg_rem = flg_rem;
    }
    //Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodeNif codeNIF)) return false;
        return Objects.equals(getCmp_cod(), codeNIF.getCmp_cod()) && Objects.equals(getValid_from(), codeNIF.getValid_from()) && Objects.equals(getValidTo(), codeNIF.getValidTo()) && Objects.equals(getCmp_nam(), codeNIF.getCmp_nam()) && Objects.equals(getCmp_adr(), codeNIF.getCmp_adr()) && Objects.equals(getCmp_ad2(), codeNIF.getCmp_ad2()) && Objects.equals(getCmp_ad3(), codeNIF.getCmp_ad3()) && Objects.equals(getCmp_ad4(), codeNIF.getCmp_ad4()) && Objects.equals(getCmp_tel(), codeNIF.getCmp_tel()) && Objects.equals(getCmp_fax(), codeNIF.getCmp_fax()) && Objects.equals(getCmp_sta(), codeNIF.getCmp_sta()) && Objects.equals(getModify_time(), codeNIF.getModify_time()) && Objects.equals(getFlg_rem(), codeNIF.getFlg_rem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCmp_cod(), getValid_from(), getValidTo(), getCmp_nam(), getCmp_adr(), getCmp_ad2(), getCmp_ad3(), getCmp_ad4(), getCmp_tel(), getCmp_fax(), getCmp_sta(), getModify_time(), getFlg_rem());
    }
    //toString


    @Override
    public String toString() {
        return "CodeNIF{" +
                "cmp_cod='" + cmp_cod + '\'' +
                ", valid_from=" + valid_from +
                ", ValidTo='" + ValidTo + '\'' +
                ", cmp_nam='" + cmp_nam + '\'' +
                ", cmp_adr='" + cmp_adr + '\'' +
                ", cmp_ad2='" + cmp_ad2 + '\'' +
                ", cmp_ad3='" + cmp_ad3 + '\'' +
                ", cmp_ad4='" + cmp_ad4 + '\'' +
                ", cmp_tel='" + cmp_tel + '\'' +
                ", cmp_fax='" + cmp_fax + '\'' +
                ", cmp_sta='" + cmp_sta + '\'' +
                ", modify_time='" + modify_time + '\'' +
                ", flg_rem='" + flg_rem + '\'' +
                '}';
    }
}