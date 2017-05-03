/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import aplicacion.datos.Puntos;

/**
 *
 * @author WallHero
 */
public class Rectangulos {
    private Puntos A;
    private Puntos B;
    private Puntos C;
    private Puntos D;
    private double base, altura;
    private double perimetro, superficie;
    public Rectangulos() {
    }
  
    public Rectangulos(double base, double h, double x1, double y1)
    {
        this.base = base;
        this.altura = h;
        A = new Puntos(x1, y1);
        perimetro = (base*2)+(h*2);
        superficie = (base*h);
    }    

    public Puntos getA() {
        return A;
    }

    public void setA(Puntos A) {
        this.A = A;
    }

    public Puntos getB() {
        return B;
    }

    public void setB(Puntos B) {
        this.B = B;
    }

    public Puntos getC() {
        return C;
    }

    public void setC(Puntos C) {
        this.C = C;
    }

    public Puntos getD() {
        return D;
    }

    public void setD(Puntos D) {
        this.D = D;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    
}
