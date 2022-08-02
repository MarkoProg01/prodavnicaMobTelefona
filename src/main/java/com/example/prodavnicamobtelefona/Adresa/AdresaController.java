package com.example.prodavnicamobtelefona.Adresa;

import com.example.prodavnicamobtelefona.Mesto.Mesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdresaController {

    @Autowired
    AdresaService service;
    @RequestMapping("/adrese")
    public List<Adresa> getAllPlaces(){
        return service.getAllAdress();
    }
    @RequestMapping("/adrese/{id}")
    public Optional<Adresa> getPlacesById(@PathVariable int id){
        return service.getAdressById(id);
    }
    @RequestMapping(value = "/adrese",method = RequestMethod.POST)
    public void addPlace(@RequestBody Adresa adresa){
        service.addAdress(adresa);
    }
    @RequestMapping(value = "/adrese",method = RequestMethod.PUT)
    public void updatePlace(@RequestBody Adresa adresa){
        service.updateAdress(adresa);
    }
    @RequestMapping(value = "/adrese/{id}",method = RequestMethod.DELETE)
    public void removePlace(@PathVariable int id){
        service.removeAdress(id);
    }

    @RequestMapping(value = "/mesta/{id}/adrese",method = RequestMethod.POST)
    public void addPlace(@RequestBody Adresa adresa,@PathVariable int id){
        adresa.setMesto(new Mesto(id,""));
        service.addAdress(adresa);
    }

}
