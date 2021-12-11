package com.example.experimentno4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView tv1 = (TextView) findViewById(R.id.result);
        Intent i3 = getIntent();
        int i4 = i3.getIntExtra("Fac", 0);
        int i=1,fact=1;
        while(i<=i4)
        {
            fact=fact*i;
            i++;
        }
        tv1.setText("Factorial is "+ fact);
    }


    }



