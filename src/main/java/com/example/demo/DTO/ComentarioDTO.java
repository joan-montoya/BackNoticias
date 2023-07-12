package com.example.demo.DTO;

public class ComentarioDTO {
	
	private Long idComentario;
	private String contenido;
	private Long idUsuario;
	private Long idNoticia;
	private String avatar;
	private String nombreUsuario;
	
	public ComentarioDTO(Long idComentario, String contenido, Long idUsuario, Long idNoticia, String avatar,
			String nombreUsuario) {
		super();
		this.idComentario = idComentario;
		this.contenido = contenido;
		this.idUsuario = idUsuario;
		this.idNoticia = idNoticia;
		this.avatar = avatar;
		this.nombreUsuario = nombreUsuario;
	}
	
	public Long getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(Long idNoticia) {
		this.idNoticia = idNoticia;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	
}
