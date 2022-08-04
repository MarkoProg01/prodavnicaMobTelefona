package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.dto.KupacDto;
import com.example.prodavnicamobtelefona.dto.MestoDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Kupac;
import com.example.prodavnicamobtelefona.entity.Mesto;
import com.example.prodavnicamobtelefona.repository.KupacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KupacService {
    @Autowired
    private KupacRepository repository;

    public KupacService(KupacRepository repository) {
        this.repository = repository;
    }

    public List<KupacDto> generateList(Iterable<Kupac> elements){
        List<KupacDto> newList = new ArrayList<>();
        elements.forEach(element -> {
            newList.add(this.convertToDto(element));
        });
        return newList;

    }

    public List<KupacDto> findAll(){
        return this.generateList(repository.findAll());
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public KupacDto save(Kupac kupac){
        return convertToDto(repository.save(kupac));
    }



    public KupacDto convertToDto(Kupac kupac){
        return new KupacDto(kupac);
    }



}
