package com.musicalinstrumentsregistry.musicalinstrumentsregistry.repository;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstrumentoRepository extends JpaRepository<Instrumento, Long> {
    Instrumento findByNombre(String nombre);
}
