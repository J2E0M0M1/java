package org.example;

import javax.swing.*;

public class ExerciseFour {
    public static void main(String[] args) {

        /*
        una compañia de carros husado
        paga a su personal de ventas un salario de $1000 MENSUALES
        mas una comision de $150 por carro q vendan
        mas el 5% del valor de la venta por carro.
        cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes
        Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
         */

        double salaryPerson = 1_000;
        double commission = 150;
        double porcentage; // 5% ...
        double salaryMonthly;
        int carSold; //...


        carSold =Integer.parseInt(JOptionPane.showInputDialog(null,"numero de carros vendidos: "));
        commission = commission * carSold;

        double valueSale[] = new double[carSold];

        for(int i = 0; i < valueSale.length; i++){
         valueSale[i]=Double.parseDouble(JOptionPane.showInputDialog(null,
                 "Ingrese el valor del "+(i+1)+" Carro"));
        }
        // una variable donde se almacena con valor 0
        double total = 0.0;
        // Recorremos el array y sumamos sus elementos
        for (int d= 0; d < valueSale.length; d++){
            total += valueSale[d];
        }

        double fivePercent = (double) (total*0.05); // sacamos el 5%

        salaryMonthly = (salaryPerson+(150*carSold)+fivePercent);

        JOptionPane.showMessageDialog(null,"El salario mensual de este vendedor es de: "+salaryMonthly);
    }
}
