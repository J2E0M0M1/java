package org.example;

import javax.swing.*;

public class ExerciseConditionFive {
    public static void main(String[] args){
        /*
        pedri el dia, mes y año de una fecha
        e indicar si la fecha es correcta. Con meses de 
        28, 30 y 31 dias. sin años bisiestos.
         */
int dia,mes,anno;
        dia =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el dia: "));
        mes =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el mes: "));
        anno =Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el año: "));
if (dia>31 || dia< 1){
    JOptionPane.showMessageDialog(null, "fecha incorrecta. los dias no concuerdan");
} else if (mes>12 ||mes<1) {
    JOptionPane.showMessageDialog(null, "fecha incorrecta. el mes no concuerdan");
} else if (anno>2023 || anno<1800) {
    JOptionPane.showMessageDialog(null, "fecha incorrecta. el año no concuerda");
}else {
    JOptionPane.showMessageDialog(null,"la fecha es: dia "+dia+"/ mes "+mes+"/ año "+anno);
}


    }
}
