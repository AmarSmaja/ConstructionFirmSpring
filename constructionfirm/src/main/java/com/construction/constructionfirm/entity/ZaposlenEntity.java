package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Zaposleni", schema = "construction")
public class ZaposlenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emp_id;
    private String emp_ime;
    private String emp_prezime;
    private Integer emp_role;
    private Integer emp_hq;

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_ime() {
        return emp_ime;
    }

    public void setEmp_ime(String emp_ime) {
        this.emp_ime = emp_ime;
    }

    public String getEmp_prezime() {
        return emp_prezime;
    }

    public void setEmp_prezime(String emp_prezime) {
        this.emp_prezime = emp_prezime;
    }

    public Integer getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(Integer emp_role) {
        this.emp_role = emp_role;
    }

    public Integer getEmp_hq() {
        return emp_hq;
    }

    public void setEmp_hq(Integer emp_hq) {
        this.emp_hq = emp_hq;
    }

    @Override
    public String toString() {
        return "ZaposlenEntity{" +
                "emp_id=" + emp_id +
                ", emp_ime='" + emp_ime + '\'' +
                ", emp_prezime='" + emp_prezime + '\'' +
                ", emp_role=" + emp_role +
                ", emp_hq=" + emp_hq +
                '}';
    }
}