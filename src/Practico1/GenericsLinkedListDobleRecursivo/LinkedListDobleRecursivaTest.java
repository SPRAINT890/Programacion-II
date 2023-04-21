package Practico1.GenericsLinkedListDobleRecursivo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListDobleRecursivaTest {

    @Test
    void addLastUnSoloElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        assertTrue(lista.head.data.equals(1)  && lista.head.next == lista.head && lista.head.prev == lista.head);
    }

    @Test
    void addLastVariosElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next == nodoUno && nodoCero.prev == nodoDos);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == nodoDos && nodoUno.prev == nodoCero);
        assertTrue(nodoDos.data.equals(9)  && nodoDos.next == nodoCero && nodoDos.prev == nodoUno);
    }
    @Test
    void addFirstUnSoloElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addFirst(1);
        assertTrue(lista.head.data.equals(1)  && lista.head.next == lista.head && lista.head.prev == lista.head);
    }

    @Test
    void addFirstVariosElementoInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addFirst(1);
        lista.addFirst(8);
        lista.addFirst(9);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(9)  && nodoCero.next == nodoUno && nodoCero.prev == nodoDos);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == nodoDos && nodoUno.prev == nodoCero);
        assertTrue(nodoDos.data.equals(1)  && nodoDos.next == nodoCero && nodoDos.prev == nodoUno);
    }

    @Test
    void removeHeadNullInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.remove(12);
        assertNull(lista.head);
    }

    @Test
    void removeFueraLengthInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(12);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next == nodoUno && nodoCero.prev == nodoDos);
        assertTrue(nodoUno.data.equals(5)  && nodoUno.next == nodoDos && nodoUno.prev == nodoCero);
        assertTrue(nodoDos.data.equals(8)  && nodoDos.next == nodoCero && nodoDos.prev == nodoUno);
    }

    @Test
    void removeIndexCeroInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == nodoUno && nodoCero.prev == nodoUno);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == nodoCero && nodoUno.prev == nodoCero);
    }
    @Test
    void removeTailInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(2);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == nodoCero && nodoCero.prev == nodoCero);
    }

    @Test
    void removeVariosInteger(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(4);//
        lista.addLast(5);
        lista.addLast(6);//
        lista.addLast(7);
        lista.addLast(8);
        lista.remove(2);
        lista.remove(0);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        Node<Integer> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == nodoUno && nodoCero.prev == nodoDos);
        assertTrue(nodoUno.data.equals(7)  && nodoUno.next == nodoDos && nodoUno.prev == nodoCero);
        assertTrue(nodoDos.data.equals(8)  && nodoDos.next == nodoCero && nodoDos.prev == nodoUno);
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
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertNull(lista.get(12));
    }
    @Test
    void getHead(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertEquals(1, lista.get(0));
    }
    @Test
    void getElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(30, lista.get(3));
    }
    @Test
    void getLastElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(20, lista.get(4));
    }
    @Test
    void existInNullList(){
        LinkedList<Integer> lista = new LinkedList<>();
        assertFalse(lista.exist(10));
    }
    @Test
    void existInList(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertTrue(lista.exist(10));
    }
    @Test
    void notExistInList(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertFalse(lista.exist(88));
    }
    @Test
    void addLastUnSoloElementoString(){
        LinkedList<String> lista = new LinkedList<>();
        lista.addLast("hola");
        Node<String> head = lista.head;
        assertTrue(head.data.equals("hola")  && head.next == head && head.prev == head);
    }
    @Test
    void addLastVariosElementoString(){
        LinkedList<String> lista = new LinkedList<>();
        lista.addLast("Hola");
        lista.addLast("como");
        lista.addLast("estas?");
        Node<String> nodoCero = lista.head;
        Node<String> nodoUno = nodoCero.next;
        Node<String> nodoDos = nodoUno.next;
        assertTrue(nodoCero.data.equals("Hola")  && nodoCero.next == nodoUno && nodoCero.prev == nodoDos);
        assertTrue(nodoUno.data.equals("como")  && nodoUno.next == nodoDos && nodoUno.prev == nodoCero);
        assertTrue(nodoDos.data.equals("estas?")  && nodoDos.next == nodoCero && nodoDos.prev == nodoUno);
    }
}