package com.musicalinstrumentsregistry.musicalinstrumentsregistry.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Instrumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipo;
    private String material;
    //@OneToMany(mappedBy = "instrumento")
    //private List<Alumno> alumnos = new ArrayList<>();

    /*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "instrumento_id", referencedColumnName = "id")
    private List<Alumno> alumnos;*/
}
