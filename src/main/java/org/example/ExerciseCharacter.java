package org.example;

import javax.swing.*;

public class ExerciseCharacter {
    public static void main(String[] args){

        /*
        hacer un programa que lea un caracter
        por teclado y que compruebe si es una letra mayuscula.
         */
        char character =JOptionPane.showInputDialog(null, "Escriba un caracter").charAt(0);

       if (Character.isUpperCase(character)){
           JOptionPane.showMessageDialog(null, "El caracter esta en mayuscula");
       }else{
           JOptionPane.showMessageDialog(null, "El caracter esta en minuscula");
       }




    }
}
