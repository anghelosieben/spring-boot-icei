package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Aula;
import org.digitalharbor.springboot1.model.Carrera;

import java.util.List;

public interface CarreraService {

    //crear
    public Carrera guardar(Carrera carrera);
    //eliminar
    public void eliminar(int idCarrera);
    //listar
    public List<Carrera> listar();
    //actualizar
    public Carrera actualizar(Carrera carrera);
}
