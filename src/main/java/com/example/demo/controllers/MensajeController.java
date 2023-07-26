package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.FavoritoDTO;
import com.example.demo.DTO.MensajeDTO;
import com.example.demo.entity.Mensaje;
import com.example.demo.services.MensajeService;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    private final MensajeService mensajeService;

    public MensajeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> obtenerMensajePorId(@PathVariable Long id) {
        Mensaje mensaje = mensajeService.obtenerMensajePorId(id);
        return ResponseEntity.ok(mensaje);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Mensaje> guardarMensaje(@RequestBody Mensaje mensaje) {
        mensaje = mensajeService.guardarMensaje(mensaje);
        return new ResponseEntity<>(mensaje, HttpStatus.CREATED);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Mensaje> actualizarMensaje(@PathVariable Long id, @RequestBody Mensaje mensaje) {
        Mensaje mensajeActualizado = mensajeService.actualizarMensaje(id, mensaje);
        return ResponseEntity.ok(mensajeActualizado);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMensaje(@PathVariable Long id) {
        mensajeService.eliminarMensaje(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @CrossOrigin
    @GetMapping
    public ResponseEntity<List<Mensaje>> obtenerTodosLosMensajes() {
        List<Mensaje> mensajes = mensajeService.obtenerTodosLosMensajes();
        return ResponseEntity.ok(mensajes);
    }
    
   

}