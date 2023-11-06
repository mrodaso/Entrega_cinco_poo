package ejercicio_8.pkg3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaPrincipal extends JFrame implements
ActionListener {

private Container contenedor;

private JButton cilindro, esfera, pirámide;
public VentanaPrincipal(){
inicio();
setTitle("Figuras"); // Establece el título de la ventana
setSize(350,160); // Establece el tamaño de la ventana
setLocationRelativeTo(null); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void inicio() {
contenedor = getContentPane(); /* Obtiene el panel de
contenidos de la ventana */
contenedor.setLayout(null); /* Establece que el contenedor no
tiene un layout */
// Establece el botón del cilindro
cilindro = new JButton();
cilindro.setText("Cilindro");
cilindro.setBounds(20, 50, 80, 23); 
cilindro.addActionListener(this);
// Establece el botón de la esfera
esfera = new JButton();
esfera.setText("Esfera");
esfera.setBounds(125, 50, 80, 23); 
esfera.addActionListener(this);
// Establece el botón de la pirámide
pirámide = new JButton();
pirámide.setText("Pirámide");
pirámide.setBounds(225, 50, 100, 23); 
pirámide.addActionListener(this);
// Se añade cada componente gráfico al contenedor de la ventana
contenedor.add(cilindro);
contenedor.add(esfera);
contenedor.add(pirámide);
}

public void actionPerformed(ActionEvent evento) {
if (evento.getSource() == esfera) { // Si se pulsa el botón esfera
VentanaEsfera esfera = new VentanaEsfera(); 
esfera.setVisible(true); 
}
if (evento.getSource() == cilindro) { 
VentanaCilindro cilindro = new VentanaCilindro(); 
cilindro.setVisible(true); 
}
if (evento.getSource() == pirámide) { 
VentanaPirámide pirámide = new VentanaPirámide(); 
pirámide.setVisible(true); 
}
}
}
