/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_recusividad;

/**
 *
 * @author CarlosXl
 */

public class EmailAccount {
    String direccionEmail;

    String password;
    String nombreUsuario;
    String[]inbox = new String[10];

    public EmailAccount(String direccionEmail, String password, String nombreUsuario, String[] inbox) {
        this.direccionEmail = direccionEmail;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        
    }

    public String getDireccionEmail() {
        return direccionEmail;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void recibirEmail(int a){
        
    }
}


