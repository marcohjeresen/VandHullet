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
public class TypeDrikkelse {
    private int id;
    private String type;
    private TypeRabat tRabat;

    public TypeDrikkelse(int id, String type, TypeRabat tRabat) {
        this.id = id;
        this.type = type;
        this.tRabat = tRabat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TypeRabat gettRabat() {
        return tRabat;
    }

    public void settRabat(TypeRabat tRabat) {
        this.tRabat = tRabat;
    }
    
    
    
}
