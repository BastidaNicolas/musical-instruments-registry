package com.musicalinstrumentsregistry.musicalinstrumentsregistry.dto;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class AlumnosAsignadosDTO implements Serializable {

    private Long id_instrumento;
    private String nombre_instrumento;
    private List<Alumno> alumnos;

}
