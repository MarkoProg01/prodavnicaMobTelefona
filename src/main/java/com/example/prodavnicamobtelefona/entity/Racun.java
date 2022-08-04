package com.example.prodavnicamobtelefona.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Racun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private int ukupna_cena;
    private int kolicina;
    @ManyToOne
    private Mobilni mobilni;
    @ManyToOne
    private Kupac kupac;


}
