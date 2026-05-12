package com.mossad.AmaPets_Notificacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.AmaPets_Notificacion.models.entities.Notificacion;
import com.mossad.AmaPets_Notificacion.service.NotificacionService;
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/notificaciones")
@RestController
public class NotificacionController {

    @Autowired
    private NotificacionService notificacionService;

    // localhost:7578/notificaciones
    @GetMapping("")
    public List<Notificacion> obtenerTodasLasNotificaciones() {
        return notificacionService.obtenerTodasLasNotificaciones();
    }

    // post
    @PostMapping("/crear")
    public Notificacion crearNotificacion(@RequestBody Notificacion notificacion) {
        return notificacionService.crearNotificacion(notificacion);
    }

    // put
    @PutMapping("/{id}")
    public Notificacion actualizarNotificacion(@PathVariable int id, @RequestBody Notificacion notificacion) {
        return notificacionService.actualizarNotificacion(id, notificacion);
    }

    // delete
    @DeleteMapping("/{id}")
    public String eliminarNotificacion(@PathVariable int id) {
        return notificacionService.eliminarNotificacion(id);
    }
}
