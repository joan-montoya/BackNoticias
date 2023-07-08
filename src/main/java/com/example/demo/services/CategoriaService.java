package com.example.demo.services;

import com.example.demo.DTO.CategoriaDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    Categoria obtenerCategoriaPorId(Long idCategoria);

    Categoria agregarCategoria(Categoria categoria);

    Categoria actualizarCategoria(Categoria categoria);

    boolean eliminarCategoria(Long idCategoria);
    
    List<Categoria> obtenerTodasLasCategorias();
    
    List<CategoriaDTO> obtenerCategoriasDTO();
}




