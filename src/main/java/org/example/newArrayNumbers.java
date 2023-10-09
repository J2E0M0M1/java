package org.example;

import javax.swing.*;
import java.util.Arrays;

public class newArrayNumbers {
    public static void main(String[] args){

        int[] arrayOrder = new int[10];
        int number;

        // insertar los digitos del arreglo
      for(int i = 0; i < 10; i++){

         number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el "+(i+1)+" numero"));

         arrayOrder[i] = number;
        }
        //  Ordenar el arreglo de menor a mayor
        Arrays.sort(arrayOrder);

        // Convertir el arreglo a una cadena
        String cadenaNumeros = Arrays.toString(arrayOrder);

        // Mostrar el arreglo mediante JOptionPane
        JOptionPane.showMessageDialog(null,"los numeros del array son: "+ cadenaNumeros);


        }

    }
