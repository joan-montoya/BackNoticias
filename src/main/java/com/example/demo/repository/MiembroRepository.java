package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Miembro;

@Repository
public interface MiembroRepository extends JpaRepository<Miembro, Long> {
	
	@Query("SELECT new com.example.demo.DTO.MiembroDTO(m.idMiembro, m.usuario.idUsuario, m.grupo.idGrupo) FROM Miembro m")
    List<MiembroDTO> obtenerMiembrosDTO();
}
