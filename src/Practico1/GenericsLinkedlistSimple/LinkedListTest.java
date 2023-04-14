package Practico1.GenericsLinkedlistSimple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addUnSoloElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        Node<Integer> head = lista.head;
        assertTrue(head.data.equals(1)  && head.next == null);
    }

    @Test
    void addVariosElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next != null);
        assertTrue(nodoDos.data.equals(9)  && nodoDos.next == null);
    }

    @Test
    void removeHeadNullInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.remove(12);
        Node<Integer> head = lista.head;
        assertNull(head);
    }

    @Test
    void removeFueraLengthInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(8);
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
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == null);
    }
    @Test
    void removeVariosInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.remove(2);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == null);
    }

    @Test
    void lengthHeadNullInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        assertEquals(-1, lista.length());
    }
    @Test
    void getHeadNull(){
        LinkedList<Integer> lista = new LinkedList<>();
        assertNull(lista.get(12));
    }
    @Test
    void getFueraLength(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(10);
        assertNull(lista.get(12));
    }
    @Test
    void getHead(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(10);
        assertEquals(1, lista.get(0));
    }
    @Test
    void getElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(10);
        lista.add(30);
        lista.add(20);
        assertEquals(30, lista.get(3));
    }
    @Test
    void getLastElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(10);
        lista.add(30);
        lista.add(20);
        assertEquals(20, lista.get(4));
    }
    @Test
    void addUnSoloElementoString(){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("hola");
        Node<String> head = lista.head;
        assertTrue(head.data.equals("hola")  && head.next == null);
    }
    @Test
    void addVariosElementoString(){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Hola");
        lista.add("como");
        lista.add("estas?");
        Node<String> nodoCero = lista.head;
        Node<String> nodoUno = nodoCero.next;
        Node<String> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals("Hola")  && nodoCero.next != null);
        assertTrue(nodoUno.data.equals("como")  && nodoUno.next != null);
        assertTrue(nodoDos.data.equals("estas?")  && nodoDos.next == null);
    }
}