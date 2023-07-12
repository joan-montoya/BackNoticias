package com.example.demo.services;

import com.example.demo.DTO.FavoritoDTO;
import com.example.demo.entity.Favorito;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Reaccion;
import com.example.demo.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface FavoritoService {
    List<Favorito> obtenerFavoritos();
    void eliminarFavorito(Long favoritoId);
    Favorito crearFavorito(Favorito favorito);
    List<FavoritoDTO> obtenerFavoritosDTO();
}


