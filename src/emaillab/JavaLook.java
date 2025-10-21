package emaillab;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;


public class JavaLook extends JFrame{
    public JavaLook(){
        setTitle("JavaLook");
        setSize(1000,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        EmailAccount actual = MenuInicio.AcountActual;
        
        JPanel nav = new JPanel();
        nav.setLayout(new BoxLayout(nav, BoxLayout.X_AXIS));
        JButton verInbox = new JButton("Ver Inbox");
        JButton mandarCorreo = new JButton("Mandar Correo");
        JButton limpiarCorreo = new JButton("Limpiar Correo");
        JButton buscarCorreo = new JButton("Buscar Correo");
        JLabel fecha = new JLabel(""+ Calendar.getInstance().getTime());
        JLabel nombre = new JLabel(actual.getNombreUsuario());
       
        add(nav , BorderLayout.NORTH);
        nav.add(Box.createHorizontalGlue());
        nav.add(verInbox);
        nav.add(Box.createHorizontalStrut(10));
        nav.add(mandarCorreo);
        nav.add(Box.createHorizontalStrut(10));
        nav.add(limpiarCorreo);
        nav.add(Box.createHorizontalStrut(10));
        nav.add(limpiarCorreo);
        nav.add(Box.createHorizontalStrut(10));
        nav.add(buscarCorreo);
        nav.add(Box.createHorizontalStrut(10));
        nav.add(fecha);
        nav.add(Box.createHorizontalStrut(10));
        nav.add(nombre);
        nav.add(Box.createHorizontalGlue());
        
    }

}
