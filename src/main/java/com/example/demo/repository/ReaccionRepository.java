package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.ComentarioDTO;
import com.example.demo.DTO.ReaccionDTO;
import com.example.demo.entity.Reaccion;

@Repository
public interface ReaccionRepository extends JpaRepository<Reaccion, Long> {
	
	@Query("SELECT new com.example.demo.DTO.ReaccionDTO(r.idReaccion, r.tipoReaccion, r.usuario.idUsuario, r.noticia.idNoticia, r.noticia.grupo.idGrupo) FROM Reaccion r")
    List<ReaccionDTO> obtenerReaccionesDTO();
}

