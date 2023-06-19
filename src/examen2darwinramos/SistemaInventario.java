/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2darwinramos;

import java.util.ArrayList;

/**
 *
 * @author Darwin
 */
public class SistemaInventario {

    private ArrayList<Producto> inventario;

    public SistemaInventario() {
        inventario = new ArrayList<>();
    }

    public void agregarProducto(int cantidad, String nombre, double precio) {
        Producto producto = new Producto(cantidad, nombre, precio);
        inventario.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void buscarProductoPorNombre(String nombre) {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado: " + producto);
                return;
            }
        }
        System.out.println("No se encontró ningún producto con el nombre: " + nombre);
    }

    public void buscarProductoPorId(int id) {
        for (Producto producto : inventario) {
            if (producto.getId() == id) {
                System.out.println("Producto encontrado: " + producto);
                return;
            }
        }
        System.out.println("No se encontró ningún producto con el ID: " + id);
    }

    public void listarProductos() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Lista de productos:");
            for (Producto producto : inventario) {
                System.out.println(producto);
            }
        }
    }
}
