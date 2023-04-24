package Parcial1;

import Parcial1.entities.Vino;
import Parcial1.exceptions.EntidadNoExiste;
import Parcial1.exceptions.EntidadYaExiste;
import StackQueue.src.queue.EmptyQueueException;

public interface TuVinoMgt {
    void crearVino(String nombre, String variedad, String pais, int cosecha) throws EntidadYaExiste;
    void agregarVinoQueGusta(int cedula, String nombreVino) throws EntidadNoExiste, EntidadYaExiste;
    void agregarRecomendación(int cedula, int cedulaARecomendar, String nombreVino) throws EntidadNoExiste, EntidadYaExiste;
    Vino obtenerProximaRecomendación(int cedula) throws EmptyQueueException;
    void intercambiarVinos(int cedula, String nombreVino1, String nombreVino2) throws EntidadNoExiste;
    void eliminarOcurrenciasRepetidasVino(int cedula, String  nombreVino) throws EntidadNoExiste;
}
