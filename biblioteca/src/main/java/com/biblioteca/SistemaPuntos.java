package com.biblioteca;

public class SistemaPuntos {
    private Usuario usuario;
    private int puntosAcumulados;

    public SistemaPuntos(Usuario usuario) {
        this.usuario = usuario;
        this.puntosAcumulados = 0;
    }

    public void asignarPuntosPorPrestamo() {
        puntosAcumulados += 10; // ejemplo
    }

    public void descontarPuntosPorMulta() {
        puntosAcumulados -= 5;
    }

    // Getters y Setters
}
