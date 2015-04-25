/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author Mark
 */
public class VareHandler {
    private static VareHandler vh;
    private DBConnection dbc;
    private ArrayList<Drikkelse> vareListe;
    private ArrayList<TypeRabat> rabatList;

    private VareHandler() {
        try {
            dbc = DBConnection.getInstance();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        rabatList = new ArrayList<>();
        vareListe = new ArrayList<>();
    }
    
    public static VareHandler getInstance(){
        if (vh == null) {
            vh = new VareHandler();
        }
        return vh;
    }
    
    public ArrayList<TypeRabat> getRabatList(){
        rabatList.removeAll(rabatList);
        try {
            ResultSet rs;
            rs = dbc.getResult("Call getRabatList()");
            while (rs.next()) {
                TypeRabat tr = new TypeRabat(rs.getInt("tr_Id"), rs.getInt("tr_PerAntal"), rs.getInt("tr_PrisForAntal"));
                rabatList.add(tr);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        return rabatList;
    }
    
    public ArrayList<Drikkelse> getVareList(){
        vareListe.removeAll(vareListe);
        TypeRabat tr = null;
        try {
            ResultSet rs;
            rs = dbc.getResult("Call getProductList();");
            System.out.println("1");
            while (rs.next()) {
                System.out.println("1");
                for (TypeRabat rabet : getRabatList()) {
                    if (rs.getInt("t_Rabat") == rabet.getId()) {
                        tr = rabet;
                    }
                }
                TypeDrikkelse td = new TypeDrikkelse(rs.getInt("t_Id"), rs.getString("t_Type"), tr);
                Drikkelse d = new Drikkelse(rs.getInt("d_Id"), rs.getString("d_Name"), td, rs.getInt("d_Lager"), rs.getInt("d_Pris"));
                vareListe.add(d);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        for (Drikkelse vareListe1 : vareListe) {
            System.out.println(vareListe1.getNavn());
        }
        return vareListe;
    }
    
    
}
