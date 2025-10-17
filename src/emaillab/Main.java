package emaillab;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            MenuInicio Inicio = new MenuInicio();
           Inicio.setVisible(true);
        });
    }
}
