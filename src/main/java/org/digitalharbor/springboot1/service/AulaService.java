package org.digitalharbor.springboot1.service;

import org.digitalharbor.springboot1.model.Aula;

import java.util.List;

public interface AulaService {

    //crear
    public Aula guardar(Aula aula);
    //eliminar
    public void eliminar(int idAula);
    //listar
    public List<Aula> listar();
    //actualizar
    public Aula actualizar(Aula aula);

}
