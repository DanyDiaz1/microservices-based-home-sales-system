package com.DevDaz.spring_boot_microservice_1_inmueble.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name="inmueble")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Inmueble inmueble = (Inmueble) o;
        return getId() != null && Objects.equals(getId(), inmueble.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
