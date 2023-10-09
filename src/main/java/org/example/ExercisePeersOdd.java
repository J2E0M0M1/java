package org.example;

import javax.swing.*;

public class ExercisePeersOdd {

    public static void main(String[] args){

        /*
        Hacer un programa qque tome dos numeros
        y diga si ambos son pares o impares
         */
            int numberA, numberB;
            numberA = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero A"));
        numberB = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero B"));

        numberA = numberA % 2;
        numberB = numberB % 2;


        if (numberA == 0 && numberB == 0){
            JOptionPane.showMessageDialog(null,"Ambos digitos son pares");

        } else if((numberA != 0 && numberB != 0)){
            JOptionPane.showMessageDialog(null,"Ambos digitos son impares");

        }else{
            JOptionPane.showMessageDialog(null,"un digito es par y otro impar");

        }


    }
}
