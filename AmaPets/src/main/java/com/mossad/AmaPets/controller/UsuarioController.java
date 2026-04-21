package com.mossad.AmaPets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.AmaPets.models.entities.Usuario;
import com.mossad.AmaPets.service.UsuarioService;


@RequestMapping("/usuarios")
@RestController

public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }
}
