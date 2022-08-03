package com.example.prodavnicamobtelefona.controller;

import com.example.prodavnicamobtelefona.entity.Kupac;
import com.example.prodavnicamobtelefona.service.RacunService;
import com.example.prodavnicamobtelefona.entity.Mobilni;
import com.example.prodavnicamobtelefona.entity.Racun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RacunController {

    @Autowired
    RacunService service;
    @RequestMapping("/racuni")
    public List<Racun> getAllBills(){
        return service.getAllBills();
    }
    @RequestMapping("/racuni/{id}")
    public Optional<Racun> getBillsById(@PathVariable int id){
        return service.getBillById(id);
    }
    @RequestMapping(value = "/racuni",method = RequestMethod.POST)
    public void addBill(@RequestBody Racun racun){
        service.addBill(racun);
    }
    @RequestMapping(value = "/racuni",method = RequestMethod.PUT)
    public void updateBill(@RequestBody Racun racun){
        service.updateBill(racun);
    }
    @RequestMapping(value = "/racuni/{id}",method = RequestMethod.DELETE)
    public void removeBill(@PathVariable int id){
        service.removeBill(id);
    }

    @RequestMapping(value = "/kupac/{id}/racuni",method = RequestMethod.POST)
    public void addBill(@RequestBody Racun racun,@PathVariable int id){
        racun.setKupac(new Kupac(id,"",""));
        service.addBill(racun);
    }
    @RequestMapping(value = "/mobilni/{modId}/racuni",method = RequestMethod.POST)
    public void addBillMobile(@RequestBody Racun racun,@PathVariable int id){
        racun.setMobilni(new Mobilni(id,"","",""));
        service.addBill(racun);
    }

}
