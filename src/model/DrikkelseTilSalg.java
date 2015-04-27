/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mark
 */
public class DrikkelseTilSalg {
    private Salg salg;
    private Drikkelse drikkelse;
    private int antal;

    public DrikkelseTilSalg(Salg salg, Drikkelse drikkelse, int antal) {
        this.salg = salg;
        this.drikkelse = drikkelse;
        this.antal = antal;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    
    public Salg getSalg() {
        return salg;
    }

    public void setSalg(Salg salg) {
        this.salg = salg;
    }

    public Drikkelse getDrikkelse() {
        return drikkelse;
    }

    public void setDrikkelse(Drikkelse drikkelse) {
        this.drikkelse = drikkelse;
    }
    
    public int getPris(){
        int pris = drikkelse.getPris() * antal;
        return pris;
    }
    
    
    
}
