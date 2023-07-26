package com.example.demo.service.impl;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.DTO.FavoritoDTO;
import com.example.demo.DTO.MensajeDTO;
import com.example.demo.entity.Mensaje;
import com.example.demo.repository.MensajeRepository;
import com.example.demo.services.MensajeService;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class MensajeServiceImpl implements MensajeService {
    private final MensajeRepository mensajeRepository;

    public MensajeServiceImpl(MensajeRepository mensajeRepository) {
        this.mensajeRepository = mensajeRepository;
    }

    @Override
    public Mensaje obtenerMensajePorId(Long id) {
        return mensajeRepository.findById(id).orElseThrow(() -> new RuntimeException("Mensaje no encontrado"));
    }

    @Override
    @Transactional
    public Mensaje guardarMensaje(Mensaje mensaje) {
        mensaje.setFechaRegistro(new Date(Calendar.getInstance().getTimeInMillis())); // Establecer la fecha y hora actual
        return mensajeRepository.save(mensaje);
    }

    @Override
    @Transactional
    public Mensaje actualizarMensaje(Long id, Mensaje mensaje) {
        Mensaje mensajeExistente = mensajeRepository.findById(id).orElseThrow(() -> new RuntimeException("Mensaje no encontrado"));
        mensajeExistente.setEmisor(mensaje.getEmisor());
        mensajeExistente.setReceptor(mensaje.getReceptor());
        mensajeExistente.setContenido(mensaje.getContenido());
        mensajeExistente.setLeido(mensaje.isLeido());
        return mensajeRepository.save(mensajeExistente);
    }

    @Override
    @Transactional
    public void eliminarMensaje(Long id) {
        mensajeRepository.deleteById(id);
    }

    @Override
    public List<Mensaje> obtenerTodosLosMensajes() {
        return mensajeRepository.findAll();
    }
    
 
}