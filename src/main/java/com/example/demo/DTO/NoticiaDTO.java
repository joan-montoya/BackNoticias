package com.example.demo.DTO;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Grupo;
import com.example.demo.entity.Usuario;

public class NoticiaDTO {
    private Long idNoticia;
    private String titulo;
    private String contenido;
    private Long idGrupo;
    private Long idCategoria;
    private byte[] imagen;

    public NoticiaDTO(Long idNoticia, String titulo, String contenido, Long idGrupo, Long idCategoria, byte[] imagen) {
        this.idNoticia = idNoticia;
        this.titulo = titulo;
        this.contenido = contenido;
        this.idGrupo = idGrupo;
        this.idCategoria = idCategoria;
        this.setImagen(imagen);
    }

    public Long getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Long idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}


}

