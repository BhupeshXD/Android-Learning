package com.example.simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] place = {"Kedarnath","Badrinath","Gangotri","Yamunotri"};
    int [] placeImages = {R.drawable.kedarnath, R.drawable.badrinath, R.drawable.gangotri, R.drawable.yamunotri};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView slv = (ListView) findViewById(R.id.lv);

        List<HashMap<String,String>> li = new ArrayList<>();

        for (int i=0; i<place.length;i++)
        {
            HashMap<String,String> hm = new HashMap<>();
            hm.put("name",place[i]);
            hm.put("picture",placeImages[i]+"");
            li.add(hm);
        }

        String[] from = {"name","picture"};
        int [] to = {R.id.tv1, R.id.iv1};

        SimpleAdapter sad = new SimpleAdapter(this, li, R.layout.layout, from, to);
        slv.setAdapter(sad);



    }
}

