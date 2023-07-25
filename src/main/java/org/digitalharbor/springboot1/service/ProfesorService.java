package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Profesor;

import java.util.List;

public interface ProfesorService {
    //crear
    public Profesor guardar(Profesor profesor);
    //eliminar
    public void eliminar(int idProfesor);
    //listar
    public List<Profesor> listar();
    //actualizar
    public Profesor actualizar(Profesor profesor);
}
