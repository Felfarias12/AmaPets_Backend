package com.mossad.AmaPets_consulta.controller;

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

import com.mossad.AmaPets_consulta.model.entities.Consulta;
import com.mossad.AmaPets_consulta.service.ConsultaService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> obtenerTodasLasConsultas() {
        return consultaService.obtenerTodasLasConsultas();
    }

    @PostMapping
    public Consulta crearConsulta(@RequestBody Consulta consulta) {
        return consultaService.crearConsulta(consulta);
    }

    @PutMapping("/{id}")
    public Consulta actualizarConsulta(@PathVariable int id, @RequestBody Consulta consulta) {
        return consultaService.actualizarConsulta(id, consulta);
    }

    @DeleteMapping("/{id}")
    public String eliminarConsulta(@PathVariable int id) {
        return consultaService.deleteConsulta(id);
    }

    
}
