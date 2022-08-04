package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.dto.MestoDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Mesto;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.repository.MestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MestoService {
    @Autowired
    private MestoRepository repository;

    public MestoService(MestoRepository repository) {
        this.repository = repository;
    }

    public List<MestoDto> generateList(Iterable<Mesto> elements){
        List<MestoDto> newList = new ArrayList<>();
        elements.forEach(element -> {
            newList.add(this.convertToDto(element));
        });
        return newList;

    }

    public List<MestoDto> findAll(){
        return this.generateList(repository.findAll());
    }
    public void delete(int id){
        repository.deleteById(id);
    }
    public MestoDto save(Mesto mesto){
        return convertToDto(repository.save(mesto));
    }



    public MestoDto convertToDto(Mesto mesto){
        return new MestoDto(mesto);
    }



}
