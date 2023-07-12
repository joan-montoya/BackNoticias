package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.FavoritoDTO;
import com.example.demo.entity.Favorito;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {
	
	@Query("SELECT new com.example.demo.DTO.FavoritoDTO(f.idFavorito, f.usuario.idUsuario, f.noticia.idNoticia) FROM Favorito f")
    List<FavoritoDTO> obtenerFavoritosDTO();
}

