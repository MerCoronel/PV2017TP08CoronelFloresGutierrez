/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.beans;


import aplicacion.modelo.dominio.Rectangulos;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@SessionScoped
public class Rectangulo {
    
    private ArrayList<Rectangulos> rectangulitos = new ArrayList<Rectangulos>();
    
    public Rectangulo() {
        Rectangulos nuevorect = new Rectangulos(5, 2, 0, 0);
        rectangulitos.add(nuevorect);
        nuevorect = new Rectangulos(6, 3 , 1, 2);
        rectangulitos.add(nuevorect);
        nuevorect = new Rectangulos(9, 5 , 3, 3);
        rectangulitos.add(nuevorect);      
    }
    public void borrarRect(Rectangulos a)
    {
        rectangulitos.remove(a);
    }
    public ArrayList<Rectangulos> getRectangulitos() {
        return rectangulitos;
    }

    public void setRectangulitos(ArrayList<Rectangulos> rectangulitos) {
        this.rectangulitos = rectangulitos;
    }
    
}
