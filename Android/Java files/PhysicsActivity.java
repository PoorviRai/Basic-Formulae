package com.example.cherry.mccproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PhysicsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
    }

    public void Message1(View view)
    {
        Intent intent = new Intent(this, Gravity.class);
        startActivity(intent);
    }

    public void Message2(View view)
    {
        Intent intent = new Intent(this, AF.class);
        startActivity(intent);
    }

    public void Message3(View view)
    {
        Intent intent = new Intent(this, Period.class);
        startActivity(intent);
    }
}
