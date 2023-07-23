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
    private String activo;
    private Long idGrupo;
    private Long idCategoria;
    private Long idUsuario;
    private byte[] imagen;
    
	public NoticiaDTO(Long idNoticia, String titulo, String contenido, String activo, Long idGrupo, Long idCategoria,
			Long idUsuario, byte[] imagen) {
		super();
		this.idNoticia = idNoticia;
		this.titulo = titulo;
		this.contenido = contenido;
		this.activo = activo;
		this.idGrupo = idGrupo;
		this.idCategoria = idCategoria;
		this.idUsuario = idUsuario;
		this.imagen = imagen;
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

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
    
	

    

}

