package com.example.prodavnicamobtelefona.repository;

import com.example.prodavnicamobtelefona.entity.Adresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresaRepository extends JpaRepository<Adresa,Integer> {

    public List<Adresa> findByMestoId(Integer id);
}
