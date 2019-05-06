package helloworld;

/**
 *
 * @author LENOVO
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HelloWorld extends JFrame implements ActionListener{
    
    private JLabel mensaje;
    private JLabel mensaje2;
    private JLabel mensajeSuma;
    private JButton boton;
    private JTextField caja;
    private JTextField caja2;
    public HelloWorld(){
        super();
        configurarVentana();
        crearComponentes();
    }
    private void configurarVentana(){
        this.setTitle("Hello World");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void crearComponentes(){
        mensaje = new JLabel();
        mensaje.setText("Hello World");
        mensaje.setBounds(100,10,80,20);//(x,y,ancho,alto)
        mensaje.setForeground(Color.red);
        this .add(mensaje);
    
        mensaje2 = new JLabel();
        mensaje2.setText("Ingrese los numeros a sumar");
        mensaje2.setBounds(50,20,200,20);//(x,y,ancho,alto)
        mensaje2.setForeground(Color.red);
        this .add(mensaje2);
        
        mensajeSuma = new JLabel();
        mensajeSuma.setText(" + ");
        mensajeSuma.setBounds(130,65,20,20);//(x,y,ancho,alto)
        mensajeSuma.setForeground(Color.red);
        this .add(mensajeSuma);
        
        caja = new JTextField();
        caja.setBounds(60,60,50,30);//(x,y,ancho,alto)
        this.add(caja);
        
        caja2 = new JTextField();
        caja2.setBounds(170,60,50,30);//(x,y,ancho,alto)
        this.add(caja2);
        
        boton = new JButton();
        boton.setText("Sumar");
        boton.setBounds(80,100,100,30);//(x,y,ancho,alto)
        boton.addActionListener(this);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        int resultado1 = Integer.parseInt(caja.getText());
        int resultado2 = Integer.parseInt(caja2.getText());
        JOptionPane.showMessageDialog(this, "El resultado es: " + (resultado1 + resultado2));
    }
    
    public static void main(String[] args){
      
      HelloWorld ventana = new HelloWorld();
      ventana.setVisible(true);
    }
}