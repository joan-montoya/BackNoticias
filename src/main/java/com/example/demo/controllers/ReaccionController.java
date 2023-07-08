package com.example.demo.controllers;

import com.example.demo.entity.Reaccion;
import com.example.demo.services.ReaccionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reacciones")
public class ReaccionController {
    private final ReaccionService reaccionService;

    @Autowired
    public ReaccionController(ReaccionService reaccionService) {
        this.reaccionService = reaccionService;
    }

    @PostMapping
    public Reaccion crearReaccion(@RequestBody Reaccion reaccion) {
        return reaccionService.crearReaccion(reaccion);
    }

    @GetMapping("/{id}")
    public Reaccion obtenerReaccionPorId(@PathVariable("id") Long idReaccion) {
        return reaccionService.obtenerReaccionPorId(idReaccion);
    }

    @PutMapping("/{id}")
    public Reaccion actualizarReaccion(@PathVariable("id") Long idReaccion, @RequestBody Reaccion reaccion) {
        return reaccionService.actualizarReaccion(idReaccion, reaccion);
    }

    @DeleteMapping("/{id}")
    public void eliminarReaccion(@PathVariable("id") Long idReaccion) {
        reaccionService.eliminarReaccion(idReaccion);
    }

    @GetMapping
    public List<Reaccion> obtenerTodasLasReacciones() {
        return reaccionService.obtenerTodasLasReacciones();
    }
}