package org.digitalharbor.springboot1.controller;

import org.digitalharbor.springboot1.model.Aula;
import org.digitalharbor.springboot1.service.AulaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aula")
public class AulaController {
    @Autowired
    AulaServiceImpl AulaService;
    @PostMapping
    public Aula guardar(@RequestBody Aula aula){
        System.out.println(aula.getCarrera().getIdCarrera());
        System.out.println("ggg");

        return AulaService.guardar(aula);
    }
    @PutMapping
    public Aula actualizar(@RequestBody Aula aula){
        return AulaService.actualizar(aula);
    }
    @DeleteMapping
    public void actualizar(@RequestBody int idAula){
        AulaService.eliminar(idAula);
    }
    @GetMapping
    public List<Aula> listar(){
        return AulaService.listar();
    }
}
