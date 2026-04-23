package com.mossad.amapets_receta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.amapets_receta.model.entities.Receta;


public interface RecetaRepository extends JpaRepository<Receta, Integer> {

    
}
