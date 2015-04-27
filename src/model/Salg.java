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
public class Salg {
    private int id;
    private String date;
    private Bruger bruger;
    private int totalPris;

    public Salg(Bruger bruger) {
        this.bruger = bruger;
        date = "";
        id = 0;
        totalPris = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bruger getBrugerId() {
        return bruger;
    }

    public void setBrugerId(Bruger brugerId) {
        this.bruger = brugerId;
    }

    public int getTotalPris() {
        return totalPris;
    }

    public void setTotalPris(int totalPris) {
        this.totalPris = totalPris;
    }
    
    
    
}
