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
public class Creature {
    
    
    /**
     * points de vie
     */
    public int ptVie;

    /**
     * Degré d'attaque
     */
    public int degAtt;

    /**
     * Point de parade
     */
    public int ptPar;

    /**
     * Pourcentage d'attaque
     */
    public int pageAtt;

    /**
     * Pourcentage de parade
     */
    public int pagePar;

    /**
     * Position
     */
    public Point2D pos;

    public Creature(int ptVie, int degAtt, int ptPar, int pageAtt, int pagePar, Point2D pos) {
        this.ptVie = ptVie;
        this.degAtt = degAtt;
        this.ptPar = ptPar;
        this.pageAtt = pageAtt;
        this.pagePar = pagePar;
        this.pos = pos;
    }

    public Creature() {

        this.ptVie = 100;
        this.degAtt = 1;
        this.ptPar = 5;
        this.pageAtt = 0;
        this.pagePar = 0;
        this.pos = new Point2D();
    }
    
    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int ptVie) {
        this.ptVie = ptVie;
    }

    public int getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int degAtt) {
        this.degAtt = degAtt;
    }

    public int getPtPar() {
        return ptPar;
    }

    public void setPtPar(int ptPar) {
        this.ptPar = ptPar;
    }

    public int getPageAtt() {
        return pageAtt;
    }

    public void setPageAtt(int pageAtt) {
        this.pageAtt = pageAtt;
    }

    public int getPagePar() {
        return pagePar;
    }

    public void setPagePar(int pagePar) {
        this.pagePar = pagePar;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
        
    }
    
    
    public void Combattre(Creature c){
    
        if (this.pos.distance(c.pos) == 1 ){
            Random gen = new Random();
            if (gen.nextInt(100) <= this.pageAtt){
                
                System.out.println("Reussite");
                
                if (gen.nextInt(100)<= c.ptPar){
                    c.setPtVie(c.ptVie - (this.degAtt - c.ptPar));
                }
                else{
                    c.setPtVie(c.ptVie - this.degAtt);
                }
             
            
            }
            
            else{
                
                System.out.println("Echec");
            
            }
            
            if (c.ptVie <= 0){
                c.ptVie =0;
                System.out.println("Ennemi tué");
        
        }
        }
        
        
     }
    
    
    
    
    
    
    
    
    
}
