package com.example.demo.services;

import java.util.List;

import com.example.demo.DTO.FavoritoDTO;
import com.example.demo.DTO.MensajeDTO;
import com.example.demo.entity.Mensaje;

public interface MensajeService {
    Mensaje obtenerMensajePorId(Long id);

    Mensaje guardarMensaje(Mensaje mensaje);

    Mensaje actualizarMensaje(Long id, Mensaje mensaje);

    void eliminarMensaje(Long id);

    List<Mensaje> obtenerTodosLosMensajes();
    
}
