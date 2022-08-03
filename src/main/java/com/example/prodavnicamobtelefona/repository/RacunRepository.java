package com.example.prodavnicamobtelefona.repository;

import com.example.prodavnicamobtelefona.entity.Racun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RacunRepository extends CrudRepository<Racun,Integer> {
    public List<Racun> findByMobilniId(int id);
    public List<Racun> findByKupacId(int id);
}
