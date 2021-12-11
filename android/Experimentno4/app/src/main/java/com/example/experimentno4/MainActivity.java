package com.example.experimentno4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edd = findViewById(R.id.ed1);


    }

    public void PM(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        EditText d = (EditText) findViewById(R.id.ed1);
        int n = Integer.parseInt(d.getText().toString());
      /*  i.putExtra("N", "Bhupesh");*/
        i.putExtra("M", n);
        startActivity(i);
    }

    public void Fact(View view) {
            Intent j = new Intent(MainActivity.this, MainActivity3.class);
            EditText d = (EditText) findViewById(R.id.ed1);
            int b = Integer.parseInt(d.getText().toString());
            j.putExtra("Fac", b);
            startActivity(j);

        }
    }