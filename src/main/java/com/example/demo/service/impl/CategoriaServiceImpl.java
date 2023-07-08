package com.example.demo.service.impl;

import com.example.demo.DTO.CategoriaDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Grupo;
import com.example.demo.repository.CategoriaRepository;
import com.example.demo.services.CategoriaService;
import com.example.demo.services.GrupoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria obtenerCategoriaPorId(Long idCategoria) {
        return categoriaRepository.findById(idCategoria).orElse(null);
    }
    
    @Override
    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria agregarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public boolean eliminarCategoria(Long idCategoria) {
        if (categoriaRepository.existsById(idCategoria)) {
            categoriaRepository.deleteById(idCategoria);
            return true;
        }
        return false;
    }
    
    @Override
    public List<CategoriaDTO> obtenerCategoriasDTO() {
        return categoriaRepository.obtenerCategoriasDTO();
    }
}



