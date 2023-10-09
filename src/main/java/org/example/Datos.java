package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Datos {

    public static void main(String[]args){
// Variable espacio en memoria q puede cambiar
        Integer numero = null ;
        String letras = "palabra";


        // constantes es un espacio en memoria q no cambia
        final String elNumero; // se define con final una constante
        final char letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un valor a la constante: ");


        int numero1 ;
        String palabra ;
        Double numero2;
        char caracter;
        float decimal;

        palabra = JOptionPane.showInputDialog("Digite una oracion"); //String
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Dijito un numero")); // number
        numero2= Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal")); // decimales
        caracter=JOptionPane.showInputDialog("Digite un caracter").charAt(0); // 1 caracter se toma
        decimal=Float.parseFloat(JOptionPane.showInputDialog("Digite un numero decimal")); //numero flotante

       // una ventana de output
        JOptionPane.showMessageDialog(null," oracion: "+palabra+" numero: "+numero1+" seguido: "+numero2+" el caracter:"+caracter+"");



    }
}
