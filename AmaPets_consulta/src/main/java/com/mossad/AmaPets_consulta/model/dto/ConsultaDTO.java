package com.mossad.AmaPets_consulta.model.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ConsultaDTO {

    private int id_consulta;
    private Date fecha_consulta;
    private String motivo;
}