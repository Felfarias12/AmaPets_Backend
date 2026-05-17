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
            fichaExistente.setMascotaId(fichaActualizada.getMascotaId());
            fichaExistente.setFecha(fichaActualizada.getFecha());
            fichaExistente.setMotivo(fichaActualizada.getMotivo());
            fichaExistente.setVeterinario(fichaActualizada.getVeterinario());
            fichaExistente.setPeso(fichaActualizada.getPeso());
            fichaExistente.setTemperatura(fichaActualizada.getTemperatura());
            fichaExistente.setDiagnostico(fichaActualizada.getDiagnostico());
            fichaExistente.setTratamiento(fichaActualizada.getTratamiento());
            fichaExistente.setNotas(fichaActualizada.getNotas());
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
