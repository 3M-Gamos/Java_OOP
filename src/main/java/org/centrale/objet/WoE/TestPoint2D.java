package org.centrale.objet.WoE;

public class TestPoint2D {
    public static void main(String[] args) {
        
        Point2D pointA = new Point2D(); 
        Point2D pointB = new Point2D(2.0, 3.0);
        Point2D pointC = new Point2D(pointB); 

        
        System.out.println("Point A : " + pointA);
        System.out.println("Point B : " + pointB);
        System.out.println("Point C (copie de B) : " + pointC);

        
        pointA.setCoordX(1.0);
        pointA.setCoordY(2.0);

        
        System.out.println("Point A après modification des coordonnées : " + pointA);

        
        pointB.translater(1.0, -1.0);

       
        System.out.println("Point B après translation : " + pointB);

        
        pointC.setCoords(5.0, 5.0);

        
        System.out.println("Point C après modification des coordonnées : " + pointC);
    }
}
