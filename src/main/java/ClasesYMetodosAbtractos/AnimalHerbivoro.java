package ClasesYMetodosAbtractos;

public class AnimalHerbivoro extends Animal{

    @Override// SOBREESCRIBIENDO
    public void alimentarse(){
        System.out.println("COME PLANTAS");
    }
}
