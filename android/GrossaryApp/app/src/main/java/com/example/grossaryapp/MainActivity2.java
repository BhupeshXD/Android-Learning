package com.example.grossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    String Fruits [] = {"Mango","Apple","Watermelon","Grapes","Bananna","Strawberry","Cherry"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView lvv = (ListView) findViewById(R.id.lv);
        ArrayAdapter ad = new ArrayAdapter( this,R.layout.layout2, R.id.tvv1,Fruits);

        lvv.setAdapter(ad);
    }
}