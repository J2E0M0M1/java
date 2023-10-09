package org.example;

import javax.swing.*;

public class SobrecargaMetodos {

    //Atributos
    String name;
    int annos;
    //Metodos sobrecargados
// ya q hay 2 metodos con el mismo nombre pero si diferencian por sus parametros
    public SobrecargaMetodos(String name,int años) {
        this.name = name;
        this.annos = años;
        JOptionPane.showMessageDialog(null, "Soy  "+name+" tengo "+annos+" años");

    }
    public SobrecargaMetodos(int dni){
        JOptionPane.showMessageDialog(null, "El DNI : "+dni);
    }
    public void Correr(){
        JOptionPane.showMessageDialog(null, "Estoy corriendo una maraton");

    }
    public void Correr(int km){
        JOptionPane.showMessageDialog(null, " Recorri "+km+" Km");

    }
}
