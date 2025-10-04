package com.proyecto.civa.service.impl;

import com.proyecto.civa.dto.MarcaBusDTO;
import com.proyecto.civa.mapper.MarcaBusMapper;
import com.proyecto.civa.repository.MarcaBusRepository;
import com.proyecto.civa.service.interf.MarcaBusService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MarcaBusServiceImpl implements MarcaBusService {

    @Autowired
    private MarcaBusRepository busRepository;

    @Autowired
    private MarcaBusMapper marcaBusMapper;

    @Transactional(readOnly = true)
    @Override
    public String obtenerNombreMarcaBusPorId(Integer id) {
        return busRepository.findById(id)
                .map(marcaBus -> marcaBus.getNombre())
                .orElse("Marca no encontrada");
    }

    @Transactional(readOnly = true)
    @Override
    public MarcaBusDTO obtenerMarcaBusPorId(Integer id) {
        return busRepository.findById(id)
                .map(marcaBusMapper::toMarcaBusDTO)
                .orElse(null);
    }

}
