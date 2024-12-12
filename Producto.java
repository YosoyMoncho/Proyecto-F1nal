/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JR_Baide Iscoa
 */
public class Producto {
    private String nombre;
    private String categoria;
    private String proveedor;
    private int stock;
    private double precio;

    public Producto(String nombre, String categoria, String proveedor, int stock, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}

