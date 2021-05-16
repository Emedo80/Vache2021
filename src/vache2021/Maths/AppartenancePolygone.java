/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache2021.Maths;

import vache2021.prairie.Prairie;
/*
Vérifie si l'entité appartient au polygone
*/
public class AppartenancePolygone {
    /*
    paramètres = "CentreGX, CentreGY, Pre"
    retourne = booléen "Somme"
    Formule paragraphe 2.1.2 - Appartenance d’un point à un polygone
    */
    public static boolean Appartenance(float CentreGX,float CentreGY,Prairie Pre){
        double Somme = 0 , thetai = 0 ;
        
        for (int i = 0; i < Pre.getNbPiquets(); i++)
        {
            
            float Xgsi = Pre.getElementFromList(i).getPositionX() - CentreGX;
            float Ygsi = Pre.getElementFromList(i).getPositionY() - CentreGY;
            
            float X1gsi = Pre.getElementFromList(i+1).getPositionX() - CentreGX;
            float Y1gsi = Pre.getElementFromList(i+1).getPositionY() - CentreGY;
            
            float ProdScalaire = Xgsi * X1gsi + Ygsi * Y1gsi;
            
            double NormVecteur = Math.sqrt(Math.pow(Xgsi, 2) + Math.pow(Ygsi, 2)) * Math.sqrt(Math.pow(X1gsi, 2) + Math.pow(Y1gsi, 2));
            thetai = Math.acos(ProdScalaire/NormVecteur);
            
            double Det = Xgsi * Y1gsi - Ygsi * X1gsi;
            
            if (Det >= 0)
            {
                Somme = Somme + thetai;
            } 
            else 
            {
                Somme = Somme - thetai;
            }
        }
        return (int) Somme != 0;  
    }
}
