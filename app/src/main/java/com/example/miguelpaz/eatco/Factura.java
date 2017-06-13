package com.example.miguelpaz.eatco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Factura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
    }

    public void callpago(View view) {
        Toast.makeText(this, "Estimad@: "+usuario.getLoggedUser().getUsername()+ " pago exitosamente", Toast.LENGTH_LONG).show();
        finish();
    }
}
