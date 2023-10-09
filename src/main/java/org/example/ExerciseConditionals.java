package org.example;

import javax.swing.*;

public class ExerciseConditionals {

    public static void main(String[] args) {

        /*
        hacer un programa que lea un
        numero entero y muestre si el numero es
        multiplo de 10.
         */


        int numberRead = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero"));


        if (numberRead % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero: " + numberRead + " es multiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El numero: " + numberRead + " ,NO es multiplo de 10");
        }
         /*
         Pedir dos numeros y decir cual
         es el mayor o si son iguales
          */
        int numberA = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero A"));
        int numberB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero B"));


        if (numberA < numberB) {
            JOptionPane.showMessageDialog(null, "El numero B: " + numberB + " es Mayor");

        } else if (numberA > numberB) {
            JOptionPane.showMessageDialog(null, "El numero A: " + numberA + " es Mayor");

        } else if (numberA == numberB) {
            JOptionPane.showMessageDialog(null, "los numeros A: " + numberA+" y B: "+numberB+ " son iguales");

        }else {
            JOptionPane.showMessageDialog(null, "error vuelva a intentarlo");

        }




    }
}