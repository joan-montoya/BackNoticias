package com.example.demo.services;

import com.example.demo.DTO.GrupoDTO;
import com.example.demo.entity.Grupo;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface GrupoService {

    List<Grupo> getAllGrupos();

    Grupo getGrupoById(Long id);

    Grupo createGrupo(Grupo grupo);

    Grupo updateGrupo(Long id, Grupo grupo);

    boolean deleteGrupo(Long id);
    
    Grupo obtenerGrupoPorId(Long id);
    List<GrupoDTO> obtenerGruposConAdministradores();
}

