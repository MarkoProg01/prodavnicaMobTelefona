package com.example.prodavnicamobtelefona.Mesto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MestoController {

    @Autowired
    MestoService service;
    @RequestMapping("/mesta")
    public List<Mesto> getAllPlaces(){
        return service.getAllPlaces();
    }
    @RequestMapping("/mesta/{id}")
    public Optional<Mesto> getPlacesById(@PathVariable int id){
        return service.getPlaceById(id);
    }
    @RequestMapping(value = "/mesta",method = RequestMethod.POST)
    public void addPlace(@RequestBody Mesto mesto){
        service.addPlace(mesto);
    }
    @RequestMapping(value = "/mesta",method = RequestMethod.PUT)
    public void updatePlace(@RequestBody Mesto mesto){
        service.updatePlace(mesto);
    }
    @RequestMapping(value = "/mesta/{id}",method = RequestMethod.DELETE)
    public void removePlace(@PathVariable int id){
        service.removePlace(id);
    }

}
