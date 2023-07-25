package org.digitalharbor.springboot1.controller;

import org.digitalharbor.springboot1.model.Profesor;
import org.digitalharbor.springboot1.service.ProfesorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {
    @Autowired
    ProfesorServiceImpl profesorServiceImpl;
    @PostMapping
    public Profesor guardar(@RequestBody Profesor profesor){
        System.out.println(profesor);
        System.out.println("ggg");
        return profesorServiceImpl.guardar(profesor);
    }
    @PutMapping
    public Profesor actualizar(@RequestBody Profesor profesor){
        return profesorServiceImpl.actualizar(profesor);
    }
    @DeleteMapping
    public void actualizar(@RequestBody int idEstudiante){
        profesorServiceImpl.eliminar(idEstudiante);
    }
    @GetMapping
    public List<Profesor> listar(){
        return profesorServiceImpl.listar();
    }

}
