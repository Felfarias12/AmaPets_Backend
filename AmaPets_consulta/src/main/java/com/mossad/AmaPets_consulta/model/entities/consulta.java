package com.mossad.AmaPets_consulta.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "CONSULTA")
public class consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_consulta;

    @Column(nullable = false)
    private Date fecha_consulta;

    @Column(nullable = false)
    private String motivo;

    @Column(nullable = false)
    private String diagnostico;
    
}
