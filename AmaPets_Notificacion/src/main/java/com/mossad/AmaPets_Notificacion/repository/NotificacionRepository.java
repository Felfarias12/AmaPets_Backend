package com.mossad.AmaPets_Notificacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mossad.AmaPets_Notificacion.models.entities.Notificacion;

public interface NotificacionRepository extends JpaRepository<Notificacion, Integer> {
}
