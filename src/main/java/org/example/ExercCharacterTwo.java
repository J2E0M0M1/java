package org.example;

import javax.swing.*;

public class ExercCharacterTwo {
    public static void main(String[] args){

        /*
        En MegaPlaza se hace un 20% de descuento
        a los clientes cuya compra supere los
        $300.¿ Cual sera la cantidad que pagara una persona por su compra?
         */

        double buys =Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el valor de su compra"));

        double price = 300.0;

if(buys > price ){
    buys = buys - (buys * 0.20);
JOptionPane.showMessageDialog(null,"El valor a pagar con descuento de 20% es: "+buys);
}else{
    JOptionPane.showMessageDialog(null,"El valor a pagar es: "+buys);
}



    }
}
