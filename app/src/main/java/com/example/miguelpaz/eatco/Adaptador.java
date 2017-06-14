package com.example.miguelpaz.eatco;

import android.app.Activity;
import android.content.Intent;
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
   /*
    public static double subtotal;
    private double cantidad,precio;
    public Lista_entrada elegido;*/

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
            public void onEntrada(final Object entrada, View view) {
                TextView texto_precio= (TextView) view.findViewById(R.id.txtPrecio);
                texto_precio.setText(String.valueOf(((Lista_entrada) entrada).getPrecio()));

                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior);
                texto_superior_entrada.setText(((Lista_entrada) entrada).get_textoEncima());

                TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior);
                texto_inferior_entrada.setText(((Lista_entrada) entrada).get_textoDebajo());

                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen);
                imagen_entrada.setImageResource(((Lista_entrada) entrada).get_idImagen());

                CheckBox checkA = (CheckBox) view.findViewById(R.id.checkBox);
                EditText textCant= (EditText) view.findViewById(R.id.txtpagar);


                checkA.setOnClickListener( new View.OnClickListener() {

                    public void onClick(View v) {

                        CheckBox check = (CheckBox) v ;
                        Toast toast = Toast.makeText(Adaptador.this, ((Lista_entrada) entrada).get_textoEncima()+ " - Pulsado"+check.isChecked(), Toast.LENGTH_LONG);
                        toast.show();/*
                        EditText editText=(EditText)v;
                        cantidad = Double.valueOf(editText.getText().toString());
                        precio= ((Lista_entrada)entrada).getPrecio();
                        Toast toat = Toast.makeText(Adaptador.this, String.valueOf(cantidad), Toast.LENGTH_LONG);
                        toast.show();*/
                    }

                });
            }


        });
        /*
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public CheckBox seleccion;
            public EditText cant;
            public TextView total;

            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                boolean check=((CheckBox)view).isChecked();

                total=(TextView)findViewById(R.id.textTotal);
                Lista_entrada elegido = (Lista_entrada) pariente.getItemAtPosition(posicion);
              // elegido.getOrde00nar();
                seleccion = (CheckBox)findViewById(R.id.checkBox);
                if (check) {
                    cant = (EditText) findViewById(R.id.txtpagar);
                    double c = Double.parseDouble(String.valueOf(cant.getText()));
                    usuario.getLoggedUser().setTotal(c * elegido.getPrecio());
                    total.setText(String.valueOf(usuario.getLoggedUser().getTotal()));
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

    public static int getTamList(){return datos.size();}


    public void callfactura(View view) {
        Intent i= new Intent(this, Factura.class);
        startActivity(i);
    }
}
