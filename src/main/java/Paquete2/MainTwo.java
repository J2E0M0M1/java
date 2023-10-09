package Paquete2;

import javax.swing.*;

public class MainTwo {
    public static void main(String[] args){
// NO SE NECESITA un objeto para llamar el atributo
     //   MienbrosStatic op1 = new MienbrosStatic();

        MienbrosStatic.name = " JOSE";
        JOptionPane.showMessageDialog(null,"Es "+ MienbrosStatic.name+" y la suma "+MienbrosStatic.sumar(2,2));

        MienbrosStatic.name = "Jerson Elian";
        JOptionPane.showMessageDialog(null,"Es "+ MienbrosStatic.name+" y la suma "+MienbrosStatic.sumar(4,5));
    }
}
