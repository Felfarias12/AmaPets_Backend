package com.mossad.AmaPets_Ficha_Clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_Ficha_Clinica.models.entities.FichaClinica;
import com.mossad.AmaPets_Ficha_Clinica.repository.FichaClinicaRepository;

@Service
public class FichaClinicaService {

    @Autowired
    private FichaClinicaRepository fichaClinicaRepo;

    public List<FichaClinica> obtenerTodasLasFichas() {
        return fichaClinicaRepo.findAll();
    }

    public FichaClinica crearFicha(FichaClinica fichaClinica) {
        return fichaClinicaRepo.save(fichaClinica);
    }

    public FichaClinica actualizarFicha(int id, FichaClinica fichaActualizada) {
        FichaClinica fichaExistente = fichaClinicaRepo.findById(id).orElse(null);
        if (fichaExistente != null) {
            fichaExistente.setFecha_creacion(fichaActualizada.getFecha_creacion());
            fichaExistente.setRaza(fichaActualizada.getRaza());
            fichaExistente.setEspecie(fichaActualizada.getEspecie());
            fichaExistente.setId_usuario(fichaActualizada.getId_usuario());
            fichaExistente.setAlergias(fichaActualizada.getAlergias());
            fichaExistente.setVacunas(fichaActualizada.getVacunas());
            fichaExistente.setFecha_bitacora(fichaActualizada.getFecha_bitacora());
            fichaExistente.setObservaciones(fichaActualizada.getObservaciones());
            return fichaClinicaRepo.save(fichaExistente);
        }
        return null;
    }

    public String eliminarFicha(int id) {
        FichaClinica ficha = fichaClinicaRepo.findById(id).orElse(null);
        if (ficha != null) {
            fichaClinicaRepo.delete(ficha);
            return "Ficha clinica eliminada";
        }
        return "Ficha clinica no encontrada";
    }
}
