package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Aula;
import org.digitalharbor.springboot1.model.Carrera;
import org.digitalharbor.springboot1.repository.AulaRepository;
import org.digitalharbor.springboot1.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServiceImpl implements CarreraService{
    @Autowired
    CarreraRepository carreraRepository;
    @Override
    public Carrera guardar(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    @Override
    public void eliminar(int idCarrera) {
        carreraRepository.deleteById(idCarrera);
    }

    @Override
    public List<Carrera> listar() {
        return carreraRepository.findAll();
    }

    @Override
    public Carrera actualizar(Carrera carrera) {
        return carreraRepository.save(carrera);
    }
}
