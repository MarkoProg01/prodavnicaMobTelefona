package com.example.prodavnicamobtelefona.Adresa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresa {
    @Id
    private int id;
    private String ulica;
    private String broj;

    public Adresa() {
    }

    public Adresa(int id, String ulica, String broj) {
        this.id = id;
        this.ulica = ulica;
        this.broj = broj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}
