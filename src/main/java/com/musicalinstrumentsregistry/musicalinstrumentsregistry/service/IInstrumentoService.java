package com.musicalinstrumentsregistry.musicalinstrumentsregistry.service;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;

import java.util.List;

public interface IInstrumentoService {
    List<Instrumento> getAll();

    Instrumento getInstrumento(String nombre);

    void addInstrumento(Instrumento instrumento);

    void deleteInstrumento(String nombre);
}
