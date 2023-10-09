package interfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    JPanel p1 ;

 public Ventana() {
     //this.setLocation(500,0); // Posicion de la ventana
     this.setSize(447, 580); // Establecer el tamaño de la ventana
     //this.setBounds(500,0,500,500); // posicion de la ventana y ancho como alto
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Al clicar en x se cierra del todoo
     this.setTitle("DICCIONARIO DEL CABALLERO"); // titulo de la ventana
     this.setLocationRelativeTo(null); // pone en el centro de la pantalla la ventana
     this.getContentPane().setBackground(Color.red); // Establece el color
     // this.setMaximumSize(new Dimension(700,700));
     // this.setMinimumSize(new Dimension(400,400));
     this.setResizable(false);
     ImageIcon imag = new ImageIcon("corona.png");
     this.setIconImage(imag.getImage());
     iniciarMetodos();


 }
 public void iniciarMetodos(){
     panel();
     etiquetas(); // instanciamos al siguiente metodo
     botones();
   //  radioBotones();
  //   cajasTexto();
   //  areaTexto();
    //    listaDesplegable();
 }
   private void  panel() {
       p1 = new JPanel(); // el panel
       p1.setLayout(null);// Desactiva el diseño por defecto
       p1.setBackground(Color.BLACK);  // color panel


   }
   private void etiquetas(){
       JLabel tex = new JLabel("Aqui Texto",SwingConstants.RIGHT); // cON Swing... se dice la posicion del texto en la etiqueta
       tex.setHorizontalAlignment(SwingConstants.CENTER); // asi se husa el metodo de posicion
     // Desactivar el fondo por defecto
       tex.setOpaque(true);
       tex.setBackground(Color.black);// NUEVO COLOR FONDO
       tex.setForeground(Color.WHITE); // Color de la letra   <ETIQUETAS>
       tex.setFont(new Font("chiller",3,30)); // Tipo de letra
       tex.setBounds(0,0,447,50); // posicion y tamaño
       tex.setText("BIENVENIDO CABALLERO");

       ImageIcon imagen= new ImageIcon("Good.jpg");// este objeto almacena la imagen y se puede pasar por parametro de JLabel

       JLabel etiquetaImage = new JLabel();// Imagen en la carpeta

          // image.setIcon(new ImageIcon("Pasamos nombre"));// otra forma de instanciar la imagen

       etiquetaImage.setBounds(0,50,447,500); // TAMAÑO DE ETIQUETA

       // TAMAÑO DE IMAGEN SIN CORTARLA
       etiquetaImage.setIcon(new ImageIcon(
               imagen.getImage().getScaledInstance(etiquetaImage.getWidth(),etiquetaImage.getHeight(),Image.SCALE_SMOOTH))
       );
       etiquetaImage.setVisible(true);


       p1.add(etiquetaImage);
       p1.add(tex);
       this.getContentPane().add(p1);  // agrego el panel a la ventana


   }
   private void botones(){
      ImageIcon imagNote = new ImageIcon("bloqueado.png");
     JButton botonEntrada = new JButton(imagNote);
     botonEntrada.setVisible(true);
     botonEntrada.setBounds(10,200,39,39);
     botonEntrada.setEnabled(true); // para interactuar con el boton
       botonEntrada.setMnemonic('j');// Atajos de teclado para cliquear
       botonEntrada.setOpaque(true); // havilitar el cambio de color
       botonEntrada.setBackground(Color.black); // color fondo
       // configurar el tamaño de la imagen sin dañarla
     botonEntrada.setIcon(new ImageIcon(
             imagNote.getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH)));

       ActionListener oyenteDeAccion = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               // Crea la nueva ventana
               JFrame ventanaNueva = new JFrame("Ventana nueva");
               ventanaNueva.setSize(300, 200);
               ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

               // Agrega un mensaje a la nueva ventana
               JLabel mensaje = new JLabel("¡Bienvenido a la nueva ventana!");
               ventanaNueva.add(mensaje);

               // Muestra la nueva ventana
               ventanaNueva.setVisible(true);
               Ventana.this.dispose();
           }
       };
     botonEntrada.addActionListener(oyenteDeAccion);  // cuando haga Click hira al oyente y procedera a hacer lo que se pidio

     p1.add(botonEntrada);
   }
   private void radioBotones(){
    JRadioButton boton1 = new JRadioButton("Opcion one");
     JRadioButton boton2 = new JRadioButton("Opcion two");
     JRadioButton boton3 = new JRadioButton("Opcion three");

     boton1.setBounds(0,0,100,40);
       boton2.setBounds(0,50,100,40);
       boton3.setBounds(0,100,100,40);

       ButtonGroup primerGrupo = new ButtonGroup();
       primerGrupo.add(boton1);
       primerGrupo.add(boton2);
       primerGrupo.add(boton3);

       boton1.setEnabled(false); // sirve para ocultar y desocultar la opcion

       p1.add(boton1);
       p1.add(boton2);
       p1.add(boton3);



   }
    private void cajasTexto(){
    JTextField cajaTex = new JTextField("Escribe aqui",20);
     cajaTex.setBounds(0,300,100,30);
     cajaTex.setText("HOLA");

        System.out.println("Texto: "+cajaTex.getText());
     p1.add(cajaTex);

    }
    private void areaTexto(){
     JTextArea areaTex = new JTextArea("NOTAS: ");
     areaTex.setBounds(10,300,300,200);
     areaTex.setText("Escribe aqui,");
     areaTex.append("Lo que quieras"); // Añade mas texto sin sobrepornese de set Text
        areaTex.setEditable(true); // no deja eliminar el texto

     p1.add(areaTex);
    }
    private void listaDesplegable(){
     String[] paises = {"Colombia","Venezuela","Mexico","Panama"};

     JComboBox lista = new JComboBox<>(paises);
     lista.addItem("Argentina"); // añadir mas objetos al array
        lista.setSelectedItem("Mexico"); // seleciona que aparecera de primero
     lista.setBounds(0,100,100,30);

     p1.add(lista);
    }
}
