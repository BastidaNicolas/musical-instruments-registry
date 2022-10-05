package com.musicalinstrumentsregistry.musicalinstrumentsregistry.service;

import com.musicalinstrumentsregistry.musicalinstrumentsregistry.model.Instrumento;
import com.musicalinstrumentsregistry.musicalinstrumentsregistry.repository.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstrumentoService implements IInstrumentoService {

    @Autowired
    private InstrumentoRepository instrumentoRepository;

    @Override
    public List<Instrumento> getAll() {
        List<Instrumento> instrumentos = instrumentoRepository.findAll();
        return instrumentos;
    }

    @Override
    public Instrumento getInstrumento(String nombre) {
        return instrumentoRepository.findByNombre(nombre);
    }

    @Override
    public void addInstrumento(Instrumento instrumento) {
        instrumentoRepository.save(instrumento);
    }

    @Override
    public void deleteInstrumento(String nombre) {

    }
}
