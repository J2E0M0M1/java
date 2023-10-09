package org.example;

import javax.swing.*;

public class MainConstructor {
    public static void main(String[] args){

     MConstructor p1 = new MConstructor("Jerson", 22);
     p1.Resultado();

     SobrecargaMetodos p2 = new SobrecargaMetodos("Jose",13);
     p2.Correr();
     SobrecargaMetodos p3 = new SobrecargaMetodos(1007308249);
     p3.Correr(100);




    }
}
