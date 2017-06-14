package com.example.miguelpaz.eatco;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by David on 6/6/2017.
 */

public class usuario implements Serializable {

    private String usuario,password,direccion,correo;
    private int puntos,numero;
    double total;
    public static ArrayList<usuario>usuarios=new ArrayList<>();
    public static usuario loggedUser;
    private ArrayList<Historial>historial;

    public usuario(String user, String pass){
        this.usuario=user;
        this.password=pass;
        this.historial = new ArrayList<>();
        this.puntos=0;
        this.total=0;
    }



    public static void add(String user, String pass)throws IOException{
        usuarios.add(new usuario(user, pass));
    }

    public static usuario existe(String user) throws FileNotFoundException, IOException{
        for(usuario u:usuarios){
            if(u.getUsername().equals(user))
                return u;
        }

        return null;
    }

    public static usuario verificar(String text, String passw) throws IOException, ClassNotFoundException {
        usuario newUser= existe(text);
        if(newUser!= null){
            if(passw.equals(newUser.getPassword()))
                return newUser;
        }
        return null;
    }

    public static void addPuntos(){
        int pts = getLoggedUser().getPuntos();
        getLoggedUser().setPuntos(pts+3);
    }

    public static usuario getLoggedUser(){
        return loggedUser;
    }

    public static void setLoggedUser(usuario user){
        loggedUser = user;
    }

    public String getUsername() {
        return usuario;
    }

    public void setUsername(String username) {
        this.usuario = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setDireccion(String d){
        this.direccion=d;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCorreo(String c){
        this.correo=c;
    }

    public String getCorreo() {
        return correo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getTotal(){return total;}

    public  void setTotal(double t){this.total = total + t;}

    public void pagar(){
        this.total=0;

    }

    /**
     * Created by Miguel Paz on 13/6/2017.
     */

    public static class Llamada {
    }
}
