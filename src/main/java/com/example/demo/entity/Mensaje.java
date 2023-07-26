package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.*;
import java.sql.Date; // Importar java.sql.Date en lugar de java.util.Date

@Entity
@Table(name = "Mensaje")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensaje")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_emisor")
    private Usuario emisor;

    @ManyToOne
    @JoinColumn(name = "id_receptor")
    private Usuario receptor;

    @Column(name = "contenido", columnDefinition = "TEXT")
    private String contenido;

    @Column(name = "fecha_registro")
    private Date fechaRegistro; // Utilizar java.sql.Date
    
    @Column(name = "leido")
    private boolean leido; // Agregamos el campo leido de tipo booleano
    
    @Column(name = "grupo", columnDefinition = "TEXT")
    private String grupo;

	
	
	 

	public Mensaje(Long id, Usuario emisor, Usuario receptor, String contenido, Date fechaRegistro, boolean leido,
			String grupo) {
		super();
		this.id = id;
		this.emisor = emisor;
		this.receptor = receptor;
		this.contenido = contenido;
		this.fechaRegistro = fechaRegistro;
		this.leido = leido;
		this.grupo = grupo;
	}

	public Mensaje() {
	    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getEmisor() {
		return emisor;
	}

	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}

	public Usuario getReceptor() {
		return receptor;
	}

	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
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

	public boolean isLeido() {
		return leido;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	
    
    
}
