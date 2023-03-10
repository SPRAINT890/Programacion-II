public class Matrices {
    public void desplegar(int[][] matriz){
        for (int y = 0; y < matriz.length; y++){
            for (int x = 0; x < matriz[y].length; x++){
                System.out.print(matriz[y][x]);
            }
        }
    }
    /*
    public boolean esCuadrada(int[][] matriz){

    }
    public int filas(int[][] matriz){

    }
    public int columnas(int[][] matriz){

    }
    public int[][] sumar (int[][] matrizA, int[][] matrizB){

    }*/
    public static void main(String[] args) {
        int[][] matriz = new int[2][3];
        matriz [0][0] = 1;
        matriz [0][1] = 7;
        matriz [0][2] = 4;
        matriz [1][0] = 1;
        matriz [1][1] = 3;
        matriz [1][2] = 8;

        System.out.println(matriz[0].length);
        System.out.println(matriz.length);
    }
}
