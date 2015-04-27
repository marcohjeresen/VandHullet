/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Handler.DBConnection;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import model.Bruger;
import model.Drikkelse;
import model.DrikkelseTilSalg;
import model.Salg;
import util.Listeners;
import view.KurvPanel;
import view.VareButton;

/**
 *
 * @author Mark
 */
public class BasketController {

    private static BasketController bc;
    private DBConnection dBConnection;
    private ArrayList<DrikkelseTilSalg> vareList;
    private Salg salg;
    private Listeners listeners;

    private BasketController() {
        try {
            vareList = new ArrayList<>();
            dBConnection = DBConnection.getInstance();
            listeners = Listeners.getList();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BasketController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static BasketController getInstance() {
        if (bc == null) {
            bc = new BasketController();
        }
        return bc;
    }

    public void setSalg(Bruger bruger) {
        salg = new Salg(bruger);
    }

    public void addToBasket(Drikkelse drikkelse) {
        boolean erder = false;
        for (int i = 0; i < vareList.size(); i++) {
            if (vareList.get(i).getDrikkelse().equals(drikkelse)) {
                vareList.get(i).setAntal(vareList.get(i).getAntal() + 1);
                erder = true;
            }
        }
        if (!erder) {
            vareList.add(new DrikkelseTilSalg(null, drikkelse, 1));
        }
        listeners.notifyListeners("Tilføjet Til Kurv");
    }

    public void basketPlus(Drikkelse drikkelse) {
        for (int i = 0; i < vareList.size(); i++) {
            if (vareList.get(i).getDrikkelse().equals(drikkelse)) {
                vareList.get(i).setAntal(vareList.get(i).getAntal() + 1);
            }
        }
        listeners.notifyListeners("Tilføjet Til Kurv");
    }
    
    public void basketMinus(Drikkelse drikkelse){
        for (int i = 0; i < vareList.size(); i++) {
            if (vareList.get(i).getDrikkelse().equals(drikkelse)) {
                vareList.get(i).setAntal(vareList.get(i).getAntal() - 1);
                if (vareList.get(i).getAntal() == 0) {
                    vareList.remove(i);
                }
            }
        }
        listeners.notifyListeners("Tilføjet Til Kurv");        
    }

    public void showBasket(JPanel jp) {
        int rowDown = 0;
        jp.removeAll();
        for (DrikkelseTilSalg d : vareList) {
            KurvPanel kp = new KurvPanel(d);
            kp.setSize(315, 40);
            if (rowDown == 8) {
                rowDown = 0;
            }
            kp.setLocation(0, (rowDown * (kp.getHeight() + 5)) + 5);
            kp.setVisible(true);
            jp.add(kp);
            jp.setPreferredSize(new Dimension(kp.getWidth(), (rowDown * (kp.getHeight() + 5)) + 50));

            rowDown++;
        }
        jp.revalidate();
        jp.repaint();

    }

}
