package com.mossad.AmaPets_Ficha_Clinica.models.entities;

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
@Table(name = "FICHA_CLINICA")
public class FichaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ficha_clinica;

    @Column(nullable = false)
    private LocalDate fecha_creacion;

    @Column(nullable = false)
    private String raza;

    @Column(nullable = false)
    private String especie;

    @Column(nullable = false)
    private int id_usuario;

    @Column(nullable = true)
    private String alergias;

    @Column(nullable = true)
    private String vacunas;

    @Column(nullable = true)
    private LocalDate fecha_bitacora;

    @Column(nullable = true, length = 1000)
    private String observaciones;
}
