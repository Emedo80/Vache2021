/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache2021.Maths;
import vache2021.prairie.Prairie;

/*
Calcul de l'air du polygone
*/
public class Air {
    /*
    paramètre = "Pre"
    Retourne = "Air/2"
    Formule paragraphe 2.1.1 - Calcul du centre de gravité d’un polygone régulier
    Sous paragrahe Aire d’un polygone régulier
    */
    
    public static float CalculeAir(Prairie Pre){
        float Air = 0;
        
        for(int i=0;i<Pre.getNbPiquets();i++)
        {
            float x1 = Pre.getElementFromList(i).getPositionX();
            float y1 = Pre.getElementFromList(i).getPositionY();

            float x2 = Pre.getElementFromList(i+1).getPositionX();
            float y2 = Pre.getElementFromList(i+1).getPositionY();

            Air = Air + ((x1*y2)-(x2*y1));
        } 
        
        return Air/2;
    }   
}
