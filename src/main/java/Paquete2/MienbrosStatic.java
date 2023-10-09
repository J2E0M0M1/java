package Paquete2;

import javax.swing.*;

public class MienbrosStatic {

    // al declararse static la variable o metodo pasa a ser de la clase y no de objeto
    public static String name = "James";
    public MienbrosStatic(){




        MienbrosStatic op = new MienbrosStatic();
         op.name = "Jerson";

    }
    public void  mensaje(String name){
        JOptionPane.showMessageDialog(null,"ERES "+name);
    }
    public static int sumar(int n1,int n2){
        int suma = n1+n2;
        return suma;
    }
}
