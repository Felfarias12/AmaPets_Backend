package com.mossad.AmaPets.models.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private int id_usuario;
    private String nombre;
    private int edad;
    private String correo;
    
}
