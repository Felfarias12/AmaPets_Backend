package com.mossad.AmaPets_Usuario.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int id_rol;

    @Column(nullable = true)
    private int id_notificacion;
}
