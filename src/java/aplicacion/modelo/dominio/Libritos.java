/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author WallHero
 */
public class Libritos implements Serializable{
    private int ISBN = -1;
    private String titulo = "";
    private String author = "";
    private int price = -1;

    public Libritos() {
    }

    public Libritos(int ISBN, String titulo, String autorcito, int precio)
    {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.author = autorcito;
        this.price = precio;
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
    
}
