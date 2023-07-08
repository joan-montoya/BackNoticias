package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Grupo;
import com.example.demo.entity.Noticia;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
	
	@Query("SELECT n FROM Noticia n")
    List<Noticia> getAllNoticias();
}

