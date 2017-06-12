package com.example.miguelpaz.eatco;

/**
 * Created by ASUS on 8/12/2016.
 */

public class Lista_entrada {

        private int idImagen;
        private double precio,cant;
        private String textoEncima;
        private String textoDebajo;
       // boolean ordenar;

        public Lista_entrada(int idImagen, String textoEncima, String textoDebajo,double p) {
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
            this.precio=p;
        //    ordenar=false;
          //  cant=0;
        }

        public String get_textoEncima() {
            return textoEncima;
        }

        public String get_textoDebajo() {
            return textoDebajo;
        }

        public int get_idImagen() {
            return idImagen;
        }

        public double getPrecio(){
            return precio;
        }

      /*  public boolean getOrdenar(){return ordenar;}

        public void setOrdenar(boolean o){this.ordenar=o;}

        public double getCant(){return cant;}

        public void setCant(double c){this.cant=c;}*/
}
