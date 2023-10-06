package org.centrale.objet.WoE;
import java.util.Random;

public class Personnage extends Creature {

    public String nom;

    public int distAttMax;

    


    public Personnage(String n, int pV, int dA, int pPar, int paAtt, int paPar, int dMax, Point2D p) {
        
        super(pV, dA, pPar, paAtt, paPar, p );
        this.nom = n;
        this.distAttMax = dMax;
    }


    public Personnage(Personnage autrePersonnage) {
        
        super(autrePersonnage.ptVie, autrePersonnage.degAtt, autrePersonnage.ptPar, autrePersonnage.pageAtt, autrePersonnage.pagePar, autrePersonnage.pos );
        this.nom = autrePersonnage.nom;
        
        this.distAttMax = autrePersonnage.distAttMax;
    }


    public Personnage() {
        
        super();
        this.nom = "username";

        this.distAttMax = 0;

    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String n){
        this.nom = n;
    }
    
    public void deplace(){
        Random genAle = new Random();
        boolean b = true;
        int x = 0;
        int y = 0;
        while (b){
            x = -1+genAle.nextInt(3);
            y = -1+genAle.nextInt(3);
            if (x != 0 || y != 0){
                b = false;
            }
        }
        this.pos.translater(x,y);
        
        
    }
    
    public void setDistAttMax(int DAM){
        this.distAttMax = DAM;
    }
    
    
    
    public void CombattrePers(Creature c){
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
            
            if (c.ptVie <= 0){
                c.setPtVie(0);
                System.out.println("Ennemi tué");
        
            }
    
        }
        

    }





}