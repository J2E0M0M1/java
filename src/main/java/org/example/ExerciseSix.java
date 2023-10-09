package org.example;

import javax.swing.*;
import java.util.Scanner;

public class ExerciseSix {

    public static void main(String[] args){

        /*
        Hacer un programa que calcule el cuadrado de una suma.
        (a+b)2 = a2 + b2 +2ab
         */

        Scanner sc= new Scanner(System.in);

        float a =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el primer valor: "));
        float b =Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el segundo valor: "));

    float a1 = cuadrado(a);
        float b1 = cuadrado(b);

float suma = (a1+b1+(2*a*b));
float result = cuadrado(suma);
double otro =Math.pow(a,3);  // clase Math tiene metodos para problemas matematicos .

        System.out.println(otro);

JOptionPane.showMessageDialog(null,"El resultado es: "+result);


    }
    private static float cuadrado(float numero){
       float result = numero * numero;
        return result;

    }
}
