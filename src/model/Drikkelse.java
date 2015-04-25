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
public class Drikkelse {
    private int id;
    private String navn;
    private TypeDrikkelse type;
    private int lager;
    private int pris;

    public Drikkelse(int id, String navn, TypeDrikkelse type, int lager, int pris) {
        this.id = id;
        this.navn = navn;
        this.type = type;
        this.lager = lager;
        this.pris = pris;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public TypeDrikkelse getType() {
        return type;
    }

    public void setType(TypeDrikkelse type) {
        this.type = type;
    }

    public int getLager() {
        return lager;
    }

    public void setLager(int lager) {
        this.lager = lager;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }
    
    
    
}
