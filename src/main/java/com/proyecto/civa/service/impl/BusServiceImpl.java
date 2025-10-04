package com.proyecto.civa.service.impl;

import com.proyecto.civa.dto.BusDTO;
import com.proyecto.civa.dto.ItemBusDTO;
import com.proyecto.civa.dto.MarcaBusDTO;
import com.proyecto.civa.mapper.BusMapper;
import com.proyecto.civa.mapper.MarcaBusMapper;
import com.proyecto.civa.model.entity.Bus;
import com.proyecto.civa.repository.BusRepository;
import com.proyecto.civa.service.interf.BusService;
import com.proyecto.civa.service.interf.MarcaBusService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private BusMapper busMapper;

    @Autowired
    private MarcaBusService marcaBusService;

    @Transactional(readOnly = true)
    @Override
    public Page<ItemBusDTO> obtenerBuses(Pageable pageable) {
        Page<Bus> buses = busRepository.findAll(pageable);

        if (buses.isEmpty()) {
            return Page.empty();
        }

        return buses.map(
                bus -> {
                    String marca = marcaBusService.obtenerNombreMarcaBusPorId(bus.getMarca().getId());
                    return busMapper.toItemBusDTO(bus, marca);
                }

        );

    }

    @Transactional(readOnly = true)
    @Override
    public BusDTO obtenerBusPorId(Integer id) {
        Bus bus = busRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No se encontro el bus con id: " + id));

        MarcaBusDTO marcaBusDTO = marcaBusService.obtenerMarcaBusPorId(bus.getMarca().getId());

        return busMapper.toBusDTO(bus, marcaBusDTO);
    }

}
