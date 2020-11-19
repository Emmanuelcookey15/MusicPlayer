package com.example.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = findViewById(R.id.play_button);
        Button pauseButton = findViewById(R.id.pause_button);

        mMediaPlayer = MediaPlayer.create(this, R.raw.teni_wait);

       playButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mMediaPlayer.start();
               Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_LONG).show();
           }
       });

       pauseButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mMediaPlayer.pause();
               Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_LONG).show();
           }
       });

    }
}
