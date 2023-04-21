package Practico1.GenericsLinkedListDobleRecursivo;

public class LinkedListDobleRecursiva<V> implements ListaInterfazSimple<V> {
    public Node<V> head;
    public Node<V> tail;
    

    @Override
    public void addLast(V value) {
       Node<V> newNode = new Node<>(value);
       if (head == null){
           head = newNode;
           head.next = newNode;
           head.prev = newNode;
           tail = head;
           return;
       }
       tail.next = newNode;
       newNode.prev = tail;
       tail = newNode;
       tail.next = head;
       head.prev = tail;
    }

    @Override
    public void addFirst(V value) {
        Node<V> newNode = new Node<>(value);
        if (head == null){
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        if (this.length()+1 == 1){
            head.next = newNode;
        }
        newNode.next = head;
        newNode.prev = tail;
        head = newNode;
        tail.next = head;
    }

    @Override
    public void remove(int index) {
        if (head == null){
            return;
        }
        if (index > this.length()){
            return;
        }
        if (index == 0){
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }
        if (index == this.length()){
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            return;
        }
        Node<V> nodoAnterior = head;
        for (int c = 0; c < index-1; c++){
            nodoAnterior = nodoAnterior.next;
        }
        Node<V> nodoSiguiente = nodoAnterior.next;
        nodoSiguiente = nodoSiguiente.next;

        nodoAnterior.next = nodoSiguiente;
        nodoSiguiente.prev = nodoAnterior;
    }

    @Override
    public int length(){
        if (head == null){
            return -1;
        }
        Node<V> tempNode = head;
        int c = 0;
        while (tempNode.next != head){
            c++;
            tempNode = tempNode.next;
        }
        return c;
    }

    @Override
    public V get(int index) {
        if (head == null){
            return null;
        }
        if (index > this.length()){
            return null;
        }
        if (index == 0) {
            return head.data;
        }
        Node<V> tempNode = head;
        for (int c = 0; c < index; c++){
            tempNode = tempNode.next;
        }
        return tempNode.data;
    }

    public boolean exist(V data){
        Node<V> tempNode = head;
        if (tempNode == null){
            return false;
        }
        while (tempNode.next != head){
            if (tempNode.data == data){
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }
}
