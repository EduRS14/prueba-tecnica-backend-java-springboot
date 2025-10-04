package com.proyecto.civa.service.interf;

import com.proyecto.civa.dto.MarcaBusDTO;

public interface MarcaBusService {

    String obtenerNombreMarcaBusPorId(Integer id);

    MarcaBusDTO obtenerMarcaBusPorId(Integer id);

}
