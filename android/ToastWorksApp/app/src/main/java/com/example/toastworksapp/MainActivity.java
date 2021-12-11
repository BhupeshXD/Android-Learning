package com.example.toastworksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                Toast.makeText(getApplicationContext(),"Hey there good Morning",Toast.LENGTH_LONG).show();
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hey there good Evening",Toast.LENGTH_SHORT).show();
            }
        });
    }
}