package com.example.estudiante.amst03;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AbrirView(View view) {

    }

    public void AbrirCalendario(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Calendario.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirMap(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Maps.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirGraph(View view) {
    }

    public void AbrirFlotante(View view) {
    }
}
