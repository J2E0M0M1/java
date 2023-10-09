package org.example;

public class POO {
    // Atributos
    String name ;
    String color;
    int km;

    // metodo main
    public static void main(String[] args){

    // creacion de objetos
    POO coche1 = new POO();
        POO coche2 = new POO();

        //instanciar atributos de un objeto
    coche1.color = "Rojo";
    coche1.name = "Supra";
    coche1.km = 0 ;
    coche2.name = "Lamborghini";
    coche2.color = "Negro";
    coche2.km = 100;

        System.out.println(coche1.name +" y "+ coche2.name);



    }
}
