package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Drzava;
import com.example.prodavnicamobtelefona.entity.Kupac;
import com.example.prodavnicamobtelefona.entity.Mobilni;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DrzavaDto {
    private int id;
    private String nazivDrzave;


    public DrzavaDto(Drzava drzava) {
        this.id = drzava.getId();
        this.nazivDrzave = drzava.getNazivDrzave();
    }
}
