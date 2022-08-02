package com.example.prodavnicamobtelefona.Mesto;

import com.example.prodavnicamobtelefona.Drzava.Drzava;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mesto {
    @Id
    private int id;
    private String nazivMesta;
    @ManyToOne
    @JoinColumn(name = "drzava_id")
    private Drzava drzava;

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

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
