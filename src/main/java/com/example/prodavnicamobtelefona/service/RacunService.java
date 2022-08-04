package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.repository.RacunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RacunService {
    @Autowired
    private RacunRepository repository;

    public RacunService(RacunRepository repository) {
        this.repository = repository;
    }

    public List<RacunDto> generateList(Iterable<Racun> elements){
       List<RacunDto> newList = new ArrayList<>();
       elements.forEach(element -> {
           newList.add(this.convertToDto(element));
       });
       return newList;

    }

    public List<RacunDto> findAll(){
        return this.generateList(repository.findAll());
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public RacunDto save(Racun racun){
        return convertToDto(repository.save(racun));
    }



    public RacunDto convertToDto(Racun racun){
        return new RacunDto(racun);
    }




}
