package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Adresa;
import com.example.prodavnicamobtelefona.entity.Mesto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdresaDto {
    private int id;
    private String ulica;
    private String broj;
    private Mesto mesto;

    public AdresaDto(Adresa adresa) {
        this.id = adresa.getId();
        this.ulica = adresa.getUlica();
        this.broj = adresa.getBroj();
        this.mesto = adresa.getMesto();
    }
}
