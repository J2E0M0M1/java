package org.example;

import java.util.*;


public class MatrizTranspuesta {

    public static void main(String[] args){



        // Declarar una matriz
        int[][] matriz = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Primera matriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }





        // Obtener la matriz traspuesta
        int[][] matrizTraspuesta = transMatrix(matriz);

        System.out.println("Matriz transpuesta");
        // Imprimir la matriz traspuesta
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                System.out.print(matrizTraspuesta[i][j] + " ");
            }
            System.out.println();
        }


        // Sumar las filas
        int[] sumaFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            sumaFilas[i] = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }

        // Sumar las columnas
        int[] sumaColumnas = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            sumaColumnas[j] = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // Imprimir las sumas
        System.out.println("Suma de filas:");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println(sumaFilas[i]);
        }
        System.out.println();
        System.out.println("Suma de columnas:");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println(sumaColumnas[i]);
        }






    }
    // Metodo encargado de reliazar la transpuesta
    public static int[][] transMatrix(int[][] matriz) {
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTraspuesta;
    }





}
