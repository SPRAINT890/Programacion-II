import java.util.Scanner;
public class Solicitud {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese numeros y -1 para salir: ");
        int mayor = 0;
        int menor = 0;
        int suma_todo = 0;
        int suma_pos = 0;
        int suma_neg = 0;
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
                suma_pos += usuario;
            }else {
                suma_neg += usuario;
            }
            suma_todo += usuario;
            c++;
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma total: " + suma_todo);
        System.out.println("Suma de los positivos: " + suma_pos);
        System.out.println("Suma de los negativos: " + suma_neg);
        System.out.println("Promedio: " + suma_todo/c);
    }
}
