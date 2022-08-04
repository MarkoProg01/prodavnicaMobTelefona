package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.dto.AdresaDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Drzava;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.service.AdresaService;
import com.example.prodavnicamobtelefona.entity.Adresa;
import com.example.prodavnicamobtelefona.entity.Mesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adrese")
public class AdresaController {

    @Autowired
    private AdresaService service;

    public AdresaController(AdresaService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AdresaDto> getAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AdresaDto create(@RequestBody Adresa adresa){
        return service.save(adresa);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public AdresaDto update(@RequestBody Adresa adresa){
        return service.save(adresa);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

}
