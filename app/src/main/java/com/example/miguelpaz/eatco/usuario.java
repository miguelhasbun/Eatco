package com.example.miguelpaz.eatco;

import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by David on 6/6/2017.
 */

public class usuario {

    private String usuario,password;
    private int puntos;
    public static ArrayList<usuario>usuarios=new ArrayList<>();
    public static usuario loggedUser;
    private ArrayList<Historial>historial;

    public usuario(String user, String pass){
        this.usuario=user;
        this.password=pass;
        this.historial = new ArrayList<>();
        this.puntos=0;
    }



    public static void add(String user, String pass)throws IOException{
        usuarios.add(new usuario(user, pass));
        FileOutputStream fo = new FileOutputStream("user.us");
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        oo.writeObject(usuarios);
    }

    public static usuario existe(String user) throws FileNotFoundException, IOException{
        try{
            FileInputStream fi = new FileInputStream("user.us");
            ObjectInputStream oi = new ObjectInputStream(fi);
            usuarios = (ArrayList<usuario>)oi.readObject();
        } catch (FileNotFoundException ex) {

        } catch (IOException | ClassNotFoundException ex) {
            FileOutputStream fo= new FileOutputStream("user.us");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(usuarios);
            //Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        for (usuario u : usuarios){
            if (u != null){
                return u;

            }
        }
        return null;
    }

    public static usuario verificar(String text, String passw) throws IOException, ClassNotFoundException {
        // FileOutputStream fo = new FileOutputStream("player.pl");
        // ObjectOutputStream oo = new ObjectOutputStream(fo);
        //oo.writeObject(players);
        try{
            FileInputStream fi = new FileInputStream("user.us");
            ObjectInputStream oi = new ObjectInputStream(fi);
            usuarios=(ArrayList<usuario>)oi.readObject();
            for(usuario u:usuarios){
                if (text.equals(u.getUsername())){
                    if(passw.equals(u.getPassword())){
                        return u;
                    }
                }
            }return null;
        }catch(FileNotFoundException e){
            FileOutputStream fo = new FileOutputStream("user.us");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(usuarios);
            return null;
        }

    }

    public static void addPuntos(String user){
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




}
