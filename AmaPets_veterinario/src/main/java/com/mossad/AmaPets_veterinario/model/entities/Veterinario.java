package com.mossad.AmaPets_veterinario.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "VETERINARIO")
public class Veterinario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_veterinario;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private int edad;

    @Column(nullable=false)
    private String genero;
    
    @Column(nullable=false)
    private String correo;
    
}
