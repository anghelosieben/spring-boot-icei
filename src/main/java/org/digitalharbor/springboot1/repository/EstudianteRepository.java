package org.digitalharbor.springboot1.repository;

import org.digitalharbor.springboot1.model.Empleado;
import org.digitalharbor.springboot1.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {
}
