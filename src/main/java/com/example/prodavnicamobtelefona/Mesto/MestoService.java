package com.example.prodavnicamobtelefona.Mesto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MestoService {
    @Autowired
    MestoRepository repository;

    public MestoService() {
    }

    public List<Mesto> getAllPlaces(){
        return repository.findAll();
    }

    public Optional<Mesto> getPlaceById(int id){
        return repository.findById(id);
    }

    public void addPlace(Mesto mesto){
        repository.save(mesto);
    }

    public void updatePlace(Mesto mesto){
        repository.save(mesto);
    }

    public void removePlace(int id){
        repository.deleteById(id);
    }



}
