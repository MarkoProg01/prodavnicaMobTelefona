package com.example.prodavnicamobtelefona.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Mesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nazivMesta;
    @ManyToOne
    @JoinColumn(name = "drzava_id")
    @NotNull
    private Drzava drzava;

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
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
