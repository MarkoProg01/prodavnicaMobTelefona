package com.example.prodavnicamobtelefona.Adresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdresaService {
    @Autowired
    AdresaRepository repository;

    public AdresaService() {
    }

    public List<Adresa> getAllAdress(){
        return repository.findAll();
    }

    public Optional<Adresa> getAdressById(int id){
        return repository.findById(id);
    }

    public void addAdress(Adresa adresa){
        repository.save(adresa);
    }

    public void updateAdress(Adresa adresa){
        repository.save(adresa);
    }

    public void removeAdress(int id){
        repository.deleteById(id);
    }



}
