/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;

import java.util.Random;

/**
 *
 * @author ADR001
 */
public class Archer extends Personnage{
    public int nbFleches;
    
    
    public Archer(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p, int nbFleches) {
        super(n, pV, dA, pPar, paAtt, paPar, dMax, p);
        this.nbFleches = nbFleches;

    }
    
    public Archer() {
        super();
        this.nbFleches = 0;
    }
    
    public Archer(Archer A) {
        this.nom = A.nom;
        this.ptVie = A.ptVie;
        this.degAtt = A.degAtt;
        this.ptPar = A.ptPar;
        this.pageAtt = A.pageAtt;
        this.pagePar = A.pagePar;
        this.distAttMax = A.distAttMax;
        this.pos = new Point2D(A.pos);

    }
    
    public int getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(int nbFleches) {
        this.nbFleches = nbFleches;
    }
    
    
    public void CombattreArcher(Creature c){
        this.Combattre(c);
        if(this.pos.distance(c.pos)> 1 && this.distAttMax > this.pos.distance(c.pos) ){
            Random gen = new Random();
            if (gen.nextInt(100) <= this.pageAtt){
                
                System.out.println("Reussite");
                
                c.setPtVie(c.ptVie - this.degAtt);
            
            }
            
            else{
                
                System.out.println("Echec");
            
            }
        }
        this.nbFleches += -1;

    }

}
    
