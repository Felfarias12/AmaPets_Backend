package com.mossad.AmaPets_veterinario.model.dto;

import lombok.Data;

@Data
public class VeterinarioDTO {

    private int id_veterinario;
    private String nombre;
    private int edad;
    private String genero;
    private String correo;
}