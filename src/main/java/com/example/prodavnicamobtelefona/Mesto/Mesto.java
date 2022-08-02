package com.example.prodavnicamobtelefona.Mesto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mesto {
    @Id
    private int id;
    private String nazivMesta;

    public Mesto() {
    }

    public Mesto(Integer id, String nazivMesta) {
        this.id = id;
        this.nazivMesta = nazivMesta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazivMesta() {
        return nazivMesta;
    }

    public void setNazivMesta(String nazivMesta) {
        this.nazivMesta = nazivMesta;
    }

    @Override
    public String toString() {
        return "Drzava{" +
                "id=" + id +
                ", nazivDrzave='" + nazivMesta + '\'' +
                '}';
    }
}
