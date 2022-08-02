package com.example.prodavnicamobtelefona.Mesto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MestoRepository extends JpaRepository<Mesto,Integer> {
    public List<Mesto> findByNazivMesta(String nazivMesta);
    public List<Mesto> findByDrzavaId(Integer id);
}
