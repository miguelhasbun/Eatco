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
        Adaptador.addList(new Comida("Pizza 4 carnes","deliciosa pizza ocho piezas de pasta delgada o gruesa segun tu elección con queso mozarella, jamon, peperoni, tocino y carne y nuestra salsa roja de la casa.",398.00,R.drawable.romano1));
        Adaptador.addList(new Comida("Pizza Frutti di Mare","nuestra original pasta de la casa con salsa roja, vegetales y camarones.",432.00,R.drawable.romano2));
        Adaptador.addList(new Comida("Pizza 4 estaciones","La mas pedida, deliciosa combinacion de pizza de jamón peperoni, suprema y de carne dividida en cuatro partes con queso mozarella.",390,R.drawable.romano3));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void callhasta(View view) {
        Menu.restauranteActual="Hasta la Pasta";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Pasta alfredo","deliciosa pasta linguini con la tradicional salsa blanca alfredo.",210,R.drawable.hasta1));
        Adaptador.addList(new Comida("Ravioli","sabrosos ravioli rellenos de carne premium y salsa roja de la casa.",245,R.drawable.hasta2));
        Adaptador.addList(new Comida("Pasta penne","deliciosa pasta blanca acompañada de camarones al ajillo.",253,R.drawable.hasta3));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
