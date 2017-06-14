package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callmenu(View view){
        Intent i= new Intent(this, Menu.class);
        startActivity(i);
    }

    public void callcerrar(View view){
        usuario.setLoggedUser(null);
        finish();
    }

    public void callconfig(View view){
        Intent i= new Intent(this, Configuracion.class);
        startActivity(i);
    }

    public void callnosotros(View view){
        Intent i= new Intent(this, Nosotros.class);
        startActivity(i);
    }

    public void callllamadas(View view){
        Intent i= new Intent(this, Llamadas.class);
        startActivity(i);
    }

    public void callpromociones(View view) {
        Menu.restauranteActual="Promociones";
        if(Adaptador.getTamList()>0)
            Adaptador.clearList();
        Adaptador.addList(new Comida("Tacotento","Paquete atores (8 personas)",598,R.drawable.tacotento2));
        Adaptador.addList(new Comida("Antojitos Mexicanos","Nachos",50,R.drawable.antojitos2));
        Adaptador.addList(new Comida("Costas Burger","Costas Pizza ",200,R.drawable.pizza2));
        Intent i= new Intent(this, Adaptador.class);
        startActivity(i);
    }
}
