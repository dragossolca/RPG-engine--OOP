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
public class Niveau {
    Element[][] carte=new Element[10][10];
    Personnage PJ;
    String titre;
    public void setElement(int i,int j, Element k){
            carte[i][j]=k;
    }
    public Element getElement(int i, int j)
    {
        return carte[i][j];
    }
    String decritCarte()
    {
        String descriptionCarte="";
        int i,j;
        for(i=0;i<10;i++)
            for(j=0;j<10;j++)
            {   descriptionCarte=descriptionCarte.concat("case "+i+" "+j+" ");
                try{
                     
                    descriptionCarte=descriptionCarte.concat(carte[i][j].getDescription());
                }catch(NullPointerException npe){
                
                    descriptionCarte=descriptionCarte.concat("case vide");
                   }
                finally{
                    descriptionCarte=descriptionCarte.concat(" "+'\n');
                }
            
            }
            
        return descriptionCarte;
    }
    public Personnage getPersonnagePrincipal()
    {
        return PJ;
    }
    public void setPersonnagePrincipal(Personnage p)
    {
        PJ=p;
    }
    public String getTitre()
    {
        return titre;
    }
    
    public void setTitre(String t)
    {
        this.titre=t;
    }
                        
    public Niveau()
    {
        Personnage p=new Personnage("Geralt",100,100);
        setPersonnagePrincipal(p);
        setElement(0,0,p);
    }
    public Niveau(Personnage p)
    {
       setElement((int)(Math.random()*10)+1,(int)(Math.random()*10)+1,p); 
    }
        
}

