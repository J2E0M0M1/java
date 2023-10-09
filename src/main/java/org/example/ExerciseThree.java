package org.example;

import javax.swing.*;

public class ExerciseThree {
    public static void main(String[] args) {

        /*
        Guillermo tiene N dolares.
        Luis tiene la mitad de lo q tiene Guillermo.
        Juan tiene la mitade de lo que tiene luis y Guillermo juntos.
        Hacer un programa q calcule e imprima la cantidad de dinero que tienen entre los tres
         */

        double guillermo, luis, juan;
        double dineroN, totalDinero;


        dineroN=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que tiene Guillermo: "));

        guillermo = dineroN;
        luis = (guillermo/2);
        juan = ((luis+guillermo)/2);
        totalDinero = (guillermo+juan+luis);
        JOptionPane.showMessageDialog(null,"Tienen: "+totalDinero+" Dolares entre todos");
    }
}
