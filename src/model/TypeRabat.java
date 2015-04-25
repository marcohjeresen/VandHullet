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
public class TypeRabat {
    private int id;
    private int perAntal;
    private int prisForAntal;

    public TypeRabat(int id, int perAntal, int prisForAntal) {
        this.id = id;
        this.perAntal = perAntal;
        this.prisForAntal = prisForAntal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerAntal() {
        return perAntal;
    }

    public void setPerAntal(int perAntal) {
        this.perAntal = perAntal;
    }

    public int getPrisForAntal() {
        return prisForAntal;
    }

    public void setPrisForAntal(int prisForAntal) {
        this.prisForAntal = prisForAntal;
    }
    
    
    
}
