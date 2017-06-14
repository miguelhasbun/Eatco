package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Factura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] letra = {"Paypal","Tarjeta de Credito","Tarjeta de Debito"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] letras = {Configuracion.dir};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letras));
    }

    public void callpago(View view) {
        if(Configuracion.dir.equals("")) {
            Toast.makeText(this, "Debe cambiar la direccion", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, Configuracion.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, usuario.getLoggedUser().getUsername()+ "has pagado exitosamente", Toast.LENGTH_LONG).show();
            finish();
        }

    }

    public void callcambiar(View view) {
        Intent i= new Intent(this, Configuracion.class);
        startActivity(i);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] letras = {Configuracion.dir};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letras));
    }
}
