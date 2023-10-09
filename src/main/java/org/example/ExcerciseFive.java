package org.example;

import javax.swing.*;

public class ExcerciseFive {

    public static void main(String[] args) {

        /*
        la calificacion final de un estudiante de informatica se calcula con base
        a cuatro aspectos de su rendimiento academico:
        participacion,
        primer examen parcial,
        segundo examen parcial y
        examen final.
        sabiendo que cada calificacion entrar con ponderaciones de
        10%,25%,25% y 40%
        hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante
         */

        double stake;
        double onePartialExam;
        double twoPartialExam;
        double finalExam;

        stake = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota de participacion: "));
        onePartialExam = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota del primer examen: "));
        twoPartialExam = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota del segundo examen: "));
        finalExam = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota de examen final: "));


        double stake2 =(stake*0.10);
        System.out.println(stake2);

        double onePartialExam2 =(onePartialExam*0.25);
        System.out.println(onePartialExam2);

        twoPartialExam *= 0.25;
        System.out.println(twoPartialExam);

        finalExam *= 0.40;
        System.out.println(finalExam);


        double noteFinal = (stake2 + onePartialExam2 + twoPartialExam + finalExam);

        JOptionPane.showMessageDialog(null,"La calificacion final es: "+  noteFinal);



    }
}
