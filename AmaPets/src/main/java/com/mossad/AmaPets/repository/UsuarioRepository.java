package com.mossad.AmaPets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets.models.entities.Usuario;

public interface  UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
