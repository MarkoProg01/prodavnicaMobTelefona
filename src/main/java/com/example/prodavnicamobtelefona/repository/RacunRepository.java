package com.example.prodavnicamobtelefona.repository;

import com.example.prodavnicamobtelefona.entity.Racun;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RacunRepository extends JpaRepository<Racun,Integer> {
    public List<Racun> findByMobilniId(int id);
    public List<Racun> findByKupacId(int id);
}
