package com.example.studentdatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class db extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME = "stud";
    public db (Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_TABLE_STUD = "CREATE TABLE student(ID INTEGER PRIMARY KEY AUTOINCREMENT,STID INTEGER NOT NULL,STNAME TEXT NOT NULL)";
        db.execSQL(CREATE_TABLE_STUD);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }

}