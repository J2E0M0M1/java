package org.example;

import javax.swing.*;

public class ExeciseOrder {
    public static void main(String[] args){

        /*
        programa que pida 3 digitos
        y los ordene de mayor a menor
         */

        int numberA,numberB, numberC;

        numberA =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte de numero A: "));
        numberB =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte de numero B: "));
        numberC =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte de numero C: "));

        if (numberA>numberB && numberB>numberC){
            JOptionPane.showMessageDialog(null,"de maryor a menor:" +
                    " - "+numberA+" - "+numberB+" - "+numberC);

        } else if (numberA>numberC && numberC>numberB) {
            JOptionPane.showMessageDialog(null,"de maryor a menor:" +
                    " - "+numberA+" - "+numberC+" - "+numberB);

        } else if (numberB>numberA && numberA>numberC) {
            JOptionPane.showMessageDialog(null,"de maryor a menor:" +
                    " - "+numberB+" - "+numberA+" - "+numberC);

        } else if (numberB>numberC && numberC>numberA) {
            JOptionPane.showMessageDialog(null,"de maryor a menor:" +
                    " - "+numberB+" - "+numberC+" - "+numberA);

        } else if (numberC>numberA && numberA>numberB) {
            JOptionPane.showMessageDialog(null,"de maryor a menor:" +
                    " - "+numberC+" - "+numberA+" - "+numberB);

        } else if (numberC>numberB && numberB>numberA) {
            JOptionPane.showMessageDialog(null,"de maryor a menor:" +
                    " - "+numberC+" - "+numberB+" - "+numberA);
        }


    }
}
