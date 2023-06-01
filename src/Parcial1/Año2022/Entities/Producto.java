package Parcial1.Año2022.Entities;

import java.util.Objects;

public class Producto {
    private String nombre;

    private float precio;

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Float.compare(producto.precio, precio) == 0 && Objects.equals(nombre, producto.nombre);
    }

}
