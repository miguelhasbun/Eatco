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
        Adaptador.addList(new Comida("Costa Sandwich","",85,R.drawable.costas1));
        Adaptador.addList(new Comida("Costas Pizza","",200,R.drawable.costas2));
        Adaptador.addList(new Comida("Hot Dog Costas","",75,R.drawable.costas3));
        Adaptador.addList(new Comida("Costas Burger","",95,R.drawable.costas4));
        //Adaptador.addList(new Comida("Chilli con Papas","",65,R.drawable.costas4));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
