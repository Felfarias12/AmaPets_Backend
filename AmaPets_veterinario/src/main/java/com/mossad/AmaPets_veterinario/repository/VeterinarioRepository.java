package com.mossad.AmaPets_veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets_veterinario.model.entities.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Integer> {
    
}
