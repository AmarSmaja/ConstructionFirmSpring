package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Zahtjevi", schema = "construction")
public class ZahtjevEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zahtjev_id;
    private String ime;
    private String prezime;
    private String email;
    private String drzava;
    private String radnik;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getRadnik() {
        return radnik;
    }

    public void setRadnik(String radnik) {
        this.radnik = radnik;
    }

    @Override
    public String toString() {
        return "ZahtjevEntity{" +
                "zahtjev_id=" + zahtjev_id +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", email='" + email + '\'' +
                ", drzava='" + drzava + '\'' +
                ", radnik='" + radnik + '\'' +
                '}';
    }
}