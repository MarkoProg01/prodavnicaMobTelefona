package com.example.prodavnicamobtelefona.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Drzava {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nazivDrzave;


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
