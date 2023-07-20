package com.example.demo.services;

import com.example.demo.DTO.GrupoDTO;
import com.example.demo.DTO.NoticiaDTO;
import com.example.demo.entity.Noticia;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface NoticiaService {
    List<Noticia> obtenerTodasLasNoticias();

    Noticia obtenerNoticiaPorId(Long id);

    Noticia crearNoticia(Noticia noticia);

    Noticia actualizarNoticia(Long id, Noticia noticia);

    void eliminarNoticia(Long idNoticia); 
    
    List<NoticiaDTO> obtenerNoticiasDTO();
}


