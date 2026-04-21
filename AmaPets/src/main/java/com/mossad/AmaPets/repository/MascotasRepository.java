package com.mossad.AmaPets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets.models.entities.Mascotas;

public interface  MascotasRepository extends JpaRepository<Mascotas, Integer> {

}