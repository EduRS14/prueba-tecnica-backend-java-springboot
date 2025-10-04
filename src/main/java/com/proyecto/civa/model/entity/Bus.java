package com.proyecto.civa.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "placa", nullable = false)
    private String placa;

    @CreationTimestamp
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "caracteristicas", nullable = false)
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name = "id_marca",
            referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_bus_marca"), nullable = false)
    private MarcaBus marca;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

}
