package com.mossad.AmaPets.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_usuario;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private int edad;
    @Column(nullable=false)
    private String correo;
    @Column(nullable=false)
    private String contrasena;
}