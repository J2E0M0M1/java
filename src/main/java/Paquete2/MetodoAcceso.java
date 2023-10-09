package Paquete2;

import org.example.Encapsulamiento;

import javax.swing.*;

public class MetodoAcceso {
    public static void main(String[] args){
        // como mis atributos estan encapsulados con setter y getter puedo Accerder
        // creo mi objeto de la clase donde estan mis atributos
        Encapsulamiento myPerson = new Encapsulamiento();
        // mediante los setters establesco el valor de cada atributo
        myPerson.setName("Jerson");
        myPerson.setYears(22);
        myPerson.setSex("Maculino");
        myPerson.setCedula(1007308249);
        // Mediante los getter muestro e valor del atribuo
        JOptionPane.showMessageDialog(null,"mi nombre es "+myPerson.getName()+
                " tengo "+myPerson.getYears()+" años soy sexo "+
                myPerson.getSex()+" y mi cedula es "+myPerson.getCedula());

    }
}
