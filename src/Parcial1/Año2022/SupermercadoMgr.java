package Parcial1.Año2022;

import Parcial1.Año2022.Entities.Cliente;
import Parcial1.Año2022.Entities.Pedido;
import Parcial1.Año2022.Entities.Producto;
import Parcial1.Año2022.Exceptions.EntidadNoExiste;
import Parcial1.Año2022.Exceptions.EntidadYaExiste;
import Parcial1.Año2022.Exceptions.InformacionInvalida;
import StackQueue.src.linkedlist.MyLinkedListImpl;
import StackQueue.src.linkedlist.MyList;
import StackQueue.src.queue.MyQueue;
import StackQueue.src.stack.MyStack;

public class SupermercadoMgr implements SupermercadoMgt {
    private MyList<Producto> productos = new MyLinkedListImpl<>();

    private MyStack<Pedido> pendientesPrioritario = new MyLinkedListImpl<>();
    private MyQueue<Pedido> pendientesNormal = new MyLinkedListImpl<>();
    private MyList<Pedido> finalizados = new MyLinkedListImpl<>();
    @Override
    public void agregarProducto(String nombre, float precio) throws EntidadYaExiste {
        Producto newProducto = new Producto(nombre, precio);
        if (productos.contains(newProducto)){
            throw new EntidadYaExiste();
        }
        productos.add(newProducto);
    }

    @Override
    public void ingresarPedido(long cedula, MyList<String> productos) throws EntidadNoExiste, InformacionInvalida {

    }

    @Override
    public Pedido procesarProximoPedido() throws InformacionInvalida {
        return null;
    }

    @Override
    public void cancelarPedido(long cedula) throws EntidadNoExiste {

    }

    @Override
    public Cliente obtenerClienteConTicketMasCaro() {
        return null;
    }

    public MyList<Producto> getProductos() {
        return productos;
    }
    public MyStack<Pedido> getPendientesPrioritario() {
        return pendientesPrioritario;
    }

    public MyQueue<Pedido> getPendientesNormal() {
        return pendientesNormal;
    }

    public MyList<Pedido> getFinalizados() {
        return finalizados;
    }
}
