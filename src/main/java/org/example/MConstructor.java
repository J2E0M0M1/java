package org.example;

import javax.swing.*;

public class MConstructor {
    //Atributos
    static String names;
    static int years;

    //Metodos
    public MConstructor(String _name, int _years){
      names = _name;
      years = _years;

    }
    public static void Resultado(){
        JOptionPane.showMessageDialog(null,"Hola soy "+names+" y tengo "+years+" años");

    }
}
