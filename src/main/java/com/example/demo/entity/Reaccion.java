package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Clase Reaccion.java (Entidad)

import javax.persistence.*;

@Entity
@Table(name = "Reaccion")
public class Reaccion {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id_reaccion")
 private Long idReaccion;

 @Column(name = "tipo_reaccion")
 private String tipoReaccion;

 @ManyToOne
 @JoinColumn(name = "id_usuario")
 private Usuario usuario;

 @ManyToOne
 @JoinColumn(name = "id_noticia")
 private Noticia noticia;

public Reaccion() {
	super();
	// TODO Auto-generated constructor stub
}

public Reaccion(Long idReaccion, String tipoReaccion, Usuario usuario, Noticia noticia) {
	super();
	this.idReaccion = idReaccion;
	this.tipoReaccion = tipoReaccion;
	this.usuario = usuario;
	this.noticia = noticia;
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

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public Noticia getNoticia() {
	return noticia;
}

public void setNoticia(Noticia noticia) {
	this.noticia = noticia;
}

 
}
