package com.example.prodavnicamobtelefona.entity;

import com.example.prodavnicamobtelefona.entity.Mesto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Adresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ulica;
    private String broj;
    @ManyToOne
    @JoinColumn(name = "mesto_id")
    private Mesto mesto;

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
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
