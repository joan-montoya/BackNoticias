package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Favorito;
import com.example.demo.entity.Miembro;
import com.example.demo.services.MiembroService;

import java.util.List;

@RestController
@RequestMapping("/miembros")
public class MiembroController {

    private final MiembroService miembroService;

    @Autowired
    public MiembroController(MiembroService miembroService) {
        this.miembroService = miembroService;
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Miembro>> obtenerTodosLosMiembros() {
        List<Miembro> miembros = miembroService.obtenerTodosLosMiembros();
        return new ResponseEntity<>(miembros, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping
    public Miembro crearMiembro(@RequestBody Miembro miembro) {
        return miembroService.guardarMiembro(miembro);
    }


    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMiembro(@PathVariable("id") Long id) {
        miembroService.eliminarMiembro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
 
    @CrossOrigin
    @GetMapping("/dto")
    public List<MiembroDTO> obtenerMiembrosDTO() {
        return miembroService.obtenerMiembrosDTO();
    }
}
