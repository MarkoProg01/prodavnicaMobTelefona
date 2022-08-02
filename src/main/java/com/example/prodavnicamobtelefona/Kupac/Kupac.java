package com.example.prodavnicamobtelefona.Kupac;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kupac {
    @Id
    private int id;
    private String ime;
    private String prezime;

    public Kupac() {
    }

    public Kupac(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
}
