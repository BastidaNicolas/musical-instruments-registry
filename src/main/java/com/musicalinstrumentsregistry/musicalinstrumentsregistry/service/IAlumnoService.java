package com.musicalinstrumentsregistry.musicalinstrumentsregistry.service;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;

import java.util.List;

public interface IAlumnoService {
    List<Alumno> getAll();

    Alumno getAlumno(Long id);

    void addAlumno(Alumno alumno);

    void deleteAlumno(Long id);
}
