/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Toolkit;
import javax.swing.JFrame;

import view.Gui2;


/**
 *
 * @author Mark
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gui2 gui = new Gui2();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800, 490);
        int height = Toolkit.getDefaultToolkit().getScreenSize().height - gui.getHeight();
        int widht = Toolkit.getDefaultToolkit().getScreenSize().width - gui.getWidth();
        gui.setLocation(widht / 2, height / 2);
        gui.setVisible(true);
    }
    
}
