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
        //a hacerr
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