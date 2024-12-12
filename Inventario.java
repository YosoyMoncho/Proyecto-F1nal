/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JR_Baide Iscoa
 */
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void verificarStockBajo(int limite) {
        for (Producto producto : productos) {
            if (producto.getStock() < limite) {
                System.out.println("ALERTA: El producto " + producto.getNombre() + " tiene stock bajo.");
            }
        }
    }
}

