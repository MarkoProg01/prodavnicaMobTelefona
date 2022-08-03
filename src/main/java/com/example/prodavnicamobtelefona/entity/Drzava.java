package com.example.prodavnicamobtelefona.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Drzava {
    @Id
    private int id;
    private String nazivDrzave;

    public Drzava() {
    }

    public Drzava(Integer id, String nazivDrzave) {
        this.id = id;
        this.nazivDrzave = nazivDrzave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    @Override
    public String toString() {
        return "Drzava{" +
                "id=" + id +
                ", nazivDrzave='" + nazivDrzave + '\'' +
                '}';
    }
}
