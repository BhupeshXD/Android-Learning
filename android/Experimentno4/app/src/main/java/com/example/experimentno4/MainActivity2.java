package com.example.experimentno4;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.experimentno4.MainActivity;
import com.example.experimentno4.R;

import javax.xml.transform.Result;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView r = (TextView) findViewById(R.id.result);
        Intent i2 = getIntent();
        int i1 = i2.getIntExtra("M",0);
      //  String i3 = i2.getStringExtra("N");
        boolean flag = false;
        for (int i = 2; i <= i1 / 2; ++i) {
            // condition for nonprime number
            if (i1 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            r.setText("Yes it is a prime number.");
        else
            r.setText("Sorry not a prime number.");


    }



        // Toast.makeText(MainActivity2.this, i3+" "+i1, Toast.LENGTH_SHORT).show();


    }
