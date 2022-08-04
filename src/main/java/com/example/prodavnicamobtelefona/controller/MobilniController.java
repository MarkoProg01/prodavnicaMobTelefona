package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.dto.MobilniDto;
import com.example.prodavnicamobtelefona.dto.RacunDto;
import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.service.MobilniService;
import com.example.prodavnicamobtelefona.entity.Mobilni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/telefoni")
public class MobilniController {

    @Autowired
    private MobilniService service;

    public MobilniController(MobilniService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MobilniDto> getAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MobilniDto create(@RequestBody Mobilni mobilni){
        return service.save(mobilni);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public MobilniDto update(@RequestBody Mobilni mobilni){
        return service.save(mobilni);
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }

}
