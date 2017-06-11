package com.example.miguelpaz.eatco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adaptador extends Activity {
    private boolean variable=true;
    public static ArrayList<Lista_entrada> datos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);

        ListView lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new Lista_adaptador(this, R.layout.entrada, datos){

            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_precio= (TextView) view.findViewById(R.id.txtPrecio);
                texto_precio.setText(String.valueOf(((Lista_entrada) entrada).getPrecio()));

                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima());

                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo());

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
                imagen_entrada.setImageResource(((Lista_entrada) entrada).get_idImagen());


            }


        });


        /*
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion);
                if(posicion==0) {
                    CharSequence texto = "El mejor equipo " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                }
                else if(posicion==3){
                    if(variable){
                        variable=false;
                        CharSequence texto = "En realidad el Real Madrid es el mejor " + elegido.get_textoDebajo();
                        Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                        toast.show();
                    }else{
                        variable=true;
                        CharSequence texto = "Hala Madrid " + elegido.get_textoDebajo();
                        Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                        toast.show();
                    }

                }else {
                    CharSequence texto = "Seleccionado: " + elegido.get_textoDebajo();
                    Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                    toast.show();
                }
            }

        });*/
    }

    public static void addList(Comida c){
        datos.add(new Lista_entrada(c.getPicture(), c.getTitle(), c.getContent(),c.getPrice()));
    }

    public static void clearList(){
        datos.clear();
    }

    public static void setRestaurante(String r,View view){
        TextView texto_restaurante = (TextView) view.findViewById(R.id.txtRestaurante);
        texto_restaurante.setText(r);
    }



}
