package com.proyecto.civa.service.interf;

import com.proyecto.civa.dto.BusDTO;
import com.proyecto.civa.dto.ItemBusDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BusService {

    Page<ItemBusDTO> obtenerBuses(Pageable pageable);

    BusDTO obtenerBusPorId(Integer id);

}
