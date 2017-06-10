package com.example.miguelpaz.eatco;

/**
 * Created by ASUS on 8/12/2016.
 */

public class Lista_entrada {

        private int idImagen,precio;
        private String textoEncima;
        private String textoDebajo;

        public Lista_entrada(int idImagen, String textoEncima, String textoDebajo,int p) {
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
            this.precio=p;
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

        public int getPrecio(){
            return precio;
        }
}
