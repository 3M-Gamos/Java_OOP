/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.objet.WoE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author ADR001
 */
public class World {
    
    
    public ArrayList<Archer> archers = new ArrayList<>();
    //public ArrayList<Paysan> paysans 
    public ArrayList<Paysan> paysans = new ArrayList<>();
    public ArrayList<Guerrier> guerriers = new ArrayList<>();
    public ArrayList<Loup> loups = new ArrayList<>();
    public ArrayList<Lapin> lapins = new ArrayList<>();

  
    public LinkedList<Archer> archersList = new LinkedList<>();
    public LinkedList<Paysan> paysansList = new LinkedList<>();
    public LinkedList<Guerrier> guerriersList = new LinkedList<>();

    Iterator<Archer> it = archersList.iterator();
    Iterator<Paysan> itun = paysansList.iterator();
    Iterator<Guerrier> itdeux = guerriersList.iterator();
    
    public World(String s , int nPro){
        
    Random aleo = new Random();


    if ("ArrayList".equals(s)){
        
        
         //  si nbchoix =  0 :Archer  ; 1: Paysan   ; 2: Guerrier  
        
        for(int i=0; i < nPro; i++) {
          int nbchoix= aleo.nextInt(3);
          switch (nbchoix){
              case 0 -> this.archers.add(new Archer());
              case 1 -> this.paysans.add(new Paysan());
              case 2 -> this.guerriers.add(new Guerrier());
          }

        }
    }
      if ("LinkedList".equals(s)){
        
         // si nbchoix =  0 :Archer  ; 1: Paysan   ; 2: Guerrier 
        
        
       for(int i=0; i < nPro; i++) {
          int nbchoix= aleo.nextInt(3);
          switch (nbchoix){
              case 0 -> this.archersList.add(new Archer());
              case 1 -> this.paysansList.add(new Paysan());
              case 2 -> this.guerriersList.add(new Guerrier());
          }

        }
    }
        
       
    }
        

        
        
        //int nbPaysans = aleo.nextInt(100);
    // etc
       /* for(int i=0; i <nbArchers ; i++) {
        
        Archer p = archersList.get(i); 
        }
        while(it.hasNext()) {
        Archer p = it.next();
        }
        */
    }
    
    
   /* public void creerMondeAlea() {

        Random alea = new Random();
        Creature tab[] = new Creature[7];
        tab[0] = this.robin;
        tab[1] = this.guillaumeT;
        tab[2] = this.bugs1;
        tab[3] = this.bugs2;
        tab[4] = this.peon;
        tab[5] = this.grosBill;
        tab[6] = this.Wolfie;
        tab[0].pos.coordX = alea.nextInt(100);
        tab[0].pos.coordY = alea.nextInt(100);
        for (int k = 1; k <= 6; k++) {
            boolean test = true;
            while (test) {
                tab[k].pos.coordX = alea.nextInt(100);
                tab[k].pos.coordY = alea.nextInt(100);
                test = false ;
                for (int j = 0; j < k; j++) {
                    if ((tab[j].pos.coordX == tab[k].pos.coordX) && (tab[j].pos.coordY == tab[k].pos.coordY)) {
                         test = true ;         }
                }
            }
        }
    }
        
        */
    
    
    



