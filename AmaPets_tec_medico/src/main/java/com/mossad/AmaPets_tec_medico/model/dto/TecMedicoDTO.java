package com.mossad.AmaPets_tec_medico.model.dto;

import lombok.Data;

@Data
public class TecMedicoDTO {

    private int id_tec_medico;
    private String nombre;
    private int edad;
    private String genero;
    private String email;
}