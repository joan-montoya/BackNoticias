package com.example.demo.DTO;

import java.sql.Date;

public class MensajeDTO {
    private Long id;
    private Long idEmisor;
    private Long idReceptor;
    private String contenido;
    private Date fechaRegistro;
    private Boolean leido;
    private String grupo;
    
	public MensajeDTO(Long id, Long idEmisor, Long idReceptor, String contenido, Date fechaRegistro, Boolean leido,
			String grupo) {
		super();
		this.id = id;
		this.idEmisor = idEmisor;
		this.idReceptor = idReceptor;
		this.contenido = contenido;
		this.fechaRegistro = fechaRegistro;
		this.leido = leido;
		this.grupo = grupo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdEmisor() {
		return idEmisor;
	}
	public void setIdEmisor(Long idEmisor) {
		this.idEmisor = idEmisor;
	}
	public Long getIdReceptor() {
		return idReceptor;
	}
	public void setIdReceptor(Long idReceptor) {
		this.idReceptor = idReceptor;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Boolean getLeido() {
		return leido;
	}
	public void setLeido(Boolean leido) {
		this.leido = leido;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
    
    


    
}
