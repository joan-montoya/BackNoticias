package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.CategoriaDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	List<Categoria> findByGrupoIdGrupo(Long idGrupo);
	
	@Query("SELECT new com.example.demo.DTO.CategoriaDTO(m.idCategoria, m.nombreCategoria, m.grupo.idGrupo) FROM Categoria m")
    List<CategoriaDTO> obtenerCategoriasDTO();
}
