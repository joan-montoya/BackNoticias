package com.example.demo.service.impl;

import com.example.demo.DTO.ReaccionDTO;
import com.example.demo.entity.Reaccion;
import com.example.demo.repository.ReaccionRepository;
import com.example.demo.services.ReaccionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Clase ReaccionServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ReaccionServiceImpl implements ReaccionService {
 private final ReaccionRepository reaccionRepository;

 @Autowired
 public ReaccionServiceImpl(ReaccionRepository reaccionRepository) {
     this.reaccionRepository = reaccionRepository;
 }

 @Override
 public Reaccion crearReaccion(Reaccion reaccion) {
     return reaccionRepository.save(reaccion);
 }

 @Override
 public Reaccion obtenerReaccionPorId(Long idReaccion) {
     return reaccionRepository.findById(idReaccion)
             .orElseThrow(() -> new NoSuchElementException("Reaccion no encontrada con ID: " + idReaccion));
 }

 @Override
 public Reaccion actualizarReaccion(Long idReaccion, Reaccion reaccion) {
     reaccion.setIdReaccion(idReaccion);
     return reaccionRepository.save(reaccion);
 }

 @Override
 public void eliminarReaccion(Long idReaccion) {
     reaccionRepository.deleteById(idReaccion);
 }

 @Override
 public List<Reaccion> obtenerTodasLasReacciones() {
     return reaccionRepository.findAll();
 }
 
 @Override
 public List<ReaccionDTO> obtenerReaccionesDTO() {
     return reaccionRepository.obtenerReaccionesDTO();
 }
}

