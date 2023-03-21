package Practico1;

public class Main {
    public static void main(String[] args) {
        Lista list = new Lista();

        list.add(15);
        list.add(1);
        list.add(45);

        list.show();

        list.find(4);

        list.addFirst(4);

        list.show();

    }
}
