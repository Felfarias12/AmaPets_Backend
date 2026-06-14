package com.mossad.amapets_mascota;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mossad.amapets_mascota.model.entities.Mascota;
import com.mossad.amapets_mascota.repository.MascotaRepository;
import com.mossad.amapets_mascota.service.MascotaService;

@ExtendWith(MockitoExtension.class)  // ← solo Mockito, sin Spring
class MascotaServiceTest {

    @Mock
    private MascotaRepository mascotaRepository;  // BD simulada

    @InjectMocks
    private MascotaService mascotaService;  // el que queremos probar

    @Test
    void obtenerTodasLasMascotas_retornaLista() {
        // 1. ARRANGE — preparar datos falsos
        Mascota mascota = new Mascota();
        mascota.setNombre("Firulais");
        when(mascotaRepository.findAll()).thenReturn(List.of(mascota));

        // 2. ACT — ejecutar el método
        List<Mascota> resultado = mascotaService.obtenerTodasLasMascotas();

        // 3. ASSERT — verificar resultado
        assertEquals(1, resultado.size());
        assertEquals("Firulais", resultado.get(0).getNombre());
    }
}