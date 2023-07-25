package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Estudiante;

import java.util.List;

public interface EstudianteService {
    //crear
    public Estudiante guardar(Estudiante estudiante);
    //eliminar
    public void eliminar(int idEstudiante);
    //listar
    public List<Estudiante> listar();
    //actualizar
    public Estudiante actualizar(Estudiante estudiante);
}
