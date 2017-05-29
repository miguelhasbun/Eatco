package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void callusa(View view){
        Intent i= new Intent(this, Americano.class);
        startActivity(i);
    }
    public void callhonduras(View view){
        Intent i= new Intent(this, Tipico.class);
        startActivity(i);
    }

    public void callmexico(View view){
        Intent i= new Intent(this, Mexicano.class);
        startActivity(i);
    }

    public void callasiatico(View view){
        Intent i= new Intent(this, Asiatico.class);
        startActivity(i);
    }

    public void callitaliano(View view){
        Intent i= new Intent(this, Italiano.class);
        startActivity(i);
    }

}
