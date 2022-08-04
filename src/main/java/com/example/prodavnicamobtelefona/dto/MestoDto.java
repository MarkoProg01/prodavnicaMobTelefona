package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Drzava;
import com.example.prodavnicamobtelefona.entity.Mesto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MestoDto {
    private int id;
    private String nazivMesta;
    private Drzava drzava;

    public MestoDto(Mesto mesto) {
        this.id = mesto.getId();
        this.nazivMesta = mesto.getNazivMesta();
        this.drzava = mesto.getDrzava();
    }
}
