package org.example;

import javax.swing.*;

public class ExerciseMixArray {
    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] mixArray = new int[20];

        for (int i = 0; i < array1.length; i++) {
            int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Arreglo 1: Inserte el " + (i + 1) + " valor."));
            array1[i] = value;
            }

        for (int a = 0; a < array2.length; a++) {
                int value2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Arreglo 2: Inserte el " + (a + 1) + " valor."));
                array2[a] = value2;
            }
           int j = 0;

        for (int b = 0; b < 10; b++) {
          mixArray[j] = array1[b];
          j++;
          mixArray[j]= array2[b];
          j++;
        }

            for (int i: mixArray){
                System.out.println("number: "+i);
            }







    }
}