package javaapplication5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fathy
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bar a = new Bar();
        a.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
                a.bar.setValue(i + 10);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaApplication5.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Login().setVisible(true);
        a.dispose();
    }

}
