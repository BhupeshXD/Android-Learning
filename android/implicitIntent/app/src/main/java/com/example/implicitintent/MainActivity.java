package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Button1(View view) {
   Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+8356824318"));
   startActivity(i);
    }

    public void Button2(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amity.edu"));
        startActivity(i);
    }

    public void Button3(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:19.1045, 73.0033"));
        startActivity(i);
    }

}
