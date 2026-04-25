package com.mossad.ama_pets_hospitalizacion.model.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "HOSPITALIZACION")
public class Hospitalizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_hospitalizacion;

}
