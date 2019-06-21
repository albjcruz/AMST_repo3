package com.example.estudiante.amst03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class grafica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafica);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(datos.x1, datos.y1),
                new DataPoint(datos.x2, datos.y2),
                new DataPoint(datos.x3, datos.y3),
                new DataPoint(datos.x4, datos.y4),
                new DataPoint(datos.x5, datos.y5)
        });
        graph.addSeries(series);
    }


}
