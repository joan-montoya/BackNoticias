package com.example.demo.controllers;

import com.example.demo.DTO.ComentarioDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Comentario;
import com.example.demo.services.ComentarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    
    private final ComentarioService comentarioService;

    public ComentarioController(ComentarioService comentarioService) {
        this.comentarioService = comentarioService;
    }

    @CrossOrigin
    @PostMapping
    public Comentario agregarComentario(@RequestBody Comentario comentario) {
        return comentarioService.agregarComentario(comentario);
    }

    @GetMapping("/{id}")
    public Comentario obtenerComentarioPorId(@PathVariable Long id) {
        return comentarioService.obtenerComentarioPorId(id);
    }

    @GetMapping
    public List<Comentario> obtenerTodosLosComentarios() {
        return comentarioService.obtenerTodosLosComentarios();
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public Comentario actualizarComentario(@PathVariable Long id, @RequestBody Comentario comentario) {
        return comentarioService.actualizarComentario(id, comentario);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void eliminarComentario(@PathVariable Long id) {
        comentarioService.eliminarComentario(id);
    }
    
    @CrossOrigin
    @GetMapping("/dto")
    public List<ComentarioDTO> obtenerComentariosDTO() {
        return comentarioService.obtenerComentariosDTO();
    }
}
