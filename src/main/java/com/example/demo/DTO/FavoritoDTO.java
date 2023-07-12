package com.example.demo.DTO;

public class FavoritoDTO {
	
	private Long idFavorito;
	private Long idUsuario;
	private Long idNoticia;
	
	
	public FavoritoDTO(Long idFavorito, Long idUsuario, Long idNoticia) {
		super();
		this.idFavorito = idFavorito;
		this.idUsuario = idUsuario;
		this.idNoticia = idNoticia;
	}
	
	public Long getIdFavorito() {
		return idFavorito;
	}
	public void setIdFavorito(Long idFavorito) {
		this.idFavorito = idFavorito;
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
	
	

}
