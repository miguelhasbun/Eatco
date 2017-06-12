package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Americano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_americano);
    }

    public void callFridays(View view) {
        Menu.restauranteActual="Friday's";
        if(Adaptador.datos.size()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Baco Cheese Burger","Hamburguesa de Carne con Bacon y papas con refresco mediano",180,R.drawable.comida2));
        Adaptador.addList(new Comida("Baby Back Rips","Papas con carne y con refresco mediano",150,R.drawable.menu1));
        Adaptador.addList(new Comida("Baco Cheese Burger","Hamburguesa de Carne con Bacon y papas con refresco mediano",180,R.drawable.comida2));
        Adaptador.addList(new Comida("Baby Back Rips","Papas con carne y con refresco mediano",150,R.drawable.menu1));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
