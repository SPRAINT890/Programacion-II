package Practico1.GenericsLinkedlistSimple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListSimpleSimpleTest {

    @Test
    void addLastUnSoloElementoInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        Node<Integer> head = lista.head;
        assertTrue(head.data.equals(1)  && head.next == null);
    }

    @Test
    void addLastVariosElementoInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next != null);
        assertTrue(nodoDos.data.equals(9)  && nodoDos.next == null);
    }
    @Test
    void addFirstUnSoloElementoInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addFirst(1);
        Node<Integer> head = lista.head;
        assertTrue(head.data.equals(1)  && head.next == null);
    }

    @Test
    void addFirstVariosElementoInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addFirst(1);
        lista.addFirst(8);
        lista.addFirst(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(9)  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next != null);
        assertTrue(nodoDos.data.equals(1)  && nodoDos.next == null);
    }

    @Test
    void removeHeadNullInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.remove(12);
        assertNull(lista.head);
    }

    @Test
    void removeFueraLengthInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(12);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals(5)  && nodoUno.next != null);
        assertTrue(nodoDos.data.equals(8)  && nodoDos.next == null);
    }

    @Test
    void removeIndexCeroInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == null);
    }
    @Test
    void removeVariosInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(2);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == null);
    }

    @Test
    void lengthHeadNullInteger(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        assertEquals(-1, lista.length());
    }
    @Test
    void getHeadNull(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        assertNull(lista.get(12));
    }
    @Test
    void getFueraLength(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertNull(lista.get(12));
    }
    @Test
    void getHead(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertEquals(1, lista.get(0));
    }
    @Test
    void getElement(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(30, lista.get(3));
    }
    @Test
    void getLastElement(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(20, lista.get(4));
    }
    @Test
    void existInNullList(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        assertFalse(lista.exist(10));
    }
    @Test
    void existInList(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertTrue(lista.exist(10));
    }
    @Test
    void notExistInList(){
        LinkedListSimple<Integer> lista = new LinkedListSimple<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertFalse(lista.exist(88));
    }
    @Test
    void addUnSoloElementoString(){
        LinkedListSimple<String> lista = new LinkedListSimple<>();
        lista.addLast("hola");
        Node<String> head = lista.head;
        assertTrue(head.data.equals("hola")  && head.next == null);
    }
    @Test
    void addVariosElementoString(){
        LinkedListSimple<String> lista = new LinkedListSimple<>();
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