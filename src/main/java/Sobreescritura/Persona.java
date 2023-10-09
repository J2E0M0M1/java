package Sobreescritura;

public class Persona extends Comer{

    @Override    // sobreeescribirse el metodo
    public void comer(){
        System.out.println("Estoy comiendo en el restaurante");
    }
}
