package com.example.demo.controllers;

import com.example.demo.DTO.CategoriaDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Grupo;
import com.example.demo.services.CategoriaService;
import com.example.demo.services.GrupoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @CrossOrigin
    @GetMapping("/{idCategoria}")
    public ResponseEntity<Categoria> obtenerCategoria(@PathVariable Long idCategoria) {
        Categoria categoria = categoriaService.obtenerCategoriaPorId(idCategoria);
        if (categoria != null) {
            return ResponseEntity.ok(categoria);
        }
        return ResponseEntity.notFound().build();
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Categoria>> obtenerTodasLasCategorias() {
        List<Categoria> categorias = categoriaService.obtenerTodasLasCategorias();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }
    
    @CrossOrigin
    @PostMapping
    public ResponseEntity<Categoria> agregarCategoria(@RequestBody Categoria categoria) {
        Categoria nuevaCategoria = categoriaService.agregarCategoria(categoria);
        if (nuevaCategoria != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevaCategoria);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @CrossOrigin
    @PutMapping("/{idCategoria}")
    public ResponseEntity<Void> actualizarCategoria(@PathVariable Long idCategoria, @RequestBody Categoria categoria) {
        Categoria categoriaExistente = categoriaService.obtenerCategoriaPorId(idCategoria);
        if (categoriaExistente != null) {
            categoria.setIdCategoria(idCategoria);
            categoriaService.actualizarCategoria(categoria);
            return ResponseEntity.ok().build(); // Respuesta sin contenido
        }
        return ResponseEntity.notFound().build();
    }


    @CrossOrigin
    @DeleteMapping("/{idCategoria}")
    public ResponseEntity<Void> eliminarCategoria(@PathVariable Long idCategoria) {
        boolean eliminado = categoriaService.eliminarCategoria(idCategoria);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    
    @CrossOrigin
    @GetMapping("/dto")
    public List<CategoriaDTO> obtenerCategoriasDTO() {
        return categoriaService.obtenerCategoriasDTO();
    }
}

