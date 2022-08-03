package com.example.prodavnicamobtelefona.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Racun {
    @Id
    private int id;
    private int ukupna_cena;
    private int kolicina;
    @ManyToOne
    @JoinColumn(name = "mobilni_id")
    private Mobilni mobilni;
    @ManyToOne
    @JoinColumn(name = "kupac_id")
    private Kupac kupac;

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public Mobilni getMobilni() {
        return mobilni;
    }

    public void setMobilni(Mobilni mobilni) {
        this.mobilni = mobilni;
    }

    public Racun() {
    }


    public Racun(int id, int ukupna_cena, int kolicina) {
        this.id = id;
        this.ukupna_cena = ukupna_cena;
        this.kolicina = kolicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUkupna_cena() {
        return ukupna_cena;
    }

    public void setUkupna_cena(int ukupna_cena) {
        this.ukupna_cena = ukupna_cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }
}
