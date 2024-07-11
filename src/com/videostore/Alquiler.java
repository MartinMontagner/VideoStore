package com.videostore;

import java.time.LocalDate;

public class Alquiler {
    private static int i=1;
    private int id;

    private Peliculas pelicula;
    private Cliente cliente;
    private LocalDate prestamo;
    private LocalDate devolucion;

    public Alquiler(Peliculas pelicula, Cliente cliente, LocalDate prestamo) {
        this.id = i++;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.prestamo = prestamo;
        this.devolucion = prestamo.plusDays(2);
    }


    public int getId() {
        return id;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getPrestamo() {
        return prestamo;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", prestamo=" + prestamo +
                ", devolucion=" + devolucion +
                '}';
    }
}
