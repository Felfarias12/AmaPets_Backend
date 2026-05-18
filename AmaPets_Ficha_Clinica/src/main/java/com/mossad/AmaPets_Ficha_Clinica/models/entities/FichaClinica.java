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
    private int mascotaId;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private String motivo;

    @Column(nullable = false)
    private String veterinario;

    @Column(nullable = false)
    private double peso;

    @Column(nullable = false)
    private String temperatura;

    @Column(nullable = false)
    private String diagnostico;

    @Column(nullable = false)
    private String tratamiento;

    @Column(nullable = true, length = 1000)
    private String notas;
}