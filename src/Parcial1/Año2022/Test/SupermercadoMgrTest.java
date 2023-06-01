package Parcial1.Año2022.Test;

import Parcial1.Año2022.Exceptions.EntidadNoExiste;
import Parcial1.Año2022.Exceptions.EntidadYaExiste;
import Parcial1.Año2022.SupermercadoMgr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermercadoMgrTest {
    @Test
    void agregarProducto() throws EntidadYaExiste {
        SupermercadoMgr tata = new SupermercadoMgr();
        tata.agregarProducto("Mermelada de Frutilla", 100);
        assertEquals(tata.getProductos().size(), 1);
    }
    @Test
    void agregarProductoRepetido() throws EntidadYaExiste {
        SupermercadoMgr tata = new SupermercadoMgr();
        tata.agregarProducto("Mermelada de Frutilla", 100);
        try {
            tata.agregarProducto("Mermelada de Frutilla", 100);
            assertTrue(false);
        }catch (EntidadYaExiste e){
            assertEquals(tata.getProductos().size(), 1);
        }
    }
}