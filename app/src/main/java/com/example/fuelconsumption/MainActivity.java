package com.example.fuelconsumption;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button mButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.editTextNumber);
        mEditText2 = findViewById(R.id.editTextNumber1);
        mTextViewResult = findViewById(R.id.resutlTextView);
        mButtonAdd = findViewById(R.id.CalculateButton);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    double l = Double.parseDouble(mEditText1.getText().toString());
                    double km = Double.parseDouble(mEditText2.getText().toString());

                    double res = l / km * 100;
                    DecimalFormat dec = new DecimalFormat("#0.00");

                    mTextViewResult.setText(String.valueOf(dec.format(res) + " L/100km"));
                    /*
                    asd1
                     */
            }
        });
    }
}