package com.example.miguelpaz.eatco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrarseActivity extends AppCompatActivity {
    EditText txtNombre, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtPass = (EditText) findViewById(R.id.txtPass);


    }

    public void callregistrarse(View view) {
        String user = txtNombre.getText().toString();
        String pass = txtPass.getText().toString();
        //Toast.makeText(this, "LLamado registrar", Toast.LENGTH_LONG).show();
        try{
            if(usuario.existe(user)==null){


                usuario.add(user,pass);
                Toast.makeText(this, "Usuario registrado correctamente.", Toast.LENGTH_LONG).show();
                System.out.println("bien");
                usuario.setLoggedUser(usuario.existe(user));
                Intent inte = new Intent(this, MainActivity.class);
                startActivity(inte);
                System.out.println("bien");
            }
            else{
                Toast.makeText(this, "Ya existe un usuario con este nombre.", Toast.LENGTH_LONG).show();
            }
        }catch(IOException e){
            try {
                usuario.add(user, pass);
            } catch (IOException ex) {
                Logger.getLogger(RegistrarseActivity.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Error en registro "+e.getMessage());
        }



    }

    public void calliniciar(View view) {
        String user = txtNombre.getText().toString();
        String pass = txtPass.getText().toString();

        try {
            usuario login = usuario.verificar(user, pass);

            if (login != null) {
                usuario.setLoggedUser(login);
                Intent inte = new Intent(this, MainActivity.class);
                startActivity(inte);
                //System.out.println("LOGGED USER: " + usuario.getLoggedUser());
                Toast.makeText(this, " Icio sesion correctamente", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, " Usuario y/o contraseña incorrectos.", Toast.LENGTH_LONG).show();
            }
        }
        catch(IOException e){
            System.out.println("Error log in "+e.getMessage()+" ");
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarseActivity.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
