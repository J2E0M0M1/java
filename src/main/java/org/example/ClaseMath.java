package org.example;

public class ClaseMath {

    public static void main(String[] args){

        Double number = Math.sqrt(23.3); // la clase Math husa un metodo para sacar raiz cuadrada a Doubles

        // clase Math sacar la raiz
        double base = 4.0 , exponente = 3.0;
        double resultado=Math.pow(base,exponente);

        long redondea = Math.round(base);
        double ramdonNumber = Math.random();

        System.out.println(ramdonNumber);



        double resto = 12 % 13; // residuo de division
        System.out.println(resto);

        resto += 2; // resto = resto + 5       ----  *=  -=  /=  %=
        resto++; // resto = resta + 1      incremento en 1
resto--; //  decremento en 1
    }
}
