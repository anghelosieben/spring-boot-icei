package org.digitalharbor.springboot1.controller;

import org.digitalharbor.springboot1.model.Estudiante;
import org.digitalharbor.springboot1.service.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteServiceImpl estudianteService;
    @PostMapping
    public Estudiante guardar(@RequestBody Estudiante estudiante){
        System.out.println(estudiante);
        System.out.println("ggg");
        return estudianteService.guardar(estudiante);
    }
    @PutMapping
    public Estudiante actualizar(@RequestBody Estudiante estudiante){
        return estudianteService.actualizar(estudiante);
    }
    @DeleteMapping
    public void actualizar(@RequestBody int idEstudiante){
        estudianteService.eliminar(idEstudiante);
    }
    @GetMapping
    public List<Estudiante> listar(){
        return estudianteService.listar();
    }
}
