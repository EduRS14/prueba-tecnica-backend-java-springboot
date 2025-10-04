package com.proyecto.civa.controller;

import com.proyecto.civa.dto.BusDTO;
import com.proyecto.civa.dto.ItemBusDTO;
import com.proyecto.civa.service.interf.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bus")
@CrossOrigin(origins = {"http://localhost:3000/"})
public class BusController {

    private final BusService busService;

    @GetMapping
    public ResponseEntity<Page<ItemBusDTO>> listarBuses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<ItemBusDTO> buses = busService.obtenerBuses(pageable);

        return new ResponseEntity<>(buses, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> obtenerBusPorId(@PathVariable Integer id) {
        BusDTO busDTO = busService.obtenerBusPorId(id);
        return new ResponseEntity<>(busDTO, HttpStatus.OK);
    }

}
