package com.mossad.AmaPets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets.models.entities.Usuario;
import com.mossad.AmaPets.repository.UsuarioRepository;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usurepo;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usurepo.findAll();
    }
    
}
