package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView r = (TextView) findViewById(R.id.result);
        Intent i2 = getIntent();
        int i1 = i2.getIntExtra(MainActivity.M,0);
        if (i1%2==0)
            r.setText("Even Number");
        else
            r.setText("Odd number");



    }
}