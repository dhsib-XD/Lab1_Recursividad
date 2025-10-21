package emaillab;
/**
 *
 * @author CarlosXl
 */
import java.util.ArrayList;
public class EmailAccount  {
    
    /**
     * @param args the command line arguments
     */
    
       private String direccionEmail;
       private String Password;
       private String nombreUsuario;
       private Email[] inbox;
       private static ArrayList<EmailAccount> cuentas = new ArrayList<>();;
       
    public EmailAccount(String dirreccionEmail, String Password, String nombreUsuario) {
        this.direccionEmail = dirreccionEmail;
        this.Password = Password;
        this.nombreUsuario = nombreUsuario;
        this.inbox = new Email[10];
        
    }
    public static boolean emailDuplicado(String email){
        for(EmailAccount e : cuentas){
            if(e.cuentas.equals(email))
                return true;
        }
        return false;
    }
    public String getDirreccionEmail() {
        return direccionEmail;
    }

    public String getPassword() {
        return Password;
    }
    public static EmailAccount buscarDireccion(String dir){
        for(EmailAccount u: cuentas){
            if(u.direccionEmail.equals(dir))
                return u;
        }
        return null;
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
    

    
    

