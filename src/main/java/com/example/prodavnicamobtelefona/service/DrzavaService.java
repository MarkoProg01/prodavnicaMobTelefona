package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.dto.DrzavaDto;
import com.example.prodavnicamobtelefona.dto.MestoDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Drzava;
import com.example.prodavnicamobtelefona.entity.Mesto;
import com.example.prodavnicamobtelefona.repository.DrzavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DrzavaService {
    @Autowired
    private DrzavaRepository repository;

    public DrzavaService(DrzavaRepository repository) {
        this.repository = repository;
    }

    public List<DrzavaDto> generateList(Iterable<Drzava> elements){
        List<DrzavaDto> newList = new ArrayList<>();
        elements.forEach(element -> {
            newList.add(this.convertToDto(element));
        });
        return newList;

    }

    public List<DrzavaDto> findAll(){
        return this.generateList(repository.findAll());
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public DrzavaDto save(Drzava drzava){
        return convertToDto(repository.save(drzava));
    }



    public DrzavaDto convertToDto(Drzava drzava){
        return new DrzavaDto(drzava);
    }



}
