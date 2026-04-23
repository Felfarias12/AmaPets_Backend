package com.mossad.AmaPets_veterinario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_veterinario.model.entities.Veterinario;
import com.mossad.AmaPets_veterinario.repository.VeterinarioRepository;

@Service
public class VeterinarioService {
    
    @Autowired
    private VeterinarioRepository veterinarioRepo;

    public List<Veterinario> obtenerTodosLosVeterinarios() {
        return veterinarioRepo.findAll();
    }

    public Veterinario crearVeterinario(Veterinario veterinario) {
        return veterinarioRepo.save(veterinario);
    }

    public Veterinario actualizarVeterinario(int id, Veterinario veterinarioActualizado) {
        Veterinario veterinarioExistente = veterinarioRepo.findById(id).orElse(null);
        if (veterinarioExistente != null) {
            veterinarioExistente.setNombre(veterinarioActualizado.getNombre());
            veterinarioExistente.setEdad(veterinarioActualizado.getEdad());
            veterinarioExistente.setGenero(veterinarioActualizado.getGenero());
            veterinarioExistente.setCorreo(veterinarioActualizado.getCorreo());
            return veterinarioRepo.save(veterinarioExistente);
        }
        return null;
    }

    public String eliminarVeterinario(int id) {
        Veterinario veterinario = veterinarioRepo.findById(id).orElse(null);
        if (veterinario != null) {
            veterinarioRepo.delete(veterinario);
            return "Veterinario eliminado";
        }
        return "Veterinario no encontrado";
    }



}
