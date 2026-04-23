package com.mossad.amapets_receta.controller;

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

import com.mossad.amapets_receta.model.entities.Receta;
import com.mossad.amapets_receta.service.RecetaService;

@RestController
@RequestMapping("/recetas")
public class RecetaController {

    @Autowired
    private RecetaService recetaService;


    // localhost :8082/recetas
    @GetMapping("")
    public List<Receta> obtenerTodasLasRecetas() {
        return recetaService.obtenerTodasLasRecetas();
    }

    //post
    @PostMapping("/crear")
    public Receta crearReceta(@RequestBody Receta receta) {
        return recetaService.crearReceta(receta);
    
    }

    //put
    @PutMapping("/actualizar/{id}")
    public Receta actualizarReceta(@RequestBody Receta receta, @PathVariable int id) {
        return recetaService.actualizarReceta(id, receta);
    }

    //delete
    @DeleteMapping("/eliminar/{id}")
    public String eliminarReceta(@PathVariable int id) {
        return recetaService.eliminarReceta(id);
    }
}
