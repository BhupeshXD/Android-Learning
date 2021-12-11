package com.example.experimentno7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MYEMPLOYEE = "MyPref";
    public static final String Name = "namekey";
    public static final String Dept = "deptkey";
    public static final String Age = "agekey";
    public static final String Salary = "salarykey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        EditText ed1  = (EditText) findViewById(R.id.ed1);
        EditText ed2  = (EditText) findViewById(R.id.ed2);
        EditText ed3  = (EditText) findViewById(R.id.ed3);
        EditText ed4  = (EditText) findViewById(R.id.ed4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                String a = ed1.getText().toString();
                String b = ed2.getText().toString();
                String c = ed3.getText().toString();
                String d = ed4.getText().toString();
                SharedPreferences sd = getSharedPreferences(MYEMPLOYEE, MODE_PRIVATE);
                SharedPreferences.Editor editor = sd.edit();
                editor.putString(Name, a);
                editor.putString(Dept, b);
                editor.putString(Age, c);
                editor.putString(Salary,d);
                editor.apply();
                startActivity(i);
            }
        });
    }
}