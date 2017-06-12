package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Asiatico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asiatico);
    }

    public void callsake(View view) {
        Menu.restauranteActual="Sake";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Sake","",110,R.drawable.sake));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callasian(View view) {
        Menu.restauranteActual="Asian Box";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Asian Box","",80,R.drawable.asian));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callsushi(View view) {
        Menu.restauranteActual="Sushi";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Arroz","",90,R.drawable.comida2));
        Adaptador.addList(new Comida("Daddy Itto","Papas con carne y con refresco mediano",100,R.drawable.daddy));
        Adaptador.addList(new Comida("Marimba Roll","",100,R.drawable.marimba));
        Adaptador.addList(new Comida("El Chelito","",100,R.drawable.elchelito));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
