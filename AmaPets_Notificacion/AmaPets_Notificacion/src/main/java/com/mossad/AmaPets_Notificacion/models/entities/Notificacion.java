package com.mossad.AmaPets_Notificacion.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "NOTIFICACION")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_notificacion;

    @Column(nullable = false, length = 500)
    private String mensaje;

    @Column(nullable = false)
    private String titulo_notificacion;

    @Column(nullable = false)
    private LocalDate fecha_notificacion;

    @Column(nullable = false)
    private int id_usuario;

    @Column(nullable = true)
    private int id_hospitalizacion;
}
