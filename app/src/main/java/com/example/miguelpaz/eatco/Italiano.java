package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Italiano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italiano);
    }

    public void callilromano(View view) {
        Menu.restauranteActual="Il Romano";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Arroz","",90,R.drawable.comida2));
        Adaptador.addList(new Comida("Daddy Itto","Papas con carne y con refresco mediano",100,R.drawable.daddy));
        Adaptador.addList(new Comida("Marimba Roll","",100,R.drawable.marimba));
        Adaptador.addList(new Comida("El Chelito","",100,R.drawable.elchelito));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callhasta(View view) {
        Menu.restauranteActual="Hasta la Pasta";
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
