package com.mossad.AmaPets_Ficha_Clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.AmaPets_Ficha_Clinica.models.entities.FichaClinica;
import com.mossad.AmaPets_Ficha_Clinica.service.FichaClinicaService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fichas")
@RestController
public class FichaClinicaController {

    @Autowired
    private FichaClinicaService fichaClinicaService;

    // localhost:7577/fichas
    @GetMapping("")
    public List<FichaClinica> obtenerTodasLasFichas() {
        return fichaClinicaService.obtenerTodasLasFichas();
    }

    // post
    @PostMapping("")
    public FichaClinica crearFicha(@RequestBody FichaClinica fichaClinica) {
        return fichaClinicaService.crearFicha(fichaClinica);
    }

    // put
    @PutMapping("/{id}")
    public FichaClinica actualizarFicha(@PathVariable int id, @RequestBody FichaClinica fichaClinica) {
        return fichaClinicaService.actualizarFicha(id, fichaClinica);
    }

    // delete
    @DeleteMapping("/{id}")
    public String eliminarFicha(@PathVariable int id) {
        return fichaClinicaService.eliminarFicha(id);
    }
}
