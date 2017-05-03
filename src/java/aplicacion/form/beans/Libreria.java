/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.beans;

import aplicacion.modelo.dominio.Libritos;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@SessionScoped
public class Libreria implements Serializable{
    private int ISBN = 0;
    private String titulo = "";
    private String author = "";
    private int price = -1;
    private ArrayList<Libritos> libros = new ArrayList<Libritos>(){};
    private Libritos libroing;
    public Libreria() {
    }
    public void addlibro()
    {
        setLibroing(new Libritos(getISBN(), getTitulo(), getAuthor(), getPrice()));
        getLibros().add(getLibroing());
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Libritos> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libritos> libros) {
        this.libros = libros;
    }

    public Libritos getLibroing() {
        return libroing;
    }

    public void setLibroing(Libritos libroing) {
        this.libroing = libroing;
    }
    
}
