package org.example;

import javax.swing.*;
import java.util.function.Function;

public class OrderInsertion {
    public static void main(String[] args){

        int cuantos =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte cuantos ingresara"));
        int[] god = new int[cuantos];

        for(int i = 0; i < god.length; i++){
            god[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte el "+(i+1)+" numero"));
        }

        insercion(god);
        for (int numero : god) {

            JOptionPane.showMessageDialog(null, "Ordenado : "+numero);
        }
    }

    public static void insercion(int[] valores){
        for (int i = 1; i < valores.length; i++) {
            int elementoActual = valores[i];
            int j;

            for (j = i - 1; j >= 0 && valores[j] > elementoActual; j--) {
                valores[j + 1] = valores[j];
            }

            valores[j + 1] = elementoActual;
        }
    }
}
