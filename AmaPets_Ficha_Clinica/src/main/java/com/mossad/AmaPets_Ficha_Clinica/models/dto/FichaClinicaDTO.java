package com.mossad.AmaPets_Ficha_Clinica.models.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class FichaClinicaDTO {

    private int id_ficha_clinica;
    private int mascotaId;
    private LocalDate fecha;
    private String motivo;
    private String veterinario;
    private double peso;
    private String temperatura;
    private String diagnostico;
    private String tratamiento;
    private String notas;
}