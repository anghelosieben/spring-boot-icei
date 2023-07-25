package org.digitalharbor.springboot1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "aula")
public class Aula implements Serializable {

    @Id
    @Column(name = "id_aula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAula;

    @Column(name = "aula", nullable = false, length = 50)
    private String aula;

    @Column(name = "piso", nullable = false)
    private Integer piso;

    @ManyToOne( fetch = FetchType.LAZY)
    @JsonBackReference
    //@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    //@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name ="id_carrera")
    private Carrera carrera;
}
