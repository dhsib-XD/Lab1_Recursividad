/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email;

import email.Email;

/**
 *
 * @author CarlosXl
 */
public class EmailAccount  {

    /**
     * @param args the command line arguments
     */
    
       String direccionEmail;
       String Password;
       String nombreUsuario;
       private Email[] inbox;

    public EmailAccount(String dirreccionEmail, String Password, String nombreUsuario) {
        this.direccionEmail = dirreccionEmail;
        this.Password = Password;
        this.nombreUsuario = nombreUsuario;
        this.inbox = new Email[10];
    }

    public String getDirreccionEmail() {
        return direccionEmail;
    }

    public String getPassword() {
        return Password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
   
   public boolean recibirEmail(Email em){
       for (int i = 0; i < inbox.length; i++) {
           if (inbox[i]==null) {
               inbox[i]= em;
               return true;
           }
       }
       return false;
   }   
   public void printInbox(){
       EmailGUI print = new EmailGUI();
       print.Impresion();
   }
   public Email[] getInbox(){
       return inbox;
   }
   public Email getEmail(int pos) {
        if (pos >= 0 && pos < inbox.length) return inbox[pos];
        return null;
    }
     
} 
    

    
    

