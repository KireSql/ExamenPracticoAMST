package com.example.heroesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    String lista="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent resultados = getIntent();
        this.lista = (String) resultados.getExtras().get("listaresultado");

        System.out.println(lista);
        final TextView heroe = (TextView) findViewById(R.id.txtCantidad);
        heroe.setText(lista);
    }


}




