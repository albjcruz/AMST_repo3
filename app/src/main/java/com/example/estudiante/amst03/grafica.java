package com.example.estudiante.amst03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class grafica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafica);
    }

    public void volver_menu(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}
