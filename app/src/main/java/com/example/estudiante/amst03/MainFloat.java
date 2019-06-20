package com.example.estudiante.amst03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.estudiante.amst03.Calendar.CalendarActivity;

public class MainFloat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_float);
    }

    public void RegresarAlMenu(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainFloat.this,Main2Activity.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirMap(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainFloat.this,MapsActivity.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirCalendario(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainFloat.this, CalendarActivity.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirVideo(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainFloat.this, activity_youtube.class);
                startActivity(intent);
            }
        }, 0);
    }
}
