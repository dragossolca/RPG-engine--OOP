/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjeurpg;

import java.util.ArrayList;

/**
 *
 * @author solca
 */
public class Personnage extends Element {
    String name;
    int health;
    int maxHealth;
    ArrayList<Objet> inventory=new ArrayList();
    public Personnage(){};

    public Personnage(String name, int health, int maxHealth) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
    }
    
    @Override
    public String getDescription() {
        if(health>maxHealth) System.out.println("Supercharged!!!");
        return "Name:"+name+" "+"Life: "+health+"/"+maxHealth;
    }

    

    @Override
    public String getType() {
        return "PERSONNAGE";
    }
    public String getName()
    {
        return name;
    }
    public void setName(String s)
    {
        this.name=s;
    }
    public int getVitalite()
    {
        return health;
    }
    public void setVitalite(int i)
    {
        this.health=i;
    }
    public int getVitaliteMax()
    {
        return maxHealth;
    }
    public void setVitaliteMax(int i)
    {
        this.maxHealth=i;
    }
    
    public void afficheInventaire()
    {
        for(Objet i:inventory)
            System.out.println(i.toString());
    }
    // vezi cum faci daca sunt 2 obiecte la fel :)
    public void ajouteObjet(Objet i)
    {   
        for(Objet j : inventory)
        {
            if(j.name.equals(i.name)) throw new RuntimeException("It's a feature, not a bug");
        }
        inventory.add(i);
    }
    public Objet poseObjet(int numero)
    {
        return inventory.remove(numero);
    }

    @Override
    public void setDescription(String s) {
        this.description=s;
    }

    @Override
    public String toString() {
        return "Personnage{" + "name=" + name + ", health=" + health + ", maxHealth=" + maxHealth + ", inventory=" + inventory + '}';
    }
    
}
