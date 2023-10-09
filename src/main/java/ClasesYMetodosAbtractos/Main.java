package ClasesYMetodosAbtractos;

public class Main {

    public static void main(String[] args){

     Planta obPlanta = new Planta();
     AnimalCarnivoro aniC = new AnimalCarnivoro();
     AnimalHerbivoro aniE = new AnimalHerbivoro();

     obPlanta.alimentarse();
     aniE.alimentarse();
     aniC.alimentarse();

    }
}
