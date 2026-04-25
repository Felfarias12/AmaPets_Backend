package com.mossad.ama_pets_hospitalizacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.ama_pets_hospitalizacion.model.entities.Hospitalizacion;



public interface HospitalizacionRepository extends JpaRepository<Hospitalizacion, Integer> {

}