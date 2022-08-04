package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.dto.KupacDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Adresa;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.service.KupacService;
import com.example.prodavnicamobtelefona.entity.Kupac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kupci")
public class KupacController {

    @Autowired
    private KupacService service;

    public KupacController(KupacService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<KupacDto> getAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public KupacDto create(@RequestBody Kupac kupac){
        return service.save(kupac);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public KupacDto update(@RequestBody Kupac kupac){
        return service.save(kupac);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

}
