package com.example.prodavnicamobtelefona.Mobilni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MobilniController {

    @Autowired
    MobilniService service;
    @RequestMapping("/telefoni")
    public List<Mobilni> getAllPhones(){
        return service.getAllPhones();
    }
    @RequestMapping("/telefoni/{id}")
    public Optional<Mobilni> getPhonesById(@PathVariable int id){
        return service.getPhoneById(id);
    }
    @RequestMapping(value = "/telefoni",method = RequestMethod.POST)
    public void addPhone(@RequestBody Mobilni mobilni){
        service.addPhone(mobilni);
    }
    @RequestMapping(value = "/telefoni",method = RequestMethod.PUT)
    public void updatePhone(@RequestBody Mobilni mobilni){
        service.updatePhone(mobilni);
    }
    @RequestMapping(value = "/telefoni/{id}",method = RequestMethod.DELETE)
    public void removePhone(@PathVariable int id){
        service.removePhone(id);
    }

}
