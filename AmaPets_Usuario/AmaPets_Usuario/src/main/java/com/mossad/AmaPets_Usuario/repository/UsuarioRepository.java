package com.mossad.AmaPets_Usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets_Usuario.models.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
