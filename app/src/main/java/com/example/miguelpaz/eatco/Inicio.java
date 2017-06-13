package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void callempresa(View view) {
        Intent i= new Intent(this, Contactanos.class);
        startActivity(i);
    }

    public void callcliente(View view) {
        Intent i= new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }
}
