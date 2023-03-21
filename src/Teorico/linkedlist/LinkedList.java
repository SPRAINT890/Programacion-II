package Teorico.linkedlist;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null){
            head = newNode;
        }
        else{
            Node tempNode = head;
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    public void insertAtStart(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (index == 0){
            insertAtStart(data);
        }else{
            Node tempNode = head;
            for (int i=0; i<index-1; i++){
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
    }

    public void deletAt(int index){
        if (index == 0 ){
            head = head.next;
        }
        else{
            Node tempNode = head;
            Node nodeABorrar = null;
            for (int i=0; i<index-1; i++){
                tempNode = tempNode.next;
            }
            nodeABorrar = tempNode.next;
            tempNode.next = nodeABorrar.next;
            nodeABorrar = null;
        }
    }

    public void get (int index){
        if(index == 0){
            System.out.println(head.data);
        }else {
            Node tempNode = new Node();
            tempNode = head;

            for (int i=0; i<index; i++){
                tempNode = tempNode.next;
            }
            System.out.println(tempNode.data);
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
