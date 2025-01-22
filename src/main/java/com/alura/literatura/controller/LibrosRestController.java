package com.alura.literatura.controller;

import com.alura.literatura.model.Libro;
import com.alura.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosRestController {
    @Autowired
    private LibroRepository libroRepository;

    @GetMapping("/libros/titulo")
    public List<Libro> getLibros(@RequestParam(name = "titulo") String titulo) {
        return libroRepository.findByTitulo(titulo);
    }

}