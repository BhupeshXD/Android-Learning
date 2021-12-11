package com.example.grossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }

    public void button2(View view) {
        Intent j = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(j);
    }
}