package com.proyecto.civa.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BusDTO {

    private Integer id;
    private Integer numero;
    private String placa;
    private LocalDate fecha_creacion;
    private String caracteristicas;
    private MarcaBusDTO marca;
    private Boolean activo;

}
