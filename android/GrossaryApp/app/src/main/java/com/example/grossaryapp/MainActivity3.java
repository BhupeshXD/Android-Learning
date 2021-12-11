package com.example.grossaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    String Veggies [] = {"Carrot","Cabbage","Pumpkin","Bell Pepper","Broccoli","Brinjal","Chilli"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView lvv = (ListView) findViewById(R.id.lv2);
        ArrayAdapter ad = new ArrayAdapter( this,R.layout.layout3,R.id.tvv2,Veggies);
        lvv.setAdapter(ad);
    }
}