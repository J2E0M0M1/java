package Paquete2;

import javax.swing.*;

public class ClaseHijo extends ClasePadre{
    private int cdEstudiante;
    private float notaFinal;

    public ClaseHijo(String nombre,String apellidos, int edad, int cdEstudiante, float notaFinal){
        super(nombre,apellidos,edad); // SUPER indica q ya estan inicializados de la clase q se heredo
        this.cdEstudiante = cdEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCdEstudiante() {
        return cdEstudiante;
    }

    public void setCdEstudiante(int cdEstudiante) {
        this.cdEstudiante = cdEstudiante;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "mi nombre es: "+getNombre()+" "+getApellidos()+" tengo "+
                getEdad()+" años. mi codigo de estudante es : "+getCdEstudiante()+" y mi nota final es: "+getNotaFinal());
    }


}
