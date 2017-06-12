package com.example.miguelpaz.eatco;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
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

        TextView texto_restaurante = (TextView) findViewById(R.id.txtRestaurante);
        texto_restaurante.setText(Menu.restauranteActual);

        final TextView texto_rtotal = (TextView) findViewById(R.id.textTotal);
        texto_rtotal.setText(String.valueOf(usuario.getLoggedUser().getTotal()));

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
            public CheckBox seleccion;
            public EditText cant;

            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion);
                elegido.getOrdenar();
                seleccion = (CheckBox) findViewById(R.id.checkBox);
                if (seleccion.isChecked()) {
                    cant = (EditText) findViewById(R.id.txtpagar);
                    double c = Double.parseDouble(String.valueOf(cant.getText()));
                    usuario.getLoggedUser().setTotal(c * elegido.getPrecio());
                    texto_rtotal.setText(String.valueOf(usuario.getLoggedUser().getTotal()));
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



}
