package Practico05;

import java.util.Scanner;
public class Recursividad {
    static long resultado = 0;
    public static long Factorial(long valor){
        if (valor <= 1){
            return resultado;
        }
        resultado = resultado * (valor - 1);
        return Factorial(valor - 1);
    }
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("1. Factorial");
        System.out.println("2. Potencia");
        System.out.println("3. Suma N veces");
        int eleccion = Teclado.nextInt();
        if (eleccion == 1){
            System.out.print("Factorial de: ");
            int calc = Teclado.nextInt();
            resultado = calc;
            System.out.print(Factorial(calc));
        }
        if (eleccion == 2){
            System.out.println("Potencia de : ");
        }
        if (eleccion == 3){
            System.out.println("Suma N veces: ");

        }
    }
}
