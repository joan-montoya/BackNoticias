package com.example.demo.services;

import com.example.demo.DTO.ComentarioDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Comentario;

import java.util.List;
import java.util.Optional;

public interface ComentarioService {
    Comentario agregarComentario(Comentario comentario);
    Comentario obtenerComentarioPorId(Long id);
    List<Comentario> obtenerTodosLosComentarios();
    Comentario actualizarComentario(Long id, Comentario comentario);
    void eliminarComentario(Long id);
    List<ComentarioDTO> obtenerComentariosDTO();
}


