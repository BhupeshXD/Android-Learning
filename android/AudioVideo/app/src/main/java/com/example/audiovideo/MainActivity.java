package com.example.audiovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.btn1);
        VideoView videoView = (VideoView) findViewById(R.id.vv);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer rings = MediaPlayer.create(MainActivity.this, R.raw.bombaydreams);
                rings.start();
            }
        });

        String path = "android.resources://"+getPackageName()+"/"+R.raw.gamesample;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}