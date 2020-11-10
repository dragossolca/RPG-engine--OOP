/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjeurpg;

/**
 *
 * @author solca
 */
public class Objet extends Element {
    
    public Objet(){};
    public Objet(String name,String description)
    {
        this.name=name;
        this.description=description;
    }
    @Override
    public String getDescription() {
        return name+" "+description;
    }

    @Override
    public void setDescription(String s) {
        this.description=s;
    }

    @Override
    public String getType() {
        return "OBJET";
    }

    public String getName() {
        return name;
    }
    

    @Override
    public String toString() {
        return "Objet{" + "name=" + name + '}';
    }
    
    
}
