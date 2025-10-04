package com.proyecto.civa.mapper;

import com.proyecto.civa.dto.BusDTO;
import com.proyecto.civa.dto.ItemBusDTO;
import com.proyecto.civa.dto.MarcaBusDTO;
import com.proyecto.civa.model.entity.Bus;
import org.springframework.stereotype.Component;

@Component
public class BusMapper {

    public ItemBusDTO toItemBusDTO(Bus bus, String nombreMarca) {
        ItemBusDTO dto = new ItemBusDTO();
        dto.setId(bus.getId());
        dto.setPlaca(bus.getPlaca());
        dto.setMarca(nombreMarca);
        dto.setActivo(bus.getActivo());
        return dto;
    }

    public BusDTO toBusDTO(Bus bus, MarcaBusDTO marcaBusDTO) {
        BusDTO dto = new BusDTO();
        dto.setId(bus.getId());
        dto.setNumero(bus.getNumero());
        dto.setPlaca(bus.getPlaca());
        dto.setFecha_creacion(bus.getFechaCreacion());
        dto.setCaracteristicas(bus.getCaracteristicas());
        dto.setMarca(marcaBusDTO);
        dto.setActivo(bus.getActivo());
        return dto;
    }

}
