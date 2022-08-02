package com.example.prodavnicamobtelefona.Racun;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Racun {
    @Id
    private int id;
    private int ukupna_cena;
    private int kolicina;

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
