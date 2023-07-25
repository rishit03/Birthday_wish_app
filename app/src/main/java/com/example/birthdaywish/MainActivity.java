package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edFirst, edSecond;
    Button add, subtract, multiply, divide;
    TextView tvResult;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edFirst = findViewById(R.id.edFirst);
        edSecond = findViewById(R.id.edSecond);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);
        imageView4 = findViewById(R.id.imageView4);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(edFirst.getText().toString());
                secondValue = Integer.parseInt(edSecond.getText().toString());
                result = firstValue + secondValue;

                tvResult.setText(result);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(edFirst.getText().toString());
                secondValue = Integer.parseInt(edSecond.getText().toString());
                result = firstValue - secondValue;

                tvResult.setText(result);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(edFirst.getText().toString());
                secondValue = Integer.parseInt(edSecond.getText().toString());
                result = firstValue * secondValue;

                tvResult.setText(result);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, result;
                firstValue = Integer.parseInt(edFirst.getText().toString());
                secondValue = Integer.parseInt(edSecond.getText().toString());
                result = firstValue / secondValue;

                tvResult.setText(result);
            }
        });


    }
}