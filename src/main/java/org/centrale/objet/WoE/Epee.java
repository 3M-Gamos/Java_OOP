/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author ADR001
 */
public class Epee extends Objet{
    
    public int Damage;
    
    public Epee(Point2D P, int D){
        super(P);
        this.Damage = D;
    }
    
    public Epee(){
        super();
        this.Damage = 0;
    }
    
    public void renforcer(Personnage P){
        if (this.pos == P.pos){
            P.degAtt += Damage;
        
        }
    }
}
