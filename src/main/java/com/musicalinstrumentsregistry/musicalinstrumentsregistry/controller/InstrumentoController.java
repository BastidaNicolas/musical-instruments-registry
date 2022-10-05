package com.musicalinstrumentsregistry.musicalinstrumentsregistry.controller;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.service.IInstrumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstrumentoController {

    @Autowired
    private IInstrumentoService interInstru;

    @GetMapping("/instrumentos/traer")
    public List<Instrumento> getInstrumentos(){
        List<Instrumento> instrumentos = interInstru.getAll();
        return instrumentos;
    }
    @GetMapping("/instrumentos/traer/{nombre}")
    public Instrumento getInstrumento(
            @PathVariable String nombre
    ){
        return interInstru.getInstrumento(nombre);
    }
    @PostMapping("/instrumentos/agregar")
    public String addInstrumento(@RequestBody Instrumento instrumento){
        interInstru.addInstrumento(instrumento);
        return "Agregado";
    }
    @PutMapping("/instrumentos/editar/{nombre}")
    public Instrumento editInstrumento(
            @PathVariable String nombre,
            @RequestParam String newNombre,
            @RequestParam String newTipo,
            @RequestParam String newMaterial
            //@RequestParam List<Alumno> newAlumnos
    ){
        Instrumento instru = interInstru.getInstrumento(nombre);

        instru.setNombre(newNombre);
        instru.setTipo(newTipo);
        instru.setMaterial(newMaterial);
        //instru.setAlumnos(newAlumnos);

        return instru;
    }

    @DeleteMapping("/instrumentos/remover/{nombre}")
    public String removeInstrumento(@PathVariable String nombre){
        interInstru.deleteInstrumento(nombre);
        return "Removido";
    }

}
