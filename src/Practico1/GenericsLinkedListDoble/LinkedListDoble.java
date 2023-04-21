package Practico1.GenericsLinkedListDoble;

public class LinkedListDoble<V> implements ListaInterfazSimple<V> {
    public Node<V> head;
    

    @Override
    public void addLast(V value) {
       Node<V> newNode = new Node<>(value);
       if (head == null){
           head = newNode;
           return;
       }
       Node<V> tempNode = head;
       while (tempNode.next != null){
           tempNode = tempNode.next;
       }
       tempNode.next = newNode;
       newNode.prev = tempNode;
    }

    @Override
    public void addFirst(V value) {
        Node<V> newNode = new Node<>(value);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
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
            head.prev = null;
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
        while (tempNode.next != null){
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
        while (tempNode.next != null){
            if (tempNode.data == data){
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }
}
