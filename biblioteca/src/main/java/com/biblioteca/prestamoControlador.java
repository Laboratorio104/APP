package com.biblioteca.controlador;

import com.biblioteca.modelo.Prestamo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoControlador {

    private List<Prestamo> prestamos = new ArrayList<>();
    private AtomicLong contadorId = new AtomicLong(1);

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamos;
    }

    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {
        prestamo.setId(contadorId.getAndIncrement());
        prestamos.add(prestamo);
        return prestamo;
    }

    @GetMapping("/{id}")
    public Prestamo obtenerPrestamo(@PathVariable Long id) {
        return prestamos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminarPrestamo(@PathVariable Long id) {
        prestamos.removeIf(p -> p.getId().equals(id));
    }
}