package com.example.demo.controllers;

import com.example.demo.DTO.GrupoDTO;
import com.example.demo.DTO.NoticiaDTO;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Usuario;
import com.example.demo.services.NoticiaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {
    private final NoticiaService noticiaService;

    @Autowired
    public NoticiaController(NoticiaService noticiaService) {
        this.noticiaService = noticiaService;
    }

    @GetMapping
    public ResponseEntity<List<Noticia>> obtenerTodasLasNoticias() {
        List<Noticia> noticias = noticiaService.obtenerTodasLasNoticias();
        return new ResponseEntity<>(noticias, HttpStatus.OK);
    }
    
    @CrossOrigin
    @GetMapping("/dto")
    public List<NoticiaDTO> obtenerNoticiasDTO() {
        return noticiaService.obtenerNoticiasDTO();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Noticia> obtenerNoticiaPorId(@PathVariable("id") Long id) {
        Noticia noticia = noticiaService.obtenerNoticiaPorId(id);
        if (noticia != null) {
            return new ResponseEntity<>(noticia, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Noticia> crearNoticia(@RequestBody Noticia noticia) {
        Noticia nuevaNoticia = noticiaService.crearNoticia(noticia);
        return new ResponseEntity<>(nuevaNoticia, HttpStatus.CREATED);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Noticia> actualizarNoticia(@PathVariable("id") Long id, @RequestBody Noticia noticia) {
        Noticia noticiaActualizada = noticiaService.actualizarNoticia(id, noticia);
        if (noticiaActualizada != null) {
            return new ResponseEntity<>(noticiaActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void eliminarNoticia(@PathVariable("id") Long idNoticia) {
    	noticiaService.eliminarNoticia(idNoticia);
    }
    
    
}

