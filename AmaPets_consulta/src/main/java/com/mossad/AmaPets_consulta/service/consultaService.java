package com.mossad.AmaPets_consulta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_consulta.model.entities.Consulta;
import com.mossad.AmaPets_consulta.repository.ConsultaRepository;
@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consrepo;

    public List<Consulta> obtenerTodasLasConsultas() {
        return consrepo.findAll();
    }

    public Consulta crearConsulta(Consulta consulta) {
        return consrepo.save(consulta);
    }

    public Consulta actualizarConsulta(int id, Consulta consulta) {
        Consulta consultaExistente = consrepo.findById(id).orElse(null);
        if (consultaExistente != null) {
            consultaExistente.setFecha_consulta(consulta.getFecha_consulta());
            consultaExistente.setMotivo(consulta.getMotivo());
            consultaExistente.setDiagnostico(consulta.getDiagnostico());
            consultaExistente.setTratamiento(consulta.getTratamiento());
            return consrepo.save(consultaExistente);
        }
        return null;
    }

    public String deleteConsulta(int id) {
        Consulta consulta = consrepo.findById(id).orElse(null);
        if (consulta != null) {
            consrepo.delete(consulta);
            return "Consulta eliminada";
        }
        return "Consulta no encontrada";
    }
    
}
