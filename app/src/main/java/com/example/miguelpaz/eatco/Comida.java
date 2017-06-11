package com.example.miguelpaz.eatco; /**
 * Created by ANDY ESCOBAR 007 on 31/5/2017.
 */


public class Comida {
    private String title,content;
    private double price;
    private int picture;
   // private TipoDeComida tipo;

    public Comida(String title, String content, double price, int picture) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.picture = picture;
       //this.tipo = tipo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    /*public TipoDeComida getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeComida tipo) {
        this.tipo = tipo;
    }
    */
}

