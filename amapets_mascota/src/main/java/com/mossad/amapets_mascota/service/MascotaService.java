package com.mossad.amapets_mascota.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.mossad.amapets_mascota.model.entities.Mascota;
import com.mossad.amapets_mascota.repository.MascotaRepository;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascorepo;

    public List<Mascota> obtenerTodasLasMascotas() {
        return mascorepo.findAll();
    }

    public Mascota crearMascota(Mascota mascota) {
        return mascorepo.save(mascota);
    }

    public Mascota actualizarMascota(int id, Mascota mascota) {
        Mascota mascotaExistente = mascorepo.findById(id).orElse(null);
        if (mascotaExistente != null) {
            mascotaExistente.setNombre(mascota.getNombre());
            mascotaExistente.setEdad(mascota.getEdad());
            mascotaExistente.setGenero(mascota.getGenero());
            mascotaExistente.setEspecie(mascota.getEspecie());
            mascotaExistente.setPeso(mascota.getPeso());
            mascotaExistente.setVacunado(mascota.isVacunado());
            return mascorepo.save(mascotaExistente);
        }
        return null;
    }

    public String deleteMascota(int id) {
        Mascota mascota = mascorepo.findById(id).orElse(null);
        if (mascota != null) {
            mascorepo.delete(mascota);
            return "Mascota eliminada";
        }
        return "Mascota no encontrada";
    }
    
}
