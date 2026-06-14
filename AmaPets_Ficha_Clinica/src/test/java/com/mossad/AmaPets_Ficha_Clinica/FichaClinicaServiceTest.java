package com.mossad.AmaPets_Ficha_Clinica;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mossad.AmaPets_Ficha_Clinica.models.entities.FichaClinica;
import com.mossad.AmaPets_Ficha_Clinica.repository.FichaClinicaRepository;
import com.mossad.AmaPets_Ficha_Clinica.service.FichaClinicaService;

@ExtendWith(MockitoExtension.class)  
public class FichaClinicaServiceTest {
    
    @Mock
    private FichaClinicaRepository fichaClinicaRepository; 

    @InjectMocks
    private FichaClinicaService fichaClinicaService; 

    @Test
    void obtenerTodasLasFichas_retornaLista() {
        // 1. ARRANGE — preparar datos falsos
        FichaClinica ficha = new FichaClinica();
        ficha.setDiagnostico("Gripe");
        when(fichaClinicaRepository.findAll()).thenReturn(List.of(ficha));

        // 2. ACT — ejecutar el método
        List<FichaClinica> resultado = fichaClinicaService.obtenerTodasLasFichas();

        // 3. ASSERT — verificar resultado
        assertEquals(1, resultado.size());
        assertEquals("Gripe", resultado.get(0).getDiagnostico());
    }

}
