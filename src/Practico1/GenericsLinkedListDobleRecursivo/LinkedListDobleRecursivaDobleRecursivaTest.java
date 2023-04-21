package Practico1.GenericsLinkedListDobleRecursivo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListDobleRecursivaDobleRecursivaTest {

    @Test
    void addLastUnSoloElementoInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        assertTrue(lista.head.data.equals(1)  && lista.head.next == lista.head && lista.head.prev == lista.head);
    }

    @Test
    void addLastVariosElementoInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
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
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addFirst(1);
        assertTrue(lista.head.data.equals(1)  && lista.head.next == lista.head && lista.head.prev == lista.head);
    }

    @Test
    void addFirstVariosElementoInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
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
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.remove(12);
        assertNull(lista.head);
    }

    @Test
    void removeFueraLengthHeadInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(6);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(5)  && nodoCero.next == nodoUno && nodoCero.prev == nodoUno);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == nodoCero && nodoUno.prev == nodoCero);
    }
    @Test
    void removeFueraLengthTailInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(5);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next == nodoUno && nodoCero.prev == nodoUno);
        assertTrue(nodoUno.data.equals(5)  && nodoUno.next == nodoCero && nodoUno.prev == nodoCero);
    }
    @Test
    void removeFueraLengthInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(5);
        lista.addLast(8);
        lista.remove(4);
        Node<Integer> nodoCero = lista.head;
        Node<Integer> nodoUno = nodoCero.next;
        assertTrue(nodoCero.data.equals(1)  && nodoCero.next == nodoUno && nodoCero.prev == nodoUno);
        assertTrue(nodoUno.data.equals(8)  && nodoUno.next == nodoCero && nodoUno.prev == nodoCero);
    }

    @Test
    void removeIndexCeroInteger(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
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
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
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
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
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
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        assertEquals(-1, lista.length());
    }
    @Test
    void getHeadNull(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        assertNull(lista.get(12));
    }
    @Test
    void getFueraLength(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertNull(lista.get(12));
    }
    @Test
    void getHead(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        assertEquals(1, lista.get(0));
    }
    @Test
    void getElement(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(30, lista.get(3));
    }
    @Test
    void getLastElement(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertEquals(20, lista.get(4));
    }
    @Test
    void existInNullList(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        assertFalse(lista.exist(10));
    }
    @Test
    void existInList(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertTrue(lista.exist(10));
    }
    @Test
    void notExistInList(){
        LinkedListDobleRecursiva<Integer> lista = new LinkedListDobleRecursiva<>();
        lista.addLast(1);
        lista.addLast(8);
        lista.addLast(10);
        lista.addLast(30);
        lista.addLast(20);
        assertFalse(lista.exist(88));
    }
    @Test
    void addLastUnSoloElementoString(){
        LinkedListDobleRecursiva<String> lista = new LinkedListDobleRecursiva<>();
        lista.addLast("hola");
        Node<String> head = lista.head;
        assertTrue(head.data.equals("hola")  && head.next == head && head.prev == head);
    }
    @Test
    void addLastVariosElementoString(){
        LinkedListDobleRecursiva<String> lista = new LinkedListDobleRecursiva<>();
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