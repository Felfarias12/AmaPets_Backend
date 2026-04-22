package com.mossad.AmaPets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets.models.entities.Usuario;
import com.mossad.AmaPets.repository.UsuarioRepository;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usurepo;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usurepo.findAll();
    }
    
    public Usuario crearUsuario(Usuario usuario) {
        return usurepo.save(usuario);
    }

    public Usuario actualizarUsuario(int id, Usuario usuario) {
        Usuario usuarioExistente = usurepo.findById(id).orElse(null);
        if (usuarioExistente != null) {
            usuarioExistente.setNombre(usuario.getNombre());
            usuarioExistente.setEdad(usuario.getEdad());
            usuarioExistente.setGenero(usuario.getGenero());
            usuarioExistente.setCorreo(usuario.getCorreo());
            return usurepo.save(usuarioExistente);
        }
        return null;
    }

    public String deleteUsuario(int id) {
        Usuario usuario = usurepo.findById(id).orElse(null);
        if (usuario != null) {
            usurepo.delete(usuario);
            return "Usuario eliminado";
        }
        return "Usuario no encontrado";
    }
}
