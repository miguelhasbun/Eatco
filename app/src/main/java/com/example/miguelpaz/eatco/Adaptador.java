package com.example.miguelpaz.eatco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Adaptador extends Activity {
    private boolean variable=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);

        ArrayList<Lista_entrada> datos = new ArrayList<Lista_entrada>();

        datos.add(new Lista_entrada(R.drawable.imgbarcelona, "Barcelona", "El Fútbol Club Barcelona (en catalán, Futbol Club Barcelona) es una entidad polideportiva de Barcelona (España). Fue fundado como club de fútbol9 el 29 de noviembre de 1899."));
        datos.add(new Lista_entrada(R.drawable.imgbayern, "Bayern", "s una entidad deportiva de la ciudad de Múnich, Alemania. Fue fundado el 27 de febrero de 1900. Es uno de los clubes de mayor prestigio en el mundo, es conocido por su sección de fútbol profesional, que participa en la Bundesliga."));
        datos.add(new Lista_entrada(R.drawable.imgliverpool, "Liverpool", "Es un club de fútbol profesional con sede en Liverpool, Inglaterra, que disputa la Premier League, máxima competición futbolística en ese país."));
        datos.add(new Lista_entrada(R.drawable.imgmadrid, "Real Madrid", "Es una entidad polideportiva con sede en Madrid, España. Fue declarada oficialmente registrada por sus socios el 6 de marzo de 1902 con el único objeto de la práctica del fútbol —aunque recientes investigaciones de antiguas publicaciones datan sus orígenes a la Nueva Sociedad de Foot-Ball en 1900."));
        datos.add(new Lista_entrada(R.drawable.imgmilan, "Milan", "Es un club de fútbol profesional con sede en Milán , Lombardía, Italia. Milán fue fundado en 1899 por el Inglés encajera Herbert Kilpin y empresario Alfred Edwards entre otros."));



        ListView lista = (ListView) findViewById(R.id.ListView_listado);



        lista.setAdapter(new Lista_adaptador(this, R.layout.entrada, datos){

            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima());

                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo());

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
                imagen_entrada.setImageResource(((Lista_entrada) entrada).get_idImagen());
            }
        });



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

        });
    }

}
