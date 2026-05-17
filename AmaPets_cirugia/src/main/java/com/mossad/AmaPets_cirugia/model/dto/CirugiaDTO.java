package com.mossad.AmaPets_cirugia.model.dto;

import lombok.Data;
import java.util.Date;

@Data
public class CirugiaDTO {

    private int id_cirugia;
    private Date fecha_cirugia;
    private String tipo_cirugia;
    private String descripcion_cirugia;
}