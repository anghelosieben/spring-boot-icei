package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Aula;
import org.digitalharbor.springboot1.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AulaServiceImpl implements AulaService{
    @Autowired
    AulaRepository aulaRepository;
    @Override
    public Aula guardar(Aula aula) {
        return aulaRepository.save(aula);
    }

    @Override
    public void eliminar(int idAula) {
        aulaRepository.deleteById(idAula);
    }

    @Override
    public List<Aula> listar() {
        return aulaRepository.findAll();
    }

    @Override
    public Aula actualizar(Aula aula) {
        return aulaRepository.save(aula);
    }
}
