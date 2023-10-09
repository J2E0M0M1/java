package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    int cilindrada;


    public VehiculoDeportivo(String matricula,String marca, String modelo, int cilindrada){
        super(matricula,marca,modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    @Override
    public String mostrarDate() {
        return "la matricula: "+getMatricula()+" de la marca: "+getMarca()+" es un modelo: "+getModelo()+"" +
                " tiene un cilindro de "+ getCilindrada();
    }
}
