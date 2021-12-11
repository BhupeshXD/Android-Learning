package com.example.playwithnumbers;

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
        Button bb1 = (Button) findViewById(R.id.btn1);
        Button bb2 = (Button) findViewById(R.id.btn2);

            bb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText num1 = (EditText) findViewById(R.id.ed1);
                    EditText num2 = (EditText) findViewById(R.id.ed2);
                    EditText num3 = (EditText) findViewById(R.id.ed3);
                    int a = Integer.parseInt(num1.getText().toString());
                    int b = Integer.parseInt(num2.getText().toString());
                    int c = Integer.parseInt(num3.getText().toString());
                    TextView r = (TextView) findViewById(R.id.tv3);
                    if (a >= b && a >= c)
                        r.setText(a + "  is Greater number");
                    else if (b >= a && b >= c)
                        r.setText(b + "  is Greater number");
                    else
                        r.setText(c + "  is Greater number");

                }
            });

            bb2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText num1 = (EditText) findViewById(R.id.ed1);
                    EditText num2 = (EditText) findViewById(R.id.ed2);
                    EditText num3 = (EditText) findViewById(R.id.ed3);
                    int x = Integer.parseInt(num1.getText().toString());
                    int y = Integer.parseInt(num2.getText().toString());
                    int z = Integer.parseInt(num3.getText().toString());
                    TextView r = (TextView) findViewById(R.id.tv3);
                    r.setText( "Shifted numbers are \n" + z +" Is The First Number \n" + x +" Is The Second Number \n" + y +" Is The Third Number \n" );
                }
            });
        }
    }