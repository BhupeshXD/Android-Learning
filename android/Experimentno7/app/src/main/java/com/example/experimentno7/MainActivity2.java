package com.example.experimentno7;

import static com.example.experimentno7.MainActivity.Age;
import static com.example.experimentno7.MainActivity.Dept;
import static com.example.experimentno7.MainActivity.MYEMPLOYEE;
import static com.example.experimentno7.MainActivity.Name;
import static com.example.experimentno7.MainActivity.Salary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView r = (TextView) findViewById(R.id.nameresult);
        TextView s = (TextView) findViewById(R.id.deptresult);
        TextView t = (TextView) findViewById(R.id.ageresult);
        TextView u = (TextView) findViewById(R.id.salaryresult);
        SharedPreferences employee = getSharedPreferences(MYEMPLOYEE,MODE_PRIVATE);
        String a = employee.getString(Name,"a");
        String b = employee.getString(Dept,"b");
        String c = employee.getString(Age,"c");
        String d = employee.getString(Salary,"d");
        r.setText(a);
        s.setText(b);
        t.setText(c);
        u.setText(d);
    }
}