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
    private Mesto mesto;




}
