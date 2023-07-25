package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Profesor;
import org.digitalharbor.springboot1.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService{
    @Autowired
    ProfesorRepository profesorRepository;
    @Override
    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void eliminar(int idProfesor) {
        profesorRepository.deleteById(idProfesor);
    }

    @Override
    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor actualizar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }
}
