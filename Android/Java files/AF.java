package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AF extends AppCompatActivity {

    TextView resultval;
    EditText fval;

    double f, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_af);

        resultval = (TextView) findViewById(R.id.answer);
        fval = (EditText) findViewById(R.id.fTxt);

        Button calcbtn = (Button)findViewById(R.id.equals);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                f = Double.parseDouble(fval.getText().toString());
                result = 2*3.14*f;
                resultval.setText(Double.toString(result));
            }
        });
    }
}
