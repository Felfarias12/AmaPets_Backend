package com.mossad.AmaPets_cirugia.controller;

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

import com.mossad.AmaPets_cirugia.model.entities.Cirugia;
import com.mossad.AmaPets_cirugia.service.CirugiaService;


@RestController
@RequestMapping("/cirugias")
public class CirugiaController {
    
    @Autowired
    private CirugiaService cirugiaService;


    @GetMapping
    public List<Cirugia> obtenerTodsaLasCirugias() {
        return cirugiaService.obtenerTodasLasCirugias();
    }

    @PostMapping
    public Cirugia crearCirugia(@RequestBody Cirugia cirugia) {
        return cirugiaService.crearCirugia(cirugia);
    }

    @PutMapping("/{id}")
    public Cirugia actualizarCirugia(@PathVariable int id, @RequestBody Cirugia cirugia) {
        return cirugiaService.actualizarCirugia(id, cirugia);
    }

    @DeleteMapping("/{id}")
    public void eliminarCirugia(@PathVariable int id) {
        cirugiaService.eliminarCirugia(id);
    }

}
