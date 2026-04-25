package com.mossad.ama_pets_hospitalizacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.ama_pets_hospitalizacion.model.entities.Hospitalizacion;
import com.mossad.ama_pets_hospitalizacion.repository.HospitalizacionRepository;

@Service    
public class HospitalizacionService {
    
    @Autowired
    private HospitalizacionRepository hospirepo;
    
    public List<Hospitalizacion> obtenerTodasLasHospitalizaciones() {
        return hospirepo.findAll();
    }

    public Hospitalizacion crearHospitalizacion(Hospitalizacion hospitalizacion) {
        return hospirepo.save(hospitalizacion);
    }

    public Hospitalizacion actualizarHospitalizacion(int id, Hospitalizacion hospitalizacion) {
        Hospitalizacion hospitalizacionExistente = hospirepo.findById(id).orElse(null);
        if (hospitalizacionExistente != null) {
            hospitalizacionExistente.setFecha_ingreso(hospitalizacion.getFecha_ingreso());
            hospitalizacionExistente.setFecha_egreso(hospitalizacion.getFecha_egreso());
            hospitalizacionExistente.setObservaciones(hospitalizacion.getObservaciones());
            hospitalizacionExistente.setId_usuario(hospitalizacion.getId_usuario());
            hospitalizacionExistente.setId_cirugia(hospitalizacion.getId_cirugia());
            return hospirepo.save(hospitalizacionExistente);
        }
        return null;
    }

    public String deleteHospitalizacion(int id) {
        Hospitalizacion hospitalizacion = hospirepo.findById(id).orElse(null);
        if (hospitalizacion != null) {
            hospirepo.delete(hospitalizacion);
            return "Hospitalización eliminada";
        }
        return "Hospitalización no encontrada";
    }



}
