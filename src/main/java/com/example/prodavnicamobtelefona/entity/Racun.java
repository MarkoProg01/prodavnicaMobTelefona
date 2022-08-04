package com.example.prodavnicamobtelefona.entity;

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
    private int ukupna_cena;
    private int kolicina;
    @ManyToOne
    private Mobilni mobilni;
    @ManyToOne
    private Kupac kupac;


}
