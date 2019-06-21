package com.example.estudiante.amst03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class datos extends AppCompatActivity {


    static public int x1, x2, x3, x4, x5, y1, y2, y3, y4, y5;
    EditText inputX1;
    EditText inputX2;
    EditText inputX3;
    EditText inputX4;
    EditText inputX5;
    EditText inputY1;
    EditText inputY2;
    EditText inputY3;
    EditText inputY4;
    EditText inputY5;

    Button EditButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        inputX1 = (EditText) findViewById(R.id.x1);
        inputX2 = (EditText) findViewById(R.id.x2);
        inputX3 = (EditText) findViewById(R.id.x3);
        inputX4 = (EditText) findViewById(R.id.x4);
        inputX5 = (EditText) findViewById(R.id.x5);
        inputY1 = (EditText) findViewById(R.id.y1);
        inputY2 = (EditText) findViewById(R.id.y2);
        inputY3 = (EditText) findViewById(R.id.y3);
        inputY4 = (EditText) findViewById(R.id.y4);
        inputY5 = (EditText) findViewById(R.id.y5);

        EditButton = (Button) findViewById(R.id.button2);
        EditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x1 = Integer.valueOf(inputX1.getText().toString());
                x2 = Integer.valueOf(inputX2.getText().toString());
                x3 = Integer.valueOf(inputX3.getText().toString());
                x4 = Integer.valueOf(inputX4.getText().toString());
                x5 = Integer.valueOf(inputX5.getText().toString());
                y1 = Integer.valueOf(inputY1.getText().toString());
                y2 = Integer.valueOf(inputY2.getText().toString());
                y3 = Integer.valueOf(inputY3.getText().toString());
                y4 = Integer.valueOf(inputY4.getText().toString());
                y5 = Integer.valueOf(inputY5.getText().toString());
                Intent intent = new Intent(datos.this, grafica.class);
                startActivity(intent);
            }
        });


    }
}
