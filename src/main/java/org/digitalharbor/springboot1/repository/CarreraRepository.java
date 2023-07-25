package org.digitalharbor.springboot1.repository;

import org.digitalharbor.springboot1.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera,Integer> {
}
