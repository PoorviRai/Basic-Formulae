package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {

    TextView resultval;
    EditText radiusval;

    double radius, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        resultval = (TextView) findViewById(R.id.ansTxt);
        radiusval = (EditText) findViewById(R.id.RadiusTxt);

        Button calcbtn = (Button)findViewById(R.id.equ);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                radius = Double.parseDouble(radiusval.getText().toString());
                result = 3.14 * radius * radius;
                resultval.setText(Double.toString(result));
            }
        });

    }
}
