package org.example;

import javax.swing.*;

public class ExerciseTwo {

    public static void main(String[] args) {

        // Exercise two : Hacer un programa que calcule e imprima el salario semanal de un empleado a partir
        // de sus horas semanales trabajadas y de su salario por hora

        double salaryWeekly;
        int hourWeekly;
        double salaryWeeklyHour;
        hourWeekly =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese sus horas de trabajo en la semana: "));
        salaryWeeklyHour =Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el salario por Hora: "));

        JOptionPane.showMessageDialog(null,"El salario semanas es de: "+(hourWeekly*salaryWeeklyHour));
      //  salaryWeekly =Double.parseDouble(JOptionPane.showInputDialog(null,""));



    }
}
