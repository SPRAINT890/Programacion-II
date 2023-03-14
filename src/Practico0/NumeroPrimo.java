package Practico0;

import java.util.Scanner;
public class NumeroPrimo {
    private static boolean esNumeroPrimo (int numero){
        boolean resultado = false;
        if (numero != 0 && numero != 1 && numero != 4){
            resultado = true;
            for (int i = 2; i < numero / 2; i++){
                if (numero % i == 0){
                    resultado = false;
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        if (esNumeroPrimo(Teclado.nextInt())){
            System.out.println("es primo");
        }else {
            System.out.println("no es primo");
        }
    }
}
