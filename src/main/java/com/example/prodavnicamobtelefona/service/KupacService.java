package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.entity.Kupac;
import com.example.prodavnicamobtelefona.repository.KupacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KupacService {
    @Autowired
    KupacRepository repository;

    public KupacService() {
    }

    public List<Kupac> getAllCustomers(){
        return repository.findAll();
    }

    public Optional<Kupac> getCustomerById(int id){
        return repository.findById(id);
    }

    public void addCustomer(Kupac kupac){
        repository.save(kupac);
    }

    public void updateCustomer(Kupac kupac){
        repository.save(kupac);
    }

    public void removeCustomer(int id){
        repository.deleteById(id);
    }



}
