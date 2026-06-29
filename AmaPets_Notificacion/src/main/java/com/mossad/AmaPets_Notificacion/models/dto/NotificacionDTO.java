package com.mossad.AmaPets_Notificacion.models.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class NotificacionDTO {

    private int id_notificacion;
    private String mensaje;
    private String titulo_notificacion;
    private LocalDate fecha_notificacion;
    private int id_usuario;
    private int id_hospitalizacion;
}