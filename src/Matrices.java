public class Matrices {
    public static void desplegar(int[][] matriz){
        for (int y = 0; y < matriz.length; y++){
            for (int x = 0; x < matriz[y].length; x++){
                System.out.print(matriz[y][x] + " | ");
            }
            System.out.println("");
        }
    }

    public static boolean esCuadrada(int[][] matriz){
        boolean resultado = false;
        if (matriz.length > 0 && matriz[0].length == matriz.length){
            resultado = true;
        }
        return resultado;
    }
    /*
    public int filas(int[][] matriz){

    }
    public int columnas(int[][] matriz){

    }
    public int[][] sumar (int[][] matrizA, int[][] matrizB){

    }*/
    public static void main(String[] args) {
        int[][] matrizA = new int[2][3];
        matrizA [0][0] = 1;
        matrizA [0][1] = 7;
        matrizA [0][2] = 4;
        matrizA [1][0] = 1;
        matrizA [1][1] = 3;
        matrizA [1][2] = 8;
        desplegar(matrizA);
        System.out.println("Largos");
        System.out.println(matrizA[0].length);
        System.out.println(matrizA.length);
        int[][] matrizB = new int[0][0];
        System.out.println("es cuadrada?: " + esCuadrada(matrizB));
        System.out.println(matrizB.length);
    }
}
