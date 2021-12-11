package com.example.filestream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edd1 = (EditText) findViewById(R.id.ed1);
        EditText edd2 = (EditText) findViewById(R.id.ed2);
        Button saveButton = (Button) findViewById(R.id.btn1);
        Button readButton = (Button) findViewById(R.id.btn2);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String filename = edd1.getText().toString();
                String data = edd2.getText().toString();

                try {
                    FileOutputStream fos = openFileOutput(filename, MODE_PRIVATE);

                    fos.write(data.getBytes());
                    fos.close();
                    Toast.makeText(MainActivity.this, "Data Saved to File", Toast.LENGTH_LONG).show();
                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }
        });

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename = edd1.getText().toString();

                StringBuffer sB = new StringBuffer();
                try {
                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(openFileInput(filename)));
                    String input;
                    while ((input = inputReader.readLine()) != null)
                    {
                        sB.append(input + "\n");
                    }



                }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

                Toast.makeText(MainActivity.this, "Data is "+ sB.toString(), Toast.LENGTH_LONG).show();


            }
        });

    }
}