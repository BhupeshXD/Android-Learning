package com.example.getdatadatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db extends SQLiteOpenHelper {

    private  static final int DATABASE_VERSION=1;
    private  static final String DATABASE_NAME= "e";

    public db(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase db){

        String CREATE_TABLE_EMP="CREATE TABLE employee(ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT NOT NULL,Empno TEXT NOT NULL,EmpDept TEXT NOT NULL)";
        db.execSQL(CREATE_TABLE_EMP);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){


    }

}