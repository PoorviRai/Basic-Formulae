package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Period extends AppCompatActivity {

    TextView resultval;
    EditText lval;
    EditText gval;

    double g1, l1, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period);

        resultval = (TextView) findViewById(R.id.pTxt);
        lval = (EditText) findViewById(R.id.lTxt);
        gval = (EditText) findViewById(R.id.GTxt);

        Button calcbtn = (Button)findViewById(R.id.equalto);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                l1 = Double.parseDouble(lval.getText().toString());
                g1 = Double.parseDouble(gval.getText().toString());
                result = 2*3.14*(Math.sqrt(l1/g1));
                resultval.setText(Double.toString(result));
            }
        });
    }
}
