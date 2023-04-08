package Practico1.GenericsLinkedlistSimple;

public class LinkedList <V> implements ListaInterfazSimple <V>{
    private Node<V> head;

    public Node<V> getHead() {
        return head;
    }

    @Override
    public void add(V value) {
       Node<V> newNode = new Node<> (value);
       if (head == null){
           head = newNode;
           return;
       }
       Node<V> tempNode = head;
       while (tempNode.getNext() != null){
           tempNode = tempNode.getNext();
       }
       tempNode.setNext(newNode);
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
            head = head.getNext();
            return;
        }
        Node<V> tempNode = head;
        for (int c = 0; c < index-1; c++){
            tempNode = tempNode.getNext();
        }
        Node<V> nodoBorrar = tempNode.getNext();
        tempNode.setNext(nodoBorrar.getNext());
    }

    public int length(){
        if (head == null){
            return -1;
        }
        Node<V> tempNode = head;
        int c = 0;
        while (tempNode.getNext() != null){
            c++;
            tempNode = tempNode.getNext();
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
            return head.getData();
        }
        Node<V> tempNode = head;
        for (int c = 0; c < index; c++){
            tempNode = tempNode.getNext();
        }
        return tempNode.getData();
    }
}
