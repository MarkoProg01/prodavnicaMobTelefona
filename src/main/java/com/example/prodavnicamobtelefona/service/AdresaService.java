package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.dto.AdresaDto;
import com.example.prodavnicamobtelefona.dto.MestoDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Mesto;
import com.example.prodavnicamobtelefona.repository.AdresaRepository;
import com.example.prodavnicamobtelefona.entity.Adresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdresaService {
    @Autowired
    private AdresaRepository repository;

    public AdresaService(AdresaRepository repository) {
        this.repository = repository;
    }

    public List<AdresaDto> generateList(Iterable<Adresa> elements){
        List<AdresaDto> newList = new ArrayList<>();
        elements.forEach(element -> {
            newList.add(this.convertToDto(element));
        });
        return newList;

    }

    public List<AdresaDto> findAll(){
        return this.generateList(repository.findAll());
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public AdresaDto save(Adresa adresa){
        return convertToDto(repository.save(adresa));
    }



    public AdresaDto convertToDto(Adresa adresa){
        return new AdresaDto(adresa);
    }



}
