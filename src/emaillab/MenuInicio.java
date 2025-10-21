package emaillab;

import java.awt.*;
import javax.swing.*;

public class MenuInicio extends JFrame {
    static EmailAccount AcountActual;
    public MenuInicio(){
        setTitle("Menu de Inicio");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton logIN = new JButton("Log In");
        JButton crearCuenta = new JButton("Crear Cuenta");
        
        logIN.setAlignmentX(Component.CENTER_ALIGNMENT);
        crearCuenta.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel.add(Box.createVerticalGlue());
        panel.add(logIN);
        panel.add(Box.createVerticalStrut(10));
        panel.add(crearCuenta);
        panel.add(Box.createVerticalGlue());
        
        add(panel);
        
        logIN.addActionListener(e ->{ 
            System.out.println("Log in");
            
            String email = JOptionPane.showInputDialog(null, "Ingresa tu email: ");
            if(email == null)
                return;
            
            String password = JOptionPane.showInputDialog(crearCuenta, "Ahora ingresa el password: ");
            
            if(EmailAccount.buscarDireccion(email).getPassword().equals(password)){
                AcountActual = EmailAccount.buscarDireccion(email);
            }
                });
        crearCuenta.addActionListener(e -> {
            System.out.println("Crear Cuenta");
            String email = null, password = "", nombre = null;
            
            
            
            while(email==null){
                email = JOptionPane.showInputDialog(null, "Ingresa tu nuevo email: ");
                if(EmailAccount.emailDuplicado(email)){
                    JOptionPane.showMessageDialog(crearCuenta, "Tu dirrecion email es identica a otra, cambiala.");
                }    
            }
           
            while(nombre==null)
                nombre = JOptionPane.showInputDialog(null, "Ingresa tu nombre de usuario : ");
            
            while(password.length()<5){
                password = JOptionPane.showInputDialog(crearCuenta, "Ahora ingresa un password seguro: ");
                if(password.length()<5){
                    JOptionPane.showMessageDialog(crearCuenta, "El password debe de ser mayor a cinco caracteres");
                }
                boolean tieneMayus = false;
                boolean tieneNumero = false;
                boolean tieneEspecial = false;

                for (char c : password.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        tieneMayus = true;
                    } else if (Character.isDigit(c)) {
                        tieneNumero = true;
                    } else if (!Character.isLetterOrDigit(c)) {
                        tieneEspecial = true;
                    }
                }
            
                if(!tieneMayus || !tieneNumero || !tieneEspecial){
                    password = "";
                    JOptionPane.showMessageDialog(crearCuenta, "El password debe de tener una Mayuscula, Numero y Caracter Especial");
                }
            }
            AcountActual = new EmailAccount(email, password, nombre );
            this.setVisible(false);
            JavaLook Principal = new JavaLook();
            
            Principal.setVisible(true);
        });

        }
    
}
