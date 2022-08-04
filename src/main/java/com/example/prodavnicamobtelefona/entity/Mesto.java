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


}
