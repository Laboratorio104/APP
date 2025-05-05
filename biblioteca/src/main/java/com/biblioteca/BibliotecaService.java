package com.biblioteca;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {

    private List<Libro> libros = new ArrayList<>();

    public BibliotecaService() {
        libros.add(new Libro(1, "Cien Años de Soledad", "Gabriel García Márquez"));
        libros.add(new Libro(2, "Don Quijote", "Miguel de Cervantes"));
    }

    public List<Libro> obtenerLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public boolean prestarLibro(int id) {
        Optional<Libro> libro = libros.stream().filter(l -> l.getId() == id).findFirst();
        if (libro.isPresent() && !libro.get().isPrestado()) {
            libro.get().setPrestado(true);
            return true;
        }
        return false;
    }

    public boolean devolverLibro(int id) {
        Optional<Libro> libro = libros.stream().filter(l -> l.getId() == id).findFirst();
        if (libro.isPresent() && libro.get().isPrestado()) {
            libro.get().setPrestado(false);
            return true;
        }
        return false;
    }
}
