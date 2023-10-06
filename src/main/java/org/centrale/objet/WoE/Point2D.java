package org.centrale.objet.WoE;

public class Point2D {

    public double coordX;
    public double coordY;


    public Point2D() {
        this.coordX = 0.0;
        this.coordY = 0.0;
    }


    public Point2D(double x, double y) {
        this.coordX = x;
        this.coordY = y;
    }


    public Point2D(Point2D autrePoint) {
        this.coordX = autrePoint.coordX;
        this.coordY = autrePoint.coordY;
    }


    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

 
    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }


    @Override
    public String toString() {
        return "[" + coordX + " ; " + coordY + "]";
    }


    public void translater(double deltaX, double deltaY) {
        this.coordX += deltaX;
        this.coordY += deltaY;
    }

  
    public void setCoords(double newX, double newY) {
        this.coordX = newX;
        this.coordY = newY;
    }

     public double distance(Point2D P) {
        double dis = Math.sqrt((this.coordX - P.coordX)*(this.coordX - P.coordX) +(this.coordY - P.coordY)*(this.coordY - P.coordY));
        return dis;

    }
}