package Practico1.GenericsLinkedListDoble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListDobleDobleTest {

    @Test
    void addLastUnSoloElementoInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        Node<Integer> head = lista.head;
        assertTrue(head.data.equals(1)  && head.next == null && head.prev == null);
    }

    @Test
    void addLastVariosElementoInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next != null && nodoCero.prev == null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next != null && nodoUno.prev != null);
        assertTrue(nodoDos.data.equals(9)  && nodoDos.next == null && nodoDos.prev != null);
    }
    @Test
    void addFirstUnSoloElementoInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addFirst(1);
        Node<Integer> head = lista.head;
        assertTrue(head.data.equals(1)  && head.next == null && head.prev == null);
    }

    @Test
    void addFirstVariosElementoInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addFirst(1);
        lista.addFirst(8);
        lista.addFirst(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(9)  && nodoCero.next != null && nodoCero.prev == null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next != null && nodoUno.prev != null);
        assertTrue(nodoDos.data.equals(1)  && nodoDos.next == null && nodoDos.prev != null);
    }

    @Test
    void removeHeadNullInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.remove(12);
        assertNull(lista.head);
    }

    @Test
    void removeFueraLengthInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(12);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next != null && nodoCero.prev == null);
        assertTrue(nodoUno.data.equals(5)  && nodoUno.next != null && nodoUno.prev != null);
        assertTrue(nodoDos.data.equals(8)  && nodoDos.next == null && nodoDos.prev != null);
    }

    @Test
    void removeIndexCeroInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next != null && nodoCero.prev == null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == null && nodoUno.prev != null);
    }
    @Test
    void removeVariosInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(2);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == null && nodoCero.prev == null);
    }

    @Test
    void lengthHeadNullInteger(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        assertEquals(-1, lista.length());
    }
    @Test
    void getHeadNull(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        assertNull(lista.get(12));
    }
    @Test
    void getFueraLength(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertNull(lista.get(12));
    }
    @Test
    void getHead(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertEquals(1, lista.get(0));
    }
    @Test
    void getElement(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(30, lista.get(3));
    }
    @Test
    void getLastElement(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(20, lista.get(4));
    }
    @Test
    void existInNullList(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        assertFalse(lista.exist(10));
    }
    @Test
    void existInList(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertTrue(lista.exist(10));
    }
    @Test
    void notExistInList(){
        LinkedListDoble<Integer> lista = new LinkedListDoble<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertFalse(lista.exist(88));
    }
    @Test
    void addUnSoloElementoString(){
        LinkedListDoble<String> lista = new LinkedListDoble<>();
        lista.addLast("hola");
        Node<String> head = lista.head;
        assertTrue(head.data.equals("hola")  && head.next == null);
    }
    @Test
    void addVariosElementoString(){
        LinkedListDoble<String> lista = new LinkedListDoble<>();
        lista.addLast("Hola");
        lista.addLast("como");
        lista.addLast("estas?");
        Node<String> nodoCero = lista.head;
        Node<String> nodoUno = nodoCero.next;
        Node<String> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals("Hola")  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals("como")  && nodoUno.next != null);
        assertTrue(nodoDos.data.equals("estas?")  && nodoDos.next == null);
    }
}