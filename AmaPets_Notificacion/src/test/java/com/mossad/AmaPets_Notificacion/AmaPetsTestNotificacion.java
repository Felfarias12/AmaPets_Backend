package com.mossad.AmaPets_Notificacion;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mossad.AmaPets_Notificacion.models.entities.Notificacion;
import com.mossad.AmaPets_Notificacion.repository.NotificacionRepository;
import com.mossad.AmaPets_Notificacion.service.NotificacionService;

@ExtendWith(MockitoExtension.class)
class NotificacionServiceTest {

    @Mock
    private NotificacionRepository notificacionRepository;

    @InjectMocks
    private NotificacionService notificacionService;

    @Test
    void obtenerTodasLasNotificaciones_retornaLista() {

        // ARRANGE
        Notificacion notificacion = new Notificacion();
        notificacion.setId_notificacion(1);
        notificacion.setTitulo_notificacion("Recordatorio");
        notificacion.setMensaje("Vacuna programada");
        notificacion.setFecha_notificacion(LocalDate.now());
        notificacion.setId_usuario(1);

        when(notificacionRepository.findAll())
                .thenReturn(List.of(notificacion));

        // ACT
        List<Notificacion> resultado =
                notificacionService.obtenerTodasLasNotificaciones();

        // ASSERT
        assertEquals(1, resultado.size());
        assertEquals("Recordatorio",
                resultado.get(0).getTitulo_notificacion());
        assertEquals("Vacuna programada",
                resultado.get(0).getMensaje());
    }

    @Test
    void obtenerNotificacionPorId_retornaNotificacion() {

        // ARRANGE
        Notificacion notificacion = new Notificacion();
        notificacion.setId_notificacion(1);
        notificacion.setTitulo_notificacion("Alerta");

        when(notificacionRepository.findById(1))
                .thenReturn(Optional.of(notificacion));

        // ACT
        Optional<Notificacion> resultado = notificacionRepository.findById(1);

        // ASSERT
        assertTrue(resultado.isPresent());
        assertEquals("Alerta", resultado.get().getTitulo_notificacion());
    }

    @Test
    void crearNotificacion_retornaNotificacionGuardada() {

        // ARRANGE
        Notificacion notificacion = new Notificacion();
        notificacion.setTitulo_notificacion("Nueva Notificación");
        notificacion.setMensaje("Mensaje de prueba");

        when(notificacionRepository.save(notificacion))
                .thenReturn(notificacion);

        // ACT
        Notificacion resultado =
                notificacionService.crearNotificacion(notificacion);

        // ASSERT
        assertEquals("Nueva Notificación",
                resultado.getTitulo_notificacion());
        assertEquals("Mensaje de prueba",
                resultado.getMensaje());
    }

    @Test
    void actualizarNotificacion_retornaNotificacionActualizada() {

        // ARRANGE
        Notificacion notificacionExistente = new Notificacion();
        notificacionExistente.setId_notificacion(1);
        notificacionExistente.setTitulo_notificacion("Anterior");
        notificacionExistente.setMensaje("Mensaje anterior");
        notificacionExistente.setFecha_notificacion(LocalDate.of(2026, 1, 1));
        notificacionExistente.setId_usuario(1);

        Notificacion notificacionActualizada = new Notificacion();
        notificacionActualizada.setTitulo_notificacion("Actualizada");
        notificacionActualizada.setMensaje("Mensaje nuevo");
        notificacionActualizada.setFecha_notificacion(LocalDate.of(2026, 6, 14));
        notificacionActualizada.setId_usuario(2);

        when(notificacionRepository.findById(1))
                .thenReturn(Optional.of(notificacionExistente));

        when(notificacionRepository.save(notificacionExistente))
                .thenReturn(notificacionExistente);

        // ACT
        Notificacion resultado =
                notificacionService.actualizarNotificacion(1, notificacionActualizada);

        // ASSERT
        assertEquals("Actualizada", resultado.getTitulo_notificacion());
        assertEquals("Mensaje nuevo", resultado.getMensaje());
        assertEquals(LocalDate.of(2026, 6, 14), resultado.getFecha_notificacion());
        assertEquals(2, resultado.getId_usuario());
    }

    @Test
    void eliminarNotificacion_llamaRepository() {

        Notificacion notificacion = new Notificacion();
        notificacion.setId_notificacion(1);

        when(notificacionRepository.findById(1))
                .thenReturn(Optional.of(notificacion));

        // ACT
        String resultado = notificacionService.eliminarNotificacion(1);

        // ASSERT
        assertEquals("Notificacion eliminada", resultado);
        verify(notificacionRepository).delete(notificacion);
    }
}