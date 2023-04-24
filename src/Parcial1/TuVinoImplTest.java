package Parcial1;

import Parcial1.exceptions.EntidadNoExiste;
import Parcial1.exceptions.EntidadYaExiste;
import StackQueue.src.queue.EmptyQueueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuVinoImplTest {
    @Test
    void crearUnVino() throws EntidadYaExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        assertEquals(empresa.getVinosRegistrados().size(), 1);
    }

    @Test
    void crearUnVinoVinoYaExiste() throws EntidadYaExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        try {
            empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
            empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        }catch (EntidadYaExiste e){
            assertEquals(empresa.getVinosRegistrados().size(), 1);
        }
    }

    @Test
    void agregarUsuario() throws EntidadYaExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        assertEquals(empresa.getUsuariosRegistrados().size(), 1);
    }

    @Test
    void agregarMismoUsuario() throws EntidadYaExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        try {
            empresa.agregarPersona(53636064);
        }catch (EntidadYaExiste e){
            assertEquals(empresa.getUsuariosRegistrados().size(), 1);
        }
    }
    @Test
    void agregarVinoQueLeGustaUsuarioYaAgregado() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        empresa.agregarVinoQueGusta(53636064, "Malbec");
        assertEquals(empresa.getUsuariosRegistrados().get(0).getMeGusta().size(), 1);
    }

    @Test
    void agregarVinoQueLeGustaRepetido() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        try {
            empresa.agregarVinoQueGusta(53636064, "Malbec");
            empresa.agregarVinoQueGusta(53636064, "Malbec");
        }catch (EntidadYaExiste e){
            assertEquals(empresa.getUsuariosRegistrados().get(0).getMeGusta().size(), 1);
        }
    }
    @Test
    void agregarVinoQueLeGustaSinAgregarUsuario() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        empresa.agregarVinoQueGusta(53636064, "Malbec");
        assertEquals(empresa.getUsuariosRegistrados().get(0).getMeGusta().size(), 1);
    }
    @Test
    void agregarVinoQueLeGustaSinAgregarUsuarioEntidadYaExiste() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        try {
            empresa.agregarVinoQueGusta(53636064, "Malbec");
        }catch (EntidadNoExiste e){
            assertTrue(true);
        }
    }
    @Test
    void agregarRecomendaciónUsuarioNoExiste() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        empresa.agregarVinoQueGusta(53636064, "Malbec");
        try {
            empresa.agregarRecomendación(53636063, 53636064, "Malbec");
        }catch (EntidadNoExiste e){
            assertTrue(true);
        }
    }

    @Test
    void agregarRecomendaciónUsuarioARecomendarNoExiste() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        empresa.agregarVinoQueGusta(53636064, "Malbec");
        try {
            empresa.agregarRecomendación(53636064, 53636063, "Malbec");
        }catch (EntidadNoExiste e){
            assertTrue(true);
        }
    }

    @Test
    void agregarRecomendaciónVinoARecomendarNoExiste() throws EntidadYaExiste, EntidadNoExiste {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.agregarPersona(53636063);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        try {
            empresa.agregarRecomendación(53636064, 53636063, "Malbec");
        }catch (EntidadNoExiste e){
            assertTrue(true);
        }
    }
    @Test
    void agregarRecomendación() throws EntidadYaExiste, EntidadNoExiste, EmptyQueueException {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.agregarPersona(53636063);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        empresa.agregarVinoQueGusta(53636064, "Malbec");
        empresa.agregarRecomendación(53636064, 53636063, "Malbec");
        assertEquals(empresa.getUsuariosRegistrados().get(1).getRecomendaciones().dequeue().getVinoARecomendar().getNombre(), "Malbec");
    }

    @Test
    void agregarRecomendaciónRepetida() throws EntidadYaExiste, EntidadNoExiste, EmptyQueueException {
        TuVinoImpl empresa = new TuVinoImpl();
        empresa.agregarPersona(53636064);
        empresa.agregarPersona(53636063);
        empresa.crearVino("Malbec", "Dulce", "Peru", 1092);
        empresa.agregarVinoQueGusta(53636064, "Malbec");
        try {
            empresa.agregarRecomendación(53636064, 53636063, "Malbec");
            empresa.agregarRecomendación(53636064, 53636063, "Malbec");
        }catch (EntidadYaExiste e){
            assertEquals(empresa.getUsuariosRegistrados().get(1).getRecomendaciones().size(), 1);
        }
    }
}