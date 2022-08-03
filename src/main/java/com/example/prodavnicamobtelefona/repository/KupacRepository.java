package com.example.prodavnicamobtelefona.repository;

import com.example.prodavnicamobtelefona.entity.Kupac;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KupacRepository extends JpaRepository<Kupac,Integer> {
    public List<Kupac> findByAdresaId(int id);
}
