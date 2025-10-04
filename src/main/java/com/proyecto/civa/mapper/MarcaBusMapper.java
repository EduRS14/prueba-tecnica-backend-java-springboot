package com.proyecto.civa.mapper;

import com.proyecto.civa.dto.MarcaBusDTO;
import com.proyecto.civa.model.entity.Bus;
import com.proyecto.civa.model.entity.MarcaBus;
import org.springframework.stereotype.Component;

@Component
public class MarcaBusMapper {

    public MarcaBusDTO toMarcaBusDTO(MarcaBus marcaBus) {
        MarcaBusDTO dto = new MarcaBusDTO();
        dto.setId(marcaBus.getId());
        dto.setNombre(marcaBus.getNombre());
        return dto;
    }

}
