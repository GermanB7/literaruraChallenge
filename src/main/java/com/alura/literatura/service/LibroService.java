package com.alura.literatura.service;

import com.alura.literatura.model.Libro;
import com.alura.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibroByTitulo(String titulo) {
        return libroRepository.findByTitulo(titulo);
    }

}