package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.entity.Racun;
import com.example.prodavnicamobtelefona.repository.RacunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RacunService {
    @Autowired
    RacunRepository repository;

    public RacunService() {
    }

    public List<Racun> getAllBills(){
        return repository.findAll();
    }

    public Optional<Racun> getBillById(int id){
        return repository.findById(id);
    }

    public void addBill(Racun racun){
        repository.save(racun);
    }

    public void updateBill(Racun racun){
        repository.save(racun);
    }

    public void removeBill(int id){
        repository.deleteById(id);
    }

    public void addBillMobile(Racun racun){
        repository.save(racun);
    }



}
