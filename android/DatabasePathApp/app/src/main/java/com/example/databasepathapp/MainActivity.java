package com.example.databasepathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvv = (TextView) findViewById(R.id.tv1);
        File path = getApplication().getFilesDir();
        String s = path + "/" + "Data";
        tvv.setText("DATABASE path " + s);


        try {
            db = this.openOrCreateDatabase("Data", MODE_PRIVATE, null);
            db.close();
        } catch(SQLException e){
            tvv.append("Exception Occured" + e.getMessage());
        }


    }
}