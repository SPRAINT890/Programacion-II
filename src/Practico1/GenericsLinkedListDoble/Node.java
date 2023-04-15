package Practico1.GenericsLinkedListDoble;

public class Node <V> {
    public final V data;
    public Node<V> next;
    public Node<V> prev;
    Node(V data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
