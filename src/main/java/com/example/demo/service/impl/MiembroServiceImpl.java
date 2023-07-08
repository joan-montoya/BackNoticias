package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DTO.MiembroDTO;
import com.example.demo.entity.Miembro;
import com.example.demo.repository.MiembroRepository;
import com.example.demo.services.MiembroService;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

import java.util.List;

@Service
@Transactional
public class MiembroServiceImpl implements MiembroService {

    private final MiembroRepository miembroRepository;

    @Autowired
    public MiembroServiceImpl(MiembroRepository miembroRepository) {
        this.miembroRepository = miembroRepository;
    }

    @Override
    public Miembro guardarMiembro(Miembro miembro) {
        return miembroRepository.save(miembro);
    }


    @Override
    public List<Miembro> obtenerTodosLosMiembros() {
        return miembroRepository.findAll();
    }

    @Override
    public void eliminarMiembro(Long id) {
        miembroRepository.deleteById(id);
    }
    
    @Override
    public List<MiembroDTO> obtenerMiembrosDTO() {
        return miembroRepository.obtenerMiembrosDTO();
    }
}
