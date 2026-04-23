package com.mossad.amapets_receta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.amapets_receta.model.entities.Receta;
import com.mossad.amapets_receta.repository.RecetaRepository;

@Service
public class RecetaService {
    
    @Autowired
    private RecetaRepository recetaRepo;


    public List<Receta> obtenerTodasLasRecetas() {
        return recetaRepo.findAll();
    }

    public Receta crearReceta(Receta receta) {
        return recetaRepo.save(receta);
    }

    public Receta actualizarReceta(int id, Receta recetaActualizada) {
        Receta recetaExistente = recetaRepo.findById(id).orElse(null);
        if (recetaExistente != null) {
            recetaExistente.setDosis(recetaActualizada.getDosis());
            recetaExistente.setMedicamento(recetaActualizada.getMedicamento());
            recetaExistente.setFrecuencia(recetaActualizada.getFrecuencia());
            recetaExistente.setDuracion(recetaActualizada.getDuracion());

            return recetaRepo.save(recetaExistente);
        }
        return null;
    }
    
    public String eliminarReceta(int id) {
        if (recetaRepo.existsById(id)) {
            recetaRepo.deleteById(id);
            return "Receta eliminada exitosamente.";
        }
        return "Receta no encontrada.";
    }

}
