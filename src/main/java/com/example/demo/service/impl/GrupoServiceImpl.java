package com.example.demo.service.impl;

import com.example.demo.DTO.GrupoDTO;
import java.util.ArrayList;

import com.example.demo.entity.Grupo;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.GrupoRepository;
import com.example.demo.services.GrupoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoServiceImpl implements GrupoService {

    private final GrupoRepository grupoRepository;

    @Autowired
    public GrupoServiceImpl(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    @Override
    public List<Grupo> getAllGrupos() {
        return grupoRepository.findAll();
    }

    @Override
    public Grupo getGrupoById(Long idGrupo) {
        return grupoRepository.findById(idGrupo)
                .orElseThrow(() -> new RuntimeException("Grupo not found with id: " + idGrupo));
    }
    
    @Override
    public Grupo obtenerGrupoPorId(Long id) {
        return grupoRepository.findById(id).orElse(null);
    }

    @Override
    public Grupo createGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    
    @Override
    public Grupo updateGrupo(Long id, Grupo grupo) {
        Optional<Grupo> optionalGrupo = grupoRepository.findById(id);
        if (optionalGrupo.isPresent()) {
            Grupo grupoExistente = optionalGrupo.get();
            grupoExistente.setNombre(grupo.getNombre());
            grupoExistente.setDescripcion(grupo.getDescripcion());
            grupoExistente.setCodigoAcceso(grupo.getCodigoAcceso());
            grupoExistente.setAdministrador(grupo.getAdministrador());
            grupoExistente.setImagen(grupo.getImagen());
            return grupoRepository.save(grupoExistente);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteGrupo(Long id) {
        Grupo grupo = grupoRepository.findById(id).orElse(null);
        if (grupo != null) {
            grupoRepository.delete(grupo);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public List<GrupoDTO> obtenerGruposConAdministradores() {
        List<Grupo> grupos = grupoRepository.findAll();
        return convertirAGrupoUsuarioDTO(grupos);
    }

    private List<GrupoDTO> convertirAGrupoUsuarioDTO(List<Grupo> grupos) {
        List<GrupoDTO> dtos = new ArrayList<>();
        for (Grupo grupo : grupos) {
            Usuario administrador = grupo.getAdministrador();
            GrupoDTO dto = new GrupoDTO(
                    grupo.getIdGrupo(),
                    grupo.getDescripcion(),
                    grupo.getNombre(),
                    grupo.getCodigoAcceso(),
                    administrador.getIdUsuario(),
                    administrador.getNombreUsuario(),
                    administrador.getContrasena(),
                    administrador.getCorreoElectronico(),
                    administrador.getNombre(),
                    administrador.getApellido(),
                    administrador.getTelefono(),
                    grupo.getImagen()
            );
            dtos.add(dto);
        }
        return dtos;
    }

}

