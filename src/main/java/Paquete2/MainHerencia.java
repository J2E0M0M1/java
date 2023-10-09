package Paquete2;

import javax.swing.*;

public class MainHerencia {
    public static void main(String[] args){

         String name = JOptionPane.showInputDialog(null,"Inserte nombre");
         String apellido = JOptionPane.showInputDialog(null,"Inserte apellido");
         int edad =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte edad"));
         int cdE = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte codigo"));
         float notaFinal = Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte notafinal"));

        ClaseHijo person = new ClaseHijo(name,apellido,edad,cdE,notaFinal);
        person.setNombre("Jerson");
        person.mostrarDatos();

    }
}
