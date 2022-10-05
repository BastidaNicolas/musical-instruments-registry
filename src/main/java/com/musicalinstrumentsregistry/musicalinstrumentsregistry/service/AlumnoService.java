package com.musicalinstrumentsregistry.musicalinstrumentsregistry.service;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> getAll() {
        List<Alumno> alumnos = alumnoRepository.findAll();
        return alumnos;
    }

    @Override
    public Alumno getAlumno(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    public void addAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    @Override
    public void deleteAlumno(Long id) {

    }
}
