package com.example.estudiante.amst03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void datos_grafica(View view){
        Intent avanzar = new Intent(this, datosGrafica.class);
        startActivity(avanzar);
    }
}
