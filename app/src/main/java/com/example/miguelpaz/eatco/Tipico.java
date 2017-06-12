package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tipico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipico);
    }

    public void callbaleadas(View view) {
        Menu.restauranteActual="Baleadas Express";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Baleada con huevo","",20,R.drawable.baleada));
        Adaptador.addList(new Comida("Baleada sencilla","",15,R.drawable.baleada));
        Adaptador.addList(new Comida("Baleada doble","",25,R.drawable.baleada));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callcostas(View view) {
        Menu.restauranteActual="Costas Burger";
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
