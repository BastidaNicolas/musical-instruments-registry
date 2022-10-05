package com.musicalinstrumentsregistry.musicalinstrumentsregistry.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String curso;

    private Long instrumento;
    //@ManyToOne
    //@JoinColumn(name = "instrumento_id")
    //private Instrumento instrumento;

}
