package com.mossad.ama_pets_hospitalizacion.model.dto;

import lombok.Data;
import java.util.Date;

@Data
public class HospitalizacionDTO {

    private int id_hospitalizacion;
    private Date fecha_ingreso;
    private Date fecha_egreso;
    private String observaciones;
    private int id_usuario;
    private int id_cirugia;
}