package org.digitalharbor.springboot1.repository;

import org.digitalharbor.springboot1.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula,Integer> {
}
