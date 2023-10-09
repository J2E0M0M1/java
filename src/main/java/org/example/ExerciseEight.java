package org.example;

import javax.swing.*;

public class ExerciseEight {

    public static void main(String[] args){
/*
construir un programa que calcule y muestre por patalla
las raices de la ecuacion de
degundo grado de coeficientes reales

ax2 + bx + c = 0
            ______
    -b +- -/b2 - 4ac
x = ---------------
           2a
 */


        double a,b,c,x;
        a=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor A: "));
        b=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor B: "));
        c=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor C: "));

         x=operationX(a,b,c);

        double resultSuma = (a*x*2)+(b*x)+ c ;

        JOptionPane.showMessageDialog(null,"el Resultado es:"+resultSuma);

    }

    private static double operationX(double a,double b, double c){

        double resRaiz = (b*2)-(4*a*b) ;
        double result =(-b +(-(Math.pow(resRaiz,2)))/ (2*a) );
        return result;
    }
}
