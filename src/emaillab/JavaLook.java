package emaillab;

import java.awt.*;
import java.util.Calendar;
import javax.swing.*;


public class JavaLook extends JFrame{
    public JavaLook(){
        setTitle("Menu de Inicio");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel nav = new JPanel();
        JButton verInbox = new JButton();
        JButton mandarCorreo = new JButton();
        JButton limpiarCorreo = new JButton();
        JButton buscarCorreo = new JButton();
        JLabel fecha = new JLabel();
        JLabel nombre = new JLabel();
        fecha.setText(""+ Calendar.getInstance());
        add(nav , BorderLayout.NORTH);
    }

}
