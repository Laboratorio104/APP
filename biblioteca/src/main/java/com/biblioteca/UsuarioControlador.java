package com.biblioteca.controlador;

import com.biblioteca.modelo.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

    private List<Usuario> usuarios = new ArrayList<>();
    private AtomicLong contadorId = new AtomicLong(1);

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        usuario.setId(contadorId.getAndIncrement());
        usuarios.add(usuario);
        return usuario;
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarios.removeIf(u -> u.getId().equals(id));
    }
}