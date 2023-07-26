package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.DTO.FavoritoDTO;
import com.example.demo.DTO.MensajeDTO;
import com.example.demo.entity.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
	
	
}
