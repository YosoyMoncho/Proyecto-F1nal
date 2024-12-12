/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JR_Baide Iscoa
 */
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        while (true) {
            System.out.println("==== Sistema de Gestion de Inventarios ====");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Verificar Stock Bajo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Proveedor: ");
                    String proveedor = scanner.nextLine();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();

                    Producto producto = new Producto(nombre, categoria, proveedor, stock, precio);
                    inventario.agregarProducto(producto);
                    System.out.println("Producto agregado correctamente.");
                    break;

                case 2:
                    System.out.println("Lista de Productos:");
                    inventario.listarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el limite de stock bajo: ");
                    int limite = scanner.nextInt();
                    inventario.verificarStockBajo(limite);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    return;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
    }
}

