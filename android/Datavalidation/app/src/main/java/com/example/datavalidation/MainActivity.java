package com.example.datavalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)  findViewById(R.id.btn1);
        EditText edd1 = (EditText) findViewById(R.id.ed1);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edd1.getText().toString();
                if (s.length() == 0) {
                    edd1.requestFocus();
                    edd1.setError("Field Cannot Be Empty");

                } if (!s.matches("[a-zA-Z]+")){
                    edd1.requestFocus();
                    edd1.setError("Only Alphabhet Characters allowed");

                }else if(!s.matches("[a-zA-Z]+")) {
                    Toast.makeText(MainActivity.this, "Validation Sucessful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}