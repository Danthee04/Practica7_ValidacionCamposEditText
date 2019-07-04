package com.example.practica7_validacioncamposedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etn, etp;//Declaramos los objetos que vamos a usar 2 Edit Text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn = (EditText)findViewById(R.id.txt_nombre);
        etp = (EditText)findViewById(R.id.txt_password);
    }

    //Metodo para el boton Reistrarse
    public void Registrar(View view){

        String nombre = etn.getText().toString();
        String password = etp.getText().toString();
        //Usamos estructuras condicionales para poder validar si los campos estan vacios y mandar un mensaje de ser asi
        //.length nos sirve para conocer la longitud de caracteres en una variable de tipo string
        if (nombre.length() == 0){
            Toast.makeText(this, "Debes ingresar un Nombre.", Toast.LENGTH_LONG).show();
        }
        if (password.length() == 0){
            Toast.makeText(this, "Debes ingresar una Contraseña.", Toast.LENGTH_SHORT).show();
        }
        //Volvemos a usar estructuras condicionales para validar si el usario escribio algo dentro de los campos
        if (nombre.length() != 0 && password.length() != 0){
            Toast.makeText(this, "Registro en proceso...", Toast.LENGTH_LONG).show();
        }
    }
}

