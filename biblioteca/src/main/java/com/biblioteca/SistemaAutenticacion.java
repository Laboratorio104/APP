package com.biblioteca;

import java.util.List;

public class SistemaAutenticacion {
    private List<Usuario> usuariosRegistrados;

    public SistemaAutenticacion() {
    
    }

    public SistemaAutenticacion(List<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }

    public void login(String correo, String contraseña) {
    
    }

    public void logout() {
    
    }

    public boolean verificarCredenciales(String correo, String contraseña) {
    
        return usuariosRegistrados.stream()
                .anyMatch(u -> u.getCorreo().equals(correo) && u.getContraseña().equals(contraseña));
    }

    
    public List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void setUsuariosRegistrados(List<Usuario> usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }
}