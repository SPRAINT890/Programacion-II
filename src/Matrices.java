public class Matrices {
    public static void desplegar(int[][] matriz){
        if (matriz != null){
            for (int y = 0; y < matriz.length; y++){
                for (int x = 0; x < matriz[y].length; x++){
                    System.out.print(matriz[y][x] + " | ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Es una matriz vacia");
        }
    }

    public static boolean esCuadrada(int[][] matriz){
        boolean resultado = false;
        if (filas(matriz) > 0 && filas(matriz) == columnas(matriz)){
            resultado = true;
        }
        return resultado;
    }

    public static int filas(int[][] matriz){
        return matriz.length;
    }

    public static int columnas(int[][] matriz){
        return matriz[filas(matriz)-1].length;
    }

    public static int[][] sumar (int[][] matrizA, int[][] matrizB) {
        int[][] matResult;
        if (filas(matrizA) == filas(matrizB) && columnas(matrizA) == columnas(matrizB)) {
            matResult = new int[filas(matrizA)][columnas(matrizA)];
            for (int x = 0; x < filas(matrizB); x++) {
                for (int y = 0; y < columnas(matrizB); y++) {
                    matResult[x][y] = matrizB[x][y] + matrizA[x][y];
                }
            }
        } else {
            return null;
        }
        return matResult;
    }
    public static void main(String[] args) {
        int[][] matrizA = new int[2][3];
        matrizA [0][0] = 1;
        matrizA [0][1] = 7;
        matrizA [0][2] = 4;
        matrizA [1][0] = 1;
        matrizA [1][1] = 3;
        matrizA [1][2] = 8;

        int[][] matrizB = new int[2][2];
        matrizB [0][0] = 1;
        matrizB [0][1] = 2;
        matrizB [1][0] = 3;
        matrizB [1][1] = 2;

        int[][] matrizC = new int[2][2];
        matrizC [0][0] = 1;
        matrizC [0][1] = 2;
        matrizC [1][0] = 3;
        matrizC [1][1] = 2;

        System.out.println("Matriz A: ");
        desplegar(matrizA);

        System.out.println("Matriz B: ");
        desplegar(matrizB);

        System.out.println("Largos Matriz A");
        System.out.println("Filas: " + filas(matrizA));
        System.out.println("Columnas: " + columnas(matrizA));

        System.out.println("Largos Matriz B");
        System.out.println("Filas: " + filas(matrizB));
        System.out.println("Columnas: " + columnas(matrizB));

        System.out.println("La Matriz A es cuadrada?: " + esCuadrada(matrizA));
        System.out.println("La Matriz B es cuadrada?: " + esCuadrada(matrizB));

        int[][] matCuB = sumar(matrizC, matrizB);
        desplegar(matCuB);
    }
}
