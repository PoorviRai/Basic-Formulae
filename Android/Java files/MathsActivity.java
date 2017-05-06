package com.example.cherry.mccproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MathsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
    }

    public void sendMessage(View view)
    {
      Intent intent = new Intent(this, Triangle.class);
      startActivity(intent);
    }

    public void sendMessage1(View view)
    {
        Intent intent = new Intent(this, Trapezoid.class);
        startActivity(intent);
    }

    public void sendMessage4(View view)
    {
        Intent intent = new Intent(this, Circle.class);
        startActivity(intent);
    }

    public void sendMessage2(View view)
    {
        Intent intent = new Intent(this, Distance.class);
        startActivity(intent);
    }

    public void sendMessage3(View view)
    {
        Intent intent = new Intent(this, Slope.class);
        startActivity(intent);
    }
    }

