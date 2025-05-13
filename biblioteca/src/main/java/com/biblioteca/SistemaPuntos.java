package com.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class SistemaPuntos {
    private Map<Integer, Integer> puntosUsuarios = new HashMap<>();

    public void asignarPuntos(int usuarioId, int puntos) {
        int total = puntosUsuarios.getOrDefault(usuarioId, 0) + puntos;
        puntosUsuarios.put(usuarioId, total);
    }

    public int consultarPuntos(int usuarioId) {
        return puntosUsuarios.getOrDefault(usuarioId, 0);
    }
}