package com.biblioteca.controlador;

import com.biblioteca.Multa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/multas")
public class MultaControlador {

    private List<Multa> multas = new ArrayList<>();
    private AtomicLong contadorId = new AtomicLong(1);

    // Obtener todas las multas
    @GetMapping
    public List<Multa> listarMultas() {
        return multas;
    }

    // Crear una nueva multa
    @PostMapping
    public Multa crearMulta(@RequestBody Multa multa) {
        multa.setId(contadorId.getAndIncrement());
        multa.setValor(multa.calcularMulta()); // Recalcular el valor basado en los días de retraso
        multas.add(multa);
        return multa;
    }

    // Obtener una multa por ID
    @GetMapping("/{id}")
    public Multa obtenerMulta(@PathVariable Long id) {
        return multas.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null); // Si no se encuentra, devuelve null
    }

    // Eliminar una multa por ID
    @DeleteMapping("/{id}")
    public void eliminarMulta(@PathVariable Long id) {
        multas.removeIf(m -> m.getId().equals(id));
    }
}