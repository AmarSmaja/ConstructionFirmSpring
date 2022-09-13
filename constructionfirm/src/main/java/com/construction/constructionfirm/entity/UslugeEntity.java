package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Usluge", schema = "construction")
public class UslugeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_usluge;
    private String ime_usluge;
    private String opis_usluge;

    public Integer getId_usluge() {
        return id_usluge;
    }

    public void setId_usluge(Integer id_usluge) {
        this.id_usluge = id_usluge;
    }

    public String getIme_usluge() {
        return ime_usluge;
    }

    public void setIme_usluge(String ime_usluge) {
        this.ime_usluge = ime_usluge;
    }

    public String getOpis_usluge() {
        return opis_usluge;
    }

    public void setOpis_usluge(String opis_usluge) {
        this.opis_usluge = opis_usluge;
    }

    @Override
    public String toString() {
        return "UslugeEntity{" +
                "id_usluge=" + id_usluge +
                ", ime_usluge='" + ime_usluge + '\'' +
                ", opis_usluge='" + opis_usluge + '\'' +
                '}';
    }
}