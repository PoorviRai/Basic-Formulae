package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {

    TextView resultval;
    EditText baseval;
    EditText heightval;

    double base, height, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);

        resultval = (TextView) findViewById(R.id.ResulttextView);
        baseval = (EditText) findViewById(R.id.baseTxt);
        heightval = (EditText) findViewById(R.id.heightTxt);

        Button calcbtn = (Button)findViewById(R.id.calcbtn);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                base = Double.parseDouble(baseval.getText().toString());
                height = Double.parseDouble(heightval.getText().toString());
                result = 0.5 * base * height;
                resultval.setText(Double.toString(result));
            }
        });

    }
}
