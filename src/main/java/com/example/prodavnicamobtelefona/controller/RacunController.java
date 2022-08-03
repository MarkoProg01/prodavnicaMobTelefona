package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Kupac;
import com.example.prodavnicamobtelefona.service.RacunService;
import com.example.prodavnicamobtelefona.entity.Mobilni;
import com.example.prodavnicamobtelefona.entity.Racun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/racuni")
public class RacunController {

    @Autowired
    private RacunService service;

    public RacunController(RacunService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RacunDto> getAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RacunDto create(@RequestBody Racun racun){
        return service.save(racun);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public RacunDto update(@RequestBody Racun racun){
        return service.save(racun);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }



}
