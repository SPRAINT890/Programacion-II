package Practico1;

import Practico1.GenericsLinkedListDobleRecursivo.LinkedListDobleRecursiva;

public class Josefo {
    public static LinkedListDobleRecursiva agregarPersonasCirculo(){
        LinkedListDobleRecursiva<Integer> personasEnCirculo = new LinkedListDobleRecursiva<>();
        for (int c = 0; c < 8; c++){
            personasEnCirculo.addLast(c);
        }
        return personasEnCirculo;
    }

    public static void jugar(LinkedListDobleRecursiva<Integer> circulo){
        LinkedListDobleRecursiva<Integer> ordenEliminados = new LinkedListDobleRecursiva<>();
        int i = 2;
        while (circulo.head.next != circulo.head){
            ordenEliminados.addLast(circulo.get(i));
            circulo.remove(i);
            i += 2;

        }
        System.out.println("Ganador es el numero: " + circulo.get(0));
        System.out.println("Orden de salida: ");
        for (int c = 0; c <6-1; c++){
            System.out.print(ordenEliminados.get(c) + " ");
        }
    }
    public static void main(String[] args) {
        LinkedListDobleRecursiva<Integer> circulo = agregarPersonasCirculo();
        jugar(circulo);


    }


}
