package Practico0;

import java.util.Scanner;
public class Conversion {
    private static double Fahrenheit (double celsius){
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Ingrese un grado en celsius ");
        System.out.println("La conversion a Fahrenheit es: " + Fahrenheit(Teclado.nextInt()));

    }
}
