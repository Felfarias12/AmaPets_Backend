package com.mossad.amapets_mascota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.amapets_mascota.model.entities.Mascota;



public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

}