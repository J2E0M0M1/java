package org.example;

public class bubbleMethod {
    public static void main(String[] args){

                // Declarar un arreglo de números enteros
                int[] numeros = {5, 3, 1, 2, 4};

                // Ordenar el arreglo utilizando el método de la burbuja
                for (int i = 0; i < numeros.length - 1; i++) {
                    for (int j = 0; j < numeros.length - i - 1; j++) {
                        if (numeros[j] > numeros[j + 1]) {
                            int temp = numeros[j];
                            numeros[j] = numeros[j + 1];
                            numeros[j + 1] = temp;
                        }
                    }
                }

                // Imprimir el arreglo ordenado
                for (int numero : numeros) {
                    System.out.println(numero);
                }
            }
        }

