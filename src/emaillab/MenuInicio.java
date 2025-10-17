package emaillab;

import java.awt.*;
import javax.swing.*;

public class MenuInicio extends JFrame {
    public MenuInicio(){
        setTitle("Menu de Inicio");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton logIN = new JButton("Log In");
        JButton crearCuenta = new JButton("Crear Cuenta");
        JButton salir = new JButton("Salir");
        
        logIN.setAlignmentX(Component.CENTER_ALIGNMENT);
        crearCuenta.setAlignmentX(Component.CENTER_ALIGNMENT);
        salir.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel.add(Box.createVerticalGlue());
        panel.add(logIN);
        panel.add(Box.createVerticalStrut(10));
        panel.add(crearCuenta);
        panel.add(Box.createVerticalStrut(10));
        panel.add(salir);
        panel.add(Box.createVerticalGlue());
        
        add(panel);
        
        logIN.addActionListener(e ->{ 
            System.out.println("Log in");
                });
        crearCuenta.addActionListener(e -> {
            System.out.println("Crear Cuenta");
            String email = JOptionPane.showInputDialog(null, "Ingresa tu nuevo nombre de email: ");
            String password = "";
            
            if (email != null) {
                while(email.length()<5)
                    email = JOptionPane.showInputDialog(null, "Ingresa tu nuevo nombre de email: ");
                while(password.length()<5){
                    password = JOptionPane.showInputDialog(crearCuenta, "Ahora ingresa un password seguro: ");
                    
                    boolean tieneMayus = password.matches("A-Z");
                    boolean tieneNum = password.matches(".*\\d.*");
                    boolean tieneEsp = password.matches("^a-zA-Z0-9\\\\s");
                    if(!tieneMayus || !tieneNum || tieneEsp)
                        password = "";
                }
            }
            else{
                JOptionPane.showMessageDialog(crearCuenta, "No ingresastes nombre.");
            }
        
        });
        salir.addActionListener(e -> System.out.println("Salir"));
        }
}
