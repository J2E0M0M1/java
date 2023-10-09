package org.example;

public class Encapsulamiento {

    // atributos antes del metodo
    private String name;
    private int years;
    private String sex;
    private int cedula;

    // Metodo setter: Establece el valor
    public void setName(String name){
       this.name = name;
    }
    // Metodo Getter: muestra el valor
    public String getName(){
        return name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
