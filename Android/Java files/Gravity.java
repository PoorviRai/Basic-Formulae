package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Gravity extends AppCompatActivity {

    TextView resultval;
    EditText m1val;
    EditText m2val;
    EditText rval;

    double m1, m2, r1, result, g = 6.67408*(Math.pow(10, -11));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gravity);

        resultval = (TextView) findViewById(R.id.ans);
        m1val = (EditText) findViewById(R.id.m1Txt);
        m2val = (EditText) findViewById(R.id.m2Txt);
        rval = (EditText) findViewById(R.id.rTxt);

        Button calcbtn = (Button)findViewById(R.id.ansbtn);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                m1 = Double.parseDouble(m1val.getText().toString());
                m2 = Double.parseDouble(m2val.getText().toString());
                r1 = Double.parseDouble(rval.getText().toString());
                result = (g*(m1*m2))/(r1*r1);
                resultval.setText(Double.toString(result));
            }
        });
    }
}
