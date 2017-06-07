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

    private String usuario,password,email;
    private int puntos;
    public static ArrayList<usuario>usuarios=new ArrayList<>();
    public static usuario loggedPlayer;
    private ArrayList<Historial>historial;

    private static FileOutputStream fo;
    private static ObjectOutputStream oo;


    public usuario(String user, String pass,String e){
        this.usuario=user;
        this.password=pass;
        this.email=e;
        this.historial = new ArrayList<>();
        this.puntos=0;
    }

    public static void creandoFolder() throws FileNotFoundException, IOException{
        try{
            //1- Asegurar que el folder Players exista
            File f = new File("Users");
            f.mkdir();
            //2- Instanciar los RAFs dentro de company
            //rplayers = new RandomAccessFile("Players/players.pl", "rw");
            fo = new FileOutputStream("Users/user.pl");
            oo = new ObjectOutputStream(fo);
        }catch(IOException e){
            System.out.println("No deberia de pasar esto");
        }

    }

    public static void guardarUsuarios()throws IOException{
        oo.writeObject(usuarios);
    }
    public static void cargarUsuarios() throws IOException, ClassNotFoundException{
        FileInputStream fi = new FileInputStream("Users/user.pl");
        ObjectInputStream oi = new ObjectInputStream(fi);
        usuarios.add((usuario) (oi.readObject()));
    }

    public static void add(String user, String pass,String e){
        usuario newUser = new usuario(user,pass,e);
        setLoggedPlayer(newUser);
        usuarios.add(newUser);
    }
    public static usuario existe(String user){
        for(usuario u: usuarios){
            if(u.getUsername().equals(user))
                return u;
        }
        return null;
    }

    public static usuario verificar(String user, String pass){
        usuario u = existe(user);
        return u.getPassword().equals(pass) ? u:null;
    }

    public static void addPuntos(String user){
        int pts = getLoggedPlayer().getPuntos();
        getLoggedPlayer().setPuntos(pts+3);
    }

    public static usuario getLoggedPlayer(){
        return loggedPlayer;
    }

    public static void setLoggedPlayer(usuario user){
        loggedPlayer = user;
    }

    public String getUsername() {
        return usuario;
    }

    public void setUsername(String username) {
        this.usuario = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String correo) {
        this.email = correo;
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
