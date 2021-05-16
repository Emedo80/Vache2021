/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache2021.prairie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Stockage de la postion de chaque piquet dans une liste
*/
public class Prairie {
    List<Piquet> liste;
    private int nbPiquets;

    public int getNbPiquets() {
        return nbPiquets;
    }

    private void setNbPiquets(int nbPiquets) 
    {
        this.nbPiquets = nbPiquets;
    }
    
    
    public void addElementToList(Piquet Position)
    {
        liste.add(Position);
    }
    
    public Piquet getElementFromList(int PosNumber)
    {
        if(PosNumber < this.getNbPiquets())
        {
            return liste.get(PosNumber);
        }
        else{
            return liste.get(0);
        }   
    }

    
    public Prairie(int nbPiquets) 
    {
        this.liste = new ArrayList();
        this.setNbPiquets(nbPiquets);
        this.initPrairie();
    }
   
    private void initPrairie(){
        float x,y;
        for(int i = 0; i < this.getNbPiquets();i++)
        {
            System.out.println("Coordonnées du piquet n°" + i + " x =");
            Scanner sc= new Scanner(System.in);
            x = sc.nextFloat();
            
            System.out.println("y =");
            y = sc.nextFloat();
            
            Piquet piquet = new Piquet(x,y);
            
            this.addElementToList(piquet);
        }
    }
}
