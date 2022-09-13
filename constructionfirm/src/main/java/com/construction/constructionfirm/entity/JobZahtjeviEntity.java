package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Job_zahtjevi", schema = "construction")
public class JobZahtjeviEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer zahtjev_id;
    private String ime;
    private String prezime;
    private String mail;
    private String cv_link;
    private String zeljena_pozicija;

    public Integer getZahtjev_id() {
        return zahtjev_id;
    }

    public void setZahtjev_id(Integer zahtjev_id) {
        this.zahtjev_id = zahtjev_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCv_link() {
        return cv_link;
    }

    public void setCv_link(String cv_link) {
        this.cv_link = cv_link;
    }

    public String getZeljena_pozicija() {
        return zeljena_pozicija;
    }

    public void setZeljena_pozicija(String zeljena_pozicija) {
        this.zeljena_pozicija = zeljena_pozicija;
    }

    @Override
    public String toString() {
        return "JobZahtjeviEntity{" +
                "zahtjev_id=" + zahtjev_id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", mail='" + mail + '\'' +
                ", cv_link='" + cv_link + '\'' +
                ", zeljena_pozicija='" + zeljena_pozicija + '\'' +
                '}';
    }
}