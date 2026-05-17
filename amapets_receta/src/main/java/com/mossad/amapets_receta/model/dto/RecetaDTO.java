package com.mossad.amapets_receta.model.dto;

import lombok.Data;

@Data
public class RecetaDTO {

    private int id_receta;
    private int dosis;
    private String medicamento;
    private String frecuencia;
    private String duracion;
}