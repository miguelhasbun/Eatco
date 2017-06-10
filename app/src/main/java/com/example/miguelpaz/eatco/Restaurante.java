package com.example.miguelpaz.eatco;

import java.util.ArrayList;

/**
 * Created by ANDY ESCOBAR 007 on 1/6/2017.
 */
public class Restaurante {
    private ArrayList<Comida>menus;
    private String name;

    public Restaurante(String n){
        this.name=n;
        this.menus=new ArrayList<>();
    }

    public void addComida(Comida com){
        menus.add(com);
    }

    public ArrayList<Comida> getComidas(){
        return menus;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
