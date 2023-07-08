package com.example.demo.DTO;

public class GrupoDTO {
    private Long idGrupo;
    private String descripcion;
    private String nombre;
    private String codigoAcceso;
    private Long idAdministrador;
    private String nombreUsuario;
    private String contrasena;
    private String correoElectronico;
    private String nombreAdministrador;
    private String apellidoAdministrador;
    private String telefonoAdministrador;
    private byte[] imagen;//

    public GrupoDTO(Long idGrupo, String descripcion, String nombre, String codigoAcceso, Long idAdministrador,
                           String nombreUsuario,String contrasena,  String correoElectronico, String nombreAdministrador,
                           String apellidoAdministrador, String telefonoAdministrador, byte[] imagen) {
        this.idGrupo = idGrupo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.codigoAcceso = codigoAcceso;
        this.idAdministrador = idAdministrador;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.correoElectronico = correoElectronico;
        this.nombreAdministrador = nombreAdministrador;
        this.apellidoAdministrador = apellidoAdministrador;
        this.telefonoAdministrador = telefonoAdministrador;
        this.imagen = imagen;
    }

    // Getters y Setters

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAcceso() {
        return codigoAcceso;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        this.codigoAcceso = codigoAcceso;
    }

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    public void setApellidoAdministrador(String apellidoAdministrador) {
        this.apellidoAdministrador = apellidoAdministrador;
    }

    public String getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public void setTelefonoAdministrador(String telefonoAdministrador) {
        this.telefonoAdministrador = telefonoAdministrador;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
