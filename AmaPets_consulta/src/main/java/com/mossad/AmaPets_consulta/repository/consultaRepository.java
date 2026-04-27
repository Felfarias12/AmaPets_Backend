package com.mossad.AmaPets_consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets_consulta.model.entities.Consulta;


public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
    
}
