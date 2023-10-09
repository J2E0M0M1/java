package org.example;

import javax.swing.*;

public class Matrix {
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }

        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero de filas"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el numero de columnas"));

        String names[][] = new String[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String valor = JOptionPane.showInputDialog("Introduce el valor para la posición [" + i + "][" + j + "]:");
                names[i][j] = valor;


            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {


                System.out.print(" "+names[i][j]);

            }
            System.out.println(" ");
        }




    }
}