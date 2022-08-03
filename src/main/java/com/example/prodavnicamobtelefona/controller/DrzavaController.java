package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.service.DrzavaService;
import com.example.prodavnicamobtelefona.entity.Drzava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/drzave")
public class DrzavaController {

    @Autowired
    DrzavaService service;
    @GetMapping
    public List<Drzava> getAllCountries(){
        return service.getAllCountries();
    }
    @GetMapping("{id}")
    public Optional<Drzava> getCountryById(@PathVariable int id){
        return service.getCountryById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCountry(@RequestBody Drzava drzava){
        service.addCountry(drzava);
    }
    @PutMapping
    public void updateCountry(@RequestBody Drzava drzava){
        service.updateCountry(drzava);
    }
    @DeleteMapping("{id}")
    public void removeCountry(@PathVariable int id){
        service.removeCountry(id);
    }

}
