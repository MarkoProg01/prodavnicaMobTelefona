package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.dto.MobilniDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Mobilni;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.repository.MobilniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MobilniService {
    @Autowired
    private MobilniRepository repository;

    public MobilniService(MobilniRepository repository) {
        this.repository = repository;
    }

    public List<MobilniDto> generateList(Iterable<Mobilni> elements){
        List<MobilniDto> newList = new ArrayList<>();
        elements.forEach(element -> {
            newList.add(this.convertToDto(element));
        });
        return newList;

    }

    public List<MobilniDto> findAll(){
        return this.generateList(repository.findAll());
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public MobilniDto save(Mobilni mobilni){
        return convertToDto(repository.save(mobilni));
    }



    public MobilniDto convertToDto(Mobilni mobilni){
        return new MobilniDto(mobilni);
    }



}
