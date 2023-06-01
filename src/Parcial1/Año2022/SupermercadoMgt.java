package Parcial1.Año2022;

import Parcial1.Año2022.Entities.Cliente;
import Parcial1.Año2022.Entities.Pedido;
import Parcial1.Año2022.Exceptions.EntidadNoExiste;
import Parcial1.Año2022.Exceptions.EntidadYaExiste;
import Parcial1.Año2022.Exceptions.InformacionInvalida;
import StackQueue.src.linkedlist.MyList;

public interface SupermercadoMgt {
    void agregarProducto(String nombre, float precio) throws EntidadYaExiste;
    void ingresarPedido(long cedula, MyList<String> productos) throws EntidadNoExiste, InformacionInvalida;
    Pedido procesarProximoPedido() throws InformacionInvalida;
    void cancelarPedido(long cedula) throws EntidadNoExiste;
    Cliente obtenerClienteConTicketMasCaro();
}
