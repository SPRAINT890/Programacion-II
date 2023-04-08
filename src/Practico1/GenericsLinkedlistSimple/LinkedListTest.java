package Practico1.GenericsLinkedlistSimple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addUnSoloElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        Node<Integer> head = lista.getHead();
        assertTrue(head.getData().equals(1)  && head.getNext() == null);
    }

    @Test
    void addVariosElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(9);
        Node<Integer> nodoCero = lista.getHead();
        Node<Integer> nodoUno = nodoCero.getNext();
        Node<Integer> nodoDos = nodoUno.getNext();
        assertTrue(nodoCero.getData().equals(1)  && nodoCero.getNext() != null);
        assertTrue(nodoUno.getData().equals(8)  && nodoUno.getNext() != null);
        assertTrue(nodoDos.getData().equals(9)  && nodoDos.getNext() == null);
    }

    @Test
    void removeHeadNullInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.remove(12);
        Node<Integer> head = lista.getHead();
        assertNull(head);
    }

    @Test
    void removeFueraLengthInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.remove(12);
        Node<Integer> nodoCero = lista.getHead();
        Node<Integer> nodoUno = nodoCero.getNext();
        Node<Integer> nodoDos = nodoUno.getNext();
        assertTrue(nodoCero.getData().equals(1)  && nodoCero.getNext() != null);
        assertTrue(nodoUno.getData().equals(5)  && nodoUno.getNext() != null);
        assertTrue(nodoDos.getData().equals(8)  && nodoDos.getNext() == null);
    }

    @Test
    void removeIndexCeroInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.remove(0);
        Node<Integer> nodoCero = lista.getHead();
        Node<Integer> nodoUno = nodoCero.getNext();
        assertTrue(nodoCero.getData().equals(5)  && nodoCero.getNext() != null);
        assertTrue(nodoUno.getData().equals(8)  && nodoUno.getNext() == null);
    }
    @Test
    void removeVariosInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.remove(2);
        lista.remove(0);
        Node<Integer> nodoCero = lista.getHead();
        assertTrue(nodoCero.getData().equals(5)  && nodoCero.getNext() == null);
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
        Node<String> head = lista.getHead();
        assertTrue(head.getData().equals("hola")  && head.getNext() == null);
    }
    @Test
    void addVariosElementoString(){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Hola");
        lista.add("como");
        lista.add("estas?");
        Node<String> nodoCero = lista.getHead();
        Node<String> nodoUno = nodoCero.getNext();
        Node<String> nodoDos = nodoUno.getNext();
        assertTrue(nodoCero.getData().equals("Hola")  && nodoCero.getNext() != null);
        assertTrue(nodoUno.getData().equals("como")  && nodoUno.getNext() != null);
        assertTrue(nodoDos.getData().equals("estas?")  && nodoDos.getNext() == null);
    }
}