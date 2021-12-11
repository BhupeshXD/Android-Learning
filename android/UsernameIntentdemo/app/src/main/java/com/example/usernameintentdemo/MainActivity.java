package com.example.usernameintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText edd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edd = findViewById(R.id.ed1);
        edd = findViewById(R.id.ed2);
    }

    public void login(View view) {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        EditText a = (EditText) findViewById(R.id.ed1);
        EditText b = (EditText) findViewById(R.id.ed2);
        String n = a.getText().toString();
        String m = b.getText().toString();
        i.putExtra("Userlog", n);
        i.putExtra("Userlog", m);
        startActivity(i);

    }
}