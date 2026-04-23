package com.mossad.AmaPets_Usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_Usuario.models.entities.Usuario;
import com.mossad.AmaPets_Usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepo.findAll();
    }

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepo.save(usuario);
    }

    public Usuario actualizarUsuario(int id, Usuario usuario) {
        Usuario usuarioExistente = usuarioRepo.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setEdad(usuario.getEdad());
            usuarioExistente.setGenero(usuario.getGenero());
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setId_rol(usuario.getId_rol());
            usuarioExistente.setId_notificacion(usuario.getId_notificacion());
            return usuarioRepo.save(usuarioExistente);
        }
        return null;
    }

    public String eliminarUsuario(int id) {
        Usuario usuario = usuarioRepo.findById(id).orElse(null);
        if (usuario != null) {
            usuarioRepo.delete(usuario);
            return "Usuario eliminado";
        }
        return "Usuario no encontrado";
    }
}
