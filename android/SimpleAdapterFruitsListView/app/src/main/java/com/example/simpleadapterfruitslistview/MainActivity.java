package com.example.simpleadapterfruitslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String [] fruits = {"Apple","Avocado","Banana","Blueberry","Coconut","Durian","Guava","Kiwifruit","Jackfruit","Mango","Olive","Grapes","Watermelon"};
    int [] fruitsImages = {R.drawable.apple, R.drawable.avacado, R.drawable.bananna, R.drawable.blueberry,R.drawable.coconut,R.drawable.durain,R.drawable.guava,R.drawable.kiwi,R.drawable.jackfruit,R.drawable.mango,R.drawable.olive,R.drawable.grapes,R.drawable.watermelon};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView LV = (ListView) findViewById(R.id.lv1);

        List<HashMap<String,String>> li = new ArrayList<>();

        for (int i=0; i<fruits.length;i++)
        {
            HashMap<String,String> hm = new HashMap<>();
            hm.put("name",fruits[i]);
            hm.put("picture",fruitsImages[i]+"");
            li.add(hm);
        }

        String[] from = {"name","picture"};
        int [] to = {R.id.tv1, R.id.iv1};

        SimpleAdapter SA = new SimpleAdapter(this, li, R.layout.layout, from, to);
        LV.setAdapter(SA);

    }
}