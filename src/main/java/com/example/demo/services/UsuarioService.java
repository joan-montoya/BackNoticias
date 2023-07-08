package com.example.demo.services;

import com.example.demo.entity.Usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

public interface UsuarioService {
    List<Usuario> obtenerTodosLosUsuarios();

    Optional<Usuario> obtenerUsuarioPorId(Long id);

    Usuario crearUsuario(Usuario usuario);

    Usuario actualizarUsuario(Usuario usuario);

    void eliminarUsuario(Long id);
    
    Usuario findByEmail(String email);
    
    boolean verificarCredenciales(String correo, String contraseña);
    
    boolean verificarCredencialesUsuario(String correoElectronico, String contrasena);

}


