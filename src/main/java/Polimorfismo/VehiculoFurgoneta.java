package Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    int carga;
    public VehiculoFurgoneta(String matricula,String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;

    }

    public int getCarga() {
        return carga;
    }
    @Override
    public String mostrarDate() {
        return "la matricula: " + getMatricula() + " de la marca: " + getMarca() + " es un modelo: " + getModelo() + "" +
                " tiene un cilindro de " + getCarga();
    }
}
