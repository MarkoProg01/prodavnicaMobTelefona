package com.example.prodavnicamobtelefona.dto;

import com.example.prodavnicamobtelefona.entity.Mobilni;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MobilniDto {
    private int id;
    private String marka;
    private String model;
    private String cena;

    public MobilniDto(Mobilni mobilni) {
        this.id = mobilni.getId();
        this.marka = mobilni.getMarka();
        this.model = mobilni.getModel();
        this.cena = mobilni.getCena();
    }
}
