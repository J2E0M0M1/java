package ClasesYMetodosAbtractos;

public class AnimalCarnivoro extends Animal{
    @Override // SOBREESCRIBIENDO
    public void alimentarse(){
        System.out.println("COME CARNE");
    }
}
