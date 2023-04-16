package com.example.oibsip_task3_simple_calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Integer;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    EditText e1,e2;
    Button b1,b2,b3,b4;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView3);
        e1=(EditText) findViewById(R.id.editTextTextPersonName);
        e2=(EditText) findViewById(R.id.editTextTextPersonName2);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
//   addition
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer v1=Integer.parseInt(e1.getText().toString());
                Integer v2=Integer.parseInt(e2.getText().toString());
                Integer sum= v1+v2;
                t2.setText("+");
                t1.setText(String.valueOf(sum));
            }
        });
// subtraction
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer v1=Integer.parseInt(e1.getText().toString());
                Integer v2=Integer.parseInt(e2.getText().toString());
                Integer sum= v1-v2;
                t2.setText("-");
                t1.setText(String.valueOf(sum));

            }
        });
// multiplication
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer v1=Integer.parseInt(e1.getText().toString());
                Integer v2=Integer.parseInt(e2.getText().toString());
                Integer sum= v1*v2;
                t2.setText("X");
                t1.setText(String.valueOf(sum));
            }
        });

//division
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer v1=Integer.parseInt(e1.getText().toString());
                Integer v2=Integer.parseInt(e2.getText().toString());
                Integer sum= v1/v2;
                t2.setText("/");
                t1.setText(String.valueOf(sum));
            }
        });
    }
}