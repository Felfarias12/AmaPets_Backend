package com.mossad.amapets_mascota.model.dto;

import lombok.Data;

@Data
public class MascotaDTO {

    private int id_mascota;
    private String nombre;
    private int edad;
    private String genero;
    private String especie;
    private double peso;
    private boolean vacunado;
}