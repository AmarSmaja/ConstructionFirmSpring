package com.construction.constructionfirm.entity;

import javax.persistence.*;

@Entity
@Table(name = "Role", schema = "construction")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;
    private String role_ime;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_ime() {
        return role_ime;
    }

    public void setRole_ime(String role_ime) {
        this.role_ime = role_ime;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "role_id=" + role_id +
                ", role_ime='" + role_ime + '\'' +
                '}';
    }
}