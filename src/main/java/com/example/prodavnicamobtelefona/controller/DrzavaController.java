package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.dto.DrzavaDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Racun;
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
    private DrzavaService service;

    public DrzavaController(DrzavaService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DrzavaDto> getAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DrzavaDto create(@RequestBody Drzava drzava){
        return service.save(drzava);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public DrzavaDto update(@RequestBody Drzava drzava){
        return service.save(drzava);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

}
