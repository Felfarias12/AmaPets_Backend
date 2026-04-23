package com.mossad.AmaPets_veterinario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.AmaPets_veterinario.model.entities.Veterinario;
import com.mossad.AmaPets_veterinario.service.VeterinarioService;


@RequestMapping("/veterinarios")
@RestController

public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;
    
    @GetMapping("")
    public List<Veterinario> obtenerTodosLosVeterinarios() {
        return veterinarioService.obtenerTodosLosVeterinarios();
    }

    //post
    @PostMapping("/login")
    public Veterinario crearVeterinario(@RequestBody Veterinario veterinario) {
        return veterinarioService.crearVeterinario(veterinario);
    }

    //put
    @PutMapping("/{id}")
    public Veterinario actualizarVeterinario(@PathVariable int id, @RequestBody Veterinario veterinario) {
        return veterinarioService.actualizarVeterinario(id, veterinario);
    }
    //delete
    @DeleteMapping("/{id}")
    public String eliminarVeterinario(@PathVariable int id) {
        return veterinarioService.eliminarVeterinario(id);
    }
    
}
