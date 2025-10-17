/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emaillab;

/**
 *
 * @author eduar
 */
public class EmailLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Email e= new Email("Eduardo Martorell", "Laboratorio 1 Progra 2", "Prueba de escritorio en consola", false, null );
        e.leido();
        System.out.println(e.print());
        
        
        
    }
    
}
