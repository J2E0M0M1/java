package Polimorfismo;

public class Main {
    public static void main(String[] args){

        Vehiculo misAutos[] = new Vehiculo[4];

        // Polimorfismo son las diferentes formas en el q un objeto puede actuar dependiendo de sobreescritura de metodos
        // Aqui hay polimorfismo ya que mediante la sobreescritura del metodo cambian sus argumentos

        misAutos[0] = new Vehiculo("JPA","CAMARO","2012");
        misAutos[1] = new VehiculoDeportivo("JASP","FERRARY","2020",1000);
        misAutos[2] = new VehiculoFurgoneta("APS","PRADA","2000",500);
        misAutos[3] = new VehiculoTurismo("VIAS","VISA","2010",4);

        //Bucle para recorrer cada metodo sobreeescrito
        for (Vehiculo Vehiculos: misAutos){
            System.out.println(Vehiculos.mostrarDate());
            System.out.println(" ");
        }
    }
}
