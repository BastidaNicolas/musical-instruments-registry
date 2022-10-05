package com.musicalinstrumentsregistry.musicalinstrumentsregistry.controller;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.dto.AlumnosAsignadosDTO;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.repository.AlumnoRepository;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.repository.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnosAsignadosDTOController {

    @Autowired
    private InstrumentoRepository instrumentoRepository;
    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/alumnos/traer/{nombre_instrumento}")
    public AlumnosAsignadosDTO getAlumnosAsignados(@PathVariable String nombre_instrumento){
        Instrumento instrumento = instrumentoRepository.findByNombre(nombre_instrumento);
        List<Alumno> alumnos = alumnoRepository.findByInstrumento(instrumento.getId());

        AlumnosAsignadosDTO asignadosDTO = new AlumnosAsignadosDTO();

        asignadosDTO.setId_instrumento(instrumento.getId());
        asignadosDTO.setNombre_instrumento(instrumento.getNombre());
        asignadosDTO.setAlumnos(alumnos);

        return asignadosDTO;
    }

}
