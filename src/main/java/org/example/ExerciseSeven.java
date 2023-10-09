package org.example;

import javax.swing.*;


public class ExerciseSeven {
    public static void main(String[] args){
/*
construir un programa que, dado un numero total de horas,
 devuelve el numero de semanas, dias y horas equivalentes.
 Por ej , dado un total de 100 h debe mostrar 5 semanas 6 dias y 16 horas
 */
        // Definimos las horas
        int horas =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el Total de horas: "));

        // Separamos las horas por semana, días y horas
        int semanas = horas / 168;
        int dias = (horas % 168) / 24; // sacamos la division y mediante el residuo se establece eñ valor
        int horasRestantes = (horas % 168) % 24;


        JOptionPane.showMessageDialog(null,"Son: "+semanas+" semanas con "+dias+" dias y "+ horasRestantes+" horas");
    }
}
