package org.digitalharbor.springboot1.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "carrera")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrera")
    private Integer idCarrera;

    @Column(name = "nombre_carrera",length = 100)
    private String nombre;

    @OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
    private Set<Aula> aulas;
}
