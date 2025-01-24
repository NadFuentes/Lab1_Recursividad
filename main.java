/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacionii.LabprograII;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.event.ActionListener;  
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel titulo = new JLabel();
        JButton agregarTicket = new JButton();
        JButton eliminarTicket = new JButton();
        JButton mostrarPasajeros = new JButton();
        JButton dispatch = new JButton();
        JOptionPane joptionpane = new JOptionPane();
        
        PalindromoAir pA= new PalindromoAir();

        //Frame
        frame.setTitle("Segmented & Corp Airlines");
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.add(titulo);
        frame.add(agregarTicket);
        frame.add(eliminarTicket);
        frame.add(mostrarPasajeros);
        frame.add(dispatch);

        frame.setVisible(true);

        //TITULO
        titulo.setBounds(100, 36, 500, 25);
        titulo.setFont(new Font("Dialog", Font.BOLD, 28));
        titulo.setText("Bienbenidos a Segmented Airlines");

        //BOTON AGREGAR
        agregarTicket.setBounds(200, 100, 200, 40);
        agregarTicket.setBorderPainted(false);
        agregarTicket.setContentAreaFilled(false);
        agregarTicket.setFont(new Font("Dialog", Font.BOLD, 20));
        agregarTicket.setText("Agregar ticket");
        
        //BOTON ELIMINAR
        
        eliminarTicket.setBounds(200, 140, 200, 40);
        eliminarTicket.setBorderPainted(false);
        eliminarTicket.setContentAreaFilled(false);
        eliminarTicket.setFont(new Font("Dialog", Font.BOLD, 20));
        eliminarTicket.setText("Eliminar ticket");
        
        //BOTON MOSTRAR
        
        mostrarPasajeros.setBounds(200, 180, 200, 40);
        mostrarPasajeros.setBorderPainted(false);
        mostrarPasajeros.setContentAreaFilled(false);
        mostrarPasajeros.setFont(new Font("Dialog", Font.BOLD, 20));
        mostrarPasajeros.setText("Mostrar pasajeros");
        
        //BOTON DISPATCH
        
        dispatch.setBounds(200, 220, 200, 40);
        dispatch.setBorderPainted(false);
        dispatch.setContentAreaFilled(false);
        dispatch.setFont(new Font("Dialog", Font.BOLD, 20));
        dispatch.setText("Despegar");
        
        //Action listeners
        
        agregarTicket.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                if(pA.firstAvailable()!=-1){
                    String name=JOptionPane.showInputDialog("Ingrese el nombre del pasajero a agregar!");
                    
                    
                    
                    if(pA.searchPassenger(name)==-1){
                        JOptionPane.showConfirmDialog(null, "Venta de ticket exitosa");
                        pA.sellTicket(name);
                    }else{
                        JOptionPane.showConfirmDialog(null, "Ingrese un nombre no existente");
                    }
                    
                }else{
                    JOptionPane.showConfirmDialog(null, "No hay mas ascientos disponibles");
                }
            }
        });
        
        eliminarTicket.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                if(pA.firstAvailable()!=-1){
                    String name=JOptionPane.showInputDialog("Ingrese el nombre del pasajero a agregar!");
                    
                    
                    
                    if(pA.searchPassenger(name)==-1){
                        JOptionPane.showConfirmDialog(null, "Venta de ticket exitosa");
                        pA.sellTicket(name);
                    }else{
                        JOptionPane.showConfirmDialog(null, "Ingrese un nombre no existente");
                    }
                    
                }else{
                    JOptionPane.showConfirmDialog(null, "No hay mas ascientos disponibles");
                }
            }
        });
        
        mostrarPasajeros.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                pA.printPassengers();
            }
        });
        
        dispatch.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                JOptionPane.showConfirmDialog(null, "Avion a despegado");
            }
        });

    }
}
