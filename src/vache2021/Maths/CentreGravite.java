/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache2021.Maths;

import vache2021.prairie.Prairie;

/*
paramètre = "Pre, Air"
Retourne = "CentreGraviteX/(6*Air) , CentreGraviteY/(6*Air)"
Formule paragraphe 2.1.1 - Calcul du centre de gravité d’un polygone régulier
Sous paragrahe Centre de gravité
*/

public class CentreGravite {
    public static float CalculeCentreGX(Prairie Pre,float Air)
    {
        float CentreGraviteX = 0;
        
        for(int i=0;i<Pre.getNbPiquets();i++)
        {
            float x1 = Pre.getElementFromList(i).getPositionX();
            float y1 = Pre.getElementFromList(i).getPositionY();

            float x2 = Pre.getElementFromList(i+1).getPositionX();
            float y2 = Pre.getElementFromList(i+1).getPositionY();

            CentreGraviteX = CentreGraviteX + (x1+x2)*((x1*y2)-(x2*y1));
        }        
        
        return CentreGraviteX/(6*Air);
    }
    
    public static float CalculeCentreGY(Prairie Pre,float Air){
        float CentreGraviteY = 0;
        
        for(int i=0;i<Pre.getNbPiquets();i++)
        {
            float x1 = Pre.getElementFromList(i).getPositionX();
            float y1 = Pre.getElementFromList(i).getPositionY();

            float x2 = Pre.getElementFromList(i+1).getPositionX();
            float y2 = Pre.getElementFromList(i+1).getPositionY();

            CentreGraviteY = CentreGraviteY + (y1+y2)*((x1*y2)-(x2*y1));
        }        
        
        return CentreGraviteY/(6*Air);
    }
}
