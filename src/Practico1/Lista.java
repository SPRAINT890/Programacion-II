package Practico1;

public class Lista implements ListaInrefaz {
    Node head;
    Node tail;

    public void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;

        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        }
        else {
            Node tempNodeTail = tail;
            tempNodeTail.next = newNode;
            newNode.prev = tempNodeTail;
            newNode.next = head;
            tail = newNode;
            head.prev = tail;
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

    public void remove(int index){
        if (index == 0 ){
            head = head.next;
            head.prev = tail;
        }
        else{
            Node tempNode = head;
            Node nodeABorrar = null;
            for (int i=0; i<index-1; i++){
                tempNode = tempNode.next;
            }
            nodeABorrar = tempNode.next;
            if (nodeABorrar == tail){
                tail = tempNode;
            }
            tempNode.next = nodeABorrar.next;
            nodeABorrar = nodeABorrar.next;
            nodeABorrar.prev = tempNode;
        }
    }

    //hasta aca primera parte

    public void find(int data){
        Node tempNode = new Node();
        tempNode = head;
        while(tempNode.data != data && tempNode.next != null){
            tempNode = tempNode.next;
        }
        if (tempNode.data == data){
            System.out.println(tempNode.data + " ya fue ingresado");
        }else {
            System.out.println(data + " no fue ingresado");
        }
    }
    //hasta aca segunda parte

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = tail;
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        newNode = newNode.next;
        newNode.prev = head;
    }

    public void insertAt(int index, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;

        if (index == 0){
            addFirst(data);
        }else{
            Node tempNode = head;
            for (int i=0; i<index-1; i++){
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            tempNode.next = newNode;
            tempNode = tempNode.next;
            tempNode = tempNode.next;
            tempNode.prev = newNode;
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
