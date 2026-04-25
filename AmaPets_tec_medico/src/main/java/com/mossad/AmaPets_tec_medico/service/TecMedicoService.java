package com.mossad.AmaPets_tec_medico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_tec_medico.model.entities.TecMedico;
import com.mossad.AmaPets_tec_medico.repository.TecMedicoRepository;

@Service

public class TecMedicoService {
    
    @Autowired
    private TecMedicoRepository tecMedicoRepository;

    public List<TecMedico> obtenerTodosLosTecMedicos() {
        return tecMedicoRepository.findAll();
    }

    public TecMedico crearTecMedico(TecMedico tecMedico) {
        return tecMedicoRepository.save(tecMedico);
    }

    public TecMedico actualizarTecMedico(int id, TecMedico tecMedico) {
        TecMedico tecMedicoExistente = tecMedicoRepository.findById(id).orElse(null);
        if (tecMedicoExistente != null) {
            tecMedicoExistente.setNombre(tecMedico.getNombre());
            tecMedicoExistente.setEdad(tecMedico.getEdad());
            tecMedicoExistente.setGenero(tecMedico.getGenero());
            tecMedicoExistente.setEmail(tecMedico.getEmail());
            return tecMedicoRepository.save(tecMedicoExistente);
        }
        return null;
    }

    public String eliminarTecMedico(int id) {
        TecMedico tecMedico = tecMedicoRepository.findById(id).orElse(null);
        if (tecMedico != null) {
            tecMedicoRepository.delete(tecMedico);
            return "Técnico médico eliminado";
        }
        return "Técnico médico no encontrado";
    }


}
