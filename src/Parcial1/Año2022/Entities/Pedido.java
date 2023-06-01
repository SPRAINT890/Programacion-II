package Parcial1.Año2022.Entities;

import StackQueue.src.linkedlist.MyList;

import java.util.Objects;

public class Pedido {

    private Cliente cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(cliente, pedido.cliente) && Objects.equals(listaProductos, pedido.listaProductos);
    }

    private MyList<Producto> listaProductos;

    public Pedido(Cliente cliente, MyList<Producto> listaProductos) {
        this.cliente = cliente;
        this.listaProductos = listaProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public MyList<Producto> getListaProductos() {
        return listaProductos;
    }
}
