package com.example.demo.service.impl;

import com.example.demo.DTO.ComentarioDTO;
import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Comentario;
import com.example.demo.entity.Favorito;
import com.example.demo.entity.Noticia;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.ComentarioRepository;
import com.example.demo.repository.NoticiaRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.services.ComentarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class ComentarioServiceImpl implements ComentarioService {
    
    private final ComentarioRepository comentarioRepository;
    private final UsuarioRepository usuarioRepository;
    private final NoticiaRepository noticiaRepository;

    public ComentarioServiceImpl(ComentarioRepository comentarioRepository, UsuarioRepository usuarioRepository,
                                 NoticiaRepository noticiaRepository) {
        this.comentarioRepository = comentarioRepository;
        this.usuarioRepository = usuarioRepository;
        this.noticiaRepository = noticiaRepository;
    }

    //@Override
    //public Comentario agregarComentario(Comentario comentario) {
     //   Long idUsuario = comentario.getUsuario().getIdUsuario();
     //   Long idNoticia = comentario.getNoticia().getIdNoticia();

     //   Usuario usuario = usuarioRepository.findById(idUsuario)
     //           .orElseThrow(NoSuchElementException::new);
     //   comentario.setUsuario(usuario);

      //  Noticia noticia = noticiaRepository.findById(idNoticia)
      //          .orElseThrow(NoSuchElementException::new);
       // comentario.setNoticia(noticia);

      //  return comentarioRepository.save(comentario);
    //}
    
    @Override
    public Comentario agregarComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }


    @Override
    public Comentario obtenerComentarioPorId(Long id) {
        return comentarioRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Comentario> obtenerTodosLosComentarios() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario actualizarComentario(Long id, Comentario comentarioActualizado) {
        Comentario comentario = comentarioRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);

        comentario.setContenido(comentarioActualizado.getContenido());
        // Actualizar otros campos según sea necesario

        return comentarioRepository.save(comentario);
    }

    @Override
    public void eliminarComentario(Long id) {
        if (comentarioRepository.existsById(id)) {
            comentarioRepository.deleteById(id);
        } else {
            throw new NoSuchElementException();
        }
    }
    
    @Override
    public List<ComentarioDTO> obtenerComentariosDTO() {
        return comentarioRepository.obtenerComentariosDTO();
    }
}


