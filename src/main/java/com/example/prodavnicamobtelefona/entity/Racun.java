package com.example.prodavnicamobtelefona.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Racun {
    @Id
    private int id;
    private int ukupna_cena;
    private int kolicina;
    @ManyToOne
    private Mobilni mobilni;
    @ManyToOne
    private Kupac kupac;







}
