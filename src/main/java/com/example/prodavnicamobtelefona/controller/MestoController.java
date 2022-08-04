package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.dto.MestoDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Drzava;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.service.MestoService;
import com.example.prodavnicamobtelefona.entity.Mesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mesta")
public class MestoController {

    @Autowired
    private MestoService service;

    public MestoController(MestoService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MestoDto> getAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MestoDto create(@RequestBody Mesto mesto){
        return service.save(mesto);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public MestoDto update(@RequestBody Mesto mesto){
        return service.save(mesto);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

}
