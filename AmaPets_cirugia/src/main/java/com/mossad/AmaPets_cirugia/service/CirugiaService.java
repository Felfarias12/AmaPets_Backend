package com.mossad.AmaPets_cirugia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_cirugia.model.entities.Cirugia;
import com.mossad.AmaPets_cirugia.repository.CirugiaRepository;

@Service
public class CirugiaService {
    
    @Autowired
    private CirugiaRepository cirugiaRepo;

    public List<Cirugia> obtenerTodasLasCirugias() {
        return cirugiaRepo.findAll();
    }

    public Cirugia crearCirugia(Cirugia cirugia) {
        return cirugiaRepo.save(cirugia);
    }

    public Cirugia actualizarCirugia(int id, Cirugia cirugia) {
        Cirugia cirugiaExistente = cirugiaRepo.findById(id).orElse(null);
        if (cirugiaExistente != null) {
            cirugiaExistente.setFecha_cirugia(cirugia.getFecha_cirugia());
            cirugiaExistente.setTipo_cirugia(cirugia.getTipo_cirugia());
            cirugiaExistente.setDescripcion_cirugia(cirugia.getDescripcion_cirugia());
        }
        return cirugiaRepo.save(cirugiaExistente);
    }

    public String eliminarCirugia(int id) {
        Cirugia cirugiaExistente = cirugiaRepo.findById(id).orElse(null);
        if (cirugiaExistente != null) {
            cirugiaRepo.delete(cirugiaExistente);
        }
        return "Cirugia eliminada con éxito";
    }


}