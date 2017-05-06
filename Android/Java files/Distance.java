package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Distance extends AppCompatActivity {

    TextView resultval;
    EditText x1val;
    EditText x2val;
    EditText y1val;
    EditText y2val;

    double x1, x2, y1, y2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        resultval = (TextView) findViewById(R.id.rt);
        x1val = (EditText) findViewById(R.id.x1t);
        x2val = (EditText) findViewById(R.id.x2t);
        y1val = (EditText) findViewById(R.id.y1t);
        y2val = (EditText) findViewById(R.id.y2t);

        Button calcbtn = (Button)findViewById(R.id.clc);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                x1 = Double.parseDouble(x1val.getText().toString());
                x2 = Double.parseDouble(x2val.getText().toString());
                y1 = Double.parseDouble(y1val.getText().toString());
                y2 = Double.parseDouble(y2val.getText().toString());
                result = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
                resultval.setText(Double.toString(result));
            }
        });

    }
}
