package com.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class BibliotecaController {

    @Autowired
    private BibliotecaService servicio;

    @GetMapping
    public List<Libro> obtenerTodos() {
        return servicio.obtenerLibros();
    }

    @PostMapping
    public void agregarLibro(@RequestBody Libro libro) {
        servicio.agregarLibro(libro);
    }

    @PostMapping("/prestar/{id}")
    public String prestarLibro(@PathVariable int id) {
        boolean exito = servicio.prestarLibro(id);
        return exito ? "Libro prestado correctamente." : "No se pudo prestar el libro.";
    }

    @PostMapping("/devolver/{id}")
    public String devolverLibro(@PathVariable int id) {
        boolean exito = servicio.devolverLibro(id);
        return exito ? "Libro devuelto correctamente." : "No se pudo devolver el libro.";
    }
}
