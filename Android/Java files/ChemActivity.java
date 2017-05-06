package com.example.cherry.mccproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);
    }

    public void send1(View view)
    {
        Intent intent = new Intent(this, Equi.class);
        startActivity(intent);
    }

    public void send2(View view)
    {
        Intent intent = new Intent(this, Const.class);
        startActivity(intent);
    }
}
