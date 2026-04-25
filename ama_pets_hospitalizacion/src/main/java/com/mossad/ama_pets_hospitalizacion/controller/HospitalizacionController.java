package com.mossad.ama_pets_hospitalizacion.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.ama_pets_hospitalizacion.service.HospitalizacionService;
import com.mossad.ama_pets_hospitalizacion.model.entities.Hospitalizacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/hospitalizaciones")
@RestController


public class HospitalizacionController {
    @Autowired
    private HospitalizacionService hospitalizacionService;

    @GetMapping
    public java.util.List<Hospitalizacion> obtenerTodasLasHospitalizaciones() {
        return hospitalizacionService.obtenerTodasLasHospitalizaciones();
    }

    @PostMapping
    
    public Hospitalizacion crearHospitalizacion(@RequestBody Hospitalizacion hospitalizacion) {
        return hospitalizacionService.crearHospitalizacion(hospitalizacion);
    }

    @PutMapping("/{id}")
    public Hospitalizacion actualizarHospitalizacion(@PathVariable int id, @RequestBody Hospitalizacion hospitalizacion) {
        return hospitalizacionService.actualizarHospitalizacion(id, hospitalizacion);   
    }

    @DeleteMapping("/{id}")
    public String eliminarHospitalizacion(@PathVariable int id) {
        return hospitalizacionService.deleteHospitalizacion(id);
    }
    
}
