package com.biblioteca;

public class Libro {
    private int id;
    @notBlank(message = "El titulo no puede estar vacio")
    private String titulo;
    @notBlank(message = "El Autor no puede estar vacio")
    private String autor;
    private boolean prestado;

    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
