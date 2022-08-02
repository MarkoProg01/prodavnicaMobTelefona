package com.example.prodavnicamobtelefona.Kupac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KupacController {

    @Autowired
    KupacService service;
    @RequestMapping("/kupci")
    public List<Kupac> getAllCustomers(){
        return service.getAllCustomers();
    }
    @RequestMapping("/kupci/{id}")
    public Optional<Kupac> getCustomersById(@PathVariable int id){
        return service.getCustomerById(id);
    }
    @RequestMapping(value = "/kupci",method = RequestMethod.POST)
    public void addCustomer(@RequestBody Kupac kupac){
        service.addCustomer(kupac);
    }
    @RequestMapping(value = "/kupci",method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Kupac kupac){
        service.updateCustomer(kupac);
    }
    @RequestMapping(value = "/kupci/{id}",method = RequestMethod.DELETE)
    public void removeCustomer(@PathVariable int id){
        service.removeCustomer(id);
    }

}
