package com.example.studentdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText stid, stname;
    SQLiteDatabase db1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db objdatabase = new db(this);
        db1 = objdatabase.getWritableDatabase();
        stid = (EditText) findViewById(R.id.ed1);
        stname = (EditText) findViewById(R.id.ed2);
        Button Load = (Button) findViewById(R.id.btn1);

        Load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { registerStud(); }
        });
    }
    public void registerStud() {

        String studid, studname;
        db objectdatabase = new db(this);
        studid = stid.getText().toString();
        studname = stname.getText().toString();
        ContentValues values = new ContentValues();
        values.put("stid",studid);
        values.put("stname", studname);
        long ID = db1.insert("student",null,values);
        Toast.makeText(MainActivity.this, "Thank You for Details! Record ID: "+ID, Toast.LENGTH_LONG).show();
        objectdatabase.close();

    }
}