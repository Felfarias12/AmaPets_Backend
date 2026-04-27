package com.mossad.AmaPets_Ficha_Clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets_Ficha_Clinica.models.entities.FichaClinica;

public interface FichaClinicaRepository extends JpaRepository<FichaClinica, Integer> {
}
