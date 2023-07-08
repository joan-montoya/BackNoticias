package com.example.demo.services;

import com.example.demo.entity.Reaccion;

import java.util.List;
import java.util.Optional;

//Interfaz ReaccionService.java

import java.util.List;

public interface ReaccionService {
 Reaccion crearReaccion(Reaccion reaccion);
 Reaccion obtenerReaccionPorId(Long idReaccion);
 Reaccion actualizarReaccion(Long idReaccion, Reaccion reaccion);
 void eliminarReaccion(Long idReaccion);
 List<Reaccion> obtenerTodasLasReacciones();
}
