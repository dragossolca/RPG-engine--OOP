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
public abstract class Element {
    String name;
    String description;
    public Element(){};
    public abstract String getDescription();
    public abstract void setDescription(String s);
    public abstract String getType();
}
