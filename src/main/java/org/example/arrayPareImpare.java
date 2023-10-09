package org.example;

import javax.swing.*;
import java.util.Arrays;

public class arrayPareImpare {
    public static void main(String[] args){
   int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null," Digite cuantos elementos quiere insertar"));
        int[] numbers = new int[cantidad];
        int number;

        // insertar los digitos del arreglo
        for(int i = 0; i < numbers.length; i++) {

            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el " + (i + 1) + " numero"));

            numbers[i] = number;
        }


        int[] pares = new int[cantidad];
        int[] impar = new int[cantidad];

         int J = 0;
         int P = 0;
        for ( int i = 0; i < cantidad; i ++){

            if(numbers[i] % 2 == 0){
                pares[J] = numbers[i];
                J++;
            }else{
                impar[P] = numbers[i];
                P++;

            }
        }


        // Convertir el arreglo a una cadena
        String cadenaPar = Arrays.toString(pares);
        String cadenaImpar = Arrays.toString(impar);


        // Mostrar el arreglo mediante JOptionPane
        JOptionPane.showMessageDialog(null,"los numeros pares: "+ cadenaPar+
                 " impares: "+ cadenaImpar);




    }
}
