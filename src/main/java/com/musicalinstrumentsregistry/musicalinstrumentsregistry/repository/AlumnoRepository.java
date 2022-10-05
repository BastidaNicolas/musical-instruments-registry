package com.musicalinstrumentsregistry.musicalinstrumentsregistry.repository;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Alumno;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    List<Alumno> findByInstrumento(Instrumento instrumento);
}
