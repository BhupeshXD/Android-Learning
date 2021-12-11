package com.example.date;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.tv);
        SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy 'and' HH:mm.ss");
        String d = s.format(new Date());
        t.setText(d);
    }
}