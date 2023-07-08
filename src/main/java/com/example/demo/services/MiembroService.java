package com.example.demo.services;

import java.util.List;

import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Miembro;

public interface MiembroService {
    Miembro guardarMiembro(Miembro miembro);
    List<Miembro> obtenerTodosLosMiembros();
    void eliminarMiembro(Long id);
    List<MiembroDTO> obtenerMiembrosDTO();
}

