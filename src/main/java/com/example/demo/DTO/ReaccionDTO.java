package com.example.demo.DTO;

public class ReaccionDTO {

	private Long idReaccion;
	private String tipoReaccion;
	private Long idUsuario;
	private Long idNoticia;
	private Long idGrupo;
	
	public ReaccionDTO(Long idReaccion, String tipoReaccion, Long idUsuario, Long idNoticia, Long idGrupo) {
		super();
		this.idReaccion = idReaccion;
		this.tipoReaccion = tipoReaccion;
		this.idUsuario = idUsuario;
		this.idNoticia = idNoticia;
		this.idGrupo = idGrupo;
	}

	public Long getIdReaccion() {
		return idReaccion;
	}

	public void setIdReaccion(Long idReaccion) {
		this.idReaccion = idReaccion;
	}

	public String getTipoReaccion() {
		return tipoReaccion;
	}

	public void setTipoReaccion(String tipoReaccion) {
		this.tipoReaccion = tipoReaccion;
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

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}
	
	
	
	
}
