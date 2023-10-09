package Paquete2;

public class Constantes {
  // una constante necesita instancias su valor y para que se inicialice como constante se pone final
    private final String name ;
    private int years ;
    private final int cedula;

    public Constantes(String name, int years, int cedula){
        this.name = name;
        this.years = years;
        this.cedula = cedula;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    // a las constantes se puede acceder mediante un Getter mas no cambiar su valor por un setter
    public String getName() {
        return name;
    }

    public int getCedula() {
        return cedula;
    }
}
