package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Drzave_hq", schema = "construction")
public class HQEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hq_id;
    private String hd_drzava;

    public Integer getHq_id() {
        return hq_id;
    }

    public void setHq_id(Integer hq_id) {
        this.hq_id = hq_id;
    }

    public String getHd_drzava() {
        return hd_drzava;
    }

    public void setHd_drzava(String hd_drzava) {
        this.hd_drzava = hd_drzava;
    }

    @Override
    public String toString() {
        return "HQEntity{" +
                "hq_id=" + hq_id +
                ", hd_drzava='" + hd_drzava + '\'' +
                '}';
    }
}
