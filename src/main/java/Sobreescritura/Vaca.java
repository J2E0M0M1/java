package Sobreescritura;

public class Vaca extends Perro {

    @Override // Indica q se sobreescribe el metodo
    public void comer(){
        System.out.println("Comiendo pasto");
    }

}
