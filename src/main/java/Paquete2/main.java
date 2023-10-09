package Paquete2;

import javax.swing.*;

public class main {
    public static void main(String[] args){

        Constantes onePerson = new Constantes("JERSON",21,1007308249);
        onePerson.setYears(22);
        JOptionPane.showMessageDialog(null,"soy "+onePerson.getName()+
                " tengo "+onePerson.getYears()+ " Años y mi cedula es "+ onePerson.getCedula());

    }
}
