package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.ComentarioDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
	
	@Query("SELECT new com.example.demo.DTO.ComentarioDTO(c.idComentario, c.contenido, c.usuario.idUsuario, c.noticia.idNoticia, c.usuario.avatar, c.usuario.nombreUsuario) FROM Comentario c")
    List<ComentarioDTO> obtenerComentariosDTO();
}

