package com.example.prodavnicamobtelefona.Mobilni;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobilni {
    @Id
    private int id;
    private String marka;
    private String model;
    private String cena;

    public Mobilni() {
    }

    public Mobilni(int id, String marka, String model, String cena) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }
}
