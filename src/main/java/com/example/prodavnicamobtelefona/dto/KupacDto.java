package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Adresa;
import com.example.prodavnicamobtelefona.entity.Kupac;

public class KupacDto {
    private int id;
    private String ime;
    private String prezime;
    private Adresa adresa;

    public KupacDto(Kupac kupac) {
        this.id = kupac.getId();
        this.ime = kupac.getIme();
        this.prezime = kupac.getPrezime();
        this.adresa = kupac.getAdresa();
    }
}
