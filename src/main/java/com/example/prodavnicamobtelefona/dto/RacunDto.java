package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Racun;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RacunDto {
    private int id;
    private int ukupna_cena;
    private int kolicina;

    public RacunDto(Racun racun) {
        this.id = racun.getId();
        this.ukupna_cena = racun.getUkupna_cena();
        this.kolicina = racun.getKolicina();
    }
}
