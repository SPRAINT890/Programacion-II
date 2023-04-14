package Practico1.GenericsLinkedlistSimple;

public class Node <V> {
    public final V data;
    public Node<V> next;
    Node(V data){
        this.data = data;
        this.next = null;
    }
}
