package Practico1.GenericsLinkedlistSimple;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(8);

        System.out.println(lista.get(1));

    }
}
