package com.DevDaz.spring_boot_microservice_1_inmueble.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name="inmueble")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;
    @Column(name = "direccion",length = 500,nullable = false)
    private String direccion;
    @Column(name = "foto",length = 1200, nullable = true)
    private String picture;
    @Column(name = "precio", nullable = false)
    private Double precio;
    @Column(name = "fecha_creacion",nullable = false)
    private LocalDateTime fechaCreacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return Objects.equals(id, inmueble.id) && Objects.equals(nombre, inmueble.nombre) && Objects.equals(direccion, inmueble.direccion) && Objects.equals(picture, inmueble.picture) && Objects.equals(precio, inmueble.precio) && Objects.equals(fechaCreacion, inmueble.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, direccion, picture, precio, fechaCreacion);
    }
}
