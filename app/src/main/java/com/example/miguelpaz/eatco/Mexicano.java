package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mexicano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexicano);
    }

    public void callanto(View view) {
        Menu.restauranteActual="Antojitos";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Arroz","",90,R.drawable.antojitos1));
        Adaptador.addList(new Comida("Daddy Itto","",100,R.drawable.antojitos2));
        Adaptador.addList(new Comida("Marimba Roll","",100,R.drawable.antojitos3));
        Adaptador.addList(new Comida("El Chelito","",100,R.drawable.antojitos4));
        Adaptador.addList(new Comida("El Chelito","",100,R.drawable.antojitos5));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void calltacotenn(View view) {
        Menu.restauranteActual="Tacotento";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Arroz","",90,R.drawable.tacotento1));
        Adaptador.addList(new Comida("Daddy Itto","",100,R.drawable.tacotento2));
        Adaptador.addList(new Comida("Marimba Roll","",100,R.drawable.tacotento3));
        Adaptador.addList(new Comida("El Chelito","",100,R.drawable.tacotento4));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void calltacoin(View view) {
        Menu.restauranteActual="Taco Inn";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Arroz","",90,R.drawable.comida2));
        Adaptador.addList(new Comida("Daddy Itto","",100,R.drawable.daddy));
        Adaptador.addList(new Comida("Marimba Roll","",100,R.drawable.marimba));
        Adaptador.addList(new Comida("El Chelito","",100,R.drawable.elchelito));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
