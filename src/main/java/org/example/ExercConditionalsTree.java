package org.example;

import javax.swing.*;

public class ExercConditionalsTree {

    public static void main(String[] args){
    /*
    un obrero necesita calcular su salario semanal
    el cual se obtiene de la siguiente manera:
    *si trabaja 40 horas o menos se le paga $16 por hora
    *si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra
     */


        int hoursJob = Integer.parseInt(JOptionPane.showInputDialog(null,"INSERTE HORAS SEMANALES"));

        if(hoursJob <= 40){
            hoursJob *= 16;
            JOptionPane.showMessageDialog(null,"El salario semanal es de: "+hoursJob);
        } else if (hoursJob > 40) {
            int oneHours =16*40;
            int hoursExtra = (hoursJob - 40);
            hoursJob = hoursExtra * 20;
            int salaryT = oneHours+hoursJob;
            JOptionPane.showMessageDialog(null,"El salario semanal es de: "+salaryT+" con horas extra");

        }




    }
}
