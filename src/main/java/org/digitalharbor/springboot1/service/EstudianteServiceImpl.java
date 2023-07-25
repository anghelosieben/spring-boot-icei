package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Estudiante;
import org.digitalharbor.springboot1.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
    @Override
    public void eliminar(int idEstudiante) { estudianteRepository.deleteById(idEstudiante);
    }
    @Override
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }
    @Override
    public Estudiante actualizar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}
