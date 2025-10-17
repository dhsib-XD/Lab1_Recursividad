/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author CarlosXl
 */
public class EmailGUI extends JFrame{
    public static void main(String[] args) {
         EmailGUI a = new  EmailGUI();
         a.Impresion();
    }
    public void Impresion(){
        setSize(500,500);
        Calendar cal =Calendar.getInstance();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel JL = new JLabel("<html>Bandeja de Entrada<br>Fecha: " + cal.getTime() + "</html>");

        JL.setBounds(150, 50, 200, 200);
        JL.setBackground(Color.gray);
        add(JL);
        setVisible(true);
       
        
    }
    
}
