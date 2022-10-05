package com.musicalinstrumentsregistry.musicalinstrumentsregistry.controller;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    private IAlumnoService interAlum;

    @GetMapping("/alumnos/traer")
    public List<Alumno> getAlumnos(){
        return interAlum.getAll();
    }

    @GetMapping("/alumnos/traer/alumno/{id}")
    public Alumno getAlumno(@PathVariable Long id){
        return interAlum.getAlumno(id);
    }

    @PostMapping("/alumnos/agregar")
    public String addAlumno(@RequestBody Alumno alumno){
        interAlum.addAlumno(alumno);
        return "Agregado";
    }

    @PutMapping("/alumnos/editar/{id}")
    public Alumno editAlumno(
            @PathVariable Long id,
            @RequestParam String newNombre,
            @RequestParam String newApellido,
            @RequestParam String newCurso
    ){
        Alumno alumno = interAlum.getAlumno(id);

        alumno.setNombre(newNombre);
        alumno.setApellido(newApellido);
        alumno.setCurso(newCurso);

        return alumno;
    }

    @DeleteMapping("/alumnos/remover/{id}")
    public String deleteAlumno(@PathVariable Long id){

        interAlum.deleteAlumno(id);

        return "Removido";
    }

}
