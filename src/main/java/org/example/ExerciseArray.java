package org.example;

import javax.swing.*;

public class ExerciseArray {
    public static void main(String[] args){

        int[] lista= new int[1];     // se inicializa un Array
        int[] lista2 = {4,3,2,1};    // paso los elementos de una sola ves

        for (int i = 0; i < lista.length; i++) {

            lista[i] = i;
            System.out.println(lista[i]);
        }

        int capacity = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de nombres a insertar"));
        String[] names = new String[capacity];

        for (int i = 0; i < names.length; i++){
            String name =JOptionPane.showInputDialog(null, "Ingrese el "+(i+1)+" nombre");

            names[i] = name;
            System.out.println(names[i]);

        }
        // BUCLE FOR EGCH
         // muestra todos los elementos de arreglo deseados
        for(String i : names){
            JOptionPane.showMessageDialog(null,"nombres :"+i);
        }


    }
}
