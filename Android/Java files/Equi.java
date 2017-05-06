package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Equi extends AppCompatActivity {

    TextView resultval;
    EditText pkval;
    EditText baseval;
    EditText acidval;

    double pk, base, acid, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equi);

        resultval = (TextView) findViewById(R.id.phTxt);
        pkval = (EditText) findViewById(R.id.pkTxt);
        baseval = (EditText) findViewById(R.id.bTxt);
        acidval = (EditText) findViewById(R.id.aTxt);

        Button calcbtn = (Button)findViewById(R.id.clcbtn);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                pk = Double.parseDouble(pkval.getText().toString());
                base = Double.parseDouble(baseval.getText().toString());
                acid = Double.parseDouble(acidval.getText().toString());
                result = pk + Math.log10(base/acid);
                resultval.setText(Double.toString(result));
            }
        });
    }
}
