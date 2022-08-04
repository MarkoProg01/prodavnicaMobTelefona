package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Kupac;
import com.example.prodavnicamobtelefona.entity.Mobilni;
import com.example.prodavnicamobtelefona.entity.Racun;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RacunDto {
    private int id;
    private int ukupna_cena;
    private int kolicina;
    private Mobilni mobilni;
    private Kupac kupac;


    public RacunDto(Racun racun) {
        this.id = racun.getId();
        this.ukupna_cena = racun.getUkupna_cena();
        this.kolicina = racun.getKolicina();
        this.mobilni = racun.getMobilni();
        this.kupac = racun.getKupac();
    }
}
