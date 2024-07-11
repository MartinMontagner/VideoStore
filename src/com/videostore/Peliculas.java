package com.videostore;

import java.time.LocalDate;
import java.util.Arrays;

public class Peliculas {

    private String titulo;
    private LocalDate fechaLanzamiento;
    private int duracion;
    private String clasificacion;
    private String genero;
    private int stock;

    public Peliculas(String titulo, LocalDate fechaLanzamiento, int duracion, String clasificacion, String genero, int stock) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracion +
                ", clasificacion='" + clasificacion + '\'' +
                ", genero='" + genero + '\'' +
                ", stock=" + stock +
                '}';
    }
}
