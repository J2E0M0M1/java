package Polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    int numeroPuertas;
    public VehiculoTurismo(String matricula,String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
         this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    @Override
    public String mostrarDate() {
        return "la matricula: " + getMatricula() + " de la marca: " + getMarca() + " es un modelo: " + getModelo() + "" +
                " tiene un cilindro de " + getNumeroPuertas();
    }
}
