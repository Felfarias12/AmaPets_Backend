package com.example.AmaPets.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Entity
@Data
@Table(name = "RECETA")
public class Receta {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id_receta;

    @Column(nullable = false)
    private int dosis;
    @Column(nullable = false)
    private String medicamento;
    @Column(nullable = false)
    private String frecuencia;
    @Column(nullable = false)
    private String duracion;
    
}
