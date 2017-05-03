/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

/**
 *
 * @author WallHero
 */
public class Puntos {
    private double x, y;


    public Puntos(double x1, double y1)
    {
        this.x = x1;
        this.y = y1;
    }
    
    
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
}
