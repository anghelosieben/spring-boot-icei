package org.digitalharbor.springboot1.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.digitalharbor.springboot1.enumeradores.TipoEmpleado;

@Getter
@Setter
@Entity
@Table(name = "empleado")
public class Empleado extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer idEmpleado;

    @Column(name = "tipo_empleado")
    private TipoEmpleado tipoEmpleado;

}
