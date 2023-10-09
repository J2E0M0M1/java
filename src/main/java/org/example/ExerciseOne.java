package org.example;

import javax.swing.*;

public class ExerciseOne {

    public static void main(String[] args) {
// Hacer un programa que calcule e imprima la suma de tres calificaciones


        double noteOne, noteTwo, noteThree;

        noteOne=Double.parseDouble(JOptionPane.showInputDialog("Primer Nota: ") );
        noteTwo=Double.parseDouble(JOptionPane.showInputDialog("Segunda Nota: ") );
        noteThree=Double.parseDouble(JOptionPane.showInputDialog("Tercera Nota: ") );

        JOptionPane.showMessageDialog(null,"Su calificacion Total es: "+(noteOne+noteTwo+noteThree));

    }
}
