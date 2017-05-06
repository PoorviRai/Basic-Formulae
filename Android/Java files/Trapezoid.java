package com.example.cherry.mccproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapezoid extends AppCompatActivity {

    TextView resultval;
    EditText base1val;
    EditText base2val;
    EditText heightval;

    double base1, base2, height, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);

        resultval = (TextView) findViewById(R.id.ResultTxt);
        base1val = (EditText) findViewById(R.id.Base1Txt);
        base2val = (EditText) findViewById(R.id.Base2Txt);
        heightval = (EditText) findViewById(R.id.HeightTxt);

        Button calcbtn = (Button)findViewById(R.id.calc);
        calcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                base1 = Double.parseDouble(base1val.getText().toString());
                base2 = Double.parseDouble(base2val.getText().toString());
                height = Double.parseDouble(heightval.getText().toString());
                result = 0.5 * height * (base1 + base2);
                resultval.setText(Double.toString(result));
    }
});
    }
}