package org.example;

import javax.swing.*;

public class ExerciseConditionFour {

    public static void main(String[] args){

     /*
     Pedir el dia, mes y año de una fecha
     e indicar si la fecha es correcta.
     Suponiendo que todos los meses son de 30 dias.
      */

        int dia, mes, anno;

        dia =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el dia: "));
        mes =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el mes: "));
        anno =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el año: "));


        if (dia > 30 || mes > 12 ) {
            JOptionPane.showMessageDialog(null, "fecha incorrecta. intente nuevamente");
        } else if (anno > 2023 || anno < 1900 ) {
            JOptionPane.showMessageDialog(null, "Año fuera de rango. Intente nuevamente");

      }else {
            JOptionPane.showMessageDialog(null,"la fecha es: dia "+dia+"/ mes "+mes+"/ año "+anno);

        }


    }
}
