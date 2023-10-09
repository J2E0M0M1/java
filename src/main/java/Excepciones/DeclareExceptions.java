package Excepciones;

import org.example.Encapsulamiento;

import javax.swing.*;
import java.io.*;

public class DeclareExceptions {


public void leerArchivos() throws IOException { // se declara la exception para en otro metodo realizar su encapsulacion
    File archivo = new File("C:\\Users\\ASUS\\Desktop\\Notas\\Notas.txt");
    FileReader fr = new FileReader(archivo);
    BufferedReader bf = new BufferedReader(fr);
    String linea;

    while ((linea = bf.readLine()) != null){
        System.out.println(linea);
    }



} // SE ENCAPSULA EN OTRO METODO PARA REALIZAR SU PROCEDIMIENTO DE MANEJO DE EXCEPTION
    // se captura el error en este metodo
public void encapsulado(){
    // Todo aquello q puede producir una exception
    try {
        leerArchivos();
        // Asi se captura la exception y como es una clase se le pone nombre al objeto(ex)
    } catch (FileNotFoundException ex){
        JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL ARCHIVO, INSERTE NUEVAMENTE SU RUTA");
    }catch (IOException ex2){
        JOptionPane.showMessageDialog(null,"ERROR VERIFICADO ENCONTRADO");
    } finally { // se ejecutara siempre

    }

}
public static void main(String[] args) throws IOException {
    DeclareExceptions lee = new DeclareExceptions();
    lee.encapsulado();

}

}
