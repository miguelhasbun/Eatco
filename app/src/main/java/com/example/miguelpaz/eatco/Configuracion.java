package com.example.miguelpaz.eatco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Configuracion extends AppCompatActivity {
    public static String dir="",cor="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        TextView user = (TextView) findViewById(R.id.textView8);
        user.setText(usuario.getLoggedUser().getUsername());
    }

    public void callcancelar(View view) {
        EditText direccion= (EditText)findViewById(R.id.txtCcorreo);
        EditText correo= (EditText)findViewById(R.id.txtCDireccion);
        direccion.setText(dir);
        correo.setText(cor);
        finish();
    }

    public void callguardar(View view) {
        EditText direccion= (EditText)findViewById(R.id.txtCcorreo);
        EditText correo= (EditText)findViewById(R.id.txtCDireccion);
        dir= direccion.getText().toString();
        cor=correo.getText().toString();
        Toast.makeText(this, "Se han guardado los cambios", Toast.LENGTH_LONG).show();
        finish();
    }
}
