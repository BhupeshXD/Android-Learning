package com.example.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open (View view)
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("HAve you joined the  class?");
        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick (DialogInterface dialog,int which){
                    Toast.makeText(MainActivity.this, "Yes I have joined", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "No i am not able to join", Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }