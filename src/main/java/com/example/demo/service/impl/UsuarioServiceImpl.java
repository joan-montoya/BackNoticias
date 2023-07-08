package com.example.demo.service.impl;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.UsuarioService;

import antlr.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
    
    @Override
    public Usuario findByEmail(String correo) {
        return usuarioRepository.findByEmail(correo);
    }

    @Override
    public boolean verificarCredenciales(String correo, String contrasena) {
        Usuario usuario = usuarioRepository.findByEmail(correo);

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return true; // Las credenciales son válidas
        }

        return false; // Las credenciales son inválidas
    }
    
    @Override
    public boolean verificarCredencialesUsuario(String correoElectronico, String contrasena) {
        Usuario usuario = usuarioRepository.findByEmail(correoElectronico);

        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return true; // Las credenciales son válidas
        }

        return false; // Las credenciales son inválidas
    }

}

