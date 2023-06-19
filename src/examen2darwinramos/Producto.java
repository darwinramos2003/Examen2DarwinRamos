/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2darwinramos;

/**
 *
 * @author Darwin
 */
public class Producto {

    private static int nextId = 1;
    private int id;
    private int cantidad;
    private String nombre;
    private double precio;
    private boolean disponible;

    public Producto(int cantidad, String nombre, double precio) {
        this.id = nextId++;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = cantidad > 0;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.disponible = cantidad > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio Unitario: $" + precio  + ", Estado: " + (disponible ? "Disponible" : "Agotado");
    }
}
