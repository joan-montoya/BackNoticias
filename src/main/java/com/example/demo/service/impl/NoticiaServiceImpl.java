package com.example.demo.service.impl;

import com.example.demo.DTO.GrupoDTO;
import com.example.demo.DTO.NoticiaDTO;
import com.example.demo.entity.Grupo;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.NoticiaRepository;
import com.example.demo.services.NoticiaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServiceImpl implements NoticiaService {
    private final NoticiaRepository noticiaRepository;

    @Autowired
    public NoticiaServiceImpl(NoticiaRepository noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }

    @Override
    public List<Noticia> obtenerTodasLasNoticias() {
        return noticiaRepository.findAll();
    }

    @Override
    public Noticia obtenerNoticiaPorId(Long id) {
        Optional<Noticia> optionalNoticia = noticiaRepository.findById(id);
        return optionalNoticia.orElse(null);
    }

    @Override
    public Noticia crearNoticia(Noticia noticia) {
        return noticiaRepository.save(noticia);
    }

    @Override
    public Noticia actualizarNoticia(Long id, Noticia noticia) {
        Optional<Noticia> optionalNoticia = noticiaRepository.findById(id);
        if (optionalNoticia.isPresent()) {
            Noticia noticiaExistente = optionalNoticia.get();
            noticiaExistente.setTitulo(noticia.getTitulo());
            noticiaExistente.setContenido(noticia.getContenido());
            noticiaExistente.setGrupo(noticia.getGrupo());
            noticiaExistente.setCategoria(noticia.getCategoria());
            noticiaExistente.setAdministrador(noticia.getAdministrador());
            noticiaExistente.setImagen(noticia.getImagen());
            noticiaExistente.setActivo(noticia.getActivo());
            return noticiaRepository.save(noticiaExistente);
        } else {
            return null;
        }
    }

   
    
    
    @Override
    public void eliminarNoticia(Long idNoticia) {
        noticiaRepository.deleteById(idNoticia);
    }
    
    @Override
    public List<NoticiaDTO> obtenerNoticiasDTO() {
        List<Noticia> noticias = noticiaRepository.findAll();
        return convertirNoticias(noticias);
    }

    private List<NoticiaDTO> convertirNoticias(List<Noticia> noticias) {
        List<NoticiaDTO> dtos = new ArrayList<>();
        for (Noticia noticia : noticias) {
            NoticiaDTO dto = new NoticiaDTO(
                noticia.getIdNoticia(),
                noticia.getTitulo(),
                noticia.getContenido(),
                noticia.getActivo(),
                noticia.getGrupo().getIdGrupo(),
                noticia.getCategoria().getIdCategoria(),
                noticia.getAdministrador().getIdUsuario(),
                noticia.getImagen()
                
            );
            dtos.add(dto);
        }
        return dtos;
    }

}

