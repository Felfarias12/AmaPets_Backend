package com.mossad.AmaPets_tec_medico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets_tec_medico.model.entities.TecMedico;

public interface TecMedicoRepository extends JpaRepository<TecMedico, Integer> {
    
}
