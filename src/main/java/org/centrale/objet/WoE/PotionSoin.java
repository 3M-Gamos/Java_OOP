/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

/**
 *
 * @author ADR001
 */
public class PotionSoin extends Objet {
    public boolean available;
    public int Soin;
    
    public PotionSoin(Point2D P, int S, boolean b){
        super( P);
        this.Soin = S;
        this.available = b;
    }
    
    public PotionSoin(){
        super();
        this.Soin = 0;
        this.available = true;
    }
    
    
     public void setSoin(int S) {
        this.Soin = S;
    }
     
     public void setAvailable (boolean b){
         this.available = b;
     }
     
     
      public void setPosSoin(Point2D p) {
        this.pos = p;
    }
    
    public void Soigner(Personnage P){
        if (P.pos.distance(this.pos) == 0 && this.available == true){
            P.ptVie += this.Soin;
            System.out.println("Plus "+ this.Soin + " de PV");
            this.available = false;
        
        }
    
    }
    
    
}
