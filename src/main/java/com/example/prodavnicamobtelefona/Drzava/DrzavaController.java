package com.example.prodavnicamobtelefona.Drzava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DrzavaController {

    @Autowired
    DrzavaService service;
    @RequestMapping("/drzave")
    public List<Drzava> getAllCountries(){
        return service.getAllCountries();
    }
    @RequestMapping("/drzave/{id}")
    public Optional<Drzava> getCountryById(@PathVariable int id){
        return service.getCountryById(id);
    }
    @RequestMapping(value = "/drzave",method = RequestMethod.POST)
    public void addCountry(@RequestBody Drzava drzava){
        service.addCountry(drzava);
    }
    @RequestMapping(value = "/drzave",method = RequestMethod.PUT)
    public void updateCountry(@RequestBody Drzava drzava){
        service.updateCountry(drzava);
    }
    @RequestMapping(value = "/drzave/{id}",method = RequestMethod.DELETE)
    public void removeCountry(@PathVariable int id){
        service.removeCountry(id);
    }

}
