package Practico1;

public class Lista {
    Node head;

    public void add(int data){
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
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (index == 0){
            addFirst(data);
        }else{
            Node tempNode = head;
            for (int i=0; i<index-1; i++){
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
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
