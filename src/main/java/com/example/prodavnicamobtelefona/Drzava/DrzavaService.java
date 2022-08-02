package com.example.prodavnicamobtelefona.Drzava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Service
public class DrzavaService {
    @Autowired
    DrzavaRepository repository;

    public DrzavaService() {
    }

    public List<Drzava> getAllCountries(){
        return repository.findAll();
    }

    public Optional<Drzava> getCountryById(int id){
        return repository.findById(id);
    }

    public void addCountry(Drzava drzava){
        repository.save(drzava);
    }

    public void updateCountry(Drzava drzava){
        repository.save(drzava);
    }

    public void removeCountry(int id){
        repository.deleteById(id);
    }



}
