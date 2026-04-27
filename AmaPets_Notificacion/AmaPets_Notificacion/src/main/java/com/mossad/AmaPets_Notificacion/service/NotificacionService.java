package com.mossad.AmaPets_Notificacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mossad.AmaPets_Notificacion.models.entities.Notificacion;
import com.mossad.AmaPets_Notificacion.repository.NotificacionRepository;

@Service
public class NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepo;

    public List<Notificacion> obtenerTodasLasNotificaciones() {
        return notificacionRepo.findAll();
    }

    public Notificacion crearNotificacion(Notificacion notificacion) {
        return notificacionRepo.save(notificacion);
    }

    public Notificacion actualizarNotificacion(int id, Notificacion notificacionActualizada) {
        Notificacion notificacionExistente = notificacionRepo.findById(id).orElse(null);
        if (notificacionExistente != null) {
            notificacionExistente.setMensaje(notificacionActualizada.getMensaje());
            notificacionExistente.setTitulo_notificacion(notificacionActualizada.getTitulo_notificacion());
            notificacionExistente.setFecha_notificacion(notificacionActualizada.getFecha_notificacion());
            notificacionExistente.setId_usuario(notificacionActualizada.getId_usuario());
            notificacionExistente.setId_hospitalizacion(notificacionActualizada.getId_hospitalizacion());
            return notificacionRepo.save(notificacionExistente);
        }
        return null;
    }

    public String eliminarNotificacion(int id) {
        Notificacion notificacion = notificacionRepo.findById(id).orElse(null);
        if (notificacion != null) {
            notificacionRepo.delete(notificacion);
            return "Notificacion eliminada";
        }
        return "Notificacion no encontrada";
    }
}
