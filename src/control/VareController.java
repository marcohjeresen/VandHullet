/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Handler.VareHandler;
import javax.swing.JPanel;
import model.Drikkelse;
import view.VareButton;

/**
 *
 * @author Mark
 */
public class VareController {
    private static VareController vc;
    private VareHandler vh;

    private VareController(VareHandler vh) {
        vh = VareHandler.getInstance();
        
    }
    
    public static VareController getInstance(){
        if (vc == null) {
            vc = new VareController(null);
        }
        return vc;
    }
    
    public void showVare(JPanel jp){
        int rowLeft = 0;
        int rowDown = 0;
        for (Drikkelse d : vh.getVareList()) {
            VareButton vb = new VareButton(d.getNavn());
            vb.setLocation(5, (rowDown * vb.getHeight()) + 5);
            vb.setVisible(true);
            jp.add(vb);
            jp.revalidate();
            
        }
    }
    
    
    
}