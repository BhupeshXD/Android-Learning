package com.example.assignment2i;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = (Button) findViewById(R.id.b1);
        Button btnSub = (Button) findViewById(R.id.b2);
        Button btnMul = (Button) findViewById(R.id.b3);
        Button btnDiv = (Button) findViewById(R.id.b4);

        EditText firstNo = (EditText) findViewById(R.id.ed1);
        EditText secondNo = (EditText) findViewById(R.id.ed2);

        TextView result = (TextView) findViewById(R.id.resultTextView);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res = Integer.parseInt(firstNo.getText().toString()) + Integer.parseInt(secondNo.getText().toString());
                res.length();
                result.setText(res + "");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(firstNo.getText().toString()) - Integer.parseInt(secondNo.getText().toString());
                result.setText(res + "");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(firstNo.getText().toString()) * Integer.parseInt(secondNo.getText().toString());

                result.setText(res + "");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = Integer.parseInt(firstNo.getText().toString()) / Integer.parseInt(secondNo.getText().toString());
                res.lowercase();
                result.setText(res + "");
            }
        });
    }
}