package org.example;

import javax.swing.*;

public class ClaseMain {

    public  static void main(String[] args){

        MOperacion accion = new MOperacion();

       int number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer digito"));
       int number2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo digito"));

        // Invocamos los metodos y establecemos su argumentos
       int suma = accion.Sumar(number1,number2);
       int resta = accion.Restar(number1,number2);
       int multiplicar = accion.Multiplicar(number1,number2);
       int dividir = accion.Dividir(number1,number2);
       accion.Resultado(suma,resta,multiplicar,dividir);



    }



}
