/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingprojekt;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Albert
 */
public class SwingProjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  JFrame frame = new JFrame("Labirynt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Panel());
        
        frame.setPreferredSize(new Dimension(400,400));
        frame.pack();
        
        frame.setVisible(true);  */
        
         //okno.getContentPane().add(new NewJFrame());
        // okno.setPreferredSize(new Dimension(900,700));
        Panel okno= new Panel();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.pack();
        
        okno.setVisible(true);
        
    }
    
}
