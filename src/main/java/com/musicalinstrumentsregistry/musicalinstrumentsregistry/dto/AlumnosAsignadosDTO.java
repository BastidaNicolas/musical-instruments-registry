package com.musicalinstrumentsregistry.musicalinstrumentsregistry.dto;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@Builder
public class AlumnosAsignadosDTO implements Serializable {

    private Long id_instrumento;
    private String nombre_instrumento;
    private List<AlumnoAsignadoDto> alumnos;

    @Value
    @Builder
    public static final class AlumnoAsignadoDto {
        private String nombre;
        private String apellido;
        private String curso;
    }


    public static AlumnosAsignadosDTO from(List<Alumno> alumnos, Instrumento instrumento) {
        return AlumnosAsignadosDTO.builder()
                .nombre_instrumento(instrumento.getNombre())
                .id_instrumento(instrumento.getId())
                .alumnos(from(alumnos))
                .build();
    }

    private static List<AlumnoAsignadoDto> from(List<Alumno> alumnos) {
        return alumnos.stream().map(a -> AlumnoAsignadoDto.builder()
                        .curso(a.getCurso())
                        .apellido(a.getApellido())
                        .nombre(a.getNombre())
                        .build())
                .collect(Collectors.toList());
    }
}
