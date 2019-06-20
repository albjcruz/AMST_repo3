package com.example.estudiante.amst03;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.estudiante.amst03.Calendar.CalendarActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void AbrirMap(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Main2Activity.this,MapsActivity.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirCalendario(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Main2Activity.this, CalendarActivity.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirVideo(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Main2Activity.this, activity_youtube.class);
                startActivity(intent);
            }
        }, 0);
    }

    public void AbrirMenuFlotante(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(Main2Activity.this, MainFloat.class);
                startActivity(intent);
            }
        }, 0);
    }
}
