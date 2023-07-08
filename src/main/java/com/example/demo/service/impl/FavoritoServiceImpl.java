package com.example.demo.service.impl;

import com.example.demo.entity.Favorito;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Reaccion;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.FavoritoRepository;
import com.example.demo.services.FavoritoService;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class FavoritoServiceImpl implements FavoritoService {
    private final FavoritoRepository favoritoRepository;

    public FavoritoServiceImpl(FavoritoRepository favoritoRepository) {
        this.favoritoRepository = favoritoRepository;
    }

    
    @Override
    public Favorito crearFavorito(Favorito favorito) {
        return favoritoRepository.save(favorito);
    }

    @Override
    public List<Favorito> obtenerFavoritos() {
        return favoritoRepository.findAll();
    }

    @Override
    public void eliminarFavorito(Long favoritoId) {
        favoritoRepository.deleteById(favoritoId);
    }
}



