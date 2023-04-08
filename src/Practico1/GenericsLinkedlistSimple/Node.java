package Practico1.GenericsLinkedlistSimple;

public class Node <V> {
    public V getData() {
        return data;
    }

    public Node<V> getNext() {
        return next;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }

    private final V data;
    private Node<V> next;

    Node(V data){
        this.data = data;
        this.next = null;
    }
}
