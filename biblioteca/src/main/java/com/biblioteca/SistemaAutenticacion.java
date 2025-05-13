package com.biblioteca;

import java.util.List;

public class SistemaAutenticacion {
    private List<Usuario> usuariosRegistrados;

    public SistemaAutenticacion() {
        // Constructor vacío
    }

    public SistemaAutenticacion(List<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }

    public void login(String correo, String contraseña) {
        // lógica para login
    }

    public void logout() {
        // lógica para cerrar sesión
    }

    public boolean verificarCredenciales(String correo, String contraseña) {
        // Aquí deberías buscar en la lista si hay un usuario con ese correo y contraseña
        return usuariosRegistrados.stream()
                .anyMatch(u -> u.getCorreo().equals(correo) && u.getContraseña().equals(contraseña));
    }

    // Getters y Setters
    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void setUsuariosRegistrados(List<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }
}