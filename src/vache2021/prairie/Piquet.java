/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache2021.prairie;

/*
Stockage des coordonnées du piquet dans un tableau
*/

public class Piquet {
    float Position[] = new float[2];

    public Piquet(float PosX, float PosY) 
    {
        this.Position[0] = PosX;
        this.Position[1] = PosY;
    }

    public float getPositionX() 
    {
        return Position[0];
    }
    public float getPositionY() 
    {
        return Position[1];
    }
}
