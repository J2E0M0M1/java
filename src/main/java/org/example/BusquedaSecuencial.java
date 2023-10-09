package org.example;

import javax.swing.*;
import java.util.Arrays;

public class BusquedaSecuencial {
    public static void main(String[] args){

            String[] nombres = {"juan","carlos","pedro"};

            String busqueda = JOptionPane.showInputDialog(null,"que nombre quiere buscar");

        // Buscar el string "Juan"
        boolean esta = false;
        int posicion = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(busqueda)) {
                posicion = i+1;
                esta = true;

            }
        }
        if ( esta == true) {
            JOptionPane.showMessageDialog(null, "el nombre : " + busqueda + " Esta en la posicion: " + posicion);
        }else {
            JOptionPane.showMessageDialog(null, "el nombre : " + busqueda + " no se encuentra en la lista");

        }
    }
}
