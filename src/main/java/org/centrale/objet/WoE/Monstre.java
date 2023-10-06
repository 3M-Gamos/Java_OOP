package org.centrale.objet.WoE;
import java.util.Random;

public class Monstre extends Creature {
    
    
     public Monstre(int pV, int dA, int pPar, int paAtt, int paPar, Point2D p) {
        super(pV, dA, pPar, paAtt, paPar, p );
        
    }


    public Monstre(Monstre autreMonstre) {
        super(autreMonstre.ptVie, autreMonstre.degAtt, autreMonstre.ptPar, autreMonstre.pageAtt, autreMonstre.pagePar, autreMonstre.pos );
    }


    public Monstre() {
        super();
    }
    

    
    public void deplace(){
        Random genAle = new Random();
        
        int x = -1+genAle.nextInt(3);
        int y = -1+genAle.nextInt(3);
        
        this.pos.setCoords(this.pos.getCoordX()+x,this.pos.getCoordY()+y);
        
        
    }
    
}
