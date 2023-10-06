
package org.centrale.objet.WoE;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author ADR001
 */
public class TestWoe {
    public static void main(String[] args){
        Random rand = new Random();
        int SommeArchers = 0;
        int SommePaysans = 0;
        int SommeGuerriers = 0;
        int SommeLapins =0 ;
        int SommeLoups = 0;

        long debut = System.currentTimeMillis();

        World earth  = new World("LinkedList",100000);
 /*       
    // Ajout des personnages dans la liste
     for(int i=0; i < earth.archersList.size(); i++) {
           earth.archersList.get(i).setPtVie(100);
           SommeArchers += earth.archersList.get(i).getPtVie();
          /*System.out.println("Point de vie de L'archer " + i + ": " + p.getPtVie()); 
        }
        
        for(int i=0; i < earth.paysansList.size(); i++) {
          earth.paysansList.get(i).setPtVie(100);
          SommePaysans += earth.paysansList.get(i).getPtVie();
          /*System.out.println("Point de vie de L'archer " + i + ": " + p.getPtVie()); 
          
          
        }
        
        
        
        for(int i=0; i < earth.guerriersList.size(); i++) {
          earth.guerriersList.get(i).setPtVie(100);
          SommeGuerriers += earth.guerriersList.get(i).getPtVie();
          /*System.out.println("Point de vie de L'archer " + i + ": " + p.getPtVie()); 
          
          
        }
*/


    Iterator<Archer> archerIterator = earth.archersList.iterator();
    while(archerIterator.hasNext()) {
        Archer archer = archerIterator.next();
        archer.setPtVie(100);
        SommeArchers += archer.getPtVie();
    }

    Iterator<Paysan> paysanIterator = earth.paysansList.iterator();
    while(paysanIterator.hasNext()) {
        Paysan paysan = paysanIterator.next();
        paysan.setPtVie(100);
        SommePaysans += paysan.getPtVie();
    }
    Iterator<Guerrier> guerrierIterator = earth.guerriersList.iterator();
    while(guerrierIterator.hasNext()) {
        Guerrier guerrier = guerrierIterator.next();
        guerrier.setPtVie(100);
        SommeGuerriers += guerrier.getPtVie();
        // (Si vous aviez un println pour guerrier, ajoutez-le ici.)
    } 



         long fin = System.currentTimeMillis();
         System.out.println("--------LinkedList----------"); 
         System.out.println("Taille de l'array des archers: "+earth.archersList.size()); 
         System.out.println("Taille de l'array des paysans: "+earth.paysansList.size());
         System.out.println("Taille de l'array des guerriers: "+earth.guerriersList.size());
         System.out.println("Somme des PV des archers: "+ SommeArchers);
         System.out.println("Somme des PV des paysans: "+ SommePaysans);
         System.out.println("Somme des PV des guerriers: "+ SommeGuerriers);
         System.out.println("Temps écoulé du programme en ms: " + (fin - debut));
         
         
           long debut2 =System.currentTimeMillis();
        World earth2  = new World("ArrayList",100000);
        
        int SommeArchers2 = 0;
        int SommePaysans2 = 0;
        int SommeGuerriers2 = 0;
    // Ajout des personnages dans la liste

        for(int i=0; i < earth2.archers.size(); i++) {
           earth2.archers.get(i).setPtVie(100);
           SommeArchers2 += earth2.archers.get(i).getPtVie();
          /*System.out.println("Point de vie de L'archer " + i + ": " + p.getPtVie()); */
        }
        
        for(int i=0; i < earth2.paysans.size(); i++) {
          earth2.paysans.get(i).setPtVie(100);
          SommePaysans2 += earth2.paysans.get(i).getPtVie();
        }
          for(int i=0; i < earth2.guerriers.size(); i++) {
          earth2.guerriers.get(i).setPtVie(100);
          SommeGuerriers2 += earth2.guerriers.get(i).getPtVie();
          /*System.out.println("Point de vie de L'archer " + i + ": " + p.getPtVie()); */
          
          
        }

        
        long fin2 = System.currentTimeMillis();
        
         System.out.println("--------ArrayList----------"); 
         System.out.println("Taille de l'array des archers: "+earth2.archers.size()); 
         System.out.println("Taille de l'array des paysans: "+earth2.paysans.size());
         System.out.println("Taille de l'array des guerriers: "+earth2.guerriers.size());
         System.out.println("Somme des PV des archers: "+ SommeArchers2);
         System.out.println("Somme des PV des paysans: "+ SommePaysans2);
         System.out.println("Somme des PV des guerriers: "+ SommeGuerriers2);
         System.out.println("Temps écoulé du programme en ms: " + (fin2 - debut2));


          /*System.out.println("Point de vie de L'archer " + i + ": " + p.getPtVie()); */
          
          
        }

        /*System.out.println("POSITIONS INITIALES:");
        System.out.println("x robin: " + earth.robin.pos.getCoordX());
        System.out.println("y robin: " + earth.robin.pos.getCoordY()); 
        System.out.println("x peon: " + earth.peon.pos.getCoordX());
        System.out.println("y peon: " + earth.peon.pos.getCoordY());
        System.out.println("x bugs1: " + earth.bugs1.pos.getCoordX());
        System.out.println("y bugs1: " + earth.bugs1.pos.getCoordY());*/
        
        /*System.out.println("x Guillaume: " + earth.guillaumeT.pos.getCoordX());
        System.out.println("y Guillaume: " + earth.guillaumeT.pos.getCoordY());*/
        /*earth.creerMondeAlea();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("POSITIONS APRES CREATION DU MONDE:");
        System.out.println("x robin: " + earth.robin.pos.getCoordX());
        System.out.println("y robin: " + earth.robin.pos.getCoordY());
        System.out.println("x peon: " + earth.peon.pos.getCoordX());
        System.out.println("y peon: " + earth.peon.pos.getCoordY());
        System.out.println("x bugs1: " + earth.bugs1.pos.getCoordX());
        System.out.println("y bugs1: " + earth.bugs1.pos.getCoordY());*/
        
        /*earth.robin.deplace();
        earth.peon.deplace();
        earth.bugs1.deplace();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("POSITIONS APRES DEPLACEMENT:");
        System.out.println("x robin: " + earth.robin.pos.getCoordX());
        System.out.println("y robin: " + earth.robin.pos.getCoordY());
        System.out.println("x peon: " + earth.peon.pos.getCoordX());
        System.out.println("y peon: " + earth.peon.pos.getCoordY());
        System.out.println("x bugs1: " + earth.bugs1.pos.getCoordX());
        System.out.println("y bugs1: " + earth.bugs1.pos.getCoordY());
        System.out.println("x Guillaume: " + earth.guillaumeT.pos.getCoordX());
        System.out.println("y Guillaume: " + earth.guillaumeT.pos.getCoordY());*/
    
    
         /*System.out.println("Distance entre robin et peon: " + earth.robin.pos.distance(earth.peon.pos));*/
         
         
        /* earth.robin.setPos(new Point2D(20,20));
         earth.robin.setDegAtt(10);
         earth.robin.setPageAtt(30);
         
         earth.robin.setNbFleches(10);
         earth.robin.setDistAttMax(5);
         
         /*earth.bugs1.setPos(new Point2D(21,22));
         earth.bugs1.setPtVie(100);
         earth.bugs1.setPtPar(2);
         earth.bugs1.setPagePar(70);*/
         
         /*earth.potion.setPosSoin(new Point2D(21,20));
         earth.potion.setAvailable(true);
         earth.potion.setSoin(20);
         
         
         /*System.out.print("position potion: "+ earth.potion.pos+"\n");
         System.out.print("position robin: "+ earth.robin.pos+"\n");
         System.out.print("ptVie robin avant potion: "+ earth.robin.ptVie+"\n");
         
         /*System.out.print("Nombres des flèches" + earth.robin.nbFleches+"\n");
         
         System.out.print("Distance entre les deux creatures: "+ earth.robin.pos.distance(earth.bugs1.pos)+"\n");*/
         
        /* earth.potion.Soigner(earth.robin);
         
         System.out.print("ptVie robin après potion: "+ earth.robin.ptVie+"\n");*/
         
         /*System.out.print("Nombres des flèches" + earth.robin.nbFleches+"\n");*/
int m = 0;
// Ajout des personnages dans la liste


        
    }
   

