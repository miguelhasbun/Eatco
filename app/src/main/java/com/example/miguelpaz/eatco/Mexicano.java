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
        Adaptador.addList(new Comida("Sopa de Tortillas","",65,R.drawable.antojitos1));
        Adaptador.addList(new Comida("Nachos","",50,R.drawable.antojitos2));
        Adaptador.addList(new Comida("Tacos Flauta","2 Tacos",80,R.drawable.antojitos3));
        Adaptador.addList(new Comida("Chilaquiles","",90,R.drawable.antojitos4));
       // Adaptador.addList(new Comida("?","",100,R.drawable.antojitos5));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void calltacotenn(View view) {
        Menu.restauranteActual="Tacotento";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Fajitas Rancheras","",140,R.drawable.tacotento1));
        Adaptador.addList(new Comida("Paquete Atores","Para 8 personas",598,R.drawable.tacotento2));
        Adaptador.addList(new Comida("Carne a la Tampiqueña","",120,R.drawable.tacotento3));
        Adaptador.addList(new Comida("Pal Hambre","4 Tacos",89,R.drawable.tacotento4));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }

    public void calltacoin(View view) {
        Menu.restauranteActual="Taco Inn";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Parrillada Especial","cuatro tacos de pastor, cuatro de bistec, cuatro de pollo.\n Acompañado por dos refrescos de tu elección",349,R.drawable.antojitos1));
        Adaptador.addList(new Comida("Parrillada Inn","5 tacos de tu eleccion y combinacion con 3 refrescos.",479,R.drawable.antojitos2));
        // Adaptador.addList(new Comida("Pizza 4 Estaciones","L a mas pedida, deliciosa combinacion de piza de jamon\n peperonni, suprema y de carne dividida en 4 partes\n con queso morarella",100,R.drawable.antojitos3));
        Adaptador.addList(new Comida("Pasta penne","deliciosa pasta blanca acompañada de camarones al ajillo.",253,R.drawable.antojitos4));

        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
