/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache2021;

import java.util.Scanner;
import vache2021.prairie.Prairie;
import vache2021.Maths.Air;
import vache2021.Maths.CentreGravite;
import vache2021.Maths.AppartenancePolygone;

/**
 *
 * @author Dorion Emeric, Le Goff François
 */
public class Main {

    public static void main(String[] args) {
        float v_Air,CentreGX,CentreGY;
        Prairie Pre;
        int NbPiquets;
        
        //Il est nécessaire d'avoir au moins 3 points pour avoir un polygone
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("Donnez le nombre de piquets (minimum 3) :");
            NbPiquets = sc.nextInt();
        }while(NbPiquets < 3); 
        
        //Initialisation de la prairie
         Pre = new Prairie(NbPiquets);
        
        //Calcul de l'air de la prairie
        v_Air = Air.CalculeAir(Pre);
        
        System.out.println("Air : "+v_Air);
        
        //calcul du centre de gravité
        CentreGX = CentreGravite.CalculeCentreGX(Pre, v_Air);
        CentreGY = CentreGravite.CalculeCentreGY(Pre, v_Air);
        
        System.out.println("Centre X : "+CentreGX);
        System.out.println("Centre Y : "+CentreGY);
        
        if (AppartenancePolygone.Appartenance(CentreGX,CentreGY,Pre))
        {
            System.out.println("dedans");
        }
        else 
        {
            System.out.println("dehors");
        }        
    } 
}
