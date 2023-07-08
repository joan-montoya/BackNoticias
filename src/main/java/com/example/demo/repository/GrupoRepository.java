package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
	@Query("SELECT g FROM Grupo g")
    List<Grupo> getAllGrupos();
}
