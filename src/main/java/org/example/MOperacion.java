package org.example;

import javax.swing.*;

public class MOperacion {


    //creacion de los metodos con sus argumentos

    public int Sumar(int number1, int number2) {
        int suma = number1 + number2;
        return suma;
    }

    public int Restar(int number1, int number2) {
        int resta = number1 - number2;
        return resta;
    }

    public int Multiplicar(int number1, int number2) {
        int multiplicacion = number1 * number2;
        return multiplicacion;
    }

    public int Dividir(int number1, int number2) {
        int dividir = number1 / number2;
        return dividir;
    }

    public void Resultado(int suma, int resta, int multi, int division) {

        JOptionPane.showMessageDialog(null, "El resultado de sumar : " + suma);
        JOptionPane.showMessageDialog(null, "El resultado de restar : " + resta);
        JOptionPane.showMessageDialog(null, "El resultado de multiplicar : " + multi);
        JOptionPane.showMessageDialog(null, "El resultado de dividir : " + division);

    }
}


