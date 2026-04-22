package com.example.AmaPets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AmaPets.models.entities.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Integer> {

    
}
