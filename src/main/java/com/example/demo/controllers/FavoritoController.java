package com.example.demo.controllers;

import com.example.demo.entity.Favorito;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Reaccion;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.FavoritoRepository;
import com.example.demo.repository.NoticiaRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.FavoritoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/favoritos")
public class FavoritoController {
    private final FavoritoRepository favoritoRepository;
    private final UsuarioRepository usuarioRepository;
    private final NoticiaRepository noticiaRepository;
    private final FavoritoService favoritoService;

    public FavoritoController(FavoritoRepository favoritoRepository, FavoritoService favoritoService, UsuarioRepository usuarioRepository, NoticiaRepository noticiaRepository) {
        this.favoritoRepository = favoritoRepository;
        this.usuarioRepository = usuarioRepository;
        this.noticiaRepository = noticiaRepository;
		this.favoritoService = favoritoService;
        
    }

    @GetMapping
    public ResponseEntity<List<Favorito>> obtenerTodosLosFavoritos() {
        List<Favorito> favoritos = favoritoService.obtenerFavoritos();
        return ResponseEntity.ok(favoritos);
    }
    
    @PostMapping
    public Favorito crearFavorito(@RequestBody Favorito favorito) {
        return favoritoService.crearFavorito(favorito);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFavorito(@PathVariable Long id) {
        favoritoService.eliminarFavorito(id);
        return ResponseEntity.noContent().build();
    }
}
