package com.example.relativelayout;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.relativelayout.R;

public class MainActivity extends AppCompatActivity {
    EditText edd;
    Button b;
    int smartInt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.btn1);
        edd = findViewById(R.id.ed1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edd.getText().toString();
                if (s.length() == 0) {
                    edd.requestFocus();
                    edd.setError("Field Cannot Be Empty");

                }else if (!s.matches("[a-zA-Z ]+")) //Blank Space " " added after A-Z in regex in order to check length and trim function
                {
                    edd.requestFocus();
                    edd.setError("Only Alphabet Characters allowed");

                }else {
                    switch(smartInt){
                        case 0: Toast.makeText(MainActivity.this, "Please select one String Function", Toast.LENGTH_SHORT).show();
                            break;
                        case 1: Toast.makeText(MainActivity.this, "Length of the String: "+s.length(), Toast.LENGTH_SHORT).show();
                            break;
                        case 2: Toast.makeText(MainActivity.this, "Trimmed String: "+s.trim(), Toast.LENGTH_SHORT).show();
                            break;
                        case 3: Toast.makeText(MainActivity.this, "In UPPER Case: "+s.toUpperCase(), Toast.LENGTH_SHORT).show();
                            break;
                        case 4: Toast.makeText(MainActivity.this, "In lower Case: "+s.toLowerCase(), Toast.LENGTH_SHORT).show();
                            break;
                    }
                    //Toast.makeText(MainActivity.this, "Validation Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void length(View view) {
        smartInt = 1;
    }

    public void trim(View view) {
        smartInt = 2;
    }

    public void uppercase(View view) {
        smartInt = 3;
    }

    public void lowercase(View view) {
        smartInt = 4;
    }
}
