package com.example.estudiante.amst03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class datosGrafica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_grafica);
    }

    public void irAgrafica(View view){
        Intent avanzar = new Intent(this, grafica.class);
        startActivity(avanzar);
    }
}
