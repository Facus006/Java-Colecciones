/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintromatriz10x10;

/**
 *
 * @author Facu
 */
public class JavaIntroMatriz10x10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Crear las matrices M y P
        int[][] M = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
        {11, 12, 13, 21, 41, 22, 47, 20, 10, 61},
        {56, 75, 57, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 97, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
        {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
        {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};

        int[][] P = {
            {36, 5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };

        // Rellenar la matriz M con números aleatorios del 0 al 9
        /*
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = (int) (Math.random() * 10);
            }
        }
         */
        // Mostrar las matrices M y P
        System.out.println("Matriz M:");
        mostrarMatriz(M);
        System.out.println("Matriz P:");
        mostrarMatriz(P);

        // Buscar la submatriz P en la matriz M
        boolean encontrada = false;
        int fila = -1;
        int columna = -1;
        for (int i = 0; i <= M.length - P.length && !encontrada; i++) {
            for (int j = 0; j <= M[i].length - P[0].length && !encontrada; j++) {
                if (compararSubmatrices(M, i, j, P)) {
                    encontrada = true;
                    fila = i;
                    columna = j;
                }
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrada) {
            System.out.println("La submatriz P está contenida en la matriz M.");
            System.out.println("La submatriz P empieza en la fila " + fila + " y la columna " + columna + " de la matriz M.");
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }
    }

    // Método para comparar dos submatrices de la misma dimensión
    public static boolean compararSubmatrices(int[][] matriz, int fila, int columna, int[][] submatriz) {
        for (int i = 0; i < submatriz.length; i++) {
            for (int j = 0; j < submatriz[i].length; j++) {
                if (matriz[fila + i][columna + j] != submatriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
