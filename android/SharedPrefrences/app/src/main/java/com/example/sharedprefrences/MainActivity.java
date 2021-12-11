package com.example.sharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MYPREFRENCES = "MyPref";
    public static final String Name = "namekey";
    public static final String Dept = "deptkey";
    public static final String Age = "agekey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed1  = (EditText) findViewById(R.id.ed1);
        EditText ed2  = (EditText) findViewById(R.id.ed2);
        EditText ed3  = (EditText) findViewById(R.id.ed3);
        Button btn = (Button) findViewById(R.id.btn1);

        SharedPreferences sharedPreferences = getSharedPreferences(MYPREFRENCES,MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = ed1.getText().toString();
                String b = ed2.getText().toString();
                String c = ed3.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Name,a);
                editor.putString(Dept,b);
                editor.putString(Age,c);
                editor.commit();
                Toast.makeText(MainActivity.this,"Data Saved Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}