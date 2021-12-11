package com.example.getdatadatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity {
    EditText edd1,edd2,edd3;
    SQLiteDatabase db1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db objdatabase=new db(this);
        db1=objdatabase.getWritableDatabase();
        setContentView(R.layout.activity_main);
        edd1 = (EditText) findViewById(R.id.ed1);
        edd2 = (EditText) findViewById(R.id.ed2);
        edd3 = (EditText) findViewById(R.id.ed3);
        TextView tt2 = (TextView) findViewById(R.id.tv2);
        TextView tt3 = (TextView) findViewById(R.id.tv3);
        TextView tt4 = (TextView) findViewById(R.id.tv4);
        Button Save = (Button) findViewById(R.id.btn1);
        Button Display = (Button) findViewById(R.id.btn2);

        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerEmp();
            }
        });

        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db=openOrCreateDatabase("e",MODE_PRIVATE,null);
                String selectQuery="SELECT *from employee";
                Cursor cursor=db.rawQuery(selectQuery,null);
                if(cursor!=null)
                {
                    cursor.moveToFirst();
                    startManagingCursor(cursor);
                    while (!cursor.isAfterLast()){
                        String en=cursor.getString(1);
                        String eno=cursor.getString(2);
                        String ed=cursor.getString(3);
                        tt2.setText(en);
                        tt3.setText(eno);
                        tt4.setText(ed);
                        Toast.makeText(MainActivity.this,"Data Getting Displayed",Toast.LENGTH_LONG).show();
                        cursor.moveToNext();
                    }
                }
            }
        });
    }

    public void registerEmp(){
        String empname, empno,empdept;
        db objectdatabase = new db(this);
        empname = edd1.getText().toString();
        empno = edd2.getText().toString();
        empdept = edd3.getText().toString();
        ContentValues values = new ContentValues();
        values.put("Name",empname);
        values.put("Empno",empno);
        values.put("Empdept",empdept);
        long ID=db1.insert("employee",null,values);
        Toast.makeText(MainActivity.this,"NO. of records"+ID,Toast.LENGTH_LONG).show();
    }}