package emaillab;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Email {
    
    private String emisor;
    private String asunto;
    private String contenido;
    private boolean leido;
    private Calendar fechaEnvio;
    
    
    public Email(){
        
    }
    

    public Email(String emisor, String asunto, String contenido, boolean leido, Calendar fechaEnvio) {
        this.emisor = emisor;
        this.asunto = asunto;
        this.contenido = contenido;
        this.leido = false;
        this.fechaEnvio = Calendar.getInstance();
        
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public Calendar getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Calendar fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    
    public boolean leido(){
        this.leido= true;
        return leido;
    }

    
    public String print() {
        
        int dia = fechaEnvio.get(Calendar.DAY_OF_MONTH);
        int mes = fechaEnvio.get(Calendar.MONTH) + 1;
        int anio = fechaEnvio.get(Calendar.YEAR);
        
        return "De: " + emisor + "\n" +
               "Asunto: " + asunto + "\n" +
               "Contenido: " + contenido + "\n" +
               "Leido: " + leido + "\n" +
               "Fecha de envio: " + dia + "/" + mes + "/" + anio;
                
                
    }
}
