package com.videostore;

public class VideoStore {
    private Peliculas[] peliculas;
    private Cliente[] clientes;
    private Alquiler[] alquileres;

    public Peliculas[] getPeliculas() {
        return peliculas;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public VideoStore(Peliculas[] peliculas, Cliente[] clientes) {
        this.peliculas = peliculas;
        this.clientes = clientes;
        this.alquileres = new Alquiler[50];
    }
    //buscar film
    public Peliculas buscarPelicula(String titulo)
    {
        for(Peliculas p:peliculas)
        {
            if(p!=null && p.getTitulo().equals(titulo))
            {
                return p;
            }
        }
        return null;
    }
    // buscar cliente
    public Cliente buscarCliente(String nombre)
    {
        for(Cliente cliente: clientes) {
            if (cliente!=null && cliente.getNombre().equals(nombre))
            {
                return cliente;
            }
        }
        return null;
    }

    //buscar alquiler
    public Alquiler buscarAlquiler (int id){
        for(Alquiler alquiler:alquileres)
        {
            if(alquiler!=null && alquiler.getId()==id)
            {
                return alquiler;
            }
        }
        return null;
    }

    //eliminar alquiler
    public void eliminarAlquiler(int id){
        for(int i=0;i<alquileres.length;i++){
            if(alquileres[i]!=null && alquileres[i].getId()==id){
                alquileres[i]=null;
                break;
            }
        }
    }
    //agregar cliente
    public String agregarCliente(String nombre, String direccion, int telefono){
        Cliente cliente= new Cliente(nombre,telefono,direccion);
        for(int i=0;i<clientes.length;i++)
        {
            if(clientes[i]==null){
                clientes[i]=cliente;
                break;
            }
        }
        return cliente.toString();
    }

    //alquilar titulo
    
    //devolver film
}
