package org.digitalharbor.springboot1.controller;

import org.digitalharbor.springboot1.model.Carrera;
import org.digitalharbor.springboot1.service.CarreraServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrera")
public class CarreraController {
    @Autowired
    CarreraServiceImpl carreraService ;
    @PostMapping
    public Carrera guardar(@RequestBody Carrera carrera){
        System.out.println(carrera);
        System.out.println("ggg");
        return carreraService.guardar(carrera);
    }
    @PutMapping
    public Carrera actualizar(@RequestBody Carrera carrera){
        return carreraService.actualizar(carrera);
    }
    @DeleteMapping
    public void actualizar(@RequestBody int idCarrera){
        carreraService.eliminar(idCarrera);
    }
    @GetMapping
    public List<Carrera> listar(){
        return carreraService.listar();
    }
}
