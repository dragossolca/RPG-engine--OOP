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
public class TestJeuRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Niveau continent = new Niveau();
        System.out.println(continent.getPersonnagePrincipal());
        System.out.println(continent.getPersonnagePrincipal().getDescription());
        
        continent.getPersonnagePrincipal().ajouteObjet(new Objet("Igni","It has a special fire effect that burns foes"));
        continent.getPersonnagePrincipal().ajouteObjet(new Objet("Igni","Placeholder"));
        Decor White_Orchard= new Decor("White Orchard","Let's get it started! Who are you kidding, you're going to fool around and play Gwent all day long, aren't you?");
        continent.setElement(1, 0, White_Orchard);
        continent.setElement(4, 4, new Personnage("Ciri",90,115));
        continent.setTitre("Continent");
        continent.setElement(0, 2, new Personnage("Wyvern",150,150));
        continent.setElement(3, 2, new Objet("Gwent Card","A new Gwent Card! Collect them all!"));
        System.out.println(continent.decritCarte());
        continent.getPersonnagePrincipal().setVitalite(150);
        System.out.println(continent.getPersonnagePrincipal().getDescription());
    }
    
}
