package Practico0;

import java.util.Scanner;
public class Solicitud {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese numeros y -1 para salir: ");
        int mayor = 0;
        int menor = 0;
        int sumaTodo = 0;
        int sumaPos = 0;
        int sumaNeg = 0;
        int c = 0;

        for (int usuario = Teclado.nextInt(); usuario != -1; usuario = Teclado.nextInt()){
            if (c == 0){
                mayor = usuario;
                menor = usuario;
            }else {
                if (usuario > mayor){
                    mayor = usuario;
                }
                if (usuario < menor){
                    menor = usuario;
                }
            }
            if (usuario > 0){
                sumaPos += usuario;
            }else {
                sumaNeg += usuario;
            }
            sumaTodo += usuario;
            c++;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma total: " + sumaTodo);
        System.out.println("Suma de los positivos: " + sumaPos);
        System.out.println("Suma de los negativos: " + sumaNeg);
        System.out.println("Promedio: " + sumaTodo/c);
    }
}
