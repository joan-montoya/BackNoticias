package com.example.demo.controllers;

import com.example.demo.DTO.GrupoDTO;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Grupo;
import com.example.demo.entity.Noticia;
import com.example.demo.services.CategoriaService;
import com.example.demo.services.GrupoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {

    private final GrupoService grupoService;
    private final CategoriaService categoriaService;

    public GrupoController(GrupoService grupoService, CategoriaService categoriaService) {
        this.grupoService = grupoService;
        this.categoriaService = categoriaService;
    }

    @CrossOrigin
    @GetMapping
    public List<Grupo> getAllGrupos() {
        return grupoService.getAllGrupos();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Grupo> getGrupoById(@PathVariable Long id) {
        Grupo grupo = grupoService.getGrupoById(id);
        if (grupo != null) {
            return ResponseEntity.ok(grupo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin
    @PostMapping
    public Grupo createGrupo(@RequestBody Grupo grupo) {
        return grupoService.createGrupo(grupo);
    }


    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Grupo> updateGrupo(@PathVariable("id") Long id, @RequestBody Grupo grupo) {
        Grupo updatedGrupo = grupoService.updateGrupo(id, grupo);
        if (updatedGrupo != null) {
            return new ResponseEntity<>( HttpStatus.OK);
        } else {
        	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrupo(@PathVariable Long id) {
        boolean deleted = grupoService.deleteGrupo(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @CrossOrigin
    @GetMapping("/dto")
    public List<GrupoDTO> obtenerGruposConAdministradores() {
        return grupoService.obtenerGruposConAdministradores();
    }
    

    
    
}
