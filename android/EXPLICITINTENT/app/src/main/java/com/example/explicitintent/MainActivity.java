package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String M = "Intent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bb1 = (Button) findViewById(R.id.btn1);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Activity2.class);
                EditText d = (EditText) findViewById(R.id.ed1);
                int n = Integer.parseInt(d.getText().toString());
                i.putExtra(M, n);
                startActivity(i);

            }
        });





    }
}