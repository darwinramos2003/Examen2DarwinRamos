/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2darwinramos;

import java.util.Scanner;

/**
 *
 * @author Darwin
 */
public class Examen2DarwinRamos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaInventario sistemaInventarios = new SistemaInventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("********************************");
            System.out.println("*****Sistema de Inventarios*****");
            System.out.println("********************************");
            System.out.println("1) Agregar producto");
            System.out.println("2) Buscar producto por nombre");
            System.out.println("3) Buscar producto por ID");
            System.out.println("4) Listar productos");
            System.out.println("0) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el precio unitario del producto: ");
                    double precio = scanner.nextDouble();
                    sistemaInventarios.agregarProducto(cantidad, nombre, precio);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    nombre = scanner.next();
                    sistemaInventarios.buscarProductoPorNombre(nombre);
                    break;
                case 3:
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    int id = scanner.nextInt();
                    sistemaInventarios.buscarProductoPorId(id);
                    break;
                case 4:
                    sistemaInventarios.listarProductos();
                    break;
                case 0:
                    System.out.println("->Saliendo del programa......");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

    }

}
