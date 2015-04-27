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
public class Bruger {
    private int id;
    private String navn;
    private String studieId;

    public Bruger(int id, String navn, String studieId) {
        this.id = id;
        this.navn = navn;
        this.studieId = studieId;
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

    public String getStudieId() {
        return studieId;
    }

    public void setStudieId(String studieId) {
        this.studieId = studieId;
    }
    
    
    
}
