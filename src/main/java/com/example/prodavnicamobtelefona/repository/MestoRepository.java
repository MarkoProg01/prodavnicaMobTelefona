package com.example.prodavnicamobtelefona.repository;

import com.example.prodavnicamobtelefona.entity.Mesto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MestoRepository extends JpaRepository<Mesto,Integer> {
    public List<Mesto> findByDrzavaId(Integer id);
}
