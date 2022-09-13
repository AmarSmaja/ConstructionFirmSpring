package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Drzave", schema = "construction")
public class DrzaveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer drzava_id;
    private String kod;
    private String ime;

    public Integer getDrzava_id() {
        return drzava_id;
    }

    public void setDrzava_id(Integer drzava_id) {
        this.drzava_id = drzava_id;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "DrzaveEntity{" +
                "drzava_id=" + drzava_id +
                ", kod='" + kod + '\'' +
                ", ime='" + ime + '\'' +
                '}';
    }
}