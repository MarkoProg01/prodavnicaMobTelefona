package com.example.prodavnicamobtelefona.service;

import com.example.prodavnicamobtelefona.entity.Mobilni;
import com.example.prodavnicamobtelefona.repository.MobilniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobilniService {
    @Autowired
    MobilniRepository repository;

    public MobilniService() {
    }

    public List<Mobilni> getAllPhones(){
        return repository.findAll();
    }

    public Optional<Mobilni> getPhoneById(int id){
        return repository.findById(id);
    }

    public void addPhone(Mobilni mobilni){
        repository.save(mobilni);
    }

    public void updatePhone(Mobilni mobilni){
        repository.save(mobilni);
    }

    public void removePhone(int id){
        repository.deleteById(id);
    }



}
