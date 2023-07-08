package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.RespuestaLogin;
import com.example.demo.entity.Usuario;
import com.example.demo.services.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @CrossOrigin
    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(id);
        return optionalUsuario.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.crearUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }
    
    
    @CrossOrigin
    @PostMapping("/login")
    public ResponseEntity<RespuestaLogin> verificarCredenciales(@RequestBody Usuario usuario) {
        boolean credencialesValidas = usuarioService.verificarCredenciales(usuario.getCorreoElectronico(), usuario.getContrasena());

        if (credencialesValidas) {
            Usuario usuarioIniciado = usuarioService.findByEmail(usuario.getCorreoElectronico());
            RespuestaLogin respuesta = new RespuestaLogin(true, usuarioIniciado);
            return ResponseEntity.ok(respuesta); // Credenciales válidas
        } else {
            RespuestaLogin respuesta = new RespuestaLogin(false, null);
            return ResponseEntity.ok(respuesta); // Credenciales inválidas
        }
    }



    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(id);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            usuario.setNombreUsuario(usuarioActualizado.getNombreUsuario());
            usuario.setContrasena(usuarioActualizado.getContrasena());
            usuario.setCorreoElectronico(usuarioActualizado.getCorreoElectronico());
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setApellido(usuarioActualizado.getApellido());
            usuario.setTelefono(usuarioActualizado.getTelefono());
            usuario.setAvatar(usuarioActualizado.getAvatar());

            Usuario usuarioActualizadoDB = usuarioService.actualizarUsuario(usuario);
            return ResponseEntity.ok(usuarioActualizadoDB);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        Optional<Usuario> optionalUsuario = usuarioService.obtenerUsuarioPorId(id);
        if (optionalUsuario.isPresent()) {
            usuarioService.eliminarUsuario(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

