package com.example.validation;

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
        EditText edd2 =(EditText) findViewById(R.id.ed2);
        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = edd1.getText().toString();
                String word = edd2.getText().toString();
                if(Name.length()==0)
                {
                    edd1.requestFocus();
                    edd1.setError("FIELD CANNOT BE EMPTY");
                }
                else if(!Name.matches("[a-zA-Z ]+"))
                {
                    edd1.requestFocus();
                    edd1.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }
                else if(word.length()==0)
                {
                    edd2.requestFocus();
                    edd2.setError("FIELD CANNOT BE EMPTY");
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Validation Successful",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
} 